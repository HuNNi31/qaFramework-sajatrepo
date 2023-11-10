package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsField;

    public void clickElementsPage(){
        elementMethods.clickElement(elementsField);
        LoggerUtility.infoTest("The user clicks on elementsField");
    }
}
