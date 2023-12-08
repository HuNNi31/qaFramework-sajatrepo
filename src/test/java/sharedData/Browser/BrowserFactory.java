package sharedData.Browser;

import configXML.Configuration;
import configXML.GeneralConfig;
import org.openqa.selenium.WebDriver;
import sharedData.Browser.Service.ChromeBrowserService;
import sharedData.Browser.Service.EdgeBrowserService;

public class BrowserFactory {

    public WebDriver getBrowserDriver(){
        boolean ci_cd=Boolean.parseBoolean(System.getProperty("ci_cd"));
        String localBrowser=System.getProperty("browser");
        Configuration configuration = GeneralConfig.getGenericConfig(Configuration.class);

        if(ci_cd){
            configuration.driverConfig.headless="--headless";
        }
        else {
            localBrowser=configuration.driverConfig.localDriver;
        }

        System.out.println("BROWSERUL ESTE" + localBrowser);
        //factory method design pattern
        switch (localBrowser){
            case BrowserType.BROWSER_CHROME:
                ChromeBrowserService chromeBrowserService = new ChromeBrowserService();
                chromeBrowserService.openBrowser(configuration.driverConfig);
                return chromeBrowserService.getDriver();
            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeBrowserService = new EdgeBrowserService();
                edgeBrowserService.openBrowser(configuration.driverConfig);
                return edgeBrowserService.getDriver();
        }

        return null;
    }


}
