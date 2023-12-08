package ObjectData;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter
public class WebTableObject {
    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;
    public Integer tableSize;

    public WebTableObject(HashMap<String, String> testData) {
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
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "age":
                    setAge(testData.get(key));
                    break;
                case "salary":
                    setSalary(testData.get(key));
                    break;
                case "department":
                    setDepartment(testData.get(key));
                    break;

            }
        }
    }

}