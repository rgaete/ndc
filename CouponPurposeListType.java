
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponPurposeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponPurposeListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Additional"/>
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Sell"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CouponPurposeListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum CouponPurposeListType {

    @XmlEnumValue("Additional")
    ADDITIONAL("Additional"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Sell")
    SELL("Sell");
    private final String value;

    CouponPurposeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponPurposeListType fromValue(String v) {
        for (CouponPurposeListType c: CouponPurposeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
