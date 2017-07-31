
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferedServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfferedServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="Baggage"/>
 *     &lt;enumeration value="Seats"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfferedServiceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum OfferedServiceType {

    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("Baggage")
    BAGGAGE("Baggage"),
    @XmlEnumValue("Seats")
    SEATS("Seats"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    OfferedServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfferedServiceType fromValue(String v) {
        for (OfferedServiceType c: OfferedServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
