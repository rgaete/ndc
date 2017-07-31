
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTP_CodeFormatListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTP_CodeFormatListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="Text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTP_CodeFormatListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum OTPCodeFormatListType {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    SMS("SMS"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    OTPCodeFormatListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTPCodeFormatListType fromValue(String v) {
        for (OTPCodeFormatListType c: OTPCodeFormatListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
