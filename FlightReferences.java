
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
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
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>InstanceClassRefSimpleType">
 *       &lt;attribute name="OnPoint" type="{http://www.iata.org/IATA/EDIST/2017.1}AirportCitySimpleType" />
 *       &lt;attribute name="OffPoint" type="{http://www.iata.org/IATA/EDIST/2017.1}AirportCitySimpleType" />
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
@XmlRootElement(name = "FlightReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class FlightReferences {

    @XmlValue
    @XmlIDREF
    protected List<Object> value;
    @XmlAttribute(name = "OnPoint")
    protected String onPoint;
    @XmlAttribute(name = "OffPoint")
    protected String offPoint;

    /**
     * A data type definition for Globally Unique XML Instance or Other Class Reference Association size constraint.Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    /**
     * Gets the value of the onPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnPoint() {
        return onPoint;
    }

    /**
     * Sets the value of the onPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnPoint(String value) {
        this.onPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

}
