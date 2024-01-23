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
    @FindBy(xpath = "//span[text()='Progress Bar']")
    private WebElement progressBarPage;

    public void clickSliderPage(){
        elementMethods.scrollToElement(sliderPage);
        elementMethods.clickElement(sliderPage);
        LoggerUtility.infoTest("The user clicks on Slider page inside Widgets");
    }
    public void clickProgressBarPage(){
        elementMethods.scrollToElement(progressBarPage);
        elementMethods.clickElement(progressBarPage);
        LoggerUtility.infoTest("The user clicks on Slider page inside Widgets");
    }
}
