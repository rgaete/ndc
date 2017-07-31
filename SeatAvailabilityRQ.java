
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PointOfSale" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Document"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Party"/>
 *         &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST/2017.1}SeatAvailReqParamsType" minOccurs="0"/>
 *         &lt;element name="Qualifiers" type="{http://www.iata.org/IATA/EDIST/2017.1}QualifiersType" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShoppingResponseID" minOccurs="0"/>
 *           &lt;element name="Query" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="OriginDestination" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightInfoAssocType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderID" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BookingReference" minOccurs="0"/>
 *                     &lt;element name="Offers" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Offer" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
 *                                         &lt;element name="OfferItemIDs">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID" maxOccurs="unbounded"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
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
 *         &lt;/sequence>
 *         &lt;element name="JourneyData" type="{http://www.iata.org/IATA/EDIST/2017.1}ItineraryType" minOccurs="0"/>
 *         &lt;element name="DataLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DataListType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Passenger" type="{http://www.iata.org/IATA/EDIST/2017.1}PassengerType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ContactList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactInformation" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactInformationType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST/2017.1}SeatAvailReqMetadataType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Policies" minOccurs="0"/>
 *       &lt;/sequence>
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
    "pointOfSale",
    "document",
    "party",
    "parameters",
    "qualifiers",
    "shoppingResponseID",
    "query",
    "journeyData",
    "dataLists",
    "metadata",
    "policies"
})
@XmlRootElement(name = "SeatAvailabilityRQ", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class SeatAvailabilityRQ {

    @XmlElement(name = "PointOfSale", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailReqParamsType parameters;
    @XmlElement(name = "Qualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected QualifiersType qualifiers;
    @XmlElement(name = "ShoppingResponseID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "Query", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailabilityRQ.Query query;
    @XmlElement(name = "JourneyData", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ItineraryType journeyData;
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailabilityRQ.DataLists dataLists;
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatAvailReqMetadataType metadata;
    @XmlElement(name = "Policies", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Policies policies;
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
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType }
     *     
     */
    public PointOfSaleType getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType }
     *     
     */
    public void setPointOfSale(PointOfSaleType value) {
        this.pointOfSale = value;
    }

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
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType }
     *     
     */
    public MsgPartiesType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType }
     *     
     */
    public void setParty(MsgPartiesType value) {
        this.party = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailReqParamsType }
     *     
     */
    public SeatAvailReqParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailReqParamsType }
     *     
     */
    public void setParameters(SeatAvailReqParamsType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the qualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiersType }
     *     
     */
    public QualifiersType getQualifiers() {
        return qualifiers;
    }

    /**
     * Sets the value of the qualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiersType }
     *     
     */
    public void setQualifiers(QualifiersType value) {
        this.qualifiers = value;
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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityRQ.Query }
     *     
     */
    public SeatAvailabilityRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityRQ.Query }
     *     
     */
    public void setQuery(SeatAvailabilityRQ.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the journeyData property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryType }
     *     
     */
    public ItineraryType getJourneyData() {
        return journeyData;
    }

    /**
     * Sets the value of the journeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryType }
     *     
     */
    public void setJourneyData(ItineraryType value) {
        this.journeyData = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailabilityRQ.DataLists }
     *     
     */
    public SeatAvailabilityRQ.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailabilityRQ.DataLists }
     *     
     */
    public void setDataLists(SeatAvailabilityRQ.DataLists value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailReqMetadataType }
     *     
     */
    public SeatAvailReqMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailReqMetadataType }
     *     
     */
    public void setMetadata(SeatAvailReqMetadataType value) {
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
        protected SeatAvailabilityRQ.DataLists.PassengerList passengerList;
        @XmlElement(name = "ContactList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SeatAvailabilityRQ.DataLists.ContactList contactList;

        /**
         * Gets the value of the passengerList property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAvailabilityRQ.DataLists.PassengerList }
         *     
         */
        public SeatAvailabilityRQ.DataLists.PassengerList getPassengerList() {
            return passengerList;
        }

        /**
         * Sets the value of the passengerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAvailabilityRQ.DataLists.PassengerList }
         *     
         */
        public void setPassengerList(SeatAvailabilityRQ.DataLists.PassengerList value) {
            this.passengerList = value;
        }

        /**
         * Gets the value of the contactList property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAvailabilityRQ.DataLists.ContactList }
         *     
         */
        public SeatAvailabilityRQ.DataLists.ContactList getContactList() {
            return contactList;
        }

        /**
         * Sets the value of the contactList property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAvailabilityRQ.DataLists.ContactList }
         *     
         */
        public void setContactList(SeatAvailabilityRQ.DataLists.ContactList value) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OriginDestination" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightInfoAssocType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderID" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BookingReference" minOccurs="0"/>
     *         &lt;element name="Offers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Offer" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
     *                             &lt;element name="OfferItemIDs">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestination",
        "orderID",
        "bookingReference",
        "offers"
    })
    public static class Query {

        @XmlElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<FlightInfoAssocType> originDestination;
        @XmlElement(name = "OrderID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderIDType orderID;
        @XmlElement(name = "BookingReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BookingReference bookingReference;
        @XmlElement(name = "Offers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SeatAvailabilityRQ.Query.Offers offers;

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
         * {@link FlightInfoAssocType }
         * 
         * 
         */
        public List<FlightInfoAssocType> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<FlightInfoAssocType>();
            }
            return this.originDestination;
        }

        /**
         * Gets the value of the orderID property.
         * 
         * @return
         *     possible object is
         *     {@link OrderIDType }
         *     
         */
        public OrderIDType getOrderID() {
            return orderID;
        }

        /**
         * Sets the value of the orderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderIDType }
         *     
         */
        public void setOrderID(OrderIDType value) {
            this.orderID = value;
        }

        /**
         * Gets the value of the bookingReference property.
         * 
         * @return
         *     possible object is
         *     {@link BookingReference }
         *     
         */
        public BookingReference getBookingReference() {
            return bookingReference;
        }

        /**
         * Sets the value of the bookingReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingReference }
         *     
         */
        public void setBookingReference(BookingReference value) {
            this.bookingReference = value;
        }

        /**
         * Gets the value of the offers property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAvailabilityRQ.Query.Offers }
         *     
         */
        public SeatAvailabilityRQ.Query.Offers getOffers() {
            return offers;
        }

        /**
         * Sets the value of the offers property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAvailabilityRQ.Query.Offers }
         *     
         */
        public void setOffers(SeatAvailabilityRQ.Query.Offers value) {
            this.offers = value;
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
         *         &lt;element name="Offer" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
         *                   &lt;element name="OfferItemIDs">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID" maxOccurs="unbounded"/>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "offer"
        })
        public static class Offers {

            @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<SeatAvailabilityRQ.Query.Offers.Offer> offer;

            /**
             * Gets the value of the offer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SeatAvailabilityRQ.Query.Offers.Offer }
             * 
             * 
             */
            public List<SeatAvailabilityRQ.Query.Offers.Offer> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<SeatAvailabilityRQ.Query.Offers.Offer>();
                }
                return this.offer;
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
             *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
             *         &lt;element name="OfferItemIDs">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID" maxOccurs="unbounded"/>
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
                "offerID",
                "offerItemIDs"
            })
            public static class Offer {

                @XmlElement(name = "OfferID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected ItemIDType offerID;
                @XmlElement(name = "OfferItemIDs", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected SeatAvailabilityRQ.Query.Offers.Offer.OfferItemIDs offerItemIDs;

                /**
                 * Gets the value of the offerID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemIDType }
                 *     
                 */
                public ItemIDType getOfferID() {
                    return offerID;
                }

                /**
                 * Sets the value of the offerID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemIDType }
                 *     
                 */
                public void setOfferID(ItemIDType value) {
                    this.offerID = value;
                }

                /**
                 * Gets the value of the offerItemIDs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SeatAvailabilityRQ.Query.Offers.Offer.OfferItemIDs }
                 *     
                 */
                public SeatAvailabilityRQ.Query.Offers.Offer.OfferItemIDs getOfferItemIDs() {
                    return offerItemIDs;
                }

                /**
                 * Sets the value of the offerItemIDs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SeatAvailabilityRQ.Query.Offers.Offer.OfferItemIDs }
                 *     
                 */
                public void setOfferItemIDs(SeatAvailabilityRQ.Query.Offers.Offer.OfferItemIDs value) {
                    this.offerItemIDs = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID" maxOccurs="unbounded"/>
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
                    "offerItemID"
                })
                public static class OfferItemIDs {

                    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                    protected List<ItemIDType> offerItemID;

                    /**
                     * Gets the value of the offerItemID property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the offerItemID property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOfferItemID().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItemIDType }
                     * 
                     * 
                     */
                    public List<ItemIDType> getOfferItemID() {
                        if (offerItemID == null) {
                            offerItemID = new ArrayList<ItemIDType>();
                        }
                        return this.offerItemID;
                    }

                }

            }

        }

    }

}
