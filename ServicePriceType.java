
package ndc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Optional Service Price.
 * 
 * <p>Java class for ServicePriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
 *         &lt;element name="RefundableValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
 *                   &lt;element name="Percentage" type="{http://www.iata.org/IATA/EDIST/2017.1}WholePercentageSimpleType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubTotal" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing" minOccurs="0"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Detail" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReferences" minOccurs="0"/>
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
@XmlType(name = "ServicePriceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "total",
    "refundableValue",
    "details",
    "taxes",
    "fees",
    "passengerReferences"
})
public class ServicePriceType {

    @XmlElement(name = "Total", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected CurrencyAmountOptType total;
    @XmlElement(name = "RefundableValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServicePriceType.RefundableValue refundableValue;
    @XmlElement(name = "Details", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServicePriceType.Details details;
    @XmlElement(name = "Taxes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TaxDetailType taxes;
    @XmlElement(name = "Fees", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FeeSurchargeType fees;
    @XmlList
    @XmlElement(name = "PassengerReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReferences;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setTotal(CurrencyAmountOptType value) {
        this.total = value;
    }

    /**
     * Gets the value of the refundableValue property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePriceType.RefundableValue }
     *     
     */
    public ServicePriceType.RefundableValue getRefundableValue() {
        return refundableValue;
    }

    /**
     * Sets the value of the refundableValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePriceType.RefundableValue }
     *     
     */
    public void setRefundableValue(ServicePriceType.RefundableValue value) {
        this.refundableValue = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePriceType.Details }
     *     
     */
    public ServicePriceType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePriceType.Details }
     *     
     */
    public void setDetails(ServicePriceType.Details value) {
        this.details = value;
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
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeeSurchargeType }
     *     
     */
    public FeeSurchargeType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeSurchargeType }
     *     
     */
    public void setFees(FeeSurchargeType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the passengerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPassengerReferences() {
        if (passengerReferences == null) {
            passengerReferences = new ArrayList<Object>();
        }
        return this.passengerReferences;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SubTotal" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing" minOccurs="0"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Detail" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
     *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "subTotal",
        "detail"
    })
    public static class Details {

        @XmlElement(name = "SubTotal", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ServicePriceType.Details.SubTotal subTotal;
        @XmlElement(name = "Detail", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<ServicePriceType.Details.Detail> detail;

        /**
         * Gets the value of the subTotal property.
         * 
         * @return
         *     possible object is
         *     {@link ServicePriceType.Details.SubTotal }
         *     
         */
        public ServicePriceType.Details.SubTotal getSubTotal() {
            return subTotal;
        }

        /**
         * Sets the value of the subTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServicePriceType.Details.SubTotal }
         *     
         */
        public void setSubTotal(ServicePriceType.Details.SubTotal value) {
            this.subTotal = value;
        }

        /**
         * Gets the value of the detail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePriceType.Details.Detail }
         * 
         * 
         */
        public List<ServicePriceType.Details.Detail> getDetail() {
            if (detail == null) {
                detail = new ArrayList<ServicePriceType.Details.Detail>();
            }
            return this.detail;
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
         *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
         *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
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
            "application",
            "amount"
        })
        public static class Detail {

            @XmlElement(name = "Application", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String application;
            @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected CurrencyAmountOptType amount;

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setAmount(CurrencyAmountOptType value) {
                this.amount = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing" minOccurs="0"/>
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
            "encodedCurrencyPrice",
            "detailCurrencyPrice",
            "combinationPricing",
            "awardPricing"
        })
        public static class SubTotal {

            @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected SimpleCurrencyPriceType simpleCurrencyPrice;
            @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected EncodedPriceType encodedCurrencyPrice;
            @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected DetailCurrencyPriceType detailCurrencyPrice;
            @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CombinationPriceType combinationPricing;
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
             * Gets the value of the encodedCurrencyPrice property.
             * 
             * @return
             *     possible object is
             *     {@link EncodedPriceType }
             *     
             */
            public EncodedPriceType getEncodedCurrencyPrice() {
                return encodedCurrencyPrice;
            }

            /**
             * Sets the value of the encodedCurrencyPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link EncodedPriceType }
             *     
             */
            public void setEncodedCurrencyPrice(EncodedPriceType value) {
                this.encodedCurrencyPrice = value;
            }

            /**
             * Gets the value of the detailCurrencyPrice property.
             * 
             * @return
             *     possible object is
             *     {@link DetailCurrencyPriceType }
             *     
             */
            public DetailCurrencyPriceType getDetailCurrencyPrice() {
                return detailCurrencyPrice;
            }

            /**
             * Sets the value of the detailCurrencyPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link DetailCurrencyPriceType }
             *     
             */
            public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
                this.detailCurrencyPrice = value;
            }

            /**
             * Gets the value of the combinationPricing property.
             * 
             * @return
             *     possible object is
             *     {@link CombinationPriceType }
             *     
             */
            public CombinationPriceType getCombinationPricing() {
                return combinationPricing;
            }

            /**
             * Sets the value of the combinationPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link CombinationPriceType }
             *     
             */
            public void setCombinationPricing(CombinationPriceType value) {
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
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
     *         &lt;element name="Percentage" type="{http://www.iata.org/IATA/EDIST/2017.1}WholePercentageSimpleType"/>
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
        "amount",
        "percentage"
    })
    public static class RefundableValue {

        @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "Percentage", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BigDecimal percentage;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setAmount(CurrencyAmountOptType value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentage(BigDecimal value) {
            this.percentage = value;
        }

    }

}
