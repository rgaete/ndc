
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight Price definition.
 * 
 * <p>Java class for GenericPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
 *         &lt;element name="Equivalent" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
 *         &lt;element name="Total" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                   &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceSimpleType"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPriceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "baseAmount",
    "equivalent",
    "surcharges",
    "taxes",
    "taxExemption",
    "fees",
    "total"
})
public class GenericPriceType {

    @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "Equivalent", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Object equivalent;
    @XmlElement(name = "Surcharges", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected GenericPriceType.Surcharges surcharges;
    @XmlElement(name = "Taxes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TaxDetailType taxes;
    @XmlElement(name = "TaxExemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TaxExemptionType taxExemption;
    @XmlElement(name = "Fees", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected GenericPriceType.Fees fees;
    @XmlElement(name = "Total", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected GenericPriceType.Total total;

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
     * Gets the value of the equivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEquivalent() {
        return equivalent;
    }

    /**
     * Sets the value of the equivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEquivalent(Object value) {
        this.equivalent = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPriceType.Surcharges }
     *     
     */
    public GenericPriceType.Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPriceType.Surcharges }
     *     
     */
    public void setSurcharges(GenericPriceType.Surcharges value) {
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
     *     {@link GenericPriceType.Fees }
     *     
     */
    public GenericPriceType.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPriceType.Fees }
     *     
     */
    public void setFees(GenericPriceType.Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPriceType.Total }
     *     
     */
    public GenericPriceType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPriceType.Total }
     *     
     */
    public void setTotal(GenericPriceType.Total value) {
        this.total = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *         &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceSimpleType"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "simpleCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class Total {

        @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CombinationPriceSimpleType combinationPricing;
        @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AwardPriceUnitType awardPricing;

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceSimpleType }
         *     
         */
        public CombinationPriceSimpleType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceSimpleType }
         *     
         */
        public void setCombinationPricing(CombinationPriceSimpleType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

    }

}
