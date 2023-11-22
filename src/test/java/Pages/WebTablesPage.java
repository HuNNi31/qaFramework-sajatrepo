package Pages;

import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class WebTablesPage extends BasePage{

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "addNewRecordButton")
    private WebElement addNewRecordButtonElement;

    @FindBy(id="firstName")
    private WebElement addFirstNameElement;

    @FindBy(id="lastName")
    private WebElement addLastNameElement;

    @FindBy(id="userEmail")
    private WebElement addUserEmailElement;

    @FindBy(id="age")
    private WebElement addAgeElement;

    @FindBy(id="salary")
    private WebElement addSalaryElement;

    @FindBy(id="department")
    private WebElement addDepartmentElement;

    @FindBy(id="submit")
    private WebElement submitButtonElement;

    @FindBy(xpath = "//div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> tableRowsList;

    @FindBy(xpath = "//span[@title='Edit']")
    private List<WebElement> editButtonList;

    @FindBy(xpath = "//span[@title='Delete']")
    private List<WebElement> deleteButtonList;

    public void clickAddButton(WebTableObject webTableObject){
        webTableObject.setTableSize(tableRowsList.size());
        elementMethods.clickElement(addNewRecordButtonElement);
        LoggerUtility.infoTest("The user clicks on add button");
    }
    public void fillRegisterForm(WebTableObject webTableObject){
        elementMethods.fillElement(addFirstNameElement, webTableObject.getFirstName());
        LoggerUtility.infoTest("The user fills the first name with the value:"+webTableObject.getFirstName());
        elementMethods.fillElement(addLastNameElement, webTableObject.getLastName());
        LoggerUtility.infoTest("The user fills the last name with the value:"+webTableObject.getLastName());
        elementMethods.fillElement(addUserEmailElement, webTableObject.getEmail());
        LoggerUtility.infoTest("The user fills the email with the value:"+webTableObject.getEmail());
        elementMethods.fillElement(addAgeElement, webTableObject.getAge());
        LoggerUtility.infoTest("The user fills the age with the value:"+webTableObject.getAge());
        elementMethods.fillElement(addSalaryElement, webTableObject.getSalary());
        LoggerUtility.infoTest("The user fills the salary with the value:"+webTableObject.getSalary());
        elementMethods.fillElement(addDepartmentElement, webTableObject.getDepartment());
        LoggerUtility.infoTest("The user fills the department with the value:"+webTableObject.getDepartment());
        elementMethods.clickElement(submitButtonElement);
        LoggerUtility.infoTest("The user clicks on the submit button");
    }

    public void fillRegisterForms(WebTableObject webTableObject, int n){
        for (int i =0; i<n; ++i){
            webTableObject.setTableSize(tableRowsList.size());
            elementMethods.clickElement(addNewRecordButtonElement);
            elementMethods.fillElement(addFirstNameElement, webTableObject.getFirstName()+i);
            elementMethods.fillElement(addLastNameElement, webTableObject.getLastName());
            elementMethods.fillElement(addUserEmailElement, webTableObject.getEmail());
            elementMethods.fillElement(addAgeElement, webTableObject.getAge());
            elementMethods.fillElement(addSalaryElement, webTableObject.getSalary());
            elementMethods.fillElement(addDepartmentElement, webTableObject.getDepartment());
            elementMethods.clickElement(submitButtonElement);
        }
    }

    public void validateTableSize(WebTableObject webTableObject){
        Assert.assertEquals(webTableObject.getTableSize()+1,tableRowsList.size());
        LoggerUtility.infoTest("The user validates the expected row count for table with the value:"+tableRowsList.size() );
    }
    public void validateTableContent(WebTableObject webTableObject){
        String rowContent=tableRowsList.get(webTableObject.getTableSize()).getText();
        Assert.assertTrue(rowContent.contains(webTableObject.getFirstName()));
        LoggerUtility.infoTest("The user validates the presence of "+webTableObject.getFirstName()+" value");
        Assert.assertTrue(rowContent.contains(webTableObject.getLastName()));
        LoggerUtility.infoTest("The user validates the presence of "+webTableObject.getLastName()+" value");
        Assert.assertTrue(rowContent.contains(webTableObject.getAge()));
        LoggerUtility.infoTest("The user validates the presence of "+webTableObject.getAge()+" value");
        Assert.assertTrue(rowContent.contains(webTableObject.getEmail()));
        LoggerUtility.infoTest("The user validates the presence of "+webTableObject.getEmail()+" value");
        Assert.assertTrue(rowContent.contains(webTableObject.getSalary()));
        LoggerUtility.infoTest("The user validates the presence of "+webTableObject.getSalary()+" value");
        Assert.assertTrue(rowContent.contains(webTableObject.getDepartment()));
        LoggerUtility.infoTest("The user validates the presence of "+webTableObject.getDepartment()+" value");
    }

    public void modifyNewEntry(WebTableObject webTableObject){
        editButtonList.get(webTableObject.getTableSize()).click();
        LoggerUtility.infoTest("The user clicks to modify text");
        elementMethods.clearElement(addFirstNameElement);
        elementMethods.fillElement(addFirstNameElement, webTableObject.getFirstName());
        LoggerUtility.infoTest("The user modifies the first name");
        elementMethods.clickElement(submitButtonElement);
        LoggerUtility.infoTest("The user clicks on submit after the field has been modified");
    }

    public void deleteNewEntry(WebTableObject webTableObject){
        deleteButtonList.get(webTableObject.getTableSize()).click();
        LoggerUtility.infoTest("The user deletes the last entry");
    }
    public void validateTableAfterDelete(WebTableObject webTableObject){
        Assert.assertEquals(webTableObject.getTableSize(),tableRowsList.size());

        
    }

}
