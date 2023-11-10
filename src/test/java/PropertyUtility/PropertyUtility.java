package PropertyUtility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class PropertyUtility {

    public Properties properties;

    public PropertyUtility(String testName) {
        loadFile(testName);
    }

    public void loadFile(String testName){
        properties=new Properties();
        try {
            FileInputStream fileInputStream=new FileInputStream("src/test/resources/inputData/"+testName+"Data.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<String,String> getAllData(){
        HashMap<String,String> testData=new HashMap<>();
        for(Object key:properties.keySet()){
            testData.put(key.toString(),properties.getProperty(key.toString()));
        }
        return testData;
    }
}
