package Pages.Widgets;
import Logger.LoggerUtility;
import ObjectData.SliderObject;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetSliderPage extends BasePage {
    public WidgetSliderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//input[@type=\"range\"]")
    private WebElement slider;
    @FindBy (xpath = "//input[@id=\"sliderValue\"]")
    private WebElement sliderValue;


    public void moveSlider(SliderObject sliderObject){
        //elementMethods.moveSlider(slider,"12");//12 puts the slider to 62
        elementMethods.moveSlider(slider,sliderObject.getSlider());
    }

    public void movesSlider(SliderObject sliderObject){
        for(String movesArray: sliderObject.getSliders()){
            //  elementMethods.moveSlider(slider,sliderObject.setSliders());
            elementMethods.moveSlider(slider,movesArray);
            LoggerUtility.infoTest("The value of slider is "+sliderValue.getAttribute("value"));
        }
        LoggerUtility.infoTest("The user set slider to "+sliderObject.getSliders() +"in order");
    }

    public void moveSliderWithButton(SliderObject sliderObject){
        elementMethods.moveSliderWithButtonsRight(slider,Integer. parseInt(sliderObject.getSlider()));
        LoggerUtility.infoTest("The value of slider is "+sliderValue.getAttribute("value"));
        elementMethods.moveSliderWithButtonsLeft(slider,15);
        LoggerUtility.infoTest("The value of slider is "+sliderValue.getAttribute("value"));
    }

}
