package ObjectData;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter
public class ProgressBarObject{
    private String whereToStop;
    //public String progressBarValue;


    public ProgressBarObject(HashMap<String, String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "whereToStop":
                    setWhereToStop(testData.get(key));
                    break;


            }
        }
    }

}