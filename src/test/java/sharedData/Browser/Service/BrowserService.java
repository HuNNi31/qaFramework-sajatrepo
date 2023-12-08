package sharedData.Browser.Service;

import configXML.DriverConfig;

public interface BrowserService {

    void openBrowser(DriverConfig driverConfig);
    Object getBrowserOptions(DriverConfig driverConfig);
}
