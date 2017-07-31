
package ndc;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
 * 
 * <p>Java class for PhoneTypeAIDM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneTypeAIDM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="CountryDialingCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CountryDialiingCodeType" minOccurs="0"/>
 *         &lt;element name="AreaCode" type="{http://www.iata.org/IATA/EDIST/2017.1}NumberType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.iata.org/IATA/EDIST/2017.1}NumberType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.iata.org/IATA/EDIST/2017.1}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneTypeAIDM", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "label",
    "countryDialingCode",
    "areaCode",
    "phoneNumber",
    "extension"
})
public class PhoneTypeAIDM {

    @XmlElement(name = "Label", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String label;
    @XmlElement(name = "CountryDialingCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String countryDialingCode;
    @XmlElement(name = "AreaCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BigDecimal areaCode;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BigDecimal phoneNumber;
    @XmlElement(name = "Extension", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BigDecimal extension;

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
     * Gets the value of the countryDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDialingCode(String value) {
        this.countryDialingCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaCode(BigDecimal value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhoneNumber(BigDecimal value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtension(BigDecimal value) {
        this.extension = value;
    }

}