
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SizeUnitSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SizeUnitSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Centimeter"/>
 *     &lt;enumeration value="Inch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SizeUnitSimpleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum SizeUnitSimpleType {

    @XmlEnumValue("Centimeter")
    CENTIMETER("Centimeter"),
    @XmlEnumValue("Inch")
    INCH("Inch");
    private final String value;

    SizeUnitSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SizeUnitSimpleType fromValue(String v) {
        for (SizeUnitSimpleType c: SizeUnitSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
