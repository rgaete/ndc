
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Time Limits definition.
 * 
 * <p>Java class for OrderTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderTimeLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentTimeLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepositTimeLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}NamingTimeLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BilateralTimeLimits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTimeLimitsType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "paymentTimeLimit",
    "depositTimeLimit",
    "namingTimeLimit",
    "bilateralTimeLimits"
})
@XmlSeeAlso({
    OrderItemTimeLimitsType.class,
    ndc.OrderCoreChangeType.TimeLimits.class
})
public class OrderTimeLimitsType {

    @XmlElement(name = "PaymentTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PaymentTimeLimitType paymentTimeLimit;
    @XmlElement(name = "DepositTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected DepositTimeLimit depositTimeLimit;
    @XmlElement(name = "NamingTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected NamingTimeLimit namingTimeLimit;
    @XmlElement(name = "BilateralTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BilateralTimeLimitsType bilateralTimeLimits;

    /**
     * Gets the value of the paymentTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTimeLimitType }
     *     
     */
    public PaymentTimeLimitType getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * Sets the value of the paymentTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimeLimitType }
     *     
     */
    public void setPaymentTimeLimit(PaymentTimeLimitType value) {
        this.paymentTimeLimit = value;
    }

    /**
     * Gets the value of the depositTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link DepositTimeLimit }
     *     
     */
    public DepositTimeLimit getDepositTimeLimit() {
        return depositTimeLimit;
    }

    /**
     * Sets the value of the depositTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositTimeLimit }
     *     
     */
    public void setDepositTimeLimit(DepositTimeLimit value) {
        this.depositTimeLimit = value;
    }

    /**
     * Gets the value of the namingTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link NamingTimeLimit }
     *     
     */
    public NamingTimeLimit getNamingTimeLimit() {
        return namingTimeLimit;
    }

    /**
     * Sets the value of the namingTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamingTimeLimit }
     *     
     */
    public void setNamingTimeLimit(NamingTimeLimit value) {
        this.namingTimeLimit = value;
    }

    /**
     * Gets the value of the bilateralTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link BilateralTimeLimitsType }
     *     
     */
    public BilateralTimeLimitsType getBilateralTimeLimits() {
        return bilateralTimeLimits;
    }

    /**
     * Sets the value of the bilateralTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilateralTimeLimitsType }
     *     
     */
    public void setBilateralTimeLimits(BilateralTimeLimitsType value) {
        this.bilateralTimeLimits = value;
    }

}
