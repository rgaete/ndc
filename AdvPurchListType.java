
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvPurchListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvPurchListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EARLIEST"/>
 *     &lt;enumeration value="LATEST"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvPurchListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum AdvPurchListType {

    EARLIEST("EARLIEST"),
    LATEST("LATEST"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AdvPurchListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdvPurchListType fromValue(String v) {
        for (AdvPurchListType c: AdvPurchListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
