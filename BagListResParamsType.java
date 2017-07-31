
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Baggage List Response Parameters definition.
 * 
 * <p>Java class for BagListResParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagListResParamsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MessageParamsBaseType">
 *       &lt;sequence>
 *         &lt;element name="Pricing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OverrideCurrency" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
 *                   &lt;element name="FeeExemption" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AssociatedObjectBaseType">
 *                           &lt;sequence>
 *                             &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Code">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ProvinceCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="GovernmentBody" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagListResParamsType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "pricing"
})
public class BagListResParamsType
    extends MessageParamsBaseType
{

    @XmlElement(name = "Pricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagListResParamsType.Pricing pricing;

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link BagListResParamsType.Pricing }
     *     
     */
    public BagListResParamsType.Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagListResParamsType.Pricing }
     *     
     */
    public void setPricing(BagListResParamsType.Pricing value) {
        this.pricing = value;
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
     *         &lt;element name="OverrideCurrency" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
     *         &lt;element name="FeeExemption" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AssociatedObjectBaseType">
     *                 &lt;sequence>
     *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Code">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ProvinceCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="GovernmentBody" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overrideCurrency",
        "feeExemption"
    })
    public static class Pricing {

        @XmlElement(name = "OverrideCurrency", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String overrideCurrency;
        @XmlElement(name = "FeeExemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BagListResParamsType.Pricing.FeeExemption feeExemption;
        @XmlAttribute(name = "AutoExchangeInd")
        protected Boolean autoExchangeInd;
        @XmlAttribute(name = "AwardIncludedInd")
        protected Boolean awardIncludedInd;
        @XmlAttribute(name = "AwardOnlyInd")
        protected Boolean awardOnlyInd;
        @XmlAttribute(name = "SimpleInd")
        protected Boolean simpleInd;

        /**
         * Gets the value of the overrideCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverrideCurrency() {
            return overrideCurrency;
        }

        /**
         * Sets the value of the overrideCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverrideCurrency(String value) {
            this.overrideCurrency = value;
        }

        /**
         * Gets the value of the feeExemption property.
         * 
         * @return
         *     possible object is
         *     {@link BagListResParamsType.Pricing.FeeExemption }
         *     
         */
        public BagListResParamsType.Pricing.FeeExemption getFeeExemption() {
            return feeExemption;
        }

        /**
         * Sets the value of the feeExemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagListResParamsType.Pricing.FeeExemption }
         *     
         */
        public void setFeeExemption(BagListResParamsType.Pricing.FeeExemption value) {
            this.feeExemption = value;
        }

        /**
         * Gets the value of the autoExchangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoExchangeInd() {
            return autoExchangeInd;
        }

        /**
         * Sets the value of the autoExchangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoExchangeInd(Boolean value) {
            this.autoExchangeInd = value;
        }

        /**
         * Gets the value of the awardIncludedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardIncludedInd() {
            return awardIncludedInd;
        }

        /**
         * Sets the value of the awardIncludedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardIncludedInd(Boolean value) {
            this.awardIncludedInd = value;
        }

        /**
         * Gets the value of the awardOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardOnlyInd() {
            return awardOnlyInd;
        }

        /**
         * Sets the value of the awardOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardOnlyInd(Boolean value) {
            this.awardOnlyInd = value;
        }

        /**
         * Gets the value of the simpleInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSimpleInd() {
            return simpleInd;
        }

        /**
         * Sets the value of the simpleInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSimpleInd(Boolean value) {
            this.simpleInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AssociatedObjectBaseType">
         *       &lt;sequence>
         *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Code">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ProvinceCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="GovernmentBody" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fee",
            "countryCode",
            "provinceCode",
            "governmentBody"
        })
        public static class FeeExemption
            extends AssociatedObjectBaseType
        {

            @XmlElement(name = "Fee", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<BagListResParamsType.Pricing.FeeExemption.Fee> fee;
            @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<CountryCode> countryCode;
            @XmlElement(name = "ProvinceCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<String> provinceCode;
            @XmlElement(name = "GovernmentBody", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String governmentBody;

            /**
             * Gets the value of the fee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BagListResParamsType.Pricing.FeeExemption.Fee }
             * 
             * 
             */
            public List<BagListResParamsType.Pricing.FeeExemption.Fee> getFee() {
                if (fee == null) {
                    fee = new ArrayList<BagListResParamsType.Pricing.FeeExemption.Fee>();
                }
                return this.fee;
            }

            /**
             * Gets the value of the countryCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the countryCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCountryCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CountryCode }
             * 
             * 
             */
            public List<CountryCode> getCountryCode() {
                if (countryCode == null) {
                    countryCode = new ArrayList<CountryCode>();
                }
                return this.countryCode;
            }

            /**
             * Gets the value of the provinceCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the provinceCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProvinceCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getProvinceCode() {
                if (provinceCode == null) {
                    provinceCode = new ArrayList<String>();
                }
                return this.provinceCode;
            }

            /**
             * Gets the value of the governmentBody property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGovernmentBody() {
                return governmentBody;
            }

            /**
             * Sets the value of the governmentBody property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGovernmentBody(String value) {
                this.governmentBody = value;
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
             *         &lt;element name="Code">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "code",
                "taxType"
            })
            public static class Fee {

                @XmlElement(name = "Code", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected BagListResParamsType.Pricing.FeeExemption.Fee.Code code;
                @XmlElement(name = "TaxType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected List<String> taxType;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BagListResParamsType.Pricing.FeeExemption.Fee.Code }
                 *     
                 */
                public BagListResParamsType.Pricing.FeeExemption.Fee.Code getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BagListResParamsType.Pricing.FeeExemption.Fee.Code }
                 *     
                 */
                public void setCode(BagListResParamsType.Pricing.FeeExemption.Fee.Code value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the taxType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the taxType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTaxType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTaxType() {
                    if (taxType == null) {
                        taxType = new ArrayList<String>();
                    }
                    return this.taxType;
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
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Code {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "CollectionPoint")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String collectionPoint;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the collectionPoint property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCollectionPoint() {
                        return collectionPoint;
                    }

                    /**
                     * Sets the value of the collectionPoint property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCollectionPoint(String value) {
                        this.collectionPoint = value;
                    }

                }

            }

        }

    }

}
