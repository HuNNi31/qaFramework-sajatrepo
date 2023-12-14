package sharedData.Browser.Service;

import configXML.DriverConfig;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

@Getter
public class FirefoxBrowserService implements BrowserService{

    private WebDriver driver;

    @Override
    public void openBrowser(DriverConfig driverConfig) {
        driver = new FirefoxDriver((FirefoxOptions) getBrowserOptions(driverConfig));
        driver.get(driverConfig.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(DriverConfig driverConfig) {
        FirefoxOptions options = new FirefoxOptions();
        if (!driverConfig.headless.isEmpty()){
            options.addArguments(driverConfig.headless);
        }
        options.addArguments(driverConfig.gpu);
        options.addArguments(driverConfig.sandbox);
        options.addArguments(driverConfig.resolution);
        return options;
    }
}
