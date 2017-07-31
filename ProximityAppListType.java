
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProximityAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProximityAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActualProximity"/>
 *     &lt;enumeration value="SearchRadius"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProximityAppListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum ProximityAppListType {

    @XmlEnumValue("ActualProximity")
    ACTUAL_PROXIMITY("ActualProximity"),
    @XmlEnumValue("SearchRadius")
    SEARCH_RADIUS("SearchRadius"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ProximityAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProximityAppListType fromValue(String v) {
        for (ProximityAppListType c: ProximityAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
