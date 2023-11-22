package Pages;

import HelpMethods.ElementMethods;
import Logger.LoggerUtility;
import ObjectData.PracticeFormObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BasePage{
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="firstName")
    private WebElement firstName;
    @FindBy(id="lastName")
    private WebElement lastName;
    @FindBy(id="userEmail")
    private WebElement userEmail;

    @FindBy(id="userNumber")
    private WebElement userNumber;

    @FindBy(xpath="//label[@for='gender-radio-1']")
    private WebElement genderMale;
    @FindBy(xpath="//label[@for='gender-radio-2']")
    private WebElement genderFemale;
    @FindBy(xpath="//label[@for='gender-radio-3']")
    private WebElement genderOther;

    @FindBy(id="dateOfBirthInput")
    private WebElement fieldDOB;

    @FindBy(xpath="//select[@class='react-datepicker__year-select']")
    private WebElement year;

    @FindBy(xpath="//select[@class='react-datepicker__month-select']")
    private WebElement month;

    @FindBy(xpath="//label[@for='hobbies-checkbox-1']")
    private WebElement sportsHobby;

    @FindBy(xpath="//label[@for='hobbies-checkbox-2']")
    private WebElement readingHobby;

    @FindBy(xpath="//label[@for='hobbies-checkbox-3']")
    private WebElement musicHobby;


    public void completeFirstRegion (PracticeFormObject practiceFormObject){
        elementMethods.fillElement(firstName,practiceFormObject.getFirstName());
        LoggerUtility.infoTest("The user fills the first name with the value:"+practiceFormObject.getFirstName());
        elementMethods.fillElement(lastName,practiceFormObject.getLastName());
        LoggerUtility.infoTest("The user fills the last name with the value:"+practiceFormObject.getLastName());
        elementMethods.fillElement(userEmail,practiceFormObject.getUserEmail());
        LoggerUtility.infoTest("The user fills the email with the value:"+practiceFormObject.getUserEmail());
        elementMethods.fillElement(userNumber,practiceFormObject.getUserNumber());
        LoggerUtility.infoTest("The user fills the phone number with the value:"+practiceFormObject.getUserNumber());
    }

    public void completeGender(PracticeFormObject practiceFormObject){
        switch (practiceFormObject.getGender()){
            case "Male":
                elementMethods.clickElement(genderMale);
                break;
            case "Female":
                elementMethods.clickElement(genderFemale);
                break;
            case "Other":
                elementMethods.clickElement(genderOther);
                break;
        }

    }

    public void completeDOB(PracticeFormObject practiceFormObject){
        elementMethods.clickElement(fieldDOB);
        LoggerUtility.infoTest("The user clicks on Date field:");
        elementMethods.selectByValue(year,practiceFormObject.getYear());
        LoggerUtility.infoTest("The user selects year:"+practiceFormObject.getYear());
        elementMethods.selectByText(month,practiceFormObject.getMonth());
        LoggerUtility.infoTest("The user selects month:"+practiceFormObject.getMonth());
        WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__week']/*[not(contains(@class,'outside-month'))][text()="+practiceFormObject.getDay()+"]"));
        LoggerUtility.infoTest("The user selects day:"+practiceFormObject.getDay());
        elementMethods.clickElement(date);
        LoggerUtility.infoTest("The user click on day");
    }

    public void completeHobbies(PracticeFormObject practiceFormObject){
        for(String hobbiesArray: practiceFormObject.getHobbies()){
            if (hobbiesArray.contains("Sports")){
                elementMethods.clickElement(sportsHobby);
            }
            else if (hobbiesArray.contains("Reading")){
                elementMethods.clickElement(readingHobby);
            }
            else if (hobbiesArray.contains("Music")){
                elementMethods.clickElement(musicHobby);

            }

        }

    }

}
