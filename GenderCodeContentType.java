
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Female"/>
 *     &lt;enumeration value="Male"/>
 *     &lt;enumeration value="Unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenderCodeContentType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum GenderCodeContentType {

    @XmlEnumValue("Female")
    FEMALE("Female"),
    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified");
    private final String value;

    GenderCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderCodeContentType fromValue(String v) {
        for (GenderCodeContentType c: GenderCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
