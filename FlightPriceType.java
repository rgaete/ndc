
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight Price definition.
 * 
 * <p>Java class for FlightPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
 *         &lt;element name="Surcharges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemption" minOccurs="0"/>
 *         &lt;element name="Fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPriceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "baseAmount",
    "surcharges",
    "taxes",
    "taxExemption",
    "fees"
})
@XmlSeeAlso({
    ndc.FlightItemOfferType.Pricing.class
})
public class FlightPriceType {

    @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "Surcharges", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightPriceType.Surcharges surcharges;
    @XmlElement(name = "Taxes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TaxDetailType taxes;
    @XmlElement(name = "TaxExemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TaxExemptionType taxExemption;
    @XmlElement(name = "Fees", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightPriceType.Fees fees;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setBaseAmount(CurrencyAmountOptType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPriceType.Surcharges }
     *     
     */
    public FlightPriceType.Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceType.Surcharges }
     *     
     */
    public void setSurcharges(FlightPriceType.Surcharges value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxes(TaxDetailType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType }
     *     
     */
    public TaxExemptionType getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType }
     *     
     */
    public void setTaxExemption(TaxExemptionType value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPriceType.Fees }
     *     
     */
    public FlightPriceType.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceType.Fees }
     *     
     */
    public void setFees(FlightPriceType.Fees value) {
        this.fees = value;
    }

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Fees
        extends FeeSurchargeType
    {


    }


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
     *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
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
        "surcharge"
    })
    public static class Surcharges {

        @XmlElement(name = "Surcharge", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<FeeSurchargeType> surcharge;

        /**
         * Gets the value of the surcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurcharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeSurchargeType }
         * 
         * 
         */
        public List<FeeSurchargeType> getSurcharge() {
            if (surcharge == null) {
                surcharge = new ArrayList<FeeSurchargeType>();
            }
            return this.surcharge;
        }

    }

}
