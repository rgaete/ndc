
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for Day of Week Date Period Representation.
 * 
 * <p>Java class for DayRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayRepType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>DayOfWeekSimpleType">
 *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayRepType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "value"
})
public class DayRepType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * A data type for Day of Week encoding constraint:Positive Integer 1 - 7
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}