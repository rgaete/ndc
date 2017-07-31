
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
 *         &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowReqParamsType" minOccurs="0"/>
 *         &lt;element name="TicketIdentification" type="{http://www.iata.org/IATA/EDIST/2017.1}TicketIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShoppingResponseID"/>
 *           &lt;element name="Query">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="OriginDestination" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FlightType">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Flight" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FlightOnlyType">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Preference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlinePreferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AlliancePreferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FarePreferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightPreferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PricingMethodPreference" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegMaxTimePreferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServicePricingOnlyPreference" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TransferPreferences" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Qualifier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggagePricingQualifier" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExistingOrderQualifier" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardQualifiers" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ProgramQualifiers" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PromotionQualifiers" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatQualifier" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceQualifier" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SocialMediaQualifiers" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SpecialFareQualifiers" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SpecialNeedQualifiers" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TripPurposeQualifier" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JourneyData" type="{http://www.iata.org/IATA/EDIST/2017.1}ItineraryType" minOccurs="0"/>
 *         &lt;element name="DataLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowReqMetadataType" minOccurs="0"/>
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
    "ticketIdentification",
    "shoppingResponseID",
    "query",
    "preference",
    "qualifier",
    "journeyData",
    "dataLists",
    "metadata",
    "policies"
})
@XmlRootElement(name = "BaggageAllowanceRQ", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class BaggageAllowanceRQ {

    @XmlElement(name = "PointOfSale", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagAllowReqParamsType parameters;
    @XmlElement(name = "TicketIdentification", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<TicketIdentificationType> ticketIdentification;
    @XmlElement(name = "ShoppingResponseID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "Query", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRQ.Query query;
    @XmlElement(name = "Preference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRQ.Preference preference;
    @XmlElement(name = "Qualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRQ.Qualifier qualifier;
    @XmlElement(name = "JourneyData", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ItineraryType journeyData;
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggageAllowanceRQ.DataLists dataLists;
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagAllowReqMetadataType metadata;
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
     *     {@link BagAllowReqParamsType }
     *     
     */
    public BagAllowReqParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowReqParamsType }
     *     
     */
    public void setParameters(BagAllowReqParamsType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the ticketIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketIdentificationType }
     * 
     * 
     */
    public List<TicketIdentificationType> getTicketIdentification() {
        if (ticketIdentification == null) {
            ticketIdentification = new ArrayList<TicketIdentificationType>();
        }
        return this.ticketIdentification;
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
     *     {@link BaggageAllowanceRQ.Query }
     *     
     */
    public BaggageAllowanceRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRQ.Query }
     *     
     */
    public void setQuery(BaggageAllowanceRQ.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRQ.Preference }
     *     
     */
    public BaggageAllowanceRQ.Preference getPreference() {
        return preference;
    }

    /**
     * Sets the value of the preference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRQ.Preference }
     *     
     */
    public void setPreference(BaggageAllowanceRQ.Preference value) {
        this.preference = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRQ.Qualifier }
     *     
     */
    public BaggageAllowanceRQ.Qualifier getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRQ.Qualifier }
     *     
     */
    public void setQualifier(BaggageAllowanceRQ.Qualifier value) {
        this.qualifier = value;
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
     *     {@link BaggageAllowanceRQ.DataLists }
     *     
     */
    public BaggageAllowanceRQ.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRQ.DataLists }
     *     
     */
    public void setDataLists(BaggageAllowanceRQ.DataLists value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowReqMetadataType }
     *     
     */
    public BagAllowReqMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowReqMetadataType }
     *     
     */
    public void setMetadata(BagAllowReqMetadataType value) {
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
     * Common NDC Data List choices.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
     *     &lt;/restriction>
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
    public static class DataLists {

        @XmlElement(name = "PassengerList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageAllowanceRQ.DataLists.PassengerList passengerList;
        @XmlElement(name = "ContactList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageAllowanceRQ.DataLists.ContactList contactList;

        /**
         * Gets the value of the passengerList property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageAllowanceRQ.DataLists.PassengerList }
         *     
         */
        public BaggageAllowanceRQ.DataLists.PassengerList getPassengerList() {
            return passengerList;
        }

        /**
         * Sets the value of the passengerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageAllowanceRQ.DataLists.PassengerList }
         *     
         */
        public void setPassengerList(BaggageAllowanceRQ.DataLists.PassengerList value) {
            this.passengerList = value;
        }

        /**
         * Gets the value of the contactList property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageAllowanceRQ.DataLists.ContactList }
         *     
         */
        public BaggageAllowanceRQ.DataLists.ContactList getContactList() {
            return contactList;
        }

        /**
         * Sets the value of the contactList property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageAllowanceRQ.DataLists.ContactList }
         *     
         */
        public void setContactList(BaggageAllowanceRQ.DataLists.ContactList value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlinePreferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AlliancePreferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FarePreferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightPreferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PricingMethodPreference" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegMaxTimePreferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServicePricingOnlyPreference" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TransferPreferences" minOccurs="0"/>
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
        "airlinePreferences",
        "alliancePreferences",
        "farePreferences",
        "flightPreferences",
        "pricingMethodPreference",
        "segMaxTimePreferences",
        "servicePricingOnlyPreference",
        "transferPreferences"
    })
    public static class Preference {

        @XmlElement(name = "AirlinePreferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirlinePreferencesType airlinePreferences;
        @XmlElement(name = "AlliancePreferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AlliancePreferencesType alliancePreferences;
        @XmlElement(name = "FarePreferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FarePreferencesType farePreferences;
        @XmlElement(name = "FlightPreferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FlightPreferencesType flightPreferences;
        @XmlElement(name = "PricingMethodPreference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BestPricingPreferencesType pricingMethodPreference;
        @XmlElement(name = "SegMaxTimePreferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;
        @XmlElement(name = "ServicePricingOnlyPreference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ServicePricingOnlyPreference servicePricingOnlyPreference;
        @XmlElement(name = "TransferPreferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TransferPreferencesType transferPreferences;

        /**
         * Gets the value of the airlinePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link AirlinePreferencesType }
         *     
         */
        public AirlinePreferencesType getAirlinePreferences() {
            return airlinePreferences;
        }

        /**
         * Sets the value of the airlinePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlinePreferencesType }
         *     
         */
        public void setAirlinePreferences(AirlinePreferencesType value) {
            this.airlinePreferences = value;
        }

        /**
         * Gets the value of the alliancePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link AlliancePreferencesType }
         *     
         */
        public AlliancePreferencesType getAlliancePreferences() {
            return alliancePreferences;
        }

        /**
         * Sets the value of the alliancePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlliancePreferencesType }
         *     
         */
        public void setAlliancePreferences(AlliancePreferencesType value) {
            this.alliancePreferences = value;
        }

        /**
         * Gets the value of the farePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FarePreferencesType }
         *     
         */
        public FarePreferencesType getFarePreferences() {
            return farePreferences;
        }

        /**
         * Sets the value of the farePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FarePreferencesType }
         *     
         */
        public void setFarePreferences(FarePreferencesType value) {
            this.farePreferences = value;
        }

        /**
         * Gets the value of the flightPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType }
         *     
         */
        public FlightPreferencesType getFlightPreferences() {
            return flightPreferences;
        }

        /**
         * Sets the value of the flightPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType }
         *     
         */
        public void setFlightPreferences(FlightPreferencesType value) {
            this.flightPreferences = value;
        }

        /**
         * Contains information to identify how reservation was re-priced to obtain best published fare (Eg. best fare in same cabin, best fare in all cabins, other parameters to select best fare).
         * 
         * @return
         *     possible object is
         *     {@link BestPricingPreferencesType }
         *     
         */
        public BestPricingPreferencesType getPricingMethodPreference() {
            return pricingMethodPreference;
        }

        /**
         * Sets the value of the pricingMethodPreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link BestPricingPreferencesType }
         *     
         */
        public void setPricingMethodPreference(BestPricingPreferencesType value) {
            this.pricingMethodPreference = value;
        }

        /**
         * Gets the value of the segMaxTimePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FltSegmentMaxTimePreferencesType }
         *     
         */
        public FltSegmentMaxTimePreferencesType getSegMaxTimePreferences() {
            return segMaxTimePreferences;
        }

        /**
         * Sets the value of the segMaxTimePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltSegmentMaxTimePreferencesType }
         *     
         */
        public void setSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
            this.segMaxTimePreferences = value;
        }

        /**
         * Gets the value of the servicePricingOnlyPreference property.
         * 
         * @return
         *     possible object is
         *     {@link ServicePricingOnlyPreference }
         *     
         */
        public ServicePricingOnlyPreference getServicePricingOnlyPreference() {
            return servicePricingOnlyPreference;
        }

        /**
         * Sets the value of the servicePricingOnlyPreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServicePricingOnlyPreference }
         *     
         */
        public void setServicePricingOnlyPreference(ServicePricingOnlyPreference value) {
            this.servicePricingOnlyPreference = value;
        }

        /**
         * Gets the value of the transferPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link TransferPreferencesType }
         *     
         */
        public TransferPreferencesType getTransferPreferences() {
            return transferPreferences;
        }

        /**
         * Sets the value of the transferPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferPreferencesType }
         *     
         */
        public void setTransferPreferences(TransferPreferencesType value) {
            this.transferPreferences = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggagePricingQualifier" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExistingOrderQualifier" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardQualifiers" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ProgramQualifiers" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PromotionQualifiers" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatQualifier" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceQualifier" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SocialMediaQualifiers" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SpecialFareQualifiers" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SpecialNeedQualifiers" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TripPurposeQualifier" minOccurs="0"/>
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
        "baggagePricingQualifier",
        "existingOrderQualifier",
        "paymentCardQualifiers",
        "programQualifiers",
        "promotionQualifiers",
        "seatQualifier",
        "serviceQualifier",
        "socialMediaQualifiers",
        "specialFareQualifiers",
        "specialNeedQualifiers",
        "tripPurposeQualifier"
    })
    public static class Qualifier {

        @XmlElement(name = "BaggagePricingQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggagePricingQualifierType baggagePricingQualifier;
        @XmlElement(name = "ExistingOrderQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ExistingOrderQualifier existingOrderQualifier;
        @XmlElement(name = "PaymentCardQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CardQualifierType paymentCardQualifiers;
        @XmlElement(name = "ProgramQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ProgramQualifiers programQualifiers;
        @XmlElement(name = "PromotionQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected PromotionQualifiers promotionQualifiers;
        @XmlElement(name = "SeatQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SeatQualifier seatQualifier;
        @XmlElement(name = "ServiceQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ServiceQualifierPriceType serviceQualifier;
        @XmlElement(name = "SocialMediaQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SocialQualiferType socialMediaQualifiers;
        @XmlElement(name = "SpecialFareQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FareQualifierType specialFareQualifiers;
        @XmlElement(name = "SpecialNeedQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SpecialQualiferType specialNeedQualifiers;
        @XmlElement(name = "TripPurposeQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlSchemaType(name = "string")
        protected TripPurposeListType tripPurposeQualifier;

        /**
         * Gets the value of the baggagePricingQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggagePricingQualifierType }
         *     
         */
        public BaggagePricingQualifierType getBaggagePricingQualifier() {
            return baggagePricingQualifier;
        }

        /**
         * Sets the value of the baggagePricingQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggagePricingQualifierType }
         *     
         */
        public void setBaggagePricingQualifier(BaggagePricingQualifierType value) {
            this.baggagePricingQualifier = value;
        }

        /**
         * Gets the value of the existingOrderQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link ExistingOrderQualifier }
         *     
         */
        public ExistingOrderQualifier getExistingOrderQualifier() {
            return existingOrderQualifier;
        }

        /**
         * Sets the value of the existingOrderQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExistingOrderQualifier }
         *     
         */
        public void setExistingOrderQualifier(ExistingOrderQualifier value) {
            this.existingOrderQualifier = value;
        }

        /**
         * Contains card type, and Issuer Identification Number. 
         * 
         * @return
         *     possible object is
         *     {@link CardQualifierType }
         *     
         */
        public CardQualifierType getPaymentCardQualifiers() {
            return paymentCardQualifiers;
        }

        /**
         * Sets the value of the paymentCardQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link CardQualifierType }
         *     
         */
        public void setPaymentCardQualifiers(CardQualifierType value) {
            this.paymentCardQualifiers = value;
        }

        /**
         * Gets the value of the programQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramQualifiers }
         *     
         */
        public ProgramQualifiers getProgramQualifiers() {
            return programQualifiers;
        }

        /**
         * Sets the value of the programQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramQualifiers }
         *     
         */
        public void setProgramQualifiers(ProgramQualifiers value) {
            this.programQualifiers = value;
        }

        /**
         * Gets the value of the promotionQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link PromotionQualifiers }
         *     
         */
        public PromotionQualifiers getPromotionQualifiers() {
            return promotionQualifiers;
        }

        /**
         * Sets the value of the promotionQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link PromotionQualifiers }
         *     
         */
        public void setPromotionQualifiers(PromotionQualifiers value) {
            this.promotionQualifiers = value;
        }

        /**
         * Gets the value of the seatQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link SeatQualifier }
         *     
         */
        public SeatQualifier getSeatQualifier() {
            return seatQualifier;
        }

        /**
         * Sets the value of the seatQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatQualifier }
         *     
         */
        public void setSeatQualifier(SeatQualifier value) {
            this.seatQualifier = value;
        }

        /**
         * Gets the value of the serviceQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceQualifierPriceType }
         *     
         */
        public ServiceQualifierPriceType getServiceQualifier() {
            return serviceQualifier;
        }

        /**
         * Sets the value of the serviceQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceQualifierPriceType }
         *     
         */
        public void setServiceQualifier(ServiceQualifierPriceType value) {
            this.serviceQualifier = value;
        }

        /**
         * Gets the value of the socialMediaQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link SocialQualiferType }
         *     
         */
        public SocialQualiferType getSocialMediaQualifiers() {
            return socialMediaQualifiers;
        }

        /**
         * Sets the value of the socialMediaQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link SocialQualiferType }
         *     
         */
        public void setSocialMediaQualifiers(SocialQualiferType value) {
            this.socialMediaQualifiers = value;
        }

        /**
         * Contains elements identifying eligibility for special pricing, which may be private or negotiated.
         * 
         * Notes:
         *  1. Supports pricing discounts and/ or other benefits for Travelers affiliated with companies with private fare and/ or negotiated rate contracts.
         * 
         *  2. Private Fares apply to ALL Travelers.
         * 
         * @return
         *     possible object is
         *     {@link FareQualifierType }
         *     
         */
        public FareQualifierType getSpecialFareQualifiers() {
            return specialFareQualifiers;
        }

        /**
         * Sets the value of the specialFareQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareQualifierType }
         *     
         */
        public void setSpecialFareQualifiers(FareQualifierType value) {
            this.specialFareQualifiers = value;
        }

        /**
         * Gets the value of the specialNeedQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link SpecialQualiferType }
         *     
         */
        public SpecialQualiferType getSpecialNeedQualifiers() {
            return specialNeedQualifiers;
        }

        /**
         * Sets the value of the specialNeedQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialQualiferType }
         *     
         */
        public void setSpecialNeedQualifiers(SpecialQualiferType value) {
            this.specialNeedQualifiers = value;
        }

        /**
         * Gets the value of the tripPurposeQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link TripPurposeListType }
         *     
         */
        public TripPurposeListType getTripPurposeQualifier() {
            return tripPurposeQualifier;
        }

        /**
         * Sets the value of the tripPurposeQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link TripPurposeListType }
         *     
         */
        public void setTripPurposeQualifier(TripPurposeListType value) {
            this.tripPurposeQualifier = value;
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
     *         &lt;element name="OriginDestination" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FlightType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Flight" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FlightOnlyType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/EDIST/2017.1}ItemID_Type"/>
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
        "originDestination",
        "flight",
        "offerID"
    })
    public static class Query {

        @XmlElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<BaggageAllowanceRQ.Query.OriginDestination> originDestination;
        @XmlElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<BaggageAllowanceRQ.Query.Flight> flight;
        @XmlElement(name = "OfferID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ItemIDType offerID;

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
         * {@link BaggageAllowanceRQ.Query.OriginDestination }
         * 
         * 
         */
        public List<BaggageAllowanceRQ.Query.OriginDestination> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<BaggageAllowanceRQ.Query.OriginDestination>();
            }
            return this.originDestination;
        }

        /**
         * Gets the value of the flight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageAllowanceRQ.Query.Flight }
         * 
         * 
         */
        public List<BaggageAllowanceRQ.Query.Flight> getFlight() {
            if (flight == null) {
                flight = new ArrayList<BaggageAllowanceRQ.Query.Flight>();
            }
            return this.flight;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FlightOnlyType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Flight
            extends FlightOnlyType
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FlightType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OriginDestination
            extends FlightType
        {


        }

    }

}
