
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType">
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
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
 *         &lt;element name="OfferPrice" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferPriceLeadType" maxOccurs="unbounded"/>
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferTimeLimitSetType"/>
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}PricedFlightOfferAssocType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionReferences" minOccurs="0"/>
 *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/EDIST/2017.1}DisclosureType" minOccurs="0"/>
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferPenaltyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareDetail" minOccurs="0"/>
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
    "parameters",
    "offerID",
    "offerPrice",
    "timeLimits",
    "associations",
    "descriptionReferences",
    "disclosure",
    "penalty",
    "fareDetail"
})
@XmlRootElement(name = "PricedFlightOffer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class PricedFlightOffer
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PricedFlightOffer.Parameters parameters;
    @XmlElement(name = "OfferID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ItemIDType offerID;
    @XmlElement(name = "OfferPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<OfferPriceLeadType> offerPrice;
    @XmlElement(name = "TimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OfferTimeLimitSetType timeLimits;
    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<PricedFlightOfferAssocType> associations;
    @XmlList
    @XmlElement(name = "DescriptionReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> descriptionReferences;
    @XmlElement(name = "Disclosure", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected DisclosureType disclosure;
    @XmlElement(name = "Penalty", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferPenaltyType penalty;
    @XmlElement(name = "FareDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareDetailType fareDetail;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOffer.Parameters }
     *     
     */
    public PricedFlightOffer.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOffer.Parameters }
     *     
     */
    public void setParameters(PricedFlightOffer.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOfferID(ItemIDType value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the offerPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferPriceLeadType }
     * 
     * 
     */
    public List<OfferPriceLeadType> getOfferPrice() {
        if (offerPrice == null) {
            offerPrice = new ArrayList<OfferPriceLeadType>();
        }
        return this.offerPrice;
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
     * Gets the value of the associations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedFlightOfferAssocType }
     * 
     * 
     */
    public List<PricedFlightOfferAssocType> getAssociations() {
        if (associations == null) {
            associations = new ArrayList<PricedFlightOfferAssocType>();
        }
        return this.associations;
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
     * Gets the value of the disclosure property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureType }
     *     
     */
    public DisclosureType getDisclosure() {
        return disclosure;
    }

    /**
     * Sets the value of the disclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureType }
     *     
     */
    public void setDisclosure(DisclosureType value) {
        this.disclosure = value;
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
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
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

}
