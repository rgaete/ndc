
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
 * CORE ORDER definition.
 * 
 * <p>Java class for OrderCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderID"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BookingReferences" minOccurs="0"/>
 *         &lt;element name="OriginalOrder" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginalOrderID" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderID_Type"/>
 *                   &lt;element name="PriceQuotes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceQuote" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Amount">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Source">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *         &lt;element name="TotalOrderPrice" minOccurs="0">
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
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST/2017.1}PaymentProcessType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TimeLimits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentTimeLimit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepositTimeLimit" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}NamingTimeLimit" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BilateralTimeLimits" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderKeys" minOccurs="0"/>
 *         &lt;element name="TotalOrderItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
@XmlType(name = "OrderCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "orderID",
    "bookingReferences",
    "originalOrder",
    "totalOrderPrice",
    "status",
    "payments",
    "timeLimits",
    "orderKeys",
    "totalOrderItemQuantity"
})
public class OrderCoreType {

    @XmlElement(name = "OrderID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OrderIDType orderID;
    @XmlElement(name = "BookingReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BookingReferences bookingReferences;
    @XmlElement(name = "OriginalOrder", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderCoreType.OriginalOrder originalOrder;
    @XmlElement(name = "TotalOrderPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderCoreType.TotalOrderPrice totalOrderPrice;
    @XmlElement(name = "Status", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderCoreType.Status status;
    @XmlElement(name = "Payments", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderCoreType.Payments payments;
    @XmlElement(name = "TimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderCoreType.TimeLimits timeLimits;
    @XmlElement(name = "OrderKeys", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderKeysType orderKeys;
    @XmlElement(name = "TotalOrderItemQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalOrderItemQuantity;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIDType }
     *     
     */
    public OrderIDType getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIDType }
     *     
     */
    public void setOrderID(OrderIDType value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the bookingReferences property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferences }
     *     
     */
    public BookingReferences getBookingReferences() {
        return bookingReferences;
    }

    /**
     * Sets the value of the bookingReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferences }
     *     
     */
    public void setBookingReferences(BookingReferences value) {
        this.bookingReferences = value;
    }

    /**
     * Gets the value of the originalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.OriginalOrder }
     *     
     */
    public OrderCoreType.OriginalOrder getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.OriginalOrder }
     *     
     */
    public void setOriginalOrder(OrderCoreType.OriginalOrder value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the totalOrderPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.TotalOrderPrice }
     *     
     */
    public OrderCoreType.TotalOrderPrice getTotalOrderPrice() {
        return totalOrderPrice;
    }

    /**
     * Sets the value of the totalOrderPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.TotalOrderPrice }
     *     
     */
    public void setTotalOrderPrice(OrderCoreType.TotalOrderPrice value) {
        this.totalOrderPrice = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.Status }
     *     
     */
    public OrderCoreType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.Status }
     *     
     */
    public void setStatus(OrderCoreType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.Payments }
     *     
     */
    public OrderCoreType.Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.Payments }
     *     
     */
    public void setPayments(OrderCoreType.Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCoreType.TimeLimits }
     *     
     */
    public OrderCoreType.TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCoreType.TimeLimits }
     *     
     */
    public void setTimeLimits(OrderCoreType.TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the orderKeys property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType }
     *     
     */
    public OrderKeysType getOrderKeys() {
        return orderKeys;
    }

    /**
     * Sets the value of the orderKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType }
     *     
     */
    public void setOrderKeys(OrderKeysType value) {
        this.orderKeys = value;
    }

    /**
     * Gets the value of the totalOrderItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalOrderItemQuantity() {
        return totalOrderItemQuantity;
    }

    /**
     * Sets the value of the totalOrderItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalOrderItemQuantity(BigInteger value) {
        this.totalOrderItemQuantity = value;
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
     *         &lt;element name="OriginalOrderID" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderID_Type"/>
     *         &lt;element name="PriceQuotes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceQuote" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Amount">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Source">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "originalOrderID",
        "priceQuotes"
    })
    public static class OriginalOrder {

        @XmlElement(name = "OriginalOrderID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected OrderIDType originalOrderID;
        @XmlElement(name = "PriceQuotes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderCoreType.OriginalOrder.PriceQuotes priceQuotes;

        /**
         * Gets the value of the originalOrderID property.
         * 
         * @return
         *     possible object is
         *     {@link OrderIDType }
         *     
         */
        public OrderIDType getOriginalOrderID() {
            return originalOrderID;
        }

        /**
         * Sets the value of the originalOrderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderIDType }
         *     
         */
        public void setOriginalOrderID(OrderIDType value) {
            this.originalOrderID = value;
        }

        /**
         * Gets the value of the priceQuotes property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCoreType.OriginalOrder.PriceQuotes }
         *     
         */
        public OrderCoreType.OriginalOrder.PriceQuotes getPriceQuotes() {
            return priceQuotes;
        }

        /**
         * Sets the value of the priceQuotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCoreType.OriginalOrder.PriceQuotes }
         *     
         */
        public void setPriceQuotes(OrderCoreType.OriginalOrder.PriceQuotes value) {
            this.priceQuotes = value;
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
         *         &lt;element name="PriceQuote" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Amount">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Source">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "priceQuote"
        })
        public static class PriceQuotes {

            @XmlElement(name = "PriceQuote", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote> priceQuote;

            /**
             * Gets the value of the priceQuote property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceQuote property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceQuote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote }
             * 
             * 
             */
            public List<OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote> getPriceQuote() {
                if (priceQuote == null) {
                    priceQuote = new ArrayList<OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote>();
                }
                return this.priceQuote;
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
             *         &lt;element name="Amount">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Source">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/>
             *       &lt;/sequence>
             *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                "source",
                "commission",
                "priceGuaranteeTimeLimit"
            })
            public static class PriceQuote {

                @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount amount;
                @XmlElement(name = "Source", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source source;
                @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected CommissionType commission;
                @XmlElement(name = "PriceGuaranteeTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
                @XmlAttribute(name = "CreatedDate")
                @XmlSchemaType(name = "anySimpleType")
                protected String createdDate;

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount }
                 *     
                 */
                public OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount }
                 *     
                 */
                public void setAmount(OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Amount value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the source property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source }
                 *     
                 */
                public OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source getSource() {
                    return source;
                }

                /**
                 * Sets the value of the source property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source }
                 *     
                 */
                public void setSource(OrderCoreType.OriginalOrder.PriceQuotes.PriceQuote.Source value) {
                    this.source = value;
                }

                /**
                 * Gets the value of the commission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommissionType }
                 *     
                 */
                public CommissionType getCommission() {
                    return commission;
                }

                /**
                 * Sets the value of the commission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommissionType }
                 *     
                 */
                public void setCommission(CommissionType value) {
                    this.commission = value;
                }

                /**
                 * Gets the value of the priceGuaranteeTimeLimit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PriceGuaranteeTimeLimit }
                 *     
                 */
                public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
                    return priceGuaranteeTimeLimit;
                }

                /**
                 * Sets the value of the priceGuaranteeTimeLimit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PriceGuaranteeTimeLimit }
                 *     
                 */
                public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
                    this.priceGuaranteeTimeLimit = value;
                }

                /**
                 * Gets the value of the createdDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreatedDate() {
                    return createdDate;
                }

                /**
                 * Sets the value of the createdDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreatedDate(String value) {
                    this.createdDate = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/>
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
                    "currencyAmount"
                })
                public static class Amount {

                    @XmlElement(name = "CurrencyAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                    protected CurrencyAmountOptType currencyAmount;

                    /**
                     * Gets the value of the currencyAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public CurrencyAmountOptType getCurrencyAmount() {
                        return currencyAmount;
                    }

                    /**
                     * Sets the value of the currencyAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public void setCurrencyAmount(CurrencyAmountOptType value) {
                        this.currencyAmount = value;
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
                 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Source {

                    @XmlAttribute(name = "Owner")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String owner;
                    @XmlAttribute(name = "Reference")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String reference;

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
                     * Gets the value of the reference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReference() {
                        return reference;
                    }

                    /**
                     * Sets the value of the reference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReference(String value) {
                        this.reference = value;
                    }

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
     *         &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST/2017.1}PaymentProcessType" maxOccurs="unbounded"/>
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
        "payment"
    })
    public static class Payments {

        @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<PaymentProcessType> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentProcessType }
         * 
         * 
         */
        public List<PaymentProcessType> getPayment() {
            if (payment == null) {
                payment = new ArrayList<PaymentProcessType>();
            }
            return this.payment;
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
     *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusCode"
    })
    public static class Status {

        @XmlElement(name = "StatusCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String statusCode;
        @XmlAttribute(name = "ChangeOfGaugeInd")
        protected Boolean changeOfGaugeInd;
        @XmlAttribute(name = "ScheduleChangeInd")
        protected Boolean scheduleChangeInd;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the changeOfGaugeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChangeOfGaugeInd() {
            return changeOfGaugeInd;
        }

        /**
         * Sets the value of the changeOfGaugeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeOfGaugeInd(Boolean value) {
            this.changeOfGaugeInd = value;
        }

        /**
         * Gets the value of the scheduleChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isScheduleChangeInd() {
            return scheduleChangeInd;
        }

        /**
         * Sets the value of the scheduleChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setScheduleChangeInd(Boolean value) {
            this.scheduleChangeInd = value;
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
     *         &lt;element name="PaymentTimeLimit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepositTimeLimit" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}NamingTimeLimit" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BilateralTimeLimits" minOccurs="0"/>
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
        "paymentTimeLimit",
        "depositTimeLimit",
        "namingTimeLimit",
        "bilateralTimeLimits"
    })
    public static class TimeLimits {

        @XmlElement(name = "PaymentTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderCoreType.TimeLimits.PaymentTimeLimit paymentTimeLimit;
        @XmlElement(name = "DepositTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DepositTimeLimit depositTimeLimit;
        @XmlElement(name = "NamingTimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected NamingTimeLimit namingTimeLimit;
        @XmlElement(name = "BilateralTimeLimits", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BilateralTimeLimitsType bilateralTimeLimits;

        /**
         * Gets the value of the paymentTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCoreType.TimeLimits.PaymentTimeLimit }
         *     
         */
        public OrderCoreType.TimeLimits.PaymentTimeLimit getPaymentTimeLimit() {
            return paymentTimeLimit;
        }

        /**
         * Sets the value of the paymentTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCoreType.TimeLimits.PaymentTimeLimit }
         *     
         */
        public void setPaymentTimeLimit(OrderCoreType.TimeLimits.PaymentTimeLimit value) {
            this.paymentTimeLimit = value;
        }

        /**
         * Gets the value of the depositTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link DepositTimeLimit }
         *     
         */
        public DepositTimeLimit getDepositTimeLimit() {
            return depositTimeLimit;
        }

        /**
         * Sets the value of the depositTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepositTimeLimit }
         *     
         */
        public void setDepositTimeLimit(DepositTimeLimit value) {
            this.depositTimeLimit = value;
        }

        /**
         * Gets the value of the namingTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link NamingTimeLimit }
         *     
         */
        public NamingTimeLimit getNamingTimeLimit() {
            return namingTimeLimit;
        }

        /**
         * Sets the value of the namingTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link NamingTimeLimit }
         *     
         */
        public void setNamingTimeLimit(NamingTimeLimit value) {
            this.namingTimeLimit = value;
        }

        /**
         * Gets the value of the bilateralTimeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link BilateralTimeLimitsType }
         *     
         */
        public BilateralTimeLimitsType getBilateralTimeLimits() {
            return bilateralTimeLimits;
        }

        /**
         * Sets the value of the bilateralTimeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BilateralTimeLimitsType }
         *     
         */
        public void setBilateralTimeLimits(BilateralTimeLimitsType value) {
            this.bilateralTimeLimits = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentTimeLimit
            extends CoreDateGrpType
        {

            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

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
    public static class TotalOrderPrice {

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
