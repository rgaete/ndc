
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePricingOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "servicePricingOnlyInd"
})
@XmlRootElement(name = "ServicePricingOnlyPreference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class ServicePricingOnlyPreference {

    @XmlElement(name = "ServicePricingOnlyInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected boolean servicePricingOnlyInd;

    /**
     * Gets the value of the servicePricingOnlyInd property.
     * 
     */
    public boolean isServicePricingOnlyInd() {
        return servicePricingOnlyInd;
    }

    /**
     * Sets the value of the servicePricingOnlyInd property.
     * 
     */
    public void setServicePricingOnlyInd(boolean value) {
        this.servicePricingOnlyInd = value;
    }

}
