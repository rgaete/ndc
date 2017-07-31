
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnableAVS_SimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnableAVS_SimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="Enable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnableAVS_SimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum EnableAVSSimpleType {

    @XmlEnumValue("Disable")
    DISABLE("Disable"),
    @XmlEnumValue("Enable")
    ENABLE("Enable");
    private final String value;

    EnableAVSSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnableAVSSimpleType fromValue(String v) {
        for (EnableAVSSimpleType c: EnableAVSSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
