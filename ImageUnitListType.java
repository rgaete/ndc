
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageUnitListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageUnitListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inch"/>
 *     &lt;enumeration value="Millimeter"/>
 *     &lt;enumeration value="Pixel"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageUnitListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum ImageUnitListType {

    @XmlEnumValue("Inch")
    INCH("Inch"),
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),
    @XmlEnumValue("Pixel")
    PIXEL("Pixel"),
    @XmlEnumValue("Point")
    POINT("Point"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ImageUnitListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageUnitListType fromValue(String v) {
        for (ImageUnitListType c: ImageUnitListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
