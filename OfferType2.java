
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Offer definition.
 * 
 * <p>Java class for OfferType_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotalItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PTC_Priced" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ApplyToAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RedemptionOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ValidatingCarrier" minOccurs="0"/>
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferTimeLimitSetType" minOccurs="0"/>
 *         &lt;element name="TotalPrice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionReferences" minOccurs="0"/>
 *         &lt;element name="DisclosureRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="BagDisclosureRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferPenaltyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Match" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OfferID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" />
 *       &lt;attribute name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequestedDateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType_2", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "parameters",
    "validatingCarrier",
    "timeLimits",
    "totalPrice",
    "descriptionReferences",
    "disclosureRef",
    "bagDisclosureRefs",
    "penalty",
    "match"
})
@XmlSeeAlso({
    ndc.AirShoppingRS.OffersGroup.AirlineOffers.Offer.class,
    ndc.AirShoppingRS.OffersGroup.AirlineOffers.ALaCarteOffer.class
})
public class OfferType2 {

    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferType2 .Parameters parameters;
    @XmlElement(name = "ValidatingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String validatingCarrier;
    @XmlElement(name = "TimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferTimeLimitSetType timeLimits;
    @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferType2 .TotalPrice totalPrice;
    @XmlList
    @XmlElement(name = "DescriptionReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> descriptionReferences;
    @XmlElement(name = "DisclosureRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object disclosureRef;
    @XmlList
    @XmlElement(name = "BagDisclosureRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> bagDisclosureRefs;
    @XmlElement(name = "Penalty", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferPenaltyType penalty;
    @XmlElement(name = "Match", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferMatchType match;
    @XmlAttribute(name = "OfferID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String offerID;
    @XmlAttribute(name = "Owner", required = true)
    protected String owner;
    @XmlAttribute(name = "OwnerType")
    protected String ownerType;
    @XmlAttribute(name = "RequestedDateInd")
    protected Boolean requestedDateInd;
    @XmlAttribute(name = "WebAddressID")
    protected String webAddressID;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType2 .Parameters }
     *     
     */
    public OfferType2 .Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType2 .Parameters }
     *     
     */
    public void setParameters(OfferType2 .Parameters value) {
        this.parameters = value;
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
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType }
     *     
     */
    public OfferTimeLimitSetType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType }
     *     
     */
    public void setTimeLimits(OfferTimeLimitSetType value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType2 .TotalPrice }
     *     
     */
    public OfferType2 .TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType2 .TotalPrice }
     *     
     */
    public void setTotalPrice(OfferType2 .TotalPrice value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the descriptionReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getDescriptionReferences() {
        if (descriptionReferences == null) {
            descriptionReferences = new ArrayList<Object>();
        }
        return this.descriptionReferences;
    }

    /**
     * Gets the value of the disclosureRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDisclosureRef() {
        return disclosureRef;
    }

    /**
     * Sets the value of the disclosureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDisclosureRef(Object value) {
        this.disclosureRef = value;
    }

    /**
     * Gets the value of the bagDisclosureRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDisclosureRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosureRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBagDisclosureRefs() {
        if (bagDisclosureRefs == null) {
            bagDisclosureRefs = new ArrayList<Object>();
        }
        return this.bagDisclosureRefs;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPenaltyType }
     *     
     */
    public OfferPenaltyType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPenaltyType }
     *     
     */
    public void setPenalty(OfferPenaltyType value) {
        this.penalty = value;
    }

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

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferID(String value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
    }

    /**
     * Gets the value of the webAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressID() {
        return webAddressID;
    }

    /**
     * Sets the value of the webAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressID(String value) {
        this.webAddressID = value;
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
     *         &lt;element name="TotalItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PTC_Priced" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ApplyToAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RedemptionOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalItemQuantity",
        "ptcPriced"
    })
    public static class Parameters {

        @XmlElement(name = "TotalItemQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger totalItemQuantity;
        @XmlElement(name = "PTC_Priced", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<PTCQuantityPricedType> ptcPriced;
        @XmlAttribute(name = "ApplyToAllInd")
        protected Boolean applyToAllInd;
        @XmlAttribute(name = "RedemptionOnlyInd")
        protected Boolean redemptionOnlyInd;

        /**
         * Gets the value of the totalItemQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalItemQuantity() {
            return totalItemQuantity;
        }

        /**
         * Sets the value of the totalItemQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalItemQuantity(BigInteger value) {
            this.totalItemQuantity = value;
        }

        /**
         * Requested and Priced PTC (passenger type code) and associated Traveler quantity.Gets the value of the ptcPriced property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcPriced property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCPriced().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCQuantityPricedType }
         * 
         * 
         */
        public List<PTCQuantityPricedType> getPTCPriced() {
            if (ptcPriced == null) {
                ptcPriced = new ArrayList<PTCQuantityPricedType>();
            }
            return this.ptcPriced;
        }

        /**
         * Gets the value of the applyToAllInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isApplyToAllInd() {
            return applyToAllInd;
        }

        /**
         * Sets the value of the applyToAllInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setApplyToAllInd(Boolean value) {
            this.applyToAllInd = value;
        }

        /**
         * Gets the value of the redemptionOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRedemptionOnlyInd() {
            return redemptionOnlyInd;
        }

        /**
         * Sets the value of the redemptionOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRedemptionOnlyInd(Boolean value) {
            this.redemptionOnlyInd = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *       &lt;/choice>
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
        "awardPricing",
        "combinationPricing",
        "simpleCurrencyPrice",
        "detailCurrencyPrice",
        "encodedCurrencyPrice"
    })
    public static class TotalPrice {

        @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
