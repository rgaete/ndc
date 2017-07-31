
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemActionSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderItemActionSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Divide"/>
 *     &lt;enumeration value="Reissue"/>
 *     &lt;enumeration value="Reprice"/>
 *     &lt;enumeration value="Update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderItemActionSimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum OrderItemActionSimpleType {

    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Divide")
    DIVIDE("Divide"),
    @XmlEnumValue("Reissue")
    REISSUE("Reissue"),
    @XmlEnumValue("Reprice")
    REPRICE("Reprice"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    OrderItemActionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderItemActionSimpleType fromValue(String v) {
        for (OrderItemActionSimpleType c: OrderItemActionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
