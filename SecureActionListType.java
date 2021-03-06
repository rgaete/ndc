
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureActionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureActionListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EnrollmentCheckRequest"/>
 *     &lt;enumeration value="EnrollmentCheckResponse"/>
 *     &lt;enumeration value="CardAuthenticationRequest"/>
 *     &lt;enumeration value="CardAuthenticationResponse"/>
 *     &lt;enumeration value="ValidateCardInfoRequest"/>
 *     &lt;enumeration value="ValidateCardInfoResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecureActionListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum SecureActionListType {

    @XmlEnumValue("EnrollmentCheckRequest")
    ENROLLMENT_CHECK_REQUEST("EnrollmentCheckRequest"),
    @XmlEnumValue("EnrollmentCheckResponse")
    ENROLLMENT_CHECK_RESPONSE("EnrollmentCheckResponse"),
    @XmlEnumValue("CardAuthenticationRequest")
    CARD_AUTHENTICATION_REQUEST("CardAuthenticationRequest"),
    @XmlEnumValue("CardAuthenticationResponse")
    CARD_AUTHENTICATION_RESPONSE("CardAuthenticationResponse"),
    @XmlEnumValue("ValidateCardInfoRequest")
    VALIDATE_CARD_INFO_REQUEST("ValidateCardInfoRequest"),
    @XmlEnumValue("ValidateCardInfoResponse")
    VALIDATE_CARD_INFO_RESPONSE("ValidateCardInfoResponse");
    private final String value;

    SecureActionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureActionListType fromValue(String v) {
        for (SecureActionListType c: SecureActionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
