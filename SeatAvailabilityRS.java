
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShoppingResponseID" minOccurs="0"/>
 *           &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST/2017.1}SeatAvailResParamsType" minOccurs="0"/>
 *           &lt;element name="Flights" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SimpleFlightAssocType">
 *                   &lt;sequence>
 *                     &lt;element name="Cabin" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCabinType">
 *                             &lt;sequence>
 *                               &lt;element name="CabinLayout" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WingPosition" maxOccurs="unbounded" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExitRowPosition" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatDisplay" minOccurs="0"/>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatReference" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Services" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Service" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDetailType">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
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
 *           &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST/2017.1}SeatAvailResMetadataType" minOccurs="0"/>
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
    "shoppingResponseID",
    "parameters",
    "flights",
    "services",
    "dataLists",
    "metadata",
    "policies",
    "errors"
})
@XmlRootElement(name = "SeatAvailabilityRS", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class SeatAvailabilityRS {

    @XmlElement(name = "Document", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MsgDocumentType document;
    @XmlElement(name = "Success", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SuccessType success;
    @XmlElement(name = "Warnings", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected WarningsType warnings;
    @XmlElement(name = "Processing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ProcessingResultType processing;
    @XmlElement(name = "ShoppingResponseID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailResParamsType parameters;
    @XmlElement(name = "Flights", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<SeatAvailabilityRS.Flights> flights;
    @XmlElement(name = "Services", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailabilityRS.Services services;
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailabilityRS.DataLists dataLists;
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailResMetadataType metadata;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailResParamsType }
     *     
     */
    public SeatAvailResParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailResParamsType }
     *     
     */
    public void setParameters(SeatAvailResParamsType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the flights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAvailabilityRS.Flights }
     * 
     * 
     */
    public List<SeatAvailabilityRS.Flights> getFlights() {
        if (flights == null) {
            flights = new ArrayList<SeatAvailabilityRS.Flights>();
        }
        return this.flights;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityRS.Services }
     *     
     */
    public SeatAvailabilityRS.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityRS.Services }
     *     
     */
    public void setServices(SeatAvailabilityRS.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityRS.DataLists }
     *     
     */
    public SeatAvailabilityRS.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityRS.DataLists }
     *     
     */
    public void setDataLists(SeatAvailabilityRS.DataLists value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailResMetadataType }
     *     
     */
    public SeatAvailResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailResMetadataType }
     *     
     */
    public void setMetadata(SeatAvailResMetadataType value) {
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
        protected SeatAvailabilityRS.DataLists.PassengerList passengerList;
        @XmlElement(name = "ContactList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SeatAvailabilityRS.DataLists.ContactList contactList;

        /**
         * Gets the value of the passengerList property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAvailabilityRS.DataLists.PassengerList }
         *     
         */
        public SeatAvailabilityRS.DataLists.PassengerList getPassengerList() {
            return passengerList;
        }

        /**
         * Sets the value of the passengerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAvailabilityRS.DataLists.PassengerList }
         *     
         */
        public void setPassengerList(SeatAvailabilityRS.DataLists.PassengerList value) {
            this.passengerList = value;
        }

        /**
         * Gets the value of the contactList property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAvailabilityRS.DataLists.ContactList }
         *     
         */
        public SeatAvailabilityRS.DataLists.ContactList getContactList() {
            return contactList;
        }

        /**
         * Sets the value of the contactList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAvailabilityRS.DataLists.ContactList }
         *     
         */
        public void setContactList(SeatAvailabilityRS.DataLists.ContactList value) {
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SimpleFlightAssocType">
     *       &lt;sequence>
     *         &lt;element name="Cabin" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCabinType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinLayout" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WingPosition" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExitRowPosition" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatDisplay" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatReference" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
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
        "cabin"
    })
    public static class Flights
        extends SimpleFlightAssocType
    {

        @XmlElement(name = "Cabin", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<SeatAvailabilityRS.Flights.Cabin> cabin;

        /**
         * Gets the value of the cabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatAvailabilityRS.Flights.Cabin }
         * 
         * 
         */
        public List<SeatAvailabilityRS.Flights.Cabin> getCabin() {
            if (cabin == null) {
                cabin = new ArrayList<SeatAvailabilityRS.Flights.Cabin>();
            }
            return this.cabin;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCabinType">
         *       &lt;sequence>
         *         &lt;element name="CabinLayout" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WingPosition" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExitRowPosition" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatDisplay" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatReference" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cabinLayout",
            "seatDisplay",
            "seatReference"
        })
        public static class Cabin
            extends AircraftCabinType
        {

            @XmlElement(name = "CabinLayout", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected SeatAvailabilityRS.Flights.Cabin.CabinLayout cabinLayout;
            @XmlElement(name = "SeatDisplay", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected SeatDisplay seatDisplay;
            @XmlElementRef(name = "SeatReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false)
            protected List<JAXBElement<Object>> seatReference;
            @XmlAttribute(name = "UpperDeckInd")
            protected Boolean upperDeckInd;

            /**
             * Gets the value of the cabinLayout property.
             * 
             * @return
             *     possible object is
             *     {@link SeatAvailabilityRS.Flights.Cabin.CabinLayout }
             *     
             */
            public SeatAvailabilityRS.Flights.Cabin.CabinLayout getCabinLayout() {
                return cabinLayout;
            }

            /**
             * Sets the value of the cabinLayout property.
             * 
             * @param value
             *     allowed object is
             *     {@link SeatAvailabilityRS.Flights.Cabin.CabinLayout }
             *     
             */
            public void setCabinLayout(SeatAvailabilityRS.Flights.Cabin.CabinLayout value) {
                this.cabinLayout = value;
            }

            /**
             * Gets the value of the seatDisplay property.
             * 
             * @return
             *     possible object is
             *     {@link SeatDisplay }
             *     
             */
            public SeatDisplay getSeatDisplay() {
                return seatDisplay;
            }

            /**
             * Sets the value of the seatDisplay property.
             * 
             * @param value
             *     allowed object is
             *     {@link SeatDisplay }
             *     
             */
            public void setSeatDisplay(SeatDisplay value) {
                this.seatDisplay = value;
            }

            /**
             * Gets the value of the seatReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link Object }{@code >}
             * 
             * 
             */
            public List<JAXBElement<Object>> getSeatReference() {
                if (seatReference == null) {
                    seatReference = new ArrayList<JAXBElement<Object>>();
                }
                return this.seatReference;
            }

            /**
             * Gets the value of the upperDeckInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isUpperDeckInd() {
                return upperDeckInd;
            }

            /**
             * Sets the value of the upperDeckInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setUpperDeckInd(Boolean value) {
                this.upperDeckInd = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WingPosition" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExitRowPosition" maxOccurs="unbounded" minOccurs="0"/>
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
                "wingPosition",
                "exitRowPosition"
            })
            public static class CabinLayout {

                @XmlElement(name = "WingPosition", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected List<WingPositionType> wingPosition;
                @XmlElement(name = "ExitRowPosition", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected List<ExitPositionType> exitRowPosition;

                /**
                 * Gets the value of the wingPosition property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the wingPosition property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getWingPosition().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link WingPositionType }
                 * 
                 * 
                 */
                public List<WingPositionType> getWingPosition() {
                    if (wingPosition == null) {
                        wingPosition = new ArrayList<WingPositionType>();
                    }
                    return this.wingPosition;
                }

                /**
                 * Gets the value of the exitRowPosition property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the exitRowPosition property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getExitRowPosition().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ExitPositionType }
                 * 
                 * 
                 */
                public List<ExitPositionType> getExitRowPosition() {
                    if (exitRowPosition == null) {
                        exitRowPosition = new ArrayList<ExitPositionType>();
                    }
                    return this.exitRowPosition;
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
        protected List<SeatAvailabilityRS.Services.Service> service;

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
         * {@link SeatAvailabilityRS.Services.Service }
         * 
         * 
         */
        public List<SeatAvailabilityRS.Services.Service> getService() {
            if (service == null) {
                service = new ArrayList<SeatAvailabilityRS.Services.Service>();
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
