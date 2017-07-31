
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Traveler Authentication Challenge  Answer definition.
 * 
 * <p>Java class for PinPhraseAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinPhraseAnswerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CustomerAuthStatusSimpleType">
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PoolQuestion" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
 *         &lt;element name="AuthAccount" type="{http://www.iata.org/IATA/EDIST/2017.1}AuthAccountType" minOccurs="0"/>
 *         &lt;element name="Device" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DeviceType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Position" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginalTransactionID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinPhraseAnswerType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "status",
    "pin",
    "poolQuestion",
    "authAccount",
    "device",
    "originalTransactionID"
})
public class PinPhraseAnswerType {

    @XmlElement(name = "Status", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PinPhraseAnswerType.Status status;
    @XmlElement(name = "PIN", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected Object pin;
    @XmlElement(name = "PoolQuestion", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String poolQuestion;
    @XmlElement(name = "AuthAccount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AuthAccountType authAccount;
    @XmlElement(name = "Device", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PinPhraseAnswerType.Device device;
    @XmlElement(name = "OriginalTransactionID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PinPhraseAnswerType.OriginalTransactionID originalTransactionID;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseAnswerType.Status }
     *     
     */
    public PinPhraseAnswerType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseAnswerType.Status }
     *     
     */
    public void setStatus(PinPhraseAnswerType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPIN(Object value) {
        this.pin = value;
    }

    /**
     * Gets the value of the poolQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolQuestion() {
        return poolQuestion;
    }

    /**
     * Sets the value of the poolQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolQuestion(String value) {
        this.poolQuestion = value;
    }

    /**
     * Gets the value of the authAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AuthAccountType }
     *     
     */
    public AuthAccountType getAuthAccount() {
        return authAccount;
    }

    /**
     * Sets the value of the authAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthAccountType }
     *     
     */
    public void setAuthAccount(AuthAccountType value) {
        this.authAccount = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseAnswerType.Device }
     *     
     */
    public PinPhraseAnswerType.Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseAnswerType.Device }
     *     
     */
    public void setDevice(PinPhraseAnswerType.Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the originalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseAnswerType.OriginalTransactionID }
     *     
     */
    public PinPhraseAnswerType.OriginalTransactionID getOriginalTransactionID() {
        return originalTransactionID;
    }

    /**
     * Sets the value of the originalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseAnswerType.OriginalTransactionID }
     *     
     */
    public void setOriginalTransactionID(PinPhraseAnswerType.OriginalTransactionID value) {
        this.originalTransactionID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DeviceType">
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
    public static class Device
        extends DeviceType
    {

        @XmlElement(name = "Position", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Position position;

        /**
         * Device Location geocoding information.
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" />
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
    public static class OriginalTransactionID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;

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
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CustomerAuthStatusSimpleType">
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
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
    public static class Status {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * 
         *         A data type for 3DS Program ACS Customer Authentication status. Examples: Y- Customer authenticated N- Customer not authenticated A- An authentication attempt occurred but could not be completed U- Unable to perform authentication
         *       
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
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

    }

}
