
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OrderQualiferType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReferences"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BookingReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengerReferences",
    "bookingReference"
})
@XmlRootElement(name = "ExistingOrderQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class ExistingOrderQualifier
    extends OrderQualiferType
{

    @XmlList
    @XmlElement(name = "PassengerReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReferences;
    @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BookingReference bookingReference;

    /**
     * Gets the value of the passengerReferences property.
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

    /**
     * Existing Booking Reference (e.g. PNR Record Locator). Example: R1A3SK
     * 
     * @return
     *     possible object is
     *     {@link BookingReference }
     *     
     */
    public BookingReference getBookingReference() {
        return bookingReference;
    }

    /**
     * Sets the value of the bookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReference }
     *     
     */
    public void setBookingReference(BookingReference value) {
        this.bookingReference = value;
    }

}
