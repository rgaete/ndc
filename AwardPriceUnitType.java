
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AWARD/ REDEMPTION PRICE BASIS UNIT definition.
 * 
 * <p>Java class for AwardPriceUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardPriceUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardRedemptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardPriceUnitType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "redemption"
})
public class AwardPriceUnitType {

    @XmlElement(name = "Redemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected AwardRedemptionType redemption;

    /**
     * Gets the value of the redemption property.
     * 
     * @return
     *     possible object is
     *     {@link AwardRedemptionType }
     *     
     */
    public AwardRedemptionType getRedemption() {
        return redemption;
    }

    /**
     * Sets the value of the redemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardRedemptionType }
     *     
     */
    public void setRedemption(AwardRedemptionType value) {
        this.redemption = value;
    }

}
