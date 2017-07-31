
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="MoreInformation"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum PaymentStatusListType {

    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("MoreInformation")
    MORE_INFORMATION("MoreInformation"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    PaymentStatusListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusListType fromValue(String v) {
        for (PaymentStatusListType c: PaymentStatusListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
