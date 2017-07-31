
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * DETAIL OFFER definition.
 * 
 * <p>Java class for OfferItemDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemCoreType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Match" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemDetailType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "match"
})
@XmlSeeAlso({
    OfferType.class
})
public class OfferItemDetailType
    extends OfferItemCoreType
{

    @XmlElement(name = "Match", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferMatchType match;

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link OfferMatchType }
     *     
     */
    public OfferMatchType getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferMatchType }
     *     
     */
    public void setMatch(OfferMatchType value) {
        this.match = value;
    }

}
