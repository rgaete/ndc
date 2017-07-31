
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportCodeRoleSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirportCodeRoleSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Arrival_Destination"/>
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="Departure_Origin"/>
 *     &lt;enumeration value="Stop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirportCodeRoleSimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum AirportCodeRoleSimpleType {

    @XmlEnumValue("Arrival_Destination")
    ARRIVAL_DESTINATION("Arrival_Destination"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("Departure_Origin")
    DEPARTURE_ORIGIN("Departure_Origin"),
    @XmlEnumValue("Stop")
    STOP("Stop");
    private final String value;

    AirportCodeRoleSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirportCodeRoleSimpleType fromValue(String v) {
        for (AirportCodeRoleSimpleType c: AirportCodeRoleSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
