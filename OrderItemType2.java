
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * CORE ORDER ITEM definition.
 * 
 * <p>Java class for OrderItemType_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceDetail">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TotalAmount" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareFiledIn" minOccurs="0"/>
 *                             &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST/2017.1}DiscountType" minOccurs="0"/>
 *                             &lt;element name="Surcharges" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemption" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardPriceUnitType" minOccurs="0"/>
 *                               &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceType" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;element name="Fees" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Service" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *                             &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *                             &lt;choice>
 *                               &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *                               &lt;element name="ServiceDefinitionRef">
 *                                 &lt;complexType>
 *                                   &lt;simpleContent>
 *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
 *                                       &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                     &lt;/extension>
 *                                   &lt;/simpleContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemTimeLimitsType" minOccurs="0"/>
 *                   &lt;element name="InventoryGuarantee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Disclosures" minOccurs="0"/>
 *                   &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderPenaltyType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemDetails" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OrderItemID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" />
 *                 &lt;attribute name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "OrderItemType_2", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "orderItem"
})
public class OrderItemType2 {

    @XmlElement(name = "OrderItem", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<OrderItemType2 .OrderItem> orderItem;

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemType2 .OrderItem }
     * 
     * 
     */
    public List<OrderItemType2 .OrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItemType2 .OrderItem>();
        }
        return this.orderItem;
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
     *         &lt;element name="PriceDetail">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TotalAmount" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareFiledIn" minOccurs="0"/>
     *                   &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST/2017.1}DiscountType" minOccurs="0"/>
     *                   &lt;element name="Surcharges" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemption" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardPriceUnitType" minOccurs="0"/>
     *                     &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceType" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;element name="Fees" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Service" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
     *                   &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
     *                   &lt;choice>
     *                     &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
     *                     &lt;element name="ServiceDefinitionRef">
     *                       &lt;complexType>
     *                         &lt;simpleContent>
     *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
     *                             &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                           &lt;/extension>
     *                         &lt;/simpleContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemTimeLimitsType" minOccurs="0"/>
     *         &lt;element name="InventoryGuarantee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeTimeLimits"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Disclosures" minOccurs="0"/>
     *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderPenaltyType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemDetails" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="OrderItemID" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" />
     *       &lt;attribute name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceDetail",
        "service",
        "timeLimits",
        "inventoryGuarantee",
        "disclosures",
        "penalty",
        "orderItemDetails"
    })
    public static class OrderItem {

        @XmlElement(name = "PriceDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected OrderItemType2 .OrderItem.PriceDetail priceDetail;
        @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<OrderItemType2 .OrderItem.Service> service;
        @XmlElement(name = "TimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderItemTimeLimitsType timeLimits;
        @XmlElement(name = "InventoryGuarantee", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderItemType2 .OrderItem.InventoryGuarantee inventoryGuarantee;
        @XmlElement(name = "Disclosures", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Disclosures disclosures;
        @XmlElement(name = "Penalty", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderPenaltyType penalty;
        @XmlElement(name = "OrderItemDetails", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderItemDetails orderItemDetails;
        @XmlAttribute(name = "OrderItemID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String orderItemID;
        @XmlAttribute(name = "Owner")
        protected String owner;
        @XmlAttribute(name = "OwnerType")
        protected String ownerType;
        @XmlAttribute(name = "Timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "WebAddressID")
        protected String webAddressID;

        /**
         * Gets the value of the priceDetail property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemType2 .OrderItem.PriceDetail }
         *     
         */
        public OrderItemType2 .OrderItem.PriceDetail getPriceDetail() {
            return priceDetail;
        }

        /**
         * Sets the value of the priceDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemType2 .OrderItem.PriceDetail }
         *     
         */
        public void setPriceDetail(OrderItemType2 .OrderItem.PriceDetail value) {
            this.priceDetail = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderItemType2 .OrderItem.Service }
         * 
         * 
         */
        public List<OrderItemType2 .OrderItem.Service> getService() {
            if (service == null) {
                service = new ArrayList<OrderItemType2 .OrderItem.Service>();
            }
            return this.service;
        }

        /**
         * Gets the value of the timeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemTimeLimitsType }
         *     
         */
        public OrderItemTimeLimitsType getTimeLimits() {
            return timeLimits;
        }

        /**
         * Sets the value of the timeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemTimeLimitsType }
         *     
         */
        public void setTimeLimits(OrderItemTimeLimitsType value) {
            this.timeLimits = value;
        }

        /**
         * Gets the value of the inventoryGuarantee property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemType2 .OrderItem.InventoryGuarantee }
         *     
         */
        public OrderItemType2 .OrderItem.InventoryGuarantee getInventoryGuarantee() {
            return inventoryGuarantee;
        }

        /**
         * Sets the value of the inventoryGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemType2 .OrderItem.InventoryGuarantee }
         *     
         */
        public void setInventoryGuarantee(OrderItemType2 .OrderItem.InventoryGuarantee value) {
            this.inventoryGuarantee = value;
        }

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
        }

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPenaltyType }
         *     
         */
        public OrderPenaltyType getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPenaltyType }
         *     
         */
        public void setPenalty(OrderPenaltyType value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the orderItemDetails property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemDetails }
         *     
         */
        public OrderItemDetails getOrderItemDetails() {
            return orderItemDetails;
        }

        /**
         * Sets the value of the orderItemDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemDetails }
         *     
         */
        public void setOrderItemDetails(OrderItemDetails value) {
            this.orderItemDetails = value;
        }

        /**
         * Gets the value of the orderItemID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderItemID() {
            return orderItemID;
        }

        /**
         * Sets the value of the orderItemID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderItemID(String value) {
            this.orderItemID = value;
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
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
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
         *         &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
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
            "inventoryGuaranteeID",
            "inventoryGuaranteeTimeLimits"
        })
        public static class InventoryGuarantee {

            @XmlElement(name = "InventoryGuaranteeID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected String inventoryGuaranteeID;
            @XmlElement(name = "InventoryGuaranteeTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected InventoryGuaranteeTimeLimits inventoryGuaranteeTimeLimits;

            /**
             * Gets the value of the inventoryGuaranteeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryGuaranteeID() {
                return inventoryGuaranteeID;
            }

            /**
             * Sets the value of the inventoryGuaranteeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryGuaranteeID(String value) {
                this.inventoryGuaranteeID = value;
            }

            /**
             * Gets the value of the inventoryGuaranteeTimeLimits property.
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
         *         &lt;element name="TotalAmount" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareFiledIn" minOccurs="0"/>
         *         &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST/2017.1}DiscountType" minOccurs="0"/>
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
         *         &lt;choice>
         *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardPriceUnitType" minOccurs="0"/>
         *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceType" minOccurs="0"/>
         *         &lt;/choice>
         *         &lt;element name="Fees" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
         *               &lt;/extension>
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
            "totalAmount",
            "baseAmount",
            "fareFiledIn",
            "discount",
            "surcharges",
            "taxes",
            "taxExemption",
            "awardPricing",
            "combinationPricing",
            "fees"
        })
        public static class PriceDetail {

            @XmlElement(name = "TotalAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected OrderItemType2 .OrderItem.PriceDetail.TotalAmount totalAmount;
            @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected CurrencyAmountOptType baseAmount;
            @XmlElement(name = "FareFiledIn", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected FareFilingType fareFiledIn;
            @XmlElement(name = "Discount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected DiscountType discount;
            @XmlElement(name = "Surcharges", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected OrderItemType2 .OrderItem.PriceDetail.Surcharges surcharges;
            @XmlElement(name = "Taxes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected TaxDetailType taxes;
            @XmlElement(name = "TaxExemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected TaxExemptionType taxExemption;
            @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AwardPriceUnitType awardPricing;
            @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CombinationPriceType combinationPricing;
            @XmlElement(name = "Fees", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected OrderItemType2 .OrderItem.PriceDetail.Fees fees;

            /**
             * Gets the value of the totalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemType2 .OrderItem.PriceDetail.TotalAmount }
             *     
             */
            public OrderItemType2 .OrderItem.PriceDetail.TotalAmount getTotalAmount() {
                return totalAmount;
            }

            /**
             * Sets the value of the totalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemType2 .OrderItem.PriceDetail.TotalAmount }
             *     
             */
            public void setTotalAmount(OrderItemType2 .OrderItem.PriceDetail.TotalAmount value) {
                this.totalAmount = value;
            }

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
             * Gets the value of the fareFiledIn property.
             * 
             * @return
             *     possible object is
             *     {@link FareFilingType }
             *     
             */
            public FareFilingType getFareFiledIn() {
                return fareFiledIn;
            }

            /**
             * Sets the value of the fareFiledIn property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFilingType }
             *     
             */
            public void setFareFiledIn(FareFilingType value) {
                this.fareFiledIn = value;
            }

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountType }
             *     
             */
            public DiscountType getDiscount() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountType }
             *     
             */
            public void setDiscount(DiscountType value) {
                this.discount = value;
            }

            /**
             * Gets the value of the surcharges property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemType2 .OrderItem.PriceDetail.Surcharges }
             *     
             */
            public OrderItemType2 .OrderItem.PriceDetail.Surcharges getSurcharges() {
                return surcharges;
            }

            /**
             * Sets the value of the surcharges property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemType2 .OrderItem.PriceDetail.Surcharges }
             *     
             */
            public void setSurcharges(OrderItemType2 .OrderItem.PriceDetail.Surcharges value) {
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
             * Gets the value of the fees property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemType2 .OrderItem.PriceDetail.Fees }
             *     
             */
            public OrderItemType2 .OrderItem.PriceDetail.Fees getFees() {
                return fees;
            }

            /**
             * Sets the value of the fees property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemType2 .OrderItem.PriceDetail.Fees }
             *     
             */
            public void setFees(OrderItemType2 .OrderItem.PriceDetail.Fees value) {
                this.fees = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
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
                "awardPricing",
                "combinationPricing",
                "detailCurrencyPrice",
                "encodedCurrencyPrice",
                "simpleCurrencyPrice"
            })
            public static class TotalAmount {

                @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected AwardPriceUnitType awardPricing;
                @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected CombinationPriceType combinationPricing;
                @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected DetailCurrencyPriceType detailCurrencyPrice;
                @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected EncodedPriceType encodedCurrencyPrice;
                @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected SimpleCurrencyPriceType simpleCurrencyPrice;

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
         *         &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
         *         &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
         *         &lt;choice>
         *           &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
         *           &lt;element name="ServiceDefinitionRef">
         *             &lt;complexType>
         *               &lt;simpleContent>
         *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
         *                   &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                 &lt;/extension>
         *               &lt;/simpleContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "passengerRef",
            "serviceRef",
            "segmentRef",
            "serviceDefinitionRef"
        })
        public static class Service {

            @XmlElement(name = "PassengerRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object passengerRef;
            @XmlElement(name = "ServiceRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object serviceRef;
            @XmlElement(name = "SegmentRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object segmentRef;
            @XmlElement(name = "ServiceDefinitionRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected OrderItemType2 .OrderItem.Service.ServiceDefinitionRef serviceDefinitionRef;
            @XmlAttribute(name = "ServiceID")
            protected String serviceID;

            /**
             * Gets the value of the passengerRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getPassengerRef() {
                return passengerRef;
            }

            /**
             * Sets the value of the passengerRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setPassengerRef(Object value) {
                this.passengerRef = value;
            }

            /**
             * Gets the value of the serviceRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getServiceRef() {
                return serviceRef;
            }

            /**
             * Sets the value of the serviceRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setServiceRef(Object value) {
                this.serviceRef = value;
            }

            /**
             * Gets the value of the segmentRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSegmentRef() {
                return segmentRef;
            }

            /**
             * Sets the value of the segmentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSegmentRef(Object value) {
                this.segmentRef = value;
            }

            /**
             * Gets the value of the serviceDefinitionRef property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemType2 .OrderItem.Service.ServiceDefinitionRef }
             *     
             */
            public OrderItemType2 .OrderItem.Service.ServiceDefinitionRef getServiceDefinitionRef() {
                return serviceDefinitionRef;
            }

            /**
             * Sets the value of the serviceDefinitionRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemType2 .OrderItem.Service.ServiceDefinitionRef }
             *     
             */
            public void setServiceDefinitionRef(OrderItemType2 .OrderItem.Service.ServiceDefinitionRef value) {
                this.serviceDefinitionRef = value;
            }

            /**
             * Gets the value of the serviceID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceID() {
                return serviceID;
            }

            /**
             * Sets the value of the serviceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceID(String value) {
                this.serviceID = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
             *       &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
            public static class ServiceDefinitionRef {

                @XmlValue
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object value;
                @XmlAttribute(name = "SegmentRef")
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object segmentRef;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setValue(Object value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the segmentRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSegmentRef() {
                    return segmentRef;
                }

                /**
                 * Sets the value of the segmentRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSegmentRef(Object value) {
                    this.segmentRef = value;
                }

            }

        }

    }

}
