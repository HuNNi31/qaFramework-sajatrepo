package ObjectData;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
@Getter
@Setter
public class PracticeFormObject extends CommonObject {


    private String firstName;
    private String lastName;
    private String userEmail;

    private String userNumber;

    private String gender;

    private String year;
    private String month;

    private String day;

    private String subjects;

    private List<String> hobbies;
    private String address;

    private String city;

    private String state;


    public PracticeFormObject(HashMap<String, String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "firstName":
                    setFirstName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "userEmail":
                    setUserEmail(testData.get(key));
                    break;
                case "userNumber":
                    setUserNumber(testData.get(key));
                    break;
                case "gender":
                    setGender(testData.get(key));
                    break;
                case "year":
                    setYear(testData.get(key));
                    break;
                case "month":
                    setMonth(testData.get(key));
                    break;
                case "day":
                    setDay(testData.get(key));
                    break;
                case "hobbies":
                    setHobbies(getValueAsList(testData.get(key)));
                    break;
                case "subjects":
                    setSubjects(testData.get(key));
                    break;
                case "address":
                    setAddress(testData.get(key));
                    break;
                case "state":
                    setState(testData.get(key));
                    break;
                case "city":
                    setCity(testData.get(key));
                    break;


            }
        }
    }
}