
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * DETAIL SEAT definition.
 * 
 * <p>Java class for SeatDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatCoreType">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}SeatCharacteristicType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "details"
})
@XmlSeeAlso({
    SeatOfferType.class,
    SeatOfferCoreType.class
})
public class SeatDetailType
    extends SeatCoreType
{

    @XmlElement(name = "Details", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatCharacteristicType details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link SeatCharacteristicType }
     *     
     */
    public SeatCharacteristicType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatCharacteristicType }
     *     
     */
    public void setDetails(SeatCharacteristicType value) {
        this.details = value;
    }

}
