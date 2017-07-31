
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponMediaListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponMediaListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electronic"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CouponMediaListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum CouponMediaListType {

    @XmlEnumValue("Electronic")
    ELECTRONIC("Electronic"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CouponMediaListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponMediaListType fromValue(String v) {
        for (CouponMediaListType c: CouponMediaListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
