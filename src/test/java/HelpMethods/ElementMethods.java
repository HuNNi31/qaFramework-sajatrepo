package HelpMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethods {
    private WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void moveToElement(WebElement element) {
        Actions action = new Actions(driver);//clasa actions te ajuta sa faci actiuniile din mouse
        action.moveToElement(element).perform();//move to numai indica unde se duce si perform aplica actiunea
    }

    public void waitVisibleElement(WebElement element){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void waitForce(Integer timeValue){
        try {
            Thread.sleep(timeValue);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void fillElement(WebElement element,String text){
        waitVisibleElement(element);
        element.sendKeys(text);
    }
    public void validateTextElement(WebElement element,String text){
        waitVisibleElement(element);
        String actualValue=element.getText();
        Assert.assertEquals(actualValue,text);
    }
    public void selectByText(WebElement element,String text){
        Select countryDropdown=new Select(element);
        countryDropdown.selectByVisibleText(text);
    }
    public void selectByValue(WebElement element,String text){
        Select countryDropdown=new Select(element);
        countryDropdown.selectByValue(text);
    }

    public void clearElement(WebElement element){
        waitVisibleElement(element);
        element.clear();
    }
    public void fillUsingActions(WebElement element, String text){
        Actions actions = new Actions(driver);
        actions.click(element).build().perform();
        actions.sendKeys(text).build().perform();
        waitVisibleElement(element);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void pressEnter(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
}
