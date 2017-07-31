
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum EmailListType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    SMS("SMS"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EmailListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailListType fromValue(String v) {
        for (EmailListType c: EmailListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
