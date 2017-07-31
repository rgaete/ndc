
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightMileageListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightMileageListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Arrival"/>
 *     &lt;enumeration value="Departure"/>
 *     &lt;enumeration value="Destination"/>
 *     &lt;enumeration value="Origin"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightMileageListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum FlightMileageListType {

    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival"),
    @XmlEnumValue("Departure")
    DEPARTURE("Departure"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FlightMileageListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightMileageListType fromValue(String v) {
        for (FlightMileageListType c: FlightMileageListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
