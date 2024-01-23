package Tests;
import ObjectData.SliderObject;
import Pages.HomePage;
import Pages.Widgets.WidgetSliderPage;
import Pages.Widgets.WidgetsPage;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
public class SliderTest extends Hooks{

    @Test
    public void SliderTest(){
        SliderObject sliderObject = new SliderObject(propertyUtility.getAllData());
        HomePage homePage = new HomePage(getDriver());
        homePage.clickWidgetsPage();
        ExtentUtility.attachTestLog("pass","I make a click on element in the tab");
        WidgetsPage widgetsPage = new WidgetsPage(getDriver());
        widgetsPage.clickSliderPage();
        ExtentUtility.attachTestLog("pass","I make a click on Slider Page");

        WidgetSliderPage widgetSliderPage = new WidgetSliderPage(getDriver());
       // widgetSliderPage.moveSlider(sliderObject);
        ExtentUtility.attachTestLog("pass","I set slider to 62");
        //widgetSliderPage.moveSlider(sliderObject);

        //widgetSliderPage.movesSlider(sliderObject);
        ExtentUtility.attachTestLog("pass","I set slider multiple times");

        widgetSliderPage.moveSliderWithButton(sliderObject);
        ExtentUtility.attachTestLog("pass","I move slider with Buttons");
    }

}
