
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query State or Province Flight Departure (Origin) information.
 * 
 * <p>Java class for AffinityStateProvDepartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityStateProvDepartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Departure" type="{http://www.iata.org/IATA/EDIST/2017.1}StateProvQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityStateProvDepartType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "departure"
})
public class AffinityStateProvDepartType {

    @XmlElement(name = "Departure", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected StateProvQueryType departure;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvQueryType }
     *     
     */
    public StateProvQueryType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvQueryType }
     *     
     */
    public void setDeparture(StateProvQueryType value) {
        this.departure = value;
    }

}
