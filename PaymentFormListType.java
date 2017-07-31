
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFormListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentFormListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BankAccount"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="DirectBill"/>
 *     &lt;enumeration value="LoyaltyRedemption"/>
 *     &lt;enumeration value="MiscChargeOrder"/>
 *     &lt;enumeration value="PaymentCard"/>
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentFormListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum PaymentFormListType {

    @XmlEnumValue("BankAccount")
    BANK_ACCOUNT("BankAccount"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("DirectBill")
    DIRECT_BILL("DirectBill"),
    @XmlEnumValue("LoyaltyRedemption")
    LOYALTY_REDEMPTION("LoyaltyRedemption"),
    @XmlEnumValue("MiscChargeOrder")
    MISC_CHARGE_ORDER("MiscChargeOrder"),
    @XmlEnumValue("PaymentCard")
    PAYMENT_CARD("PaymentCard"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PaymentFormListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentFormListType fromValue(String v) {
        for (PaymentFormListType c: PaymentFormListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
