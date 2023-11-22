package Tests;

import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import ReportUtility.ExtentUtility;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class WebTableTest extends Hooks {

    @Test
    public void metodaLoginTest(){
        WebTableObject webTableObject=new WebTableObject(propertyUtility.getAllData());

        HomePage homePage=new HomePage(getDriver());
        homePage.clickElementsPage();
        ExtentUtility.attachTestLog("pass","I make a click on element");

        ElementsPage elementsPage=new ElementsPage(getDriver());
        elementsPage.clickWebTablesElement();
        ExtentUtility.attachTestLog("pass","I make a click on web element table");

        WebTablesPage webTablesPage=new WebTablesPage(getDriver());

//        webTablesPage.clickAddButton(webTableObject);
//        ExtentUtility.attachTestLog("pass","I make a click on add button");

//        webTablesPage.fillRegisterForm(webTableObject);
//        ExtentUtility.attachTestLog("pass","I fill in the register form");

        webTablesPage.fillRegisterForms(webTableObject,8);
        ExtentUtility.attachTestLog("pass","I fill in the register forms");

        webTablesPage.validateTableSize(webTableObject);
        ExtentUtility.attachTestLog("pass","I validate table size");

        webTablesPage.validateTableContent(webTableObject);
        ExtentUtility.attachTestLog("pass","I validate table content");

        webTableObject.setFirstName("Alex");

        webTablesPage.modifyNewEntry(webTableObject);
        ExtentUtility.attachTestLog("pass","I validate the first name has been changed");
        webTablesPage.validateTableContent(webTableObject);
        ExtentUtility.attachTestLog("pass","I validate table content");

        webTablesPage.deleteNewEntry(webTableObject);
        ExtentUtility.attachTestLog("pass","I validate the entry has been deleted");
        webTablesPage.validateTableAfterDelete(webTableObject);
        ExtentUtility.attachTestLog("pass","I validate the table size");
    }

}
