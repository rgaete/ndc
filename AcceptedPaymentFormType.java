
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * ACCEPTED PAYMENT FORM definition.
 * 
 * <p>Java class for AcceptedPaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptedPaymentFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPriceType" minOccurs="0"/>
 *         &lt;element name="Qualifier" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Voucher" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCard" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Other" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MiscChargeOrder" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LoyaltyRedemption" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBill" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Cash" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BankAccount" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations" minOccurs="0"/>
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
@XmlType(name = "AcceptedPaymentFormType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "type",
    "amount",
    "qualifier",
    "voucher",
    "paymentCard",
    "other",
    "miscChargeOrder",
    "loyaltyRedemption",
    "directBill",
    "cash",
    "bankAccount",
    "associations"
})
public class AcceptedPaymentFormType {

    @XmlElement(name = "Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String type;
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SimpleCurrencyPriceType amount;
    @XmlElement(name = "Qualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String qualifier;
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
    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderItemAssociationType associations;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

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
     * Gets the value of the associations property.
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
