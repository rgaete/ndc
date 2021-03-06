
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Other Contact Method information.   (i.e. social media handle, website, etc.)
 * 
 * <p>Java class for OtherAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleNameType"/>
 *         &lt;element name="OtherAddressValue" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAddressType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "label",
    "otherAddressValue"
})
public class OtherAddressType {

    @XmlElement(name = "Label", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String label;
    @XmlElement(name = "OtherAddressValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String otherAddressValue;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the otherAddressValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressValue() {
        return otherAddressValue;
    }

    /**
     * Sets the value of the otherAddressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddressValue(String value) {
        this.otherAddressValue = value;
    }

}
