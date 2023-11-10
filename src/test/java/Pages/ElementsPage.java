package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{

    public ElementsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath="//span[text()='Web Tables']")
    private WebElement webTablesElement;

    public void clickWebTablesElement(){
        elementMethods.clickElement(webTablesElement);
        LoggerUtility.infoTest("The user clicks on web Tables elements");
    }
}
