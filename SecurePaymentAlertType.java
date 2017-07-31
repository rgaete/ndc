
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * SECURE PAYMENT definiton.
 * 
 * 
 * <p>Java class for SecurePaymentAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePaymentAlertType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}TrxProcessObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="PayerAuth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PAReq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PARes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransactionType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SecureTransactionSimpleType">
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EnrollmentStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>EnrollStatusSimpleType">
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Airline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueStringID_SimpleType">
 *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Name" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CountryCode" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CountrySimpleType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Reference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ACS_TxnReference" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SPM_TxnReference" minOccurs="0"/>
 *                   &lt;element name="OriginalTransactionID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TrxTimestamp" type="{http://www.iata.org/IATA/EDIST/2017.1}TimestampRepType" minOccurs="0"/>
 *                   &lt;element name="TxnDescription" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType" minOccurs="0"/>
 *                   &lt;element name="TxnDatas" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TxnDate" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="3"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="URLs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SecurePaymentUrlType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TrxTimestamp" type="{http://www.iata.org/IATA/EDIST/2017.1}TimestampRepType" minOccurs="0"/>
 *                   &lt;element name="ClientType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SecureTrxClientSimpleType">
 *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustomerDevice" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DeviceType">
 *                           &lt;sequence>
 *                             &lt;element name="BowserAcceptHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BrowserUserAgentHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DeviceCategoryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Currency" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InputCurrCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
 *                             &lt;element name="SettlementCurrCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ReservationInfo" minOccurs="0"/>
 *                   &lt;element name="TxnDatas" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TxnDate" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="3"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProcessingInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProcessingInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AddrVerification" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                                     &lt;attribute name="Text" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
 *                                     &lt;attribute name="InvalidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="NoMatchInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CustomerAuthStatus" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CustomerAuthStatusSimpleType">
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ECI" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentAlertType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "payerAuth",
    "transactionType",
    "enrollmentStatus",
    "airline",
    "reference",
    "urLs",
    "details",
    "processingInfos"
})
public class SecurePaymentAlertType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "PayerAuth", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.PayerAuth payerAuth;
    @XmlElement(name = "TransactionType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.TransactionType transactionType;
    @XmlElement(name = "EnrollmentStatus", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.EnrollmentStatus enrollmentStatus;
    @XmlElement(name = "Airline", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.Airline airline;
    @XmlElement(name = "Reference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.Reference reference;
    @XmlElement(name = "URLs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.URLs urLs;
    @XmlElement(name = "Details", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.Details details;
    @XmlElement(name = "ProcessingInfos", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SecurePaymentAlertType.ProcessingInfos processingInfos;

    /**
     * Gets the value of the payerAuth property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.PayerAuth }
     *     
     */
    public SecurePaymentAlertType.PayerAuth getPayerAuth() {
        return payerAuth;
    }

    /**
     * Sets the value of the payerAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.PayerAuth }
     *     
     */
    public void setPayerAuth(SecurePaymentAlertType.PayerAuth value) {
        this.payerAuth = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.TransactionType }
     *     
     */
    public SecurePaymentAlertType.TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.TransactionType }
     *     
     */
    public void setTransactionType(SecurePaymentAlertType.TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the enrollmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.EnrollmentStatus }
     *     
     */
    public SecurePaymentAlertType.EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Sets the value of the enrollmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.EnrollmentStatus }
     *     
     */
    public void setEnrollmentStatus(SecurePaymentAlertType.EnrollmentStatus value) {
        this.enrollmentStatus = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.Airline }
     *     
     */
    public SecurePaymentAlertType.Airline getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.Airline }
     *     
     */
    public void setAirline(SecurePaymentAlertType.Airline value) {
        this.airline = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.Reference }
     *     
     */
    public SecurePaymentAlertType.Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.Reference }
     *     
     */
    public void setReference(SecurePaymentAlertType.Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the urLs property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.URLs }
     *     
     */
    public SecurePaymentAlertType.URLs getURLs() {
        return urLs;
    }

    /**
     * Sets the value of the urLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.URLs }
     *     
     */
    public void setURLs(SecurePaymentAlertType.URLs value) {
        this.urLs = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.Details }
     *     
     */
    public SecurePaymentAlertType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.Details }
     *     
     */
    public void setDetails(SecurePaymentAlertType.Details value) {
        this.details = value;
    }

    /**
     * Gets the value of the processingInfos property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType.ProcessingInfos }
     *     
     */
    public SecurePaymentAlertType.ProcessingInfos getProcessingInfos() {
        return processingInfos;
    }

    /**
     * Sets the value of the processingInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType.ProcessingInfos }
     *     
     */
    public void setProcessingInfos(SecurePaymentAlertType.ProcessingInfos value) {
        this.processingInfos = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueStringID_SimpleType">
     *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Name" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CountryCode" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CountrySimpleType">
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
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "countryCode"
    })
    public static class Airline {

        @XmlElement(name = "ID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Airline.ID id;
        @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Airline.Name name;
        @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Airline.CountryCode countryCode;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Airline.ID }
         *     
         */
        public SecurePaymentAlertType.Airline.ID getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Airline.ID }
         *     
         */
        public void setID(SecurePaymentAlertType.Airline.ID value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Airline.Name }
         *     
         */
        public SecurePaymentAlertType.Airline.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Airline.Name }
         *     
         */
        public void setName(SecurePaymentAlertType.Airline.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Airline.CountryCode }
         *     
         */
        public SecurePaymentAlertType.Airline.CountryCode getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Airline.CountryCode }
         *     
         */
        public void setCountryCode(SecurePaymentAlertType.Airline.CountryCode value) {
            this.countryCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CountrySimpleType">
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
        public static class CountryCode {

            @XmlValue
            protected String value;

            /**
             * A data type for Country Code encoding constraint: ISO 3166-1 (two character) Country Code
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueStringID_SimpleType">
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
        public static class ID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Context")
            protected String context;

            /**
             * A data type for a Unique String Identifier constraint.
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
        public static class Name {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Context")
            protected String context;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TrxTimestamp" type="{http://www.iata.org/IATA/EDIST/2017.1}TimestampRepType" minOccurs="0"/>
     *         &lt;element name="ClientType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SecureTrxClientSimpleType">
     *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustomerDevice" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DeviceType">
     *                 &lt;sequence>
     *                   &lt;element name="BowserAcceptHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BrowserUserAgentHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DeviceCategoryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Currency" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InputCurrCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
     *                   &lt;element name="SettlementCurrCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ReservationInfo" minOccurs="0"/>
     *         &lt;element name="TxnDatas" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TxnDate" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="3"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "trxTimestamp",
        "clientType",
        "customerDevice",
        "currency",
        "reservationInfo",
        "txnDatas"
    })
    public static class Details {

        @XmlElement(name = "TrxTimestamp", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TimestampRepType trxTimestamp;
        @XmlElement(name = "ClientType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Details.ClientType clientType;
        @XmlElement(name = "CustomerDevice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Details.CustomerDevice customerDevice;
        @XmlElement(name = "Currency", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Details.Currency currency;
        @XmlElement(name = "ReservationInfo", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ReservationInfo reservationInfo;
        @XmlElement(name = "TxnDatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Details.TxnDatas txnDatas;

        /**
         * Gets the value of the trxTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link TimestampRepType }
         *     
         */
        public TimestampRepType getTrxTimestamp() {
            return trxTimestamp;
        }

        /**
         * Sets the value of the trxTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimestampRepType }
         *     
         */
        public void setTrxTimestamp(TimestampRepType value) {
            this.trxTimestamp = value;
        }

        /**
         * Gets the value of the clientType property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Details.ClientType }
         *     
         */
        public SecurePaymentAlertType.Details.ClientType getClientType() {
            return clientType;
        }

        /**
         * Sets the value of the clientType property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Details.ClientType }
         *     
         */
        public void setClientType(SecurePaymentAlertType.Details.ClientType value) {
            this.clientType = value;
        }

        /**
         * Gets the value of the customerDevice property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Details.CustomerDevice }
         *     
         */
        public SecurePaymentAlertType.Details.CustomerDevice getCustomerDevice() {
            return customerDevice;
        }

        /**
         * Sets the value of the customerDevice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Details.CustomerDevice }
         *     
         */
        public void setCustomerDevice(SecurePaymentAlertType.Details.CustomerDevice value) {
            this.customerDevice = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Details.Currency }
         *     
         */
        public SecurePaymentAlertType.Details.Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Details.Currency }
         *     
         */
        public void setCurrency(SecurePaymentAlertType.Details.Currency value) {
            this.currency = value;
        }

        /**
         *  3D Secure Transaction Airline Reservation information.
         * 
         * @return
         *     possible object is
         *     {@link ReservationInfo }
         *     
         */
        public ReservationInfo getReservationInfo() {
            return reservationInfo;
        }

        /**
         * Sets the value of the reservationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationInfo }
         *     
         */
        public void setReservationInfo(ReservationInfo value) {
            this.reservationInfo = value;
        }

        /**
         * Gets the value of the txnDatas property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Details.TxnDatas }
         *     
         */
        public SecurePaymentAlertType.Details.TxnDatas getTxnDatas() {
            return txnDatas;
        }

        /**
         * Sets the value of the txnDatas property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Details.TxnDatas }
         *     
         */
        public void setTxnDatas(SecurePaymentAlertType.Details.TxnDatas value) {
            this.txnDatas = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SecureTrxClientSimpleType">
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
        public static class ClientType {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Context")
            protected String context;

            /**
             * 
             *         A data type for 3DS Secure Authorization Client Type. Examples: InteractiveVoiceResponse (IVR) Internet MailOrTelephoneOrder (MOTO) Recurring Unattended
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="InputCurrCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
         *         &lt;element name="SettlementCurrCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inputCurrCode",
            "settlementCurrCode"
        })
        public static class Currency {

            @XmlElement(name = "InputCurrCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String inputCurrCode;
            @XmlElement(name = "SettlementCurrCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String settlementCurrCode;

            /**
             * Gets the value of the inputCurrCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInputCurrCode() {
                return inputCurrCode;
            }

            /**
             * Sets the value of the inputCurrCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInputCurrCode(String value) {
                this.inputCurrCode = value;
            }

            /**
             * Gets the value of the settlementCurrCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSettlementCurrCode() {
                return settlementCurrCode;
            }

            /**
             * Sets the value of the settlementCurrCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSettlementCurrCode(String value) {
                this.settlementCurrCode = value;
            }

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
         *         &lt;element name="BowserAcceptHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BrowserUserAgentHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DeviceCategoryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
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
            "bowserAcceptHeader",
            "browserUserAgentHeader",
            "deviceCategoryCode"
        })
        public static class CustomerDevice
            extends DeviceType
        {

            @XmlElement(name = "BowserAcceptHeader", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String bowserAcceptHeader;
            @XmlElement(name = "BrowserUserAgentHeader", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String browserUserAgentHeader;
            @XmlElement(name = "DeviceCategoryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String deviceCategoryCode;

            /**
             * Gets the value of the bowserAcceptHeader property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBowserAcceptHeader() {
                return bowserAcceptHeader;
            }

            /**
             * Sets the value of the bowserAcceptHeader property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBowserAcceptHeader(String value) {
                this.bowserAcceptHeader = value;
            }

            /**
             * Gets the value of the browserUserAgentHeader property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrowserUserAgentHeader() {
                return browserUserAgentHeader;
            }

            /**
             * Sets the value of the browserUserAgentHeader property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrowserUserAgentHeader(String value) {
                this.browserUserAgentHeader = value;
            }

            /**
             * Gets the value of the deviceCategoryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeviceCategoryCode() {
                return deviceCategoryCode;
            }

            /**
             * Sets the value of the deviceCategoryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeviceCategoryCode(String value) {
                this.deviceCategoryCode = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TxnDate" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="3"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "txnDate"
        })
        public static class TxnDatas {

            @XmlElement(name = "TxnDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<String> txnDate;

            /**
             * Gets the value of the txnDate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the txnDate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTxnDate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTxnDate() {
                if (txnDate == null) {
                    txnDate = new ArrayList<String>();
                }
                return this.txnDate;
            }

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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>EnrollStatusSimpleType">
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
    public static class EnrollmentStatus {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * 
         *         A data type for 3DS Program Enrollment Status. Examples: CardNotEnrolled, CardEnrolled, CardMayBeEnrolled, Unknown
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="PAReq" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PARes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paReq",
        "paRes"
    })
    public static class PayerAuth {

        @XmlElement(name = "PAReq", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String paReq;
        @XmlElement(name = "PARes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String paRes;

        /**
         * Gets the value of the paReq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAReq() {
            return paReq;
        }

        /**
         * Sets the value of the paReq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAReq(String value) {
            this.paReq = value;
        }

        /**
         * Gets the value of the paRes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARes() {
            return paRes;
        }

        /**
         * Sets the value of the paRes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARes(String value) {
            this.paRes = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProcessingInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AddrVerification" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *                           &lt;attribute name="Text" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
     *                           &lt;attribute name="InvalidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="NoMatchInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CustomerAuthStatus" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CustomerAuthStatusSimpleType">
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ECI" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "processingInfo"
    })
    public static class ProcessingInfos {

        @XmlElement(name = "ProcessingInfo", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<SecurePaymentAlertType.ProcessingInfos.ProcessingInfo> processingInfo;

        /**
         * Gets the value of the processingInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the processingInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcessingInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo }
         * 
         * 
         */
        public List<SecurePaymentAlertType.ProcessingInfos.ProcessingInfo> getProcessingInfo() {
            if (processingInfo == null) {
                processingInfo = new ArrayList<SecurePaymentAlertType.ProcessingInfos.ProcessingInfo>();
            }
            return this.processingInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AddrVerification" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
         *                 &lt;attribute name="Text" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
         *                 &lt;attribute name="InvalidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="NoMatchInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CustomerAuthStatus" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CustomerAuthStatusSimpleType">
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ECI" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addrVerification",
            "cavv",
            "customerAuthStatus",
            "eci"
        })
        public static class ProcessingInfo {

            @XmlElement(name = "AddrVerification", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification addrVerification;
            @XmlElement(name = "CAVV", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String cavv;
            @XmlElement(name = "CustomerAuthStatus", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus customerAuthStatus;
            @XmlElement(name = "ECI", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected String eci;

            /**
             * Gets the value of the addrVerification property.
             * 
             * @return
             *     possible object is
             *     {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification }
             *     
             */
            public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification getAddrVerification() {
                return addrVerification;
            }

            /**
             * Sets the value of the addrVerification property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification }
             *     
             */
            public void setAddrVerification(SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification value) {
                this.addrVerification = value;
            }

            /**
             * Gets the value of the cavv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAVV() {
                return cavv;
            }

            /**
             * Sets the value of the cavv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAVV(String value) {
                this.cavv = value;
            }

            /**
             * Gets the value of the customerAuthStatus property.
             * 
             * @return
             *     possible object is
             *     {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus }
             *     
             */
            public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus getCustomerAuthStatus() {
                return customerAuthStatus;
            }

            /**
             * Sets the value of the customerAuthStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus }
             *     
             */
            public void setCustomerAuthStatus(SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus value) {
                this.customerAuthStatus = value;
            }

            /**
             * Gets the value of the eci property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getECI() {
                return eci;
            }

            /**
             * Sets the value of the eci property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setECI(String value) {
                this.eci = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
             *       &lt;attribute name="Text" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
             *       &lt;attribute name="InvalidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="NoMatchInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AddrVerification {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "Text")
                protected String text;
                @XmlAttribute(name = "InvalidInd")
                protected Boolean invalidInd;
                @XmlAttribute(name = "NoMatchInd")
                protected Boolean noMatchInd;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Sets the value of the text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
                }

                /**
                 * Gets the value of the invalidInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isInvalidInd() {
                    return invalidInd;
                }

                /**
                 * Sets the value of the invalidInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setInvalidInd(Boolean value) {
                    this.invalidInd = value;
                }

                /**
                 * Gets the value of the noMatchInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNoMatchInd() {
                    return noMatchInd;
                }

                /**
                 * Sets the value of the noMatchInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setNoMatchInd(Boolean value) {
                    this.noMatchInd = value;
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
            public static class CustomerAuthStatus {

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ACS_TxnReference" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SPM_TxnReference" minOccurs="0"/>
     *         &lt;element name="OriginalTransactionID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TrxTimestamp" type="{http://www.iata.org/IATA/EDIST/2017.1}TimestampRepType" minOccurs="0"/>
     *         &lt;element name="TxnDescription" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType" minOccurs="0"/>
     *         &lt;element name="TxnDatas" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TxnDate" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="3"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "acsTxnReference",
        "spmTxnReference",
        "originalTransactionID",
        "trxTimestamp",
        "txnDescription",
        "txnDatas"
    })
    public static class Reference {

        @XmlElement(name = "ACS_TxnReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ACSTxnReference acsTxnReference;
        @XmlElement(name = "SPM_TxnReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SPMTxnReference spmTxnReference;
        @XmlElement(name = "OriginalTransactionID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Reference.OriginalTransactionID originalTransactionID;
        @XmlElement(name = "TrxTimestamp", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TimestampRepType trxTimestamp;
        @XmlElement(name = "TxnDescription", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String txnDescription;
        @XmlElement(name = "TxnDatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SecurePaymentAlertType.Reference.TxnDatas txnDatas;

        /**
         * Gets the value of the acsTxnReference property.
         * 
         * @return
         *     possible object is
         *     {@link ACSTxnReference }
         *     
         */
        public ACSTxnReference getACSTxnReference() {
            return acsTxnReference;
        }

        /**
         * Sets the value of the acsTxnReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ACSTxnReference }
         *     
         */
        public void setACSTxnReference(ACSTxnReference value) {
            this.acsTxnReference = value;
        }

        /**
         * Gets the value of the spmTxnReference property.
         * 
         * @return
         *     possible object is
         *     {@link SPMTxnReference }
         *     
         */
        public SPMTxnReference getSPMTxnReference() {
            return spmTxnReference;
        }

        /**
         * Sets the value of the spmTxnReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link SPMTxnReference }
         *     
         */
        public void setSPMTxnReference(SPMTxnReference value) {
            this.spmTxnReference = value;
        }

        /**
         * Gets the value of the originalTransactionID property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Reference.OriginalTransactionID }
         *     
         */
        public SecurePaymentAlertType.Reference.OriginalTransactionID getOriginalTransactionID() {
            return originalTransactionID;
        }

        /**
         * Sets the value of the originalTransactionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Reference.OriginalTransactionID }
         *     
         */
        public void setOriginalTransactionID(SecurePaymentAlertType.Reference.OriginalTransactionID value) {
            this.originalTransactionID = value;
        }

        /**
         * Gets the value of the trxTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link TimestampRepType }
         *     
         */
        public TimestampRepType getTrxTimestamp() {
            return trxTimestamp;
        }

        /**
         * Sets the value of the trxTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimestampRepType }
         *     
         */
        public void setTrxTimestamp(TimestampRepType value) {
            this.trxTimestamp = value;
        }

        /**
         * Gets the value of the txnDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTxnDescription() {
            return txnDescription;
        }

        /**
         * Sets the value of the txnDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTxnDescription(String value) {
            this.txnDescription = value;
        }

        /**
         * Gets the value of the txnDatas property.
         * 
         * @return
         *     possible object is
         *     {@link SecurePaymentAlertType.Reference.TxnDatas }
         *     
         */
        public SecurePaymentAlertType.Reference.TxnDatas getTxnDatas() {
            return txnDatas;
        }

        /**
         * Sets the value of the txnDatas property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurePaymentAlertType.Reference.TxnDatas }
         *     
         */
        public void setTxnDatas(SecurePaymentAlertType.Reference.TxnDatas value) {
            this.txnDatas = value;
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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TxnDate" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="3"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "txnDate"
        })
        public static class TxnDatas {

            @XmlElement(name = "TxnDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<String> txnDate;

            /**
             * Gets the value of the txnDate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the txnDate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTxnDate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTxnDate() {
                if (txnDate == null) {
                    txnDate = new ArrayList<String>();
                }
                return this.txnDate;
            }

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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SecureTransactionSimpleType">
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
    public static class TransactionType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * 
         *         A data type for 3DS Transaction Type. Examples: Purchase, Refund, Authorization, Complete, Validate
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SecurePaymentUrlType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class URLs
        extends SecurePaymentUrlType
    {


    }

}
