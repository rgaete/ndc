
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Alternate Seat Offer with Order Association definition.
 *       
 * 
 * <p>Java class for AltSeatOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltSeatOfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatOfferCoreType">
 *       &lt;sequence>
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}MultiAssociationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltSeatOfferType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "associations"
})
public class AltSeatOfferType
    extends SeatOfferCoreType
{

    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MultiAssociationType associations;

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

}
