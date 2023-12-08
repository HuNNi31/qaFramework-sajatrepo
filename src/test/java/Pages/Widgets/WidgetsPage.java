package Pages.Widgets;
import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class WidgetsPage extends BasePage {
    public WidgetsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//span[text()='Slider']")
    private WebElement sliderPage;
    public void clickSliderPage(){
        elementMethods.scrollToElement(sliderPage);
        elementMethods.clickElement(sliderPage);
        LoggerUtility.infoTest("The user clicks on Slider page inside Widgets");
    }
}
