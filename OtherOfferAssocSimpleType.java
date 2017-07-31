
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherOfferAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherOfferAssocSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AircraftEquipment"/>
 *     &lt;enumeration value="BaggageDisclosure"/>
 *     &lt;enumeration value="CarryOnAllowance"/>
 *     &lt;enumeration value="CheckedBagAllowance"/>
 *     &lt;enumeration value="MediaGroup"/>
 *     &lt;enumeration value="MediaItem"/>
 *     &lt;enumeration value="OfferDisclosure"/>
 *     &lt;enumeration value="OfferInstructions"/>
 *     &lt;enumeration value="OfferTerms"/>
 *     &lt;enumeration value="Penalty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OtherOfferAssocSimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum OtherOfferAssocSimpleType {

    @XmlEnumValue("AircraftEquipment")
    AIRCRAFT_EQUIPMENT("AircraftEquipment"),
    @XmlEnumValue("BaggageDisclosure")
    BAGGAGE_DISCLOSURE("BaggageDisclosure"),
    @XmlEnumValue("CarryOnAllowance")
    CARRY_ON_ALLOWANCE("CarryOnAllowance"),
    @XmlEnumValue("CheckedBagAllowance")
    CHECKED_BAG_ALLOWANCE("CheckedBagAllowance"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("OfferDisclosure")
    OFFER_DISCLOSURE("OfferDisclosure"),
    @XmlEnumValue("OfferInstructions")
    OFFER_INSTRUCTIONS("OfferInstructions"),
    @XmlEnumValue("OfferTerms")
    OFFER_TERMS("OfferTerms"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    OtherOfferAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherOfferAssocSimpleType fromValue(String v) {
        for (OtherOfferAssocSimpleType c: OtherOfferAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
