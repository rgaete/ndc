
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpnCancelFunctionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CpnCancelFunctionListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OriginalIssue"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="Refund"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CpnCancelFunctionListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum CpnCancelFunctionListType {

    @XmlEnumValue("OriginalIssue")
    ORIGINAL_ISSUE("OriginalIssue"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    CpnCancelFunctionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CpnCancelFunctionListType fromValue(String v) {
        for (CpnCancelFunctionListType c: CpnCancelFunctionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
