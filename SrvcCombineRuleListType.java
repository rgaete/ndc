
package ndc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SrvcCombineRuleListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SrvcCombineRuleListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotPermitted"/>
 *     &lt;enumeration value="Permitted"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SrvcCombineRuleListType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlEnum
public enum SrvcCombineRuleListType {

    @XmlEnumValue("NotPermitted")
    NOT_PERMITTED("NotPermitted"),
    @XmlEnumValue("Permitted")
    PERMITTED("Permitted"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SrvcCombineRuleListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrvcCombineRuleListType fromValue(String v) {
        for (SrvcCombineRuleListType c: SrvcCombineRuleListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
