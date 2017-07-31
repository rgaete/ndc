
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagRestrictionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagRestrictionListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Party"/>
 *     &lt;enumeration value="Traveler"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagRestrictionListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum BagRestrictionListType {

    @XmlEnumValue("Party")
    PARTY("Party"),
    @XmlEnumValue("Traveler")
    TRAVELER("Traveler");
    private final String value;

    BagRestrictionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagRestrictionListType fromValue(String v) {
        for (BagRestrictionListType c: BagRestrictionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
