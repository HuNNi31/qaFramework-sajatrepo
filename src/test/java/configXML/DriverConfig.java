package configXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DriverConfig {

    @XmlElement(name="localDriver")
    public String localDriver;
    @XmlElement(name="url")
    public String url;
    @XmlElement(name="headless")
    public String headless;
    @XmlElement(name="gpu")
    public String gpu;
    @XmlElement(name="resolution")
    public String resolution;
    @XmlElement(name="sandbox")
    public String sandbox;


}
