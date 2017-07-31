
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketMsgAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketMsgAssocSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Media"/>
 *     &lt;enumeration value="OfferItem"/>
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="OrderItem"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="ServiceBundle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketMsgAssocSimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum MarketMsgAssocSimpleType {

    @XmlEnumValue("Media")
    MEDIA("Media"),
    @XmlEnumValue("OfferItem")
    OFFER_ITEM("OfferItem"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("OrderItem")
    ORDER_ITEM("OrderItem"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("ServiceBundle")
    SERVICE_BUNDLE("ServiceBundle");
    private final String value;

    MarketMsgAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketMsgAssocSimpleType fromValue(String v) {
        for (MarketMsgAssocSimpleType c: MarketMsgAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
