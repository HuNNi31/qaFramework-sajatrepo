package configXML;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="configuration")
public class Configuration {

    @XmlElement(name="driverConfig")
    public DriverConfig driverConfig;



}
