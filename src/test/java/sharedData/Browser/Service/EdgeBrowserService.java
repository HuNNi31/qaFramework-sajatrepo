package sharedData.Browser.Service;

import configXML.DriverConfig;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

//S.o.l.i.d
//interface segregation
@Getter
public class EdgeBrowserService implements BrowserService{

    private WebDriver driver;

    @Override
    public void openBrowser(DriverConfig driverConfig) {
        driver = new EdgeDriver((EdgeOptions) getBrowserOptions(driverConfig));
        driver.get(driverConfig.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(DriverConfig driverConfig) {
        EdgeOptions options = new EdgeOptions();
        if (!driverConfig.headless.isEmpty()){
            options.addArguments(driverConfig.headless);
        }
        options.addArguments(driverConfig.gpu);
        options.addArguments(driverConfig.sandbox);
        options.addArguments(driverConfig.resolution);
        return options;
    }
}
