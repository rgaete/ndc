
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Document"/>
 *           &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST/2017.1}SuccessType"/>
 *           &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST/2017.1}WarningsType" minOccurs="0"/>
 *           &lt;element name="Processing" type="{http://www.iata.org/IATA/EDIST/2017.1}ProcessingResultType" minOccurs="0"/>
 *           &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowResParamsType" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShoppingResponseID" minOccurs="0"/>
 *           &lt;element name="OriginDestination" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepartureCode"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ArrivalCode"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBags" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBags" minOccurs="0"/>
 *                     &lt;element name="Services" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Service" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDetailType">
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="USDOT" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureKey" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DataLists" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DataListType">
 *                   &lt;sequence>
 *                     &lt;element name="PassengerList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Passenger" type="{http://www.iata.org/IATA/EDIST/2017.1}PassengerType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ContactList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ContactInformation" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactInformationType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Metadata" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowResMetadataType">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Policies" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Errors"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}IATA_PayloadStdAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document",
    "success",
    "warnings",
    "processing",
    "parameters",
    "shoppingResponseID",
    "originDestination",
    "usdot",
    "dataLists",
    "metadata",
    "policies",
    "errors"
})
@XmlRootElement(name = "BaggageAllowanceRS", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class BaggageAllowanceRS {

    @XmlElement(name = "Document", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MsgDocumentType document;
    @XmlElement(name = "Success", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SuccessType success;
    @XmlElement(name = "Warnings", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected WarningsType warnings;
    @XmlElement(name = "Processing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ProcessingResultType processing;
    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagAllowResParamsType parameters;
    @XmlElement(name = "ShoppingResponseID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<BaggageAllowanceRS.OriginDestination> originDestination;
    @XmlElement(name = "USDOT", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRS.USDOT usdot;
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRS.DataLists dataLists;
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRS.Metadata metadata;
    @XmlElement(name = "Policies", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Policies policies;
    @XmlElement(name = "Errors", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ErrorsType errors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "AsynchronousAllowedInd")
    protected Boolean asynchronousAllowedInd;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link MsgDocumentType }
     *     
     */
    public MsgDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgDocumentType }
     *     
     */
    public void setDocument(MsgDocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultType }
     *     
     */
    public ProcessingResultType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultType }
     *     
     */
    public void setProcessing(ProcessingResultType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowResParamsType }
     *     
     */
    public BagAllowResParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowResParamsType }
     *     
     */
    public void setParameters(BagAllowResParamsType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the shoppingResponseID property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public ShoppingResponseIDType getShoppingResponseID() {
        return shoppingResponseID;
    }

    /**
     * Sets the value of the shoppingResponseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public void setShoppingResponseID(ShoppingResponseIDType value) {
        this.shoppingResponseID = value;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowanceRS.OriginDestination }
     * 
     * 
     */
    public List<BaggageAllowanceRS.OriginDestination> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<BaggageAllowanceRS.OriginDestination>();
        }
        return this.originDestination;
    }

    /**
     * Gets the value of the usdot property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRS.USDOT }
     *     
     */
    public BaggageAllowanceRS.USDOT getUSDOT() {
        return usdot;
    }

    /**
     * Sets the value of the usdot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRS.USDOT }
     *     
     */
    public void setUSDOT(BaggageAllowanceRS.USDOT value) {
        this.usdot = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRS.DataLists }
     *     
     */
    public BaggageAllowanceRS.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRS.DataLists }
     *     
     */
    public void setDataLists(BaggageAllowanceRS.DataLists value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRS.Metadata }
     *     
     */
    public BaggageAllowanceRS.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRS.Metadata }
     *     
     */
    public void setMetadata(BaggageAllowanceRS.Metadata value) {
        this.metadata = value;
    }

    /**
     * Message Policy information.
     * 
     * @return
     *     possible object is
     *     {@link Policies }
     *     
     */
    public Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policies }
     *     
     */
    public void setPolicies(Policies value) {
        this.policies = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the asynchronousAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsynchronousAllowedInd() {
        return asynchronousAllowedInd;
    }

    /**
     * Sets the value of the asynchronousAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsynchronousAllowedInd(Boolean value) {
        this.asynchronousAllowedInd = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DataListType">
     *       &lt;sequence>
     *         &lt;element name="PassengerList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Passenger" type="{http://www.iata.org/IATA/EDIST/2017.1}PassengerType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ContactList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactInformation" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactInformationType" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "passengerList",
        "contactList"
    })
    public static class DataLists
        extends DataListType
    {

        @XmlElement(name = "PassengerList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageAllowanceRS.DataLists.PassengerList passengerList;
        @XmlElement(name = "ContactList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageAllowanceRS.DataLists.ContactList contactList;

        /**
         * Gets the value of the passengerList property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageAllowanceRS.DataLists.PassengerList }
         *     
         */
        public BaggageAllowanceRS.DataLists.PassengerList getPassengerList() {
            return passengerList;
        }

        /**
         * Sets the value of the passengerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageAllowanceRS.DataLists.PassengerList }
         *     
         */
        public void setPassengerList(BaggageAllowanceRS.DataLists.PassengerList value) {
            this.passengerList = value;
        }

        /**
         * Gets the value of the contactList property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageAllowanceRS.DataLists.ContactList }
         *     
         */
        public BaggageAllowanceRS.DataLists.ContactList getContactList() {
            return contactList;
        }

        /**
         * Sets the value of the contactList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageAllowanceRS.DataLists.ContactList }
         *     
         */
        public void setContactList(BaggageAllowanceRS.DataLists.ContactList value) {
            this.contactList = value;
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
         *         &lt;element name="ContactInformation" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactInformationType" maxOccurs="unbounded"/>
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
            "contactInformation"
        })
        public static class ContactList {

            @XmlElement(name = "ContactInformation", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<ContactInformationType> contactInformation;

            /**
             * Gets the value of the contactInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContactInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactInformationType }
             * 
             * 
             */
            public List<ContactInformationType> getContactInformation() {
                if (contactInformation == null) {
                    contactInformation = new ArrayList<ContactInformationType>();
                }
                return this.contactInformation;
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
         *         &lt;element name="Passenger" type="{http://www.iata.org/IATA/EDIST/2017.1}PassengerType" maxOccurs="unbounded"/>
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
            "passenger"
        })
        public static class PassengerList {

            @XmlElement(name = "Passenger", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<PassengerType> passenger;

            /**
             * Gets the value of the passenger property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passenger property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassenger().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PassengerType }
             * 
             * 
             */
            public List<PassengerType> getPassenger() {
                if (passenger == null) {
                    passenger = new ArrayList<PassengerType>();
                }
                return this.passenger;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowResMetadataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Metadata
        extends BagAllowResMetadataType
    {


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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepartureCode"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ArrivalCode"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBags" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBags" minOccurs="0"/>
     *         &lt;element name="Services" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Service" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDetailType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "departureCode",
        "arrivalCode",
        "checkedBags",
        "carryOnBags",
        "services"
    })
    public static class OriginDestination {

        @XmlElement(name = "DepartureCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected DepartureCode departureCode;
        @XmlElement(name = "ArrivalCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected ArrivalCode arrivalCode;
        @XmlElement(name = "CheckedBags", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CheckedBags checkedBags;
        @XmlElement(name = "CarryOnBags", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CarryOnBags carryOnBags;
        @XmlElement(name = "Services", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageAllowanceRS.OriginDestination.Services services;

        /**
         * Gets the value of the departureCode property.
         * 
         * @return
         *     possible object is
         *     {@link DepartureCode }
         *     
         */
        public DepartureCode getDepartureCode() {
            return departureCode;
        }

        /**
         * Sets the value of the departureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepartureCode }
         *     
         */
        public void setDepartureCode(DepartureCode value) {
            this.departureCode = value;
        }

        /**
         * Gets the value of the arrivalCode property.
         * 
         * @return
         *     possible object is
         *     {@link ArrivalCode }
         *     
         */
        public ArrivalCode getArrivalCode() {
            return arrivalCode;
        }

        /**
         * Sets the value of the arrivalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrivalCode }
         *     
         */
        public void setArrivalCode(ArrivalCode value) {
            this.arrivalCode = value;
        }

        /**
         * Gets the value of the checkedBags property.
         * 
         * @return
         *     possible object is
         *     {@link CheckedBags }
         *     
         */
        public CheckedBags getCheckedBags() {
            return checkedBags;
        }

        /**
         * Sets the value of the checkedBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link CheckedBags }
         *     
         */
        public void setCheckedBags(CheckedBags value) {
            this.checkedBags = value;
        }

        /**
         * Gets the value of the carryOnBags property.
         * 
         * @return
         *     possible object is
         *     {@link CarryOnBags }
         *     
         */
        public CarryOnBags getCarryOnBags() {
            return carryOnBags;
        }

        /**
         * Sets the value of the carryOnBags property.
         * 
         * @param value
         *     allowed object is
         *     {@link CarryOnBags }
         *     
         */
        public void setCarryOnBags(CarryOnBags value) {
            this.carryOnBags = value;
        }

        /**
         * Gets the value of the services property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageAllowanceRS.OriginDestination.Services }
         *     
         */
        public BaggageAllowanceRS.OriginDestination.Services getServices() {
            return services;
        }

        /**
         * Sets the value of the services property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageAllowanceRS.OriginDestination.Services }
         *     
         */
        public void setServices(BaggageAllowanceRS.OriginDestination.Services value) {
            this.services = value;
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
         *         &lt;element name="Service" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDetailType">
         *               &lt;/extension>
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
            "service"
        })
        public static class Services {

            @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<BaggageAllowanceRS.OriginDestination.Services.Service> service;

            /**
             * Gets the value of the service property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the service property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BaggageAllowanceRS.OriginDestination.Services.Service }
             * 
             * 
             */
            public List<BaggageAllowanceRS.OriginDestination.Services.Service> getService() {
                if (service == null) {
                    service = new ArrayList<BaggageAllowanceRS.OriginDestination.Services.Service>();
                }
                return this.service;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDetailType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Service
                extends ServiceDetailType
            {


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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureKey" minOccurs="0"/>
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
        "bagDisclosureKey"
    })
    public static class USDOT
        extends BagDisclosureType
    {

        @XmlElement(name = "BagDisclosureKey", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String bagDisclosureKey;

        /**
         * Gets the value of the bagDisclosureKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBagDisclosureKey() {
            return bagDisclosureKey;
        }

        /**
         * Sets the value of the bagDisclosureKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBagDisclosureKey(String value) {
            this.bagDisclosureKey = value;
        }

    }

}
