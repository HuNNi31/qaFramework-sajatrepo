package Pages.Alerts;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath="//span[text()='Browser Windows']")
    private WebElement browserwindowsElement;

    public void clickbrowerwindowsElement(){
        elementMethods.clickElement(browserwindowsElement);
        LoggerUtility.infoTest("The user clicks on browserwindows elements");
    }
}
