
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Reference Point Flight Arrival (Destination) information.
 * 
 * <p>Java class for AffinityReferencePointArriveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityReferencePointArriveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/EDIST/2017.1}ReferencePointQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityReferencePointArriveType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "arrival"
})
public class AffinityReferencePointArriveType {

    @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ReferencePointQueryType arrival;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointQueryType }
     *     
     */
    public ReferencePointQueryType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointQueryType }
     *     
     */
    public void setArrival(ReferencePointQueryType value) {
        this.arrival = value;
    }

}
