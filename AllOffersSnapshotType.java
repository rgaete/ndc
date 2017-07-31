
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Aggregated Optional Service Offers Snapshot.
 * 
 * <p>Java class for AllOffersSnapshotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllOffersSnapshotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AssociatedPassenger" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="SubTotal" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Highest" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Lowest" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
@XmlType(name = "AllOffersSnapshotType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "passengerQuantity",
    "associatedPassenger",
    "subTotal",
    "highest",
    "lowest"
})
public class AllOffersSnapshotType {

    @XmlElement(name = "PassengerQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger passengerQuantity;
    @XmlElement(name = "AssociatedPassenger", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PassengerInfoAssocType associatedPassenger;
    @XmlElement(name = "SubTotal", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AllOffersSnapshotType.SubTotal subTotal;
    @XmlElement(name = "Highest", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AllOffersSnapshotType.Highest highest;
    @XmlElement(name = "Lowest", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AllOffersSnapshotType.Lowest lowest;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the passengerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Sets the value of the passengerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerQuantity(BigInteger value) {
        this.passengerQuantity = value;
    }

    /**
     * Gets the value of the associatedPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public PassengerInfoAssocType getAssociatedPassenger() {
        return associatedPassenger;
    }

    /**
     * Sets the value of the associatedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public void setAssociatedPassenger(PassengerInfoAssocType value) {
        this.associatedPassenger = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AllOffersSnapshotType.SubTotal }
     *     
     */
    public AllOffersSnapshotType.SubTotal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllOffersSnapshotType.SubTotal }
     *     
     */
    public void setSubTotal(AllOffersSnapshotType.SubTotal value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the highest property.
     * 
     * @return
     *     possible object is
     *     {@link AllOffersSnapshotType.Highest }
     *     
     */
    public AllOffersSnapshotType.Highest getHighest() {
        return highest;
    }

    /**
     * Sets the value of the highest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllOffersSnapshotType.Highest }
     *     
     */
    public void setHighest(AllOffersSnapshotType.Highest value) {
        this.highest = value;
    }

    /**
     * Gets the value of the lowest property.
     * 
     * @return
     *     possible object is
     *     {@link AllOffersSnapshotType.Lowest }
     *     
     */
    public AllOffersSnapshotType.Lowest getLowest() {
        return lowest;
    }

    /**
     * Sets the value of the lowest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllOffersSnapshotType.Lowest }
     *     
     */
    public void setLowest(AllOffersSnapshotType.Lowest value) {
        this.lowest = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
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
        "simpleCurrencyPrice",
        "encodedCurrencyPrice",
        "detailCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class Highest {

        @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected AwardPriceUnitType awardPricing;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
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
        "simpleCurrencyPrice",
        "encodedCurrencyPrice",
        "detailCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class Lowest {

        @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected AwardPriceUnitType awardPricing;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
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
        "simpleCurrencyPrice",
        "encodedCurrencyPrice",
        "detailCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class SubTotal {

        @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected AwardPriceUnitType awardPricing;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
