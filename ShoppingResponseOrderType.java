
package ndc;

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
import javax.xml.bind.annotation.XmlValue;


/**
 * ORDER INPUT SHOPPING RESPONSE object definition.
 * 
 * <p>Java class for ShoppingResponseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingResponseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType"/>
 *         &lt;element name="ResponseID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueStringID_SimpleType">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Offers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Offer" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
 *                             &lt;element name="OfferItems">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OfferItem" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID"/>
 *                                                 &lt;element name="Passengers" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotalPrice" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                                                         &lt;/choice>
 *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ApplicableFlight" minOccurs="0"/>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}IncludedService" minOccurs="0"/>
 *                                                 &lt;element name="AssociatedServices" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AssociatedService" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
 *                                                                     &lt;element name="Passengers" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Details" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="InventoryGuarantee" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="WaitListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotalPrice" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                                     &lt;/choice>
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingResponseOrderType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "owner",
    "responseID",
    "offers"
})
public class ShoppingResponseOrderType {

    @XmlElement(name = "Owner", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String owner;
    @XmlElement(name = "ResponseID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ShoppingResponseOrderType.ResponseID responseID;
    @XmlElement(name = "Offers", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ShoppingResponseOrderType.Offers offers;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseOrderType.ResponseID }
     *     
     */
    public ShoppingResponseOrderType.ResponseID getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseOrderType.ResponseID }
     *     
     */
    public void setResponseID(ShoppingResponseOrderType.ResponseID value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseOrderType.Offers }
     *     
     */
    public ShoppingResponseOrderType.Offers getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseOrderType.Offers }
     *     
     */
    public void setOffers(ShoppingResponseOrderType.Offers value) {
        this.offers = value;
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
     *         &lt;element name="Offer" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
     *                   &lt;element name="OfferItems">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OfferItem" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID"/>
     *                                       &lt;element name="Passengers" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotalPrice" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *                                               &lt;/choice>
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ApplicableFlight" minOccurs="0"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}IncludedService" minOccurs="0"/>
     *                                       &lt;element name="AssociatedServices" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AssociatedService" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
     *                                                           &lt;element name="Passengers" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Details" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="InventoryGuarantee" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="WaitListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TotalPrice" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *                           &lt;/choice>
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
        "offer"
    })
    public static class Offers {

        @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<ShoppingResponseOrderType.Offers.Offer> offer;

        /**
         * Gets the value of the offer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShoppingResponseOrderType.Offers.Offer }
         * 
         * 
         */
        public List<ShoppingResponseOrderType.Offers.Offer> getOffer() {
            if (offer == null) {
                offer = new ArrayList<ShoppingResponseOrderType.Offers.Offer>();
            }
            return this.offer;
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
         *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
         *         &lt;element name="OfferItems">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OfferItem" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID"/>
         *                             &lt;element name="Passengers" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TotalPrice" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
         *                                     &lt;/choice>
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ApplicableFlight" minOccurs="0"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}IncludedService" minOccurs="0"/>
         *                             &lt;element name="AssociatedServices" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AssociatedService" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
         *                                                 &lt;element name="Passengers" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Details" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="InventoryGuarantee" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
         *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="WaitListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "offerID",
            "offerItems",
            "totalPrice"
        })
        public static class Offer {

            @XmlElement(name = "OfferID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected ItemIDType offerID;
            @XmlElement(name = "OfferItems", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected ShoppingResponseOrderType.Offers.Offer.OfferItems offerItems;
            @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected ShoppingResponseOrderType.Offers.Offer.TotalPrice totalPrice;

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
             * Gets the value of the offerItems property.
             * 
             * @return
             *     possible object is
             *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems }
             *     
             */
            public ShoppingResponseOrderType.Offers.Offer.OfferItems getOfferItems() {
                return offerItems;
            }

            /**
             * Sets the value of the offerItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems }
             *     
             */
            public void setOfferItems(ShoppingResponseOrderType.Offers.Offer.OfferItems value) {
                this.offerItems = value;
            }

            /**
             * Gets the value of the totalPrice property.
             * 
             * @return
             *     possible object is
             *     {@link ShoppingResponseOrderType.Offers.Offer.TotalPrice }
             *     
             */
            public ShoppingResponseOrderType.Offers.Offer.TotalPrice getTotalPrice() {
                return totalPrice;
            }

            /**
             * Sets the value of the totalPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link ShoppingResponseOrderType.Offers.Offer.TotalPrice }
             *     
             */
            public void setTotalPrice(ShoppingResponseOrderType.Offers.Offer.TotalPrice value) {
                this.totalPrice = value;
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
             *         &lt;element name="OfferItem" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID"/>
             *                   &lt;element name="Passengers" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TotalPrice" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
             *                           &lt;/choice>
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ApplicableFlight" minOccurs="0"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}IncludedService" minOccurs="0"/>
             *                   &lt;element name="AssociatedServices" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AssociatedService" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
             *                                       &lt;element name="Passengers" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Details" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="InventoryGuarantee" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
             *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="WaitListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
                "offerItem"
            })
            public static class OfferItems {

                @XmlElement(name = "OfferItem", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected List<ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem> offerItem;

                /**
                 * Gets the value of the offerItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem }
                 * 
                 * 
                 */
                public List<ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem> getOfferItem() {
                    if (offerItem == null) {
                        offerItem = new ArrayList<ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem>();
                    }
                    return this.offerItem;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID"/>
                 *         &lt;element name="Passengers" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ApplicableFlight" minOccurs="0"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}IncludedService" minOccurs="0"/>
                 *         &lt;element name="AssociatedServices" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AssociatedService" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
                 *                             &lt;element name="Passengers" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Details" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="InventoryGuarantee" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
                 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="WaitListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *               &lt;/restriction>
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
                @XmlType(name = "", propOrder = {
                    "offerItemID",
                    "passengers",
                    "totalPrice",
                    "applicableFlight",
                    "includedService",
                    "associatedServices",
                    "details"
                })
                public static class OfferItem {

                    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                    protected ItemIDType offerItemID;
                    @XmlElement(name = "Passengers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers passengers;
                    @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice totalPrice;
                    @XmlElement(name = "ApplicableFlight", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected ApplicableFlight applicableFlight;
                    @XmlElement(name = "IncludedService", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected ServiceInfoAssocType includedService;
                    @XmlElement(name = "AssociatedServices", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices associatedServices;
                    @XmlElement(name = "Details", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details details;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

                    /**
                     * Gets the value of the offerItemID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItemIDType }
                     *     
                     */
                    public ItemIDType getOfferItemID() {
                        return offerItemID;
                    }

                    /**
                     * Sets the value of the offerItemID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItemIDType }
                     *     
                     */
                    public void setOfferItemID(ItemIDType value) {
                        this.offerItemID = value;
                    }

                    /**
                     * Gets the value of the passengers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers }
                     *     
                     */
                    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers getPassengers() {
                        return passengers;
                    }

                    /**
                     * Sets the value of the passengers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers }
                     *     
                     */
                    public void setPassengers(ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Passengers value) {
                        this.passengers = value;
                    }

                    /**
                     * Gets the value of the totalPrice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice }
                     *     
                     */
                    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice getTotalPrice() {
                        return totalPrice;
                    }

                    /**
                     * Sets the value of the totalPrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice }
                     *     
                     */
                    public void setTotalPrice(ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.TotalPrice value) {
                        this.totalPrice = value;
                    }

                    /**
                     * Gets the value of the applicableFlight property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicableFlight }
                     *     
                     */
                    public ApplicableFlight getApplicableFlight() {
                        return applicableFlight;
                    }

                    /**
                     * Sets the value of the applicableFlight property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicableFlight }
                     *     
                     */
                    public void setApplicableFlight(ApplicableFlight value) {
                        this.applicableFlight = value;
                    }

                    /**
                     * Gets the value of the includedService property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ServiceInfoAssocType }
                     *     
                     */
                    public ServiceInfoAssocType getIncludedService() {
                        return includedService;
                    }

                    /**
                     * Sets the value of the includedService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ServiceInfoAssocType }
                     *     
                     */
                    public void setIncludedService(ServiceInfoAssocType value) {
                        this.includedService = value;
                    }

                    /**
                     * Gets the value of the associatedServices property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices }
                     *     
                     */
                    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices getAssociatedServices() {
                        return associatedServices;
                    }

                    /**
                     * Sets the value of the associatedServices property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices }
                     *     
                     */
                    public void setAssociatedServices(ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices value) {
                        this.associatedServices = value;
                    }

                    /**
                     * Gets the value of the details property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details }
                     *     
                     */
                    public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details getDetails() {
                        return details;
                    }

                    /**
                     * Sets the value of the details property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details }
                     *     
                     */
                    public void setDetails(ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details value) {
                        this.details = value;
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
                     *         &lt;element name="AssociatedService" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
                     *                   &lt;element name="Passengers" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
                        "associatedService"
                    })
                    public static class AssociatedServices {

                        @XmlElement(name = "AssociatedService", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                        protected List<ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService> associatedService;

                        /**
                         * Gets the value of the associatedService property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the associatedService property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAssociatedService().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService }
                         * 
                         * 
                         */
                        public List<ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService> getAssociatedService() {
                            if (associatedService == null) {
                                associatedService = new ArrayList<ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService>();
                            }
                            return this.associatedService;
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
                         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" minOccurs="0"/>
                         *         &lt;element name="Passengers" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
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
                        @XmlType(name = "", propOrder = {
                            "serviceID",
                            "passengers"
                        })
                        public static class AssociatedService {

                            @XmlElement(name = "ServiceID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                            protected ServiceIDType serviceID;
                            @XmlElement(name = "Passengers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                            protected ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers passengers;
                            @XmlAttribute(name = "refs")
                            @XmlIDREF
                            protected List<Object> refs;

                            /**
                             * Gets the value of the serviceID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ServiceIDType }
                             *     
                             */
                            public ServiceIDType getServiceID() {
                                return serviceID;
                            }

                            /**
                             * Sets the value of the serviceID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ServiceIDType }
                             *     
                             */
                            public void setServiceID(ServiceIDType value) {
                                this.serviceID = value;
                            }

                            /**
                             * Gets the value of the passengers property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers }
                             *     
                             */
                            public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers getPassengers() {
                                return passengers;
                            }

                            /**
                             * Sets the value of the passengers property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers }
                             *     
                             */
                            public void setPassengers(ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.Passengers value) {
                                this.passengers = value;
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
                             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
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
                                "passengerReference"
                            })
                            public static class Passengers {

                                @XmlList
                                @XmlElement(name = "PassengerReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                                @XmlIDREF
                                @XmlSchemaType(name = "IDREFS")
                                protected List<Object> passengerReference;

                                /**
                                 * 
                                 *                                       Association to multiple Passenger instance(s). Example: pax1 pax2
                                 *                                     Gets the value of the passengerReference property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getPassengerReference().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link Object }
                                 * 
                                 * 
                                 */
                                public List<Object> getPassengerReference() {
                                    if (passengerReference == null) {
                                        passengerReference = new ArrayList<Object>();
                                    }
                                    return this.passengerReference;
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
                     *       &lt;sequence>
                     *         &lt;element name="InventoryGuarantee" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
                     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="WaitListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "inventoryGuarantee"
                    })
                    public static class Details {

                        @XmlElement(name = "InventoryGuarantee", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                        protected ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee inventoryGuarantee;
                        @XmlAttribute(name = "WaitListInd")
                        protected Boolean waitListInd;

                        /**
                         * Gets the value of the inventoryGuarantee property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee }
                         *     
                         */
                        public ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee getInventoryGuarantee() {
                            return inventoryGuarantee;
                        }

                        /**
                         * Sets the value of the inventoryGuarantee property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee }
                         *     
                         */
                        public void setInventoryGuarantee(ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.Details.InventoryGuarantee value) {
                            this.inventoryGuarantee = value;
                        }

                        /**
                         * Gets the value of the waitListInd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isWaitListInd() {
                            return waitListInd;
                        }

                        /**
                         * Sets the value of the waitListInd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setWaitListInd(Boolean value) {
                            this.waitListInd = value;
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
                         *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
                         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
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
                            "invGuaranteeID",
                            "inventoryGuaranteeTimeLimits"
                        })
                        public static class InventoryGuarantee {

                            @XmlElement(name = "InvGuaranteeID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                            protected String invGuaranteeID;
                            @XmlElement(name = "InventoryGuaranteeTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                            protected InventoryGuaranteeTimeLimits inventoryGuaranteeTimeLimits;

                            /**
                             * Gets the value of the invGuaranteeID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getInvGuaranteeID() {
                                return invGuaranteeID;
                            }

                            /**
                             * Sets the value of the invGuaranteeID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setInvGuaranteeID(String value) {
                                this.invGuaranteeID = value;
                            }

                            /**
                             * Time limit by which guaranteed inventory for a specified product offer is guaranteed as available and by which the inventory held must be converted into a completed order before the time limit expires otherwise the guarantee is lost.
                             * 
                             * Examples: 2017-05-30T09:00:00,  2015-01-13T13:59:38Z
                             * 
                             * @return
                             *     possible object is
                             *     {@link InventoryGuaranteeTimeLimits }
                             *     
                             */
                            public InventoryGuaranteeTimeLimits getInventoryGuaranteeTimeLimits() {
                                return inventoryGuaranteeTimeLimits;
                            }

                            /**
                             * Sets the value of the inventoryGuaranteeTimeLimits property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link InventoryGuaranteeTimeLimits }
                             *     
                             */
                            public void setInventoryGuaranteeTimeLimits(InventoryGuaranteeTimeLimits value) {
                                this.inventoryGuaranteeTimeLimits = value;
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
                     *       &lt;sequence>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
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
                        "passengerReference"
                    })
                    public static class Passengers {

                        @XmlList
                        @XmlElement(name = "PassengerReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREFS")
                        protected List<Object> passengerReference;

                        /**
                         * 
                         *                                       Association to multiple Passenger instance(s). Example: pax1 pax2
                         *                                     Gets the value of the passengerReference property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPassengerReference().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Object }
                         * 
                         * 
                         */
                        public List<Object> getPassengerReference() {
                            if (passengerReference == null) {
                                passengerReference = new ArrayList<Object>();
                            }
                            return this.passengerReference;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueStringID_SimpleType">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
    public static class ResponseID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * A data type for a Unique String Identifier constraint.
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
