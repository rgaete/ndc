
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeLimitTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeLimitTypeListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bilateral"/>
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="InventoryGuarantee"/>
 *     &lt;enumeration value="Naming"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="PriceGuarantee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeLimitTypeListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum TimeLimitTypeListType {

    @XmlEnumValue("Bilateral")
    BILATERAL("Bilateral"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("InventoryGuarantee")
    INVENTORY_GUARANTEE("InventoryGuarantee"),
    @XmlEnumValue("Naming")
    NAMING("Naming"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("PriceGuarantee")
    PRICE_GUARANTEE("PriceGuarantee");
    private final String value;

    TimeLimitTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeLimitTypeListType fromValue(String v) {
        for (TimeLimitTypeListType c: TimeLimitTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
