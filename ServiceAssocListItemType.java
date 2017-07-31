
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAssocListItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAssocListItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="Disclosure"/>
 *     &lt;enumeration value="MediaGroup"/>
 *     &lt;enumeration value="MediaItem"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="OfferItem"/>
 *     &lt;enumeration value="Penalty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceAssocListItemType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum ServiceAssocListItemType {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Disclosure")
    DISCLOSURE("Disclosure"),
    @XmlEnumValue("MediaGroup")
    MEDIA_GROUP("MediaGroup"),
    @XmlEnumValue("MediaItem")
    MEDIA_ITEM("MediaItem"),
    @XmlEnumValue("Offer")
    OFFER("Offer"),
    @XmlEnumValue("OfferItem")
    OFFER_ITEM("OfferItem"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    ServiceAssocListItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAssocListItemType fromValue(String v) {
        for (ServiceAssocListItemType c: ServiceAssocListItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
