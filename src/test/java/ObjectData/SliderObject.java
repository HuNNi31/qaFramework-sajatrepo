package ObjectData;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
@Getter
@Setter
public class SliderObject extends CommonObject {

    private String slider;
    private List<String> sliders;
    private String sliderValue;
    public SliderObject(HashMap<String, String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData) {
        setSlider(testData.get("right"));
        setSliders(getValueAsList(testData.get("sliders")));

    }
}