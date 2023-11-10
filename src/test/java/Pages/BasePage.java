package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public BasePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(this.driver,this);
        //findElement(By.cssSelector("...']"));
        // in momentul cand faci Page sa se asigure ca toate findBy-uriile sunt initializate si au valori
        elementMethods=new ElementMethods(driver);
        alertMethods=new AlertMethods(driver);

    }
}
