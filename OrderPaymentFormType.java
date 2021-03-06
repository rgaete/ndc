
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
 * ORDER PAYMENT FORM definition.
 * 
 * <p>Java class for OrderPaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Voucher" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCard" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Other" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MiscChargeOrder" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LoyaltyRedemption" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBill" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Cash" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BankAccount" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPriceType"/>
 *         &lt;element name="Associations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
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
 *                   &lt;element name="OfferItemSets" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferItemSetRefs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType"/>
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
 *         &lt;element name="Payer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Surname">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Given" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="Middle" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Contacts" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Qualifier" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
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
@XmlType(name = "OrderPaymentFormType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "method",
    "amount",
    "associations",
    "payer",
    "qualifier"
})
public class OrderPaymentFormType {

    @XmlElement(name = "Method", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OrderPaymentFormType.Method method;
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected SimpleCurrencyPriceType amount;
    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderPaymentFormType.Associations associations;
    @XmlElement(name = "Payer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderPaymentFormType.Payer payer;
    @XmlElement(name = "Qualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String qualifier;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Method }
     *     
     */
    public OrderPaymentFormType.Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Method }
     *     
     */
    public void setMethod(OrderPaymentFormType.Method value) {
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
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Associations }
     *     
     */
    public OrderPaymentFormType.Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Associations }
     *     
     */
    public void setAssociations(OrderPaymentFormType.Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Payer }
     *     
     */
    public OrderPaymentFormType.Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Payer }
     *     
     */
    public void setPayer(OrderPaymentFormType.Payer value) {
        this.payer = value;
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
     *         &lt;element name="OfferItemSets" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferItemSetRefs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType"/>
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
        "passengers",
        "offerItemSets"
    })
    public static class Associations {

        @XmlElement(name = "Passengers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderPaymentFormType.Associations.Passengers passengers;
        @XmlElement(name = "OfferItemSets", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderPaymentFormType.Associations.OfferItemSets offerItemSets;

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPaymentFormType.Associations.Passengers }
         *     
         */
        public OrderPaymentFormType.Associations.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPaymentFormType.Associations.Passengers }
         *     
         */
        public void setPassengers(OrderPaymentFormType.Associations.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the offerItemSets property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPaymentFormType.Associations.OfferItemSets }
         *     
         */
        public OrderPaymentFormType.Associations.OfferItemSets getOfferItemSets() {
            return offerItemSets;
        }

        /**
         * Sets the value of the offerItemSets property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPaymentFormType.Associations.OfferItemSets }
         *     
         */
        public void setOfferItemSets(OrderPaymentFormType.Associations.OfferItemSets value) {
            this.offerItemSets = value;
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
         *         &lt;element name="OfferItemSetRefs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType"/>
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
            "offerItemSetRefs"
        })
        public static class OfferItemSets {

            @XmlList
            @XmlElement(name = "OfferItemSetRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> offerItemSetRefs;

            /**
             * Gets the value of the offerItemSetRefs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offerItemSetRefs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOfferItemSetRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getOfferItemSetRefs() {
                if (offerItemSetRefs == null) {
                    offerItemSetRefs = new ArrayList<Object>();
                }
                return this.offerItemSetRefs;
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
             *                             Association to multiple Passenger instance(s). Example: pax1 pax2
             *                           Gets the value of the passengerReference property.
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Voucher" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCard" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Other" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MiscChargeOrder" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LoyaltyRedemption" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBill" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Cash" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BankAccount" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/>
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
        "voucher",
        "paymentCard",
        "other",
        "miscChargeOrder",
        "loyaltyRedemption",
        "directBill",
        "cash",
        "bankAccount",
        "check"
    })
    public static class Method {

        @XmlElement(name = "Voucher", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Voucher voucher;
        @XmlElement(name = "PaymentCard", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected PaymentCardType paymentCard;
        @XmlElement(name = "Other", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Other other;
        @XmlElement(name = "MiscChargeOrder", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MiscChargeOrder miscChargeOrder;
        @XmlElement(name = "LoyaltyRedemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected LoyaltyRedemption loyaltyRedemption;
        @XmlElement(name = "DirectBill", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DirectBillType directBill;
        @XmlElement(name = "Cash", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Cash cash;
        @XmlElement(name = "BankAccount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BankAccountType bankAccount;
        @XmlElement(name = "Check", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Check check;

        /**
         * Information relating to prepayment vouchers.
         * 
         * @return
         *     possible object is
         *     {@link Voucher }
         *     
         */
        public Voucher getVoucher() {
            return voucher;
        }

        /**
         * Sets the value of the voucher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Voucher }
         *     
         */
        public void setVoucher(Voucher value) {
            this.voucher = value;
        }

        /**
         * Gets the value of the paymentCard property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType }
         *     
         */
        public PaymentCardType getPaymentCard() {
            return paymentCard;
        }

        /**
         * Sets the value of the paymentCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType }
         *     
         */
        public void setPaymentCard(PaymentCardType value) {
            this.paymentCard = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * @return
         *     possible object is
         *     {@link Other }
         *     
         */
        public Other getOther() {
            return other;
        }

        /**
         * Sets the value of the other property.
         * 
         * @param value
         *     allowed object is
         *     {@link Other }
         *     
         */
        public void setOther(Other value) {
            this.other = value;
        }

        /**
         * Gets the value of the miscChargeOrder property.
         * 
         * @return
         *     possible object is
         *     {@link MiscChargeOrder }
         *     
         */
        public MiscChargeOrder getMiscChargeOrder() {
            return miscChargeOrder;
        }

        /**
         * Sets the value of the miscChargeOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscChargeOrder }
         *     
         */
        public void setMiscChargeOrder(MiscChargeOrder value) {
            this.miscChargeOrder = value;
        }

        /**
         * Gets the value of the loyaltyRedemption property.
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public LoyaltyRedemption getLoyaltyRedemption() {
            return loyaltyRedemption;
        }

        /**
         * Sets the value of the loyaltyRedemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public void setLoyaltyRedemption(LoyaltyRedemption value) {
            this.loyaltyRedemption = value;
        }

        /**
         * Gets the value of the directBill property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillType }
         *     
         */
        public DirectBillType getDirectBill() {
            return directBill;
        }

        /**
         * Sets the value of the directBill property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillType }
         *     
         */
        public void setDirectBill(DirectBillType value) {
            this.directBill = value;
        }

        /**
         * Gets the value of the cash property.
         * 
         * @return
         *     possible object is
         *     {@link Cash }
         *     
         */
        public Cash getCash() {
            return cash;
        }

        /**
         * Sets the value of the cash property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cash }
         *     
         */
        public void setCash(Cash value) {
            this.cash = value;
        }

        /**
         * Gets the value of the bankAccount property.
         * 
         * @return
         *     possible object is
         *     {@link BankAccountType }
         *     
         */
        public BankAccountType getBankAccount() {
            return bankAccount;
        }

        /**
         * Sets the value of the bankAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAccountType }
         *     
         */
        public void setBankAccount(BankAccountType value) {
            this.bankAccount = value;
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
     *         &lt;element name="Name">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Surname">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Given" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="Middle" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Contacts" minOccurs="0"/>
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
        "name",
        "contacts"
    })
    public static class Payer {

        @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected OrderPaymentFormType.Payer.Name name;
        @XmlElement(name = "Contacts", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Contacts contacts;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPaymentFormType.Payer.Name }
         *     
         */
        public OrderPaymentFormType.Payer.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPaymentFormType.Payer.Name }
         *     
         */
        public void setName(OrderPaymentFormType.Payer.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the contacts property.
         * 
         * @return
         *     possible object is
         *     {@link Contacts }
         *     
         */
        public Contacts getContacts() {
            return contacts;
        }

        /**
         * Sets the value of the contacts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contacts }
         *     
         */
        public void setContacts(Contacts value) {
            this.contacts = value;
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
         *         &lt;element name="Surname">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Given" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="Middle" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "surname",
            "given",
            "title",
            "surnameSuffix",
            "middle"
        })
        public static class Name {

            @XmlElement(name = "Surname", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected OrderPaymentFormType.Payer.Name.Surname surname;
            @XmlElement(name = "Given", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<OrderPaymentFormType.Payer.Name.Given> given;
            @XmlElement(name = "Title", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String title;
            @XmlElement(name = "SurnameSuffix", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected Object surnameSuffix;
            @XmlElement(name = "Middle", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<OrderPaymentFormType.Payer.Name.Middle> middle;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ObjectMetaReferences")
            @XmlIDREF
            protected List<Object> objectMetaReferences;

            /**
             * Gets the value of the surname property.
             * 
             * @return
             *     possible object is
             *     {@link OrderPaymentFormType.Payer.Name.Surname }
             *     
             */
            public OrderPaymentFormType.Payer.Name.Surname getSurname() {
                return surname;
            }

            /**
             * Sets the value of the surname property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderPaymentFormType.Payer.Name.Surname }
             *     
             */
            public void setSurname(OrderPaymentFormType.Payer.Name.Surname value) {
                this.surname = value;
            }

            /**
             * Gets the value of the given property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the given property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGiven().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderPaymentFormType.Payer.Name.Given }
             * 
             * 
             */
            public List<OrderPaymentFormType.Payer.Name.Given> getGiven() {
                if (given == null) {
                    given = new ArrayList<OrderPaymentFormType.Payer.Name.Given>();
                }
                return this.given;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the surnameSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSurnameSuffix() {
                return surnameSuffix;
            }

            /**
             * Sets the value of the surnameSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSurnameSuffix(Object value) {
                this.surnameSuffix = value;
            }

            /**
             * Gets the value of the middle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the middle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMiddle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderPaymentFormType.Payer.Name.Middle }
             * 
             * 
             */
            public List<OrderPaymentFormType.Payer.Name.Middle> getMiddle() {
                if (middle == null) {
                    middle = new ArrayList<OrderPaymentFormType.Payer.Name.Middle>();
                }
                return this.middle;
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
             * Gets the value of the objectMetaReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the objectMetaReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObjectMetaReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getObjectMetaReferences() {
                if (objectMetaReferences == null) {
                    objectMetaReferences = new ArrayList<Object>();
                }
                return this.objectMetaReferences;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
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
            public static class Given {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
            public static class Middle {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

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
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
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
            public static class Surname {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
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

    }

}
