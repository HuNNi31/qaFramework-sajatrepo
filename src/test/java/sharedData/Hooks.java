package sharedData;

import Logger.LoggerUtility;
import PropertyUtility.PropertyUtility;
import ReportUtility.ExtentUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Hooks extends SharedData {

    public PropertyUtility propertyUtility;

    @BeforeMethod
    public void prepareEnvironment(){
        initiateDriver();
        String testName = this.getClass().getSimpleName();
        propertyUtility = new PropertyUtility(testName);
        LoggerUtility.startTestCase(testName);
        ExtentUtility.createTest(testName);
    }
    @BeforeSuite
    public void initiateReport(){
        ExtentUtility.initializeReport();
    }
    @AfterMethod
    public void clearEnvironment(ITestResult result){
        String testName = this.getClass().getSimpleName();
        if(result.getStatus()==ITestResult.FAILURE){
            ExtentUtility.attachTestLog(testName,result.getThrowable().getMessage(),getDriver());
        }
        closeDriver();

        LoggerUtility.endTestCase(testName);
        ExtentUtility.finishTest(testName);
    }
    @AfterSuite
    public void finishSuite(){
        LoggerUtility.mergeFilesIntoOne();
        ExtentUtility.generateReport();
    }

}
