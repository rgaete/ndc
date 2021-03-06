
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage Offer with Association definition.
 * 
 * <p>Java class for BaggageOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}BagOfferAssocType" minOccurs="0"/>
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" minOccurs="0"/>
 *         &lt;element name="BagDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BagDetail" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType"/>
 *                             &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}BagOfferAssocType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBags" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBags" minOccurs="0"/>
 *                             &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureType" minOccurs="0"/>
 *                             &lt;element name="Price" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageOfferType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "totalPrice",
    "associations",
    "validatingCarrier",
    "bagDetails"
})
public class BaggageOfferType {

    @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected BaggageOfferType.TotalPrice totalPrice;
    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagOfferAssocType associations;
    @XmlElement(name = "ValidatingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String validatingCarrier;
    @XmlElement(name = "BagDetails", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageOfferType.BagDetails bagDetails;

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferType.TotalPrice }
     *     
     */
    public BaggageOfferType.TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferType.TotalPrice }
     *     
     */
    public void setTotalPrice(BaggageOfferType.TotalPrice value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link BagOfferAssocType }
     *     
     */
    public BagOfferAssocType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagOfferAssocType }
     *     
     */
    public void setAssociations(BagOfferAssocType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrier(String value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the bagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferType.BagDetails }
     *     
     */
    public BaggageOfferType.BagDetails getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferType.BagDetails }
     *     
     */
    public void setBagDetails(BaggageOfferType.BagDetails value) {
        this.bagDetails = value;
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
     *         &lt;element name="BagDetail" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType"/>
     *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}BagOfferAssocType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBags" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBags" minOccurs="0"/>
     *                   &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureType" minOccurs="0"/>
     *                   &lt;element name="Price" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "bagDetail"
    })
    public static class BagDetails {

        @XmlElement(name = "BagDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<BaggageOfferType.BagDetails.BagDetail> bagDetail;

        /**
         * Gets the value of the bagDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bagDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBagDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageOfferType.BagDetails.BagDetail }
         * 
         * 
         */
        public List<BaggageOfferType.BagDetails.BagDetail> getBagDetail() {
            if (bagDetail == null) {
                bagDetail = new ArrayList<BaggageOfferType.BagDetails.BagDetail>();
            }
            return this.bagDetail;
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
         *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType"/>
         *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}BagOfferAssocType" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBags" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBags" minOccurs="0"/>
         *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureType" minOccurs="0"/>
         *         &lt;element name="Price" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
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
        @XmlType(name = "", propOrder = {
            "validatingCarrier",
            "associations",
            "checkedBags",
            "carryOnBags",
            "disclosure",
            "price"
        })
        public static class BagDetail {

            @XmlElement(name = "ValidatingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected String validatingCarrier;
            @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected BagOfferAssocType associations;
            @XmlElement(name = "CheckedBags", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CheckedBags checkedBags;
            @XmlElement(name = "CarryOnBags", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CarryOnBags carryOnBags;
            @XmlElement(name = "Disclosure", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected BagDisclosureType disclosure;
            @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected BaggageOfferType.BagDetails.BagDetail.Price price;

            /**
             * Gets the value of the validatingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidatingCarrier() {
                return validatingCarrier;
            }

            /**
             * Sets the value of the validatingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidatingCarrier(String value) {
                this.validatingCarrier = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link BagOfferAssocType }
             *     
             */
            public BagOfferAssocType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagOfferAssocType }
             *     
             */
            public void setAssociations(BagOfferAssocType value) {
                this.associations = value;
            }

            /**
             * Gets the value of the checkedBags property.
             * 
             * @return
             *     possible object is
             *     {@link CheckedBags }
             *     
             */
            public CheckedBags getCheckedBags() {
                return checkedBags;
            }

            /**
             * Sets the value of the checkedBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CheckedBags }
             *     
             */
            public void setCheckedBags(CheckedBags value) {
                this.checkedBags = value;
            }

            /**
             * Gets the value of the carryOnBags property.
             * 
             * @return
             *     possible object is
             *     {@link CarryOnBags }
             *     
             */
            public CarryOnBags getCarryOnBags() {
                return carryOnBags;
            }

            /**
             * Sets the value of the carryOnBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarryOnBags }
             *     
             */
            public void setCarryOnBags(CarryOnBags value) {
                this.carryOnBags = value;
            }

            /**
             * Gets the value of the disclosure property.
             * 
             * @return
             *     possible object is
             *     {@link BagDisclosureType }
             *     
             */
            public BagDisclosureType getDisclosure() {
                return disclosure;
            }

            /**
             * Sets the value of the disclosure property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagDisclosureType }
             *     
             */
            public void setDisclosure(BagDisclosureType value) {
                this.disclosure = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageOfferType.BagDetails.BagDetail.Price }
             *     
             */
            public BaggageOfferType.BagDetails.BagDetail.Price getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageOfferType.BagDetails.BagDetail.Price }
             *     
             */
            public void setPrice(BaggageOfferType.BagDetails.BagDetail.Price value) {
                this.price = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
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
                "encodedCurrencyPrice",
                "detailCurrencyPrice",
                "combinationPricing",
                "awardPricing"
            })
            public static class Price {

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
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
        "encodedCurrencyPrice",
        "detailCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class TotalPrice {

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
