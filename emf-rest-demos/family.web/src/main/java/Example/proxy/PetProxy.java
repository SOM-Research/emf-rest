package Example.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pet",namespace="http://emf-rest.com/proxy")
@XmlAccessorType(XmlAccessType.FIELD)
public class PetProxy {


	String url;
}



