
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderingTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenderingTypeListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Narrative"/>
 *     &lt;enumeration value="XSLT"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenderingTypeListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum RenderingTypeListType {

    @XmlEnumValue("Narrative")
    NARRATIVE("Narrative"),
    XSLT("XSLT"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RenderingTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RenderingTypeListType fromValue(String v) {
        for (RenderingTypeListType c: RenderingTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
