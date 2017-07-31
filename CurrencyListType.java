
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Conversion"/>
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum CurrencyListType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CurrencyListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyListType fromValue(String v) {
        for (CurrencyListType c: CurrencyListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
