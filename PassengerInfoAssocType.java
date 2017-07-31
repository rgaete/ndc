
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated Passenger(s) definition.
 * 
 * <p>Java class for PassengerInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AllPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReferences"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerInfoAssocType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "allPassengerInd",
    "passengerReferences"
})
public class PassengerInfoAssocType {

    @XmlElement(name = "AllPassengerInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Boolean allPassengerInd;
    @XmlList
    @XmlElement(name = "PassengerReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReferences;

    /**
     * Gets the value of the allPassengerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPassengerInd() {
        return allPassengerInd;
    }

    /**
     * Sets the value of the allPassengerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllPassengerInd(Boolean value) {
        this.allPassengerInd = value;
    }

    /**
     * Association to multiple Passenger instance(s). Example: Passenger1 Passenger2
     * 
     * Note: May be Passenger (by PTC) instance(s).Gets the value of the passengerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPassengerReferences() {
        if (passengerReferences == null) {
            passengerReferences = new ArrayList<Object>();
        }
        return this.passengerReferences;
    }

}