
package ndc;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="BookingReference" type="{http://www.iata.org/IATA/EDIST/2017.1}BookingReferenceType" maxOccurs="unbounded"/>
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
    "bookingReference"
})
@XmlRootElement(name = "BookingReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class BookingReferences {

    @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<BookingReferenceType> bookingReference;

    /**
     * Gets the value of the bookingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingReferenceType }
     * 
     * 
     */
    public List<BookingReferenceType> getBookingReference() {
        if (bookingReference == null) {
            bookingReference = new ArrayList<BookingReferenceType>();
        }
        return this.bookingReference;
    }

}
