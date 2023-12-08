package configXML;

import lombok.SneakyThrows;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class GeneralConfig {

    //Facem o metoda generica, care sa ne returneze un obiect specific unei bucati din config.xml
    @SneakyThrows(JAXBException.class)
    public static <T> T getGenericConfig(Class<T> klass){
        JAXBContext jaxbContext = JAXBContext.newInstance(klass);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return klass.cast(unmarshaller.unmarshal(new File("src/test/resources/sharedDataConfig.xml")));
    }



}
