
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferencesLevelListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferencesLevelListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Preferred"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Exclude"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferencesLevelListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum PreferencesLevelListType {

    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude");
    private final String value;

    PreferencesLevelListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferencesLevelListType fromValue(String v) {
        for (PreferencesLevelListType c: PreferencesLevelListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
