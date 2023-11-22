package ObjectData;

import java.util.HashMap;
import java.util.List;

public class PracticeFormObject extends CommonObject{


    private String firstName;
    private String lastName;
    private String userEmail;

    private String userNumber;

    private String gender;

    private String year;
    private String month;

    private String day;

    private List<String> hobbies;

    public PracticeFormObject(HashMap<String,String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String,String> testData){
        for(String key:testData.keySet()){
            switch(key){
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



            }
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
