package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sharedData.Browser.BrowserFactory;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    public void initiateDriver(){
        driver = new BrowserFactory().getBrowserDriver();
    }

    public void closeDriver(){
        //driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
