
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Device identification.
 * 
 * <p>Java class for DeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Position" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="IP_Address" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
 *         &lt;element name="MAC_Address" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "type",
    "phoneNumber",
    "ipAddress",
    "macAddress",
    "name"
})
@XmlSeeAlso({
    ndc.SecurePaymentAlertType.Details.CustomerDevice.class,
    ndc.PinPhraseQuestionType.Device.class,
    ndc.PinPhraseAnswerType.Device.class
})
public class DeviceType {

    @XmlElement(name = "Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected DeviceType.Type type;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PhoneType phoneNumber;
    @XmlElement(name = "IP_Address", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String ipAddress;
    @XmlElement(name = "MAC_Address", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String macAddress;
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String name;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType.Type }
     *     
     */
    public DeviceType.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType.Type }
     *     
     */
    public void setType(DeviceType.Type value) {
        this.type = value;
    }

    /**
     * Provides telephone information, and allows to specify telephone number application (ie Home, Business, etc.). May be used for a simle, unstrucutured number, or, in combination with child attributes allows to create a structured telephone number (ie Country Code number, Area Code numbers, etc.)
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhoneNumber(PhoneType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Position" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    public static class Type
        extends CodesetType
    {

        @XmlElement(name = "Position", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Position position;

        /**
         * Device position and geocoding coordinates.
         * 
         * @return
         *     possible object is
         *     {@link Position }
         *     
         */
        public Position getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link Position }
         *     
         */
        public void setPosition(Position value) {
            this.position = value;
        }

    }

}
