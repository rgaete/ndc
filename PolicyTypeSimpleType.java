
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyTypeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Privacy_PII"/>
 *     &lt;enumeration value="Payment_PCI"/>
 *     &lt;enumeration value="Credentialing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyTypeSimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum PolicyTypeSimpleType {


    /**
     * 
     *             Personnally Identifting Information Privacy Policy.
     *           
     * 
     */
    @XmlEnumValue("Privacy_PII")
    PRIVACY_PII("Privacy_PII"),
    @XmlEnumValue("Payment_PCI")
    PAYMENT_PCI("Payment_PCI"),
    @XmlEnumValue("Credentialing")
    CREDENTIALING("Credentialing");
    private final String value;

    PolicyTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyTypeSimpleType fromValue(String v) {
        for (PolicyTypeSimpleType c: PolicyTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
