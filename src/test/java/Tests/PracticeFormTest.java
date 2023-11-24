package Tests;

import ObjectData.PracticeFormObject;
import ObjectData.WebTableObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class PracticeFormTest extends Hooks {

    @Test
    public void PracticeFormTest() {
        PracticeFormObject practiceFormObject=new PracticeFormObject(propertyUtility.getAllData());
        //PracticeFormObject practiceFormObject=new PracticeFormObject(hunorTestData);
        HomePage homePage = new HomePage(getDriver());
        homePage.clickFormsPage();
        ExtentUtility.attachTestLog("pass","I make a click on element");
        FormsPage formPage = new FormsPage(getDriver());
        formPage.clickPracticeFormElement();
        ExtentUtility.attachTestLog("pass","I make a click on element");

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.completeFirstRegion(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I complete firstName, lastName, email and mobile");
        practiceFormPage.completeGender(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I select my gender");
        practiceFormPage.completeDOB(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I make a click on DOB element");

        practiceFormPage.completeHobbies(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I select my hobbies");

        practiceFormPage.completeSubjects(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I select my subjects");
        practiceFormPage.uploadImage();
        ExtentUtility.attachTestLog("pass","I upload an image");
        practiceFormPage.completeAddress(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I complete my address");
        practiceFormPage.completeStateCity(practiceFormObject);
        ExtentUtility.attachTestLog("pass","I complete my state and city");
        //practiceFormPage.submitForm();
        practiceFormPage.finnishTest();
        ExtentUtility.attachTestLog("pass","I submit my form");
        practiceFormPage.validateTableContent(practiceFormObject);
    }

}
