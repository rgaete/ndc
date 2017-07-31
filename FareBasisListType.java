
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareBasisListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareBasisListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareBasisListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum FareBasisListType {

    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FareBasisListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareBasisListType fromValue(String v) {
        for (FareBasisListType c: FareBasisListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}