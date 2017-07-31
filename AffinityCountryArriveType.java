
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Country Flight Arrival (Destination) information.
 * 
 * <p>Java class for AffinityCountryArriveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityCountryArriveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/EDIST/2017.1}CountryQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityCountryArriveType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "arrival"
})
public class AffinityCountryArriveType {

    @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected CountryQueryType arrival;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType }
     *     
     */
    public CountryQueryType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType }
     *     
     */
    public void setArrival(CountryQueryType value) {
        this.arrival = value;
    }

}
