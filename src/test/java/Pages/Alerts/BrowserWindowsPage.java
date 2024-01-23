package Pages.Alerts;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTabButton ;
    @FindBy(id = "windowButton")
    private WebElement newWindowButton  ;
    @FindBy(id = "messageWindowButton ")
    private WebElement newWindowMessageButton  ;


}
