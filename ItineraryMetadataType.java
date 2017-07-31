
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ITINERARY Metadata definition.
 * 
 * <p>Java class for ItineraryMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryMetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "actionCode"
})
public class ItineraryMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "ActionCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String actionCode;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
