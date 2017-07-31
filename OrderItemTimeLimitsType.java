
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Item Time Limits definition.
 * 
 * <p>Java class for OrderItemTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemTimeLimitsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OrderTimeLimitsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimits" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TicketingTimeLimits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemTimeLimitsType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "priceGuaranteeTimeLimits",
    "ticketingTimeLimits"
})
public class OrderItemTimeLimitsType
    extends OrderTimeLimitsType
{

    @XmlElement(name = "PriceGuaranteeTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PriceGuaranteeTimeLimitType priceGuaranteeTimeLimits;
    @XmlElement(name = "TicketingTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TicketingTimeLimits ticketingTimeLimits;

    /**
     * Gets the value of the priceGuaranteeTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public PriceGuaranteeTimeLimitType getPriceGuaranteeTimeLimits() {
        return priceGuaranteeTimeLimits;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public void setPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        this.priceGuaranteeTimeLimits = value;
    }

    /**
     * Gets the value of the ticketingTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public TicketingTimeLimits getTicketingTimeLimits() {
        return ticketingTimeLimits;
    }

    /**
     * Sets the value of the ticketingTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public void setTicketingTimeLimits(TicketingTimeLimits value) {
        this.ticketingTimeLimits = value;
    }

}
