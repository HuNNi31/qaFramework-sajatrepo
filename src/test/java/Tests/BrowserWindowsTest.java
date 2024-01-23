package Tests;
import ObjectData.ProgressBarObject;
import Pages.Alerts.AlertsPage;
import Pages.HomePage;
import Pages.Widgets.WidgetProgressBarPage;
import Pages.Widgets.WidgetsPage;
import ReportUtility.ExtentUtility;
import org.testng.annotations.Test;
import sharedData.Hooks;
public class BrowserWindowsTest extends Hooks{


    @Test
    public void BrowserWindowsTest(){
        ProgressBarObject progressBarObject = new ProgressBarObject(propertyUtility.getAllData());
        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertsPage();

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.clickbrowerwindowsElement();


    }
}


