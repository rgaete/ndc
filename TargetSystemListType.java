
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSystemListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetSystemListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Production"/>
 *     &lt;enumeration value="Staging"/>
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetSystemListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum TargetSystemListType {


    /**
     * K = KILOMETERS
     * 
     */
    @XmlEnumValue("Production")
    PRODUCTION("Production"),

    /**
     * M = MILES
     * 
     */
    @XmlEnumValue("Staging")
    STAGING("Staging"),
    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TargetSystemListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetSystemListType fromValue(String v) {
        for (TargetSystemListType c: TargetSystemListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
