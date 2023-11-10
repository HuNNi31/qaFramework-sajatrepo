package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {
    private WebDriver driver;
    public AlertMethods(WebDriver driver) {
        this.driver=driver;
    }
    public void alertOk(){
        Alert alertOk=driver.switchTo().alert();
        alertOk.accept();
    }
    public void alertCancel(){
        Alert alertCancel=driver.switchTo().alert();
        alertCancel.dismiss();
    }
    public void alertText(String value){
        Alert alertTextBox=driver.switchTo().alert();
        alertTextBox.sendKeys(value);
        alertTextBox.accept();

    }
}
