
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTRIBUTE"/>
 *     &lt;enumeration value="AFFINITY"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchAppListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum MatchAppListType {

    ATTRIBUTE("ATTRIBUTE"),
    AFFINITY("AFFINITY"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MatchAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchAppListType fromValue(String v) {
        for (MatchAppListType c: MatchAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
