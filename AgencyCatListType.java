
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyCatListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyCatListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OnlineTravelAgency"/>
 *     &lt;enumeration value="TravelAgency"/>
 *     &lt;enumeration value="TravelManagementCompany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgencyCatListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum AgencyCatListType {

    @XmlEnumValue("OnlineTravelAgency")
    ONLINE_TRAVEL_AGENCY("OnlineTravelAgency"),

    /**
     * Travel agency.
     * 
     */
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),
    @XmlEnumValue("TravelManagementCompany")
    TRAVEL_MANAGEMENT_COMPANY("TravelManagementCompany");
    private final String value;

    AgencyCatListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgencyCatListType fromValue(String v) {
        for (AgencyCatListType c: AgencyCatListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
