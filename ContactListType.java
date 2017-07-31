
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="ServiceLocation"/>
 *     &lt;enumeration value="StayLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum ContactListType {

    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation"),
    @XmlEnumValue("StayLocation")
    STAY_LOCATION("StayLocation");
    private final String value;

    ContactListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactListType fromValue(String v) {
        for (ContactListType c: ContactListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
