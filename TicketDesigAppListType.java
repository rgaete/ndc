
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketDesigAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketDesigAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TicketDesigAppListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum TicketDesigAppListType {

    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TicketDesigAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketDesigAppListType fromValue(String v) {
        for (TicketDesigAppListType c: TicketDesigAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
