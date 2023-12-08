package sharedData.Browser.Service;

import configXML.DriverConfig;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

@Getter
public class ChromeBrowserService implements BrowserService{

    private WebDriver driver;

    @Override
    public void openBrowser(DriverConfig driverConfig) {
        driver = new ChromeDriver((ChromeOptions) getBrowserOptions(driverConfig));
        driver.get(driverConfig.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(DriverConfig driverConfig) {
        ChromeOptions options = new ChromeOptions();
        if (!driverConfig.headless.isEmpty()){
            options.addArguments(driverConfig.headless);
        }
        options.addArguments(driverConfig.gpu);
        options.addArguments(driverConfig.sandbox);
        options.addArguments(driverConfig.resolution);
        return options;
    }
}
