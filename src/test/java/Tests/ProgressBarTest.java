package Tests;

import ObjectData.ProgressBarObject;
import ObjectData.SliderObject;
import Pages.HomePage;
import Pages.Widgets.WidgetProgressBarPage;
import Pages.Widgets.WidgetsPage;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;

public class ProgressBarTest extends Hooks {

@Test
    public void SliderTest(){
        ProgressBarObject progressBarObject = new ProgressBarObject(propertyUtility.getAllData());
        HomePage homePage = new HomePage(getDriver());
        homePage.clickWidgetsPage();
        ExtentUtility.attachTestLog("pass","I make a click Widget page element");

        WidgetsPage widgetsPage = new WidgetsPage(getDriver());
        widgetsPage.clickProgressBarPage();
        ExtentUtility.attachTestLog("pass","I make a click ProgressBar page element");

        WidgetProgressBarPage widgetProgressBarPage = new WidgetProgressBarPage(getDriver());
        widgetProgressBarPage.useProgressBar(progressBarObject);
    ExtentUtility.attachTestLog("pass","I start/stop the bar "+progressBarObject.getWhereToStop()+"times, then after reset i stop the bar at "+progressBarObject.getWhereToStop()+"%");

    }
}
