
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Reference Point Flight Departure (Origin) information.
 * 
 * <p>Java class for AffinityReferencePointDepartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityReferencePointDepartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Departure" type="{http://www.iata.org/IATA/EDIST/2017.1}ReferencePointQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityReferencePointDepartType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "departure"
})
public class AffinityReferencePointDepartType {

    @XmlElement(name = "Departure", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ReferencePointQueryType departure;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointQueryType }
     *     
     */
    public ReferencePointQueryType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointQueryType }
     *     
     */
    public void setDeparture(ReferencePointQueryType value) {
        this.departure = value;
    }

}
