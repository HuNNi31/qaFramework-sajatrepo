package Pages.Widgets;

import Logger.LoggerUtility;
import ObjectData.PracticeFormObject;
import ObjectData.ProgressBarObject;
import Pages.BasePage;
import ReportUtility.ExtentUtility;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import sharedData.Hooks;

import java.time.Duration;
import java.util.Objects;
import java.util.logging.Handler;
public class WidgetProgressBarPage extends BasePage {

    public WidgetProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "progressBar")
    private WebElement progressBar;

    @FindBy(id = "startStopButton")
    private WebElement startStopButton;
    @FindBy(xpath = "//span[text()='Progress Bar']") //Why is this span?
    private WebElement progressBarTitle;

//    @FindBy(xpath = "//div[@id='progressBar']")
//    private WebElement progressBarValue;


    public void useProgressBar(ProgressBarObject progressBarObject)  {

        LoggerUtility.infoTest("The progressBar starts");

        for (int i = 0; i < Integer.parseInt(progressBarObject.getWhereToStop()); ++i) {
            elementMethods.clickElement(startStopButton);
            elementMethods.clickElement(startStopButton);

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        String progressBarValue = progressBar.getText();
        LoggerUtility.infoTest("Current Progress Bar Value: "+ progressBarValue);

        //set the progressbar to 1%
        driver.navigate().refresh();

        //restart the progressbar
        elementMethods.clickElement(startStopButton);
        Assert.assertEquals("Stop",startStopButton.getText());


        System.out.println("Where to Stop the bar: "+progressBarObject.getWhereToStop()+"%");

            while (true) {
                // Assert that the startStopButton is visible
                assert startStopButton.isDisplayed() : "Start Stop Button is visible";
                progressBarValue=progressBar.getText();
                System.out.println("Current Progress Bar Value in While: " + progressBarValue);

                if (progressBarValue.equals(progressBarObject.getWhereToStop()+"%")) {
                    elementMethods.clickElement(startStopButton);
                    LoggerUtility.infoTest("Progress Bar reached: "+ progressBarValue);
                    break;

                }





            }
        LoggerUtility.infoTest("I start/stop the bar"+progressBarObject.getWhereToStop()+"times, then after reset i stop the bar at"+progressBarObject.getWhereToStop());

    }

}

