
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>GeoSpecCodeType">
 *       &lt;attribute name="GeoSpecCodeType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *             &lt;enumeration value="A"/>
 *             &lt;enumeration value="S"/>
 *             &lt;enumeration value="Z"/>
 *             &lt;enumeration value="C"/>
 *             &lt;enumeration value="P"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "GeoSpecCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class GeoSpecCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "GeoSpecCodeType", required = true)
    protected String geoSpecCodeType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the geoSpecCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoSpecCodeType() {
        return geoSpecCodeType;
    }

    /**
     * Sets the value of the geoSpecCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoSpecCodeType(String value) {
        this.geoSpecCodeType = value;
    }

}
