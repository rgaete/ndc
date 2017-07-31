
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Spoken"/>
 *     &lt;enumeration value="Written"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageAppListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum LanguageAppListType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Spoken")
    SPOKEN("Spoken"),
    @XmlEnumValue("Written")
    WRITTEN("Written"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    LanguageAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageAppListType fromValue(String v) {
        for (LanguageAppListType c: LanguageAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
