
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


/**
 * ORDER PAYMENT METHOD definition.
 * 
 * <p>Java class for OrderPaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="Method">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BankAccountMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CashMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBillMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MiscChargeMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OtherMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RedemptionMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}VoucherMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPriceType" minOccurs="0"/>
 *         &lt;element name="Qualifier" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="Promotions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Promotion" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Associations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderID" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Passengers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GroupReference"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}OtherOrderAssocListType" />
 *                           &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Description" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SplitFormInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentMethodType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "type",
    "method",
    "amount",
    "qualifier",
    "promotions",
    "associations",
    "description"
})
public class OrderPaymentMethodType {

    @XmlElement(name = "Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String type;
    @XmlElement(name = "Method", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OrderPaymentMethodType.Method method;
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SimpleCurrencyPriceType amount;
    @XmlElement(name = "Qualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String qualifier;
    @XmlElement(name = "Promotions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderPaymentMethodType.Promotions promotions;
    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderPaymentMethodType.Associations associations;
    @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Description description;
    @XmlAttribute(name = "SplitFormInd")
    protected Boolean splitFormInd;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentMethodType.Method }
     *     
     */
    public OrderPaymentMethodType.Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentMethodType.Method }
     *     
     */
    public void setMethod(OrderPaymentMethodType.Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public SimpleCurrencyPriceType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public void setAmount(SimpleCurrencyPriceType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentMethodType.Promotions }
     *     
     */
    public OrderPaymentMethodType.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentMethodType.Promotions }
     *     
     */
    public void setPromotions(OrderPaymentMethodType.Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentMethodType.Associations }
     *     
     */
    public OrderPaymentMethodType.Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentMethodType.Associations }
     *     
     */
    public void setAssociations(OrderPaymentMethodType.Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the splitFormInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitFormInd() {
        return splitFormInd;
    }

    /**
     * Sets the value of the splitFormInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitFormInd(Boolean value) {
        this.splitFormInd = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderID" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Passengers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GroupReference"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}OtherOrderAssocListType" />
     *                 &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
        "orderID",
        "orderItemID",
        "passengers",
        "otherAssociation"
    })
    public static class Associations {

        @XmlElement(name = "OrderID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderIDType orderID;
        @XmlElement(name = "OrderItemID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<ItemIDType> orderItemID;
        @XmlElement(name = "Passengers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderPaymentMethodType.Associations.Passengers passengers;
        @XmlElement(name = "OtherAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<OrderPaymentMethodType.Associations.OtherAssociation> otherAssociation;

        /**
         * Associated Order ID Example: ORDER7333
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
         * Associated Order Item ID(s). Example: ORD7333-001 Gets the value of the orderItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         */
        public List<ItemIDType> getOrderItemID() {
            if (orderItemID == null) {
                orderItemID = new ArrayList<ItemIDType>();
            }
            return this.orderItemID;
        }

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPaymentMethodType.Associations.Passengers }
         *     
         */
        public OrderPaymentMethodType.Associations.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPaymentMethodType.Associations.Passengers }
         *     
         */
        public void setPassengers(OrderPaymentMethodType.Associations.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the otherAssociation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherAssociation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderPaymentMethodType.Associations.OtherAssociation }
         * 
         * 
         */
        public List<OrderPaymentMethodType.Associations.OtherAssociation> getOtherAssociation() {
            if (otherAssociation == null) {
                otherAssociation = new ArrayList<OrderPaymentMethodType.Associations.OtherAssociation>();
            }
            return this.otherAssociation;
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
         *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}OtherOrderAssocListType" />
         *       &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OtherAssociation {

            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "RefValue", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object refValue;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the refValue property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRefValue() {
                return refValue;
            }

            /**
             * Sets the value of the refValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRefValue(Object value) {
                this.refValue = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GroupReference"/>
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
            "passengerReference",
            "groupReference"
        })
        public static class Passengers {

            @XmlList
            @XmlElement(name = "PassengerReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> passengerReference;
            @XmlElement(name = "GroupReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object groupReference;

            /**
             * 
             *                         Association to multiple Passenger instance(s). Example: pax1 pax2
             *                       Gets the value of the passengerReference property.
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

            /**
             * Gets the value of the groupReference property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getGroupReference() {
                return groupReference;
            }

            /**
             * Sets the value of the groupReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setGroupReference(Object value) {
                this.groupReference = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BankAccountMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CashMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBillMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MiscChargeMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OtherMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RedemptionMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}VoucherMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/>
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
        "bankAccountMethod",
        "cashMethod",
        "directBillMethod",
        "miscChargeMethod",
        "otherMethod",
        "paymentCardMethod",
        "redemptionMethod",
        "voucherMethod",
        "check"
    })
    public static class Method {

        @XmlElement(name = "BankAccountMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BankAccountMethodType bankAccountMethod;
        @XmlElement(name = "CashMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CashMethodType cashMethod;
        @XmlElement(name = "DirectBillMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DirectBillMethodType directBillMethod;
        @XmlElement(name = "MiscChargeMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MiscChargeMethodType miscChargeMethod;
        @XmlElement(name = "OtherMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OtherMethodType otherMethod;
        @XmlElement(name = "PaymentCardMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected PaymentCardMethodType paymentCardMethod;
        @XmlElement(name = "RedemptionMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected RedemptionMethodType redemptionMethod;
        @XmlElement(name = "VoucherMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected VoucherMethodType voucherMethod;
        @XmlElement(name = "Check", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Check check;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the bankAccountMethod property.
         * 
         * @return
         *     possible object is
         *     {@link BankAccountMethodType }
         *     
         */
        public BankAccountMethodType getBankAccountMethod() {
            return bankAccountMethod;
        }

        /**
         * Sets the value of the bankAccountMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAccountMethodType }
         *     
         */
        public void setBankAccountMethod(BankAccountMethodType value) {
            this.bankAccountMethod = value;
        }

        /**
         * Gets the value of the cashMethod property.
         * 
         * @return
         *     possible object is
         *     {@link CashMethodType }
         *     
         */
        public CashMethodType getCashMethod() {
            return cashMethod;
        }

        /**
         * Sets the value of the cashMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link CashMethodType }
         *     
         */
        public void setCashMethod(CashMethodType value) {
            this.cashMethod = value;
        }

        /**
         * Gets the value of the directBillMethod property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillMethodType }
         *     
         */
        public DirectBillMethodType getDirectBillMethod() {
            return directBillMethod;
        }

        /**
         * Sets the value of the directBillMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillMethodType }
         *     
         */
        public void setDirectBillMethod(DirectBillMethodType value) {
            this.directBillMethod = value;
        }

        /**
         * Gets the value of the miscChargeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link MiscChargeMethodType }
         *     
         */
        public MiscChargeMethodType getMiscChargeMethod() {
            return miscChargeMethod;
        }

        /**
         * Sets the value of the miscChargeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscChargeMethodType }
         *     
         */
        public void setMiscChargeMethod(MiscChargeMethodType value) {
            this.miscChargeMethod = value;
        }

        /**
         * Gets the value of the otherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link OtherMethodType }
         *     
         */
        public OtherMethodType getOtherMethod() {
            return otherMethod;
        }

        /**
         * Sets the value of the otherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherMethodType }
         *     
         */
        public void setOtherMethod(OtherMethodType value) {
            this.otherMethod = value;
        }

        /**
         * Gets the value of the paymentCardMethod property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public PaymentCardMethodType getPaymentCardMethod() {
            return paymentCardMethod;
        }

        /**
         * Sets the value of the paymentCardMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public void setPaymentCardMethod(PaymentCardMethodType value) {
            this.paymentCardMethod = value;
        }

        /**
         * Gets the value of the redemptionMethod property.
         * 
         * @return
         *     possible object is
         *     {@link RedemptionMethodType }
         *     
         */
        public RedemptionMethodType getRedemptionMethod() {
            return redemptionMethod;
        }

        /**
         * Sets the value of the redemptionMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RedemptionMethodType }
         *     
         */
        public void setRedemptionMethod(RedemptionMethodType value) {
            this.redemptionMethod = value;
        }

        /**
         * Gets the value of the voucherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link VoucherMethodType }
         *     
         */
        public VoucherMethodType getVoucherMethod() {
            return voucherMethod;
        }

        /**
         * Sets the value of the voucherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoucherMethodType }
         *     
         */
        public void setVoucherMethod(VoucherMethodType value) {
            this.voucherMethod = value;
        }

        /**
         * Check (Cheque) Payment
         * 
         * @return
         *     possible object is
         *     {@link Check }
         *     
         */
        public Check getCheck() {
            return check;
        }

        /**
         * Sets the value of the check property.
         * 
         * @param value
         *     allowed object is
         *     {@link Check }
         *     
         */
        public void setCheck(Check value) {
            this.check = value;
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
     *         &lt;element name="Promotion" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/>
     *                 &lt;/sequence>
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
        "promotion"
    })
    public static class Promotions {

        @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<OrderPaymentMethodType.Promotions.Promotion> promotion;

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderPaymentMethodType.Promotions.Promotion }
         * 
         * 
         */
        public List<OrderPaymentMethodType.Promotions.Promotion> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<OrderPaymentMethodType.Promotions.Promotion>();
            }
            return this.promotion;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/>
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
            "associations"
        })
        public static class Promotion
            extends PromotionType
        {

            @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected OrderItemAssociationType associations;

            /**
             * Association(s), including Passenger and Group.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
            }

        }

    }

}
