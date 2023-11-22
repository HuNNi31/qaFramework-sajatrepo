package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{

    public FormsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//span[text()='Practice Form']")
    private WebElement practiceFormPage;
    public void clickPracticeFormElement(){
        elementMethods.clickElement(practiceFormPage);
        LoggerUtility.infoTest("The user clicks on practice Form elements");
    }
}
