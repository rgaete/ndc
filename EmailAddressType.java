
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The email address which should be used for contact purposes.
 * 
 * <p>Java class for EmailAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="EmailAddressValue" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddressType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "label",
    "emailAddressValue"
})
public class EmailAddressType {

    @XmlElement(name = "Label", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String label;
    @XmlElement(name = "EmailAddressValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String emailAddressValue;

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
     * Gets the value of the emailAddressValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddressValue() {
        return emailAddressValue;
    }

    /**
     * Sets the value of the emailAddressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddressValue(String value) {
        this.emailAddressValue = value;
    }

}
