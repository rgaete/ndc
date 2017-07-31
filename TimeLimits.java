
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;element name="PaymentTimeLimit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepositTimeLimit" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TicketingTimeLimits" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "paymentTimeLimit",
    "priceGuaranteeTimeLimit",
    "depositTimeLimit",
    "ticketingTimeLimits",
    "namingTimeLimit",
    "bilateralTimeLimits"
})
@XmlRootElement(name = "TimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class TimeLimits {

    @XmlElement(name = "PaymentTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TimeLimits.PaymentTimeLimit paymentTimeLimit;
    @XmlElement(name = "PriceGuaranteeTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
    @XmlElement(name = "DepositTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected DepositTimeLimit depositTimeLimit;
    @XmlElement(name = "TicketingTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TicketingTimeLimits ticketingTimeLimits;
    @XmlElement(name = "NamingTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected NamingTimeLimit namingTimeLimit;
    @XmlElement(name = "BilateralTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BilateralTimeLimitsType bilateralTimeLimits;

    /**
     * Gets the value of the paymentTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLimits.PaymentTimeLimit }
     *     
     */
    public TimeLimits.PaymentTimeLimit getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * Sets the value of the paymentTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLimits.PaymentTimeLimit }
     *     
     */
    public void setPaymentTimeLimit(TimeLimits.PaymentTimeLimit value) {
        this.paymentTimeLimit = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimit }
     *     
     */
    public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
        return priceGuaranteeTimeLimit;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimit }
     *     
     */
    public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
        this.priceGuaranteeTimeLimit = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PaymentTimeLimit
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

    }

}
