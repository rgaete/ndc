
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirShoppingProcessing" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShoppingResponseID" minOccurs="0"/>
 *           &lt;element name="OffersGroup">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AllOffersSnapshot" minOccurs="0"/>
 *                     &lt;element name="AirlineOffers" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineOfferSnapshot" minOccurs="0"/>
 *                               &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
 *                                       &lt;sequence>
 *                                         &lt;element name="FlightsOverview" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="FlightRef" maxOccurs="unbounded">
 *                                                     &lt;complexType>
 *                                                       &lt;simpleContent>
 *                                                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
 *                                                           &lt;attribute name="ODRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                                           &lt;attribute name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                                         &lt;/extension>
 *                                                       &lt;/simpleContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="ItineraryPriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemType_2" maxOccurs="unbounded"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="ALaCarteOffer" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
 *                                       &lt;sequence>
 *                                         &lt;element name="ALaCarteOfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}ALaCarteOfferItemType" maxOccurs="unbounded"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PriceCalendar" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                                                 &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                               &lt;/extension>
 *                                             &lt;/simpleContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST/2017.1}EncodedPriceType"/>
 *                                         &lt;element name="PTC" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PaxSimpleType">
 *                                                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                               &lt;/extension>
 *                                             &lt;/simpleContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *           &lt;element name="Payments" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderPaymentFormType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Promotions" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission" minOccurs="0"/>
 *           &lt;element name="DataLists" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnAllowanceList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBagAllowanceList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfServiceList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ContentSourceList" minOccurs="0"/>
 *                     &lt;element name="DescriptionList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Description" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DisclosureList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareList" minOccurs="0"/>
 *                     &lt;element name="FlightSegmentList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/EDIST/2017.1}ListOfFlightSegmentType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="FlightList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Flight" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST/2017.1}TotalJourneyType" minOccurs="0"/>
 *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
 *                                         &lt;element name="Settlement" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                                                   &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                                       &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST/2017.1}KeyIdentifier" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OriginDestinationList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestination" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InstructionsList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MediaList" minOccurs="0"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PenaltyList" minOccurs="0"/>
 *                     &lt;element name="PriceClassList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="PriceClass" type="{http://www.iata.org/IATA/EDIST/2017.1}PriceClassType_2" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ServiceDefinitionList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ServiceDefinition" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDefinitionType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TermsList" minOccurs="0"/>
 *                     &lt;element name="SeatList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Seats" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ListOfSeatType">
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
 *           &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST/2017.1}AirShopResMetadataType" minOccurs="0"/>
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
    "airShoppingProcessing",
    "shoppingResponseID",
    "offersGroup",
    "payments",
    "promotions",
    "commission",
    "dataLists",
    "metadata",
    "policies",
    "errors"
})
@XmlRootElement(name = "AirShoppingRS", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class AirShoppingRS {

    @XmlElement(name = "Document", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MsgDocumentType document;
    @XmlElement(name = "Success", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SuccessType success;
    @XmlElement(name = "Warnings", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected WarningsType warnings;
    @XmlElement(name = "AirShoppingProcessing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrdViewProcessType airShoppingProcessing;
    @XmlElement(name = "ShoppingResponseID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "OffersGroup", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AirShoppingRS.OffersGroup offersGroup;
    @XmlElement(name = "Payments", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AirShoppingRS.Payments payments;
    @XmlElement(name = "Promotions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AirShoppingRS.Promotions promotions;
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CommissionType commission;
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AirShoppingRS.DataLists dataLists;
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AirShopResMetadataType metadata;
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
     * Gets the value of the airShoppingProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrdViewProcessType }
     *     
     */
    public OrdViewProcessType getAirShoppingProcessing() {
        return airShoppingProcessing;
    }

    /**
     * Sets the value of the airShoppingProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdViewProcessType }
     *     
     */
    public void setAirShoppingProcessing(OrdViewProcessType value) {
        this.airShoppingProcessing = value;
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
     * Gets the value of the offersGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.OffersGroup }
     *     
     */
    public AirShoppingRS.OffersGroup getOffersGroup() {
        return offersGroup;
    }

    /**
     * Sets the value of the offersGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.OffersGroup }
     *     
     */
    public void setOffersGroup(AirShoppingRS.OffersGroup value) {
        this.offersGroup = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.Payments }
     *     
     */
    public AirShoppingRS.Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.Payments }
     *     
     */
    public void setPayments(AirShoppingRS.Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.Promotions }
     *     
     */
    public AirShoppingRS.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.Promotions }
     *     
     */
    public void setPromotions(AirShoppingRS.Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.DataLists }
     *     
     */
    public AirShoppingRS.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.DataLists }
     *     
     */
    public void setDataLists(AirShoppingRS.DataLists value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopResMetadataType }
     *     
     */
    public AirShopResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopResMetadataType }
     *     
     */
    public void setMetadata(AirShopResMetadataType value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BagDisclosureList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnAllowanceList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBagAllowanceList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfServiceList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ContentSourceList" minOccurs="0"/>
     *         &lt;element name="DescriptionList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Description" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DisclosureList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareList" minOccurs="0"/>
     *         &lt;element name="FlightSegmentList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/EDIST/2017.1}ListOfFlightSegmentType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Flight" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST/2017.1}TotalJourneyType" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
     *                             &lt;element name="Settlement" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *                                       &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                           &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST/2017.1}KeyIdentifier" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OriginDestinationList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestination" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InstructionsList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MediaList" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PenaltyList" minOccurs="0"/>
     *         &lt;element name="PriceClassList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceClass" type="{http://www.iata.org/IATA/EDIST/2017.1}PriceClassType_2" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ServiceDefinitionList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ServiceDefinition" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDefinitionType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TermsList" minOccurs="0"/>
     *         &lt;element name="SeatList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Seats" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ListOfSeatType">
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
        "passengerList",
        "contactList",
        "bagDisclosureList",
        "carryOnAllowanceList",
        "checkedBagAllowanceList",
        "classOfServiceList",
        "contentSourceList",
        "descriptionList",
        "disclosureList",
        "fareList",
        "flightSegmentList",
        "flightList",
        "originDestinationList",
        "instructionsList",
        "mediaList",
        "penaltyList",
        "priceClassList",
        "serviceDefinitionList",
        "termsList",
        "seatList"
    })
    public static class DataLists {

        @XmlElement(name = "PassengerList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.PassengerList passengerList;
        @XmlElement(name = "ContactList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.ContactList contactList;
        @XmlElement(name = "BagDisclosureList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfBagDisclosureType bagDisclosureList;
        @XmlElement(name = "CarryOnAllowanceList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfCarryOnAllowanceType carryOnAllowanceList;
        @XmlElement(name = "CheckedBagAllowanceList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfBagAllowanceType checkedBagAllowanceList;
        @XmlElement(name = "ClassOfServiceList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfClassOfServiceType classOfServiceList;
        @XmlElement(name = "ContentSourceList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfContentSourceType contentSourceList;
        @XmlElement(name = "DescriptionList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.DescriptionList descriptionList;
        @XmlElement(name = "DisclosureList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfDisclosureType disclosureList;
        @XmlElement(name = "FareList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FareList fareList;
        @XmlElement(name = "FlightSegmentList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.FlightSegmentList flightSegmentList;
        @XmlElement(name = "FlightList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.FlightList flightList;
        @XmlElement(name = "OriginDestinationList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.OriginDestinationList originDestinationList;
        @XmlElement(name = "InstructionsList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfOfferInstructionsType instructionsList;
        @XmlElement(name = "MediaList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfMediaType mediaList;
        @XmlElement(name = "PenaltyList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfOfferPenaltyType penaltyList;
        @XmlElement(name = "PriceClassList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.PriceClassList priceClassList;
        @XmlElement(name = "ServiceDefinitionList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.ServiceDefinitionList serviceDefinitionList;
        @XmlElement(name = "TermsList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfOfferTermsType termsList;
        @XmlElement(name = "SeatList", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirShoppingRS.DataLists.SeatList seatList;

        /**
         * Gets the value of the passengerList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.PassengerList }
         *     
         */
        public AirShoppingRS.DataLists.PassengerList getPassengerList() {
            return passengerList;
        }

        /**
         * Sets the value of the passengerList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.PassengerList }
         *     
         */
        public void setPassengerList(AirShoppingRS.DataLists.PassengerList value) {
            this.passengerList = value;
        }

        /**
         * Gets the value of the contactList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.ContactList }
         *     
         */
        public AirShoppingRS.DataLists.ContactList getContactList() {
            return contactList;
        }

        /**
         * Sets the value of the contactList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.ContactList }
         *     
         */
        public void setContactList(AirShoppingRS.DataLists.ContactList value) {
            this.contactList = value;
        }

        /**
         * Gets the value of the bagDisclosureList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfBagDisclosureType }
         *     
         */
        public ListOfBagDisclosureType getBagDisclosureList() {
            return bagDisclosureList;
        }

        /**
         * Sets the value of the bagDisclosureList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfBagDisclosureType }
         *     
         */
        public void setBagDisclosureList(ListOfBagDisclosureType value) {
            this.bagDisclosureList = value;
        }

        /**
         * Gets the value of the carryOnAllowanceList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfCarryOnAllowanceType }
         *     
         */
        public ListOfCarryOnAllowanceType getCarryOnAllowanceList() {
            return carryOnAllowanceList;
        }

        /**
         * Sets the value of the carryOnAllowanceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfCarryOnAllowanceType }
         *     
         */
        public void setCarryOnAllowanceList(ListOfCarryOnAllowanceType value) {
            this.carryOnAllowanceList = value;
        }

        /**
         * Gets the value of the checkedBagAllowanceList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfBagAllowanceType }
         *     
         */
        public ListOfBagAllowanceType getCheckedBagAllowanceList() {
            return checkedBagAllowanceList;
        }

        /**
         * Sets the value of the checkedBagAllowanceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfBagAllowanceType }
         *     
         */
        public void setCheckedBagAllowanceList(ListOfBagAllowanceType value) {
            this.checkedBagAllowanceList = value;
        }

        /**
         * Gets the value of the classOfServiceList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfClassOfServiceType }
         *     
         */
        public ListOfClassOfServiceType getClassOfServiceList() {
            return classOfServiceList;
        }

        /**
         * Sets the value of the classOfServiceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfClassOfServiceType }
         *     
         */
        public void setClassOfServiceList(ListOfClassOfServiceType value) {
            this.classOfServiceList = value;
        }

        /**
         * Gets the value of the contentSourceList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfContentSourceType }
         *     
         */
        public ListOfContentSourceType getContentSourceList() {
            return contentSourceList;
        }

        /**
         * Sets the value of the contentSourceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfContentSourceType }
         *     
         */
        public void setContentSourceList(ListOfContentSourceType value) {
            this.contentSourceList = value;
        }

        /**
         * Gets the value of the descriptionList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.DescriptionList }
         *     
         */
        public AirShoppingRS.DataLists.DescriptionList getDescriptionList() {
            return descriptionList;
        }

        /**
         * Sets the value of the descriptionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.DescriptionList }
         *     
         */
        public void setDescriptionList(AirShoppingRS.DataLists.DescriptionList value) {
            this.descriptionList = value;
        }

        /**
         * Gets the value of the disclosureList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfDisclosureType }
         *     
         */
        public ListOfDisclosureType getDisclosureList() {
            return disclosureList;
        }

        /**
         * Sets the value of the disclosureList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfDisclosureType }
         *     
         */
        public void setDisclosureList(ListOfDisclosureType value) {
            this.disclosureList = value;
        }

        /**
         * Gets the value of the fareList property.
         * 
         * @return
         *     possible object is
         *     {@link FareList }
         *     
         */
        public FareList getFareList() {
            return fareList;
        }

        /**
         * Sets the value of the fareList property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareList }
         *     
         */
        public void setFareList(FareList value) {
            this.fareList = value;
        }

        /**
         * Gets the value of the flightSegmentList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.FlightSegmentList }
         *     
         */
        public AirShoppingRS.DataLists.FlightSegmentList getFlightSegmentList() {
            return flightSegmentList;
        }

        /**
         * Sets the value of the flightSegmentList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.FlightSegmentList }
         *     
         */
        public void setFlightSegmentList(AirShoppingRS.DataLists.FlightSegmentList value) {
            this.flightSegmentList = value;
        }

        /**
         * Gets the value of the flightList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.FlightList }
         *     
         */
        public AirShoppingRS.DataLists.FlightList getFlightList() {
            return flightList;
        }

        /**
         * Sets the value of the flightList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.FlightList }
         *     
         */
        public void setFlightList(AirShoppingRS.DataLists.FlightList value) {
            this.flightList = value;
        }

        /**
         * Gets the value of the originDestinationList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.OriginDestinationList }
         *     
         */
        public AirShoppingRS.DataLists.OriginDestinationList getOriginDestinationList() {
            return originDestinationList;
        }

        /**
         * Sets the value of the originDestinationList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.OriginDestinationList }
         *     
         */
        public void setOriginDestinationList(AirShoppingRS.DataLists.OriginDestinationList value) {
            this.originDestinationList = value;
        }

        /**
         * Gets the value of the instructionsList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfOfferInstructionsType }
         *     
         */
        public ListOfOfferInstructionsType getInstructionsList() {
            return instructionsList;
        }

        /**
         * Sets the value of the instructionsList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfOfferInstructionsType }
         *     
         */
        public void setInstructionsList(ListOfOfferInstructionsType value) {
            this.instructionsList = value;
        }

        /**
         * Gets the value of the mediaList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfMediaType }
         *     
         */
        public ListOfMediaType getMediaList() {
            return mediaList;
        }

        /**
         * Sets the value of the mediaList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfMediaType }
         *     
         */
        public void setMediaList(ListOfMediaType value) {
            this.mediaList = value;
        }

        /**
         * Gets the value of the penaltyList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfOfferPenaltyType }
         *     
         */
        public ListOfOfferPenaltyType getPenaltyList() {
            return penaltyList;
        }

        /**
         * Sets the value of the penaltyList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfOfferPenaltyType }
         *     
         */
        public void setPenaltyList(ListOfOfferPenaltyType value) {
            this.penaltyList = value;
        }

        /**
         * Gets the value of the priceClassList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.PriceClassList }
         *     
         */
        public AirShoppingRS.DataLists.PriceClassList getPriceClassList() {
            return priceClassList;
        }

        /**
         * Sets the value of the priceClassList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.PriceClassList }
         *     
         */
        public void setPriceClassList(AirShoppingRS.DataLists.PriceClassList value) {
            this.priceClassList = value;
        }

        /**
         * Gets the value of the serviceDefinitionList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.ServiceDefinitionList }
         *     
         */
        public AirShoppingRS.DataLists.ServiceDefinitionList getServiceDefinitionList() {
            return serviceDefinitionList;
        }

        /**
         * Sets the value of the serviceDefinitionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.ServiceDefinitionList }
         *     
         */
        public void setServiceDefinitionList(AirShoppingRS.DataLists.ServiceDefinitionList value) {
            this.serviceDefinitionList = value;
        }

        /**
         * Gets the value of the termsList property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfOfferTermsType }
         *     
         */
        public ListOfOfferTermsType getTermsList() {
            return termsList;
        }

        /**
         * Sets the value of the termsList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfOfferTermsType }
         *     
         */
        public void setTermsList(ListOfOfferTermsType value) {
            this.termsList = value;
        }

        /**
         * Gets the value of the seatList property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingRS.DataLists.SeatList }
         *     
         */
        public AirShoppingRS.DataLists.SeatList getSeatList() {
            return seatList;
        }

        /**
         * Sets the value of the seatList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingRS.DataLists.SeatList }
         *     
         */
        public void setSeatList(AirShoppingRS.DataLists.SeatList value) {
            this.seatList = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Description" maxOccurs="unbounded"/>
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
            "description"
        })
        public static class DescriptionList {

            @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<Description> description;

            /**
             * Gets the value of the description property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the description property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Description }
             * 
             * 
             */
            public List<Description> getDescription() {
                if (description == null) {
                    description = new ArrayList<Description>();
                }
                return this.description;
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
         *         &lt;element name="Flight" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST/2017.1}TotalJourneyType" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
         *                   &lt;element name="Settlement" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
         *                             &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
         *                 &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST/2017.1}KeyIdentifier" />
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
            "flight"
        })
        public static class FlightList {

            @XmlElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<AirShoppingRS.DataLists.FlightList.Flight> flight;

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
             * {@link AirShoppingRS.DataLists.FlightList.Flight }
             * 
             * 
             */
            public List<AirShoppingRS.DataLists.FlightList.Flight> getFlight() {
                if (flight == null) {
                    flight = new ArrayList<AirShoppingRS.DataLists.FlightList.Flight>();
                }
                return this.flight;
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
             *         &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST/2017.1}TotalJourneyType" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
             *         &lt;element name="Settlement" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
             *                   &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
             *       &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST/2017.1}KeyIdentifier" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "journey",
                "segmentReferences",
                "settlement"
            })
            public static class Flight {

                @XmlElement(name = "Journey", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected TotalJourneyType journey;
                @XmlElement(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected SegmentReferences segmentReferences;
                @XmlElement(name = "Settlement", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected AirShoppingRS.DataLists.FlightList.Flight.Settlement settlement;
                @XmlAttribute(name = "FlightKey")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                protected String flightKey;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * Gets the value of the journey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TotalJourneyType }
                 *     
                 */
                public TotalJourneyType getJourney() {
                    return journey;
                }

                /**
                 * Sets the value of the journey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TotalJourneyType }
                 *     
                 */
                public void setJourney(TotalJourneyType value) {
                    this.journey = value;
                }

                /**
                 * Gets the value of the segmentReferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentReferences }
                 *     
                 */
                public SegmentReferences getSegmentReferences() {
                    return segmentReferences;
                }

                /**
                 * Sets the value of the segmentReferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentReferences }
                 *     
                 */
                public void setSegmentReferences(SegmentReferences value) {
                    this.segmentReferences = value;
                }

                /**
                 * Gets the value of the settlement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirShoppingRS.DataLists.FlightList.Flight.Settlement }
                 *     
                 */
                public AirShoppingRS.DataLists.FlightList.Flight.Settlement getSettlement() {
                    return settlement;
                }

                /**
                 * Sets the value of the settlement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirShoppingRS.DataLists.FlightList.Flight.Settlement }
                 *     
                 */
                public void setSettlement(AirShoppingRS.DataLists.FlightList.Flight.Settlement value) {
                    this.settlement = value;
                }

                /**
                 * Gets the value of the flightKey property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightKey() {
                    return flightKey;
                }

                /**
                 * Sets the value of the flightKey property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightKey(String value) {
                    this.flightKey = value;
                }

                /**
                 * Gets the value of the refs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the refs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRefs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getRefs() {
                    if (refs == null) {
                        refs = new ArrayList<Object>();
                    }
                    return this.refs;
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
                 *         &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
                 *         &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
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
                    "method",
                    "interlineSettlementValue"
                })
                public static class Settlement {

                    @XmlElement(name = "Method", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                    protected String method;
                    @XmlElement(name = "InterlineSettlementValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    protected CurrencyAmountOptType interlineSettlementValue;

                    /**
                     * Gets the value of the method property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMethod() {
                        return method;
                    }

                    /**
                     * Sets the value of the method property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMethod(String value) {
                        this.method = value;
                    }

                    /**
                     * Gets the value of the interlineSettlementValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public CurrencyAmountOptType getInterlineSettlementValue() {
                        return interlineSettlementValue;
                    }

                    /**
                     * Sets the value of the interlineSettlementValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public void setInterlineSettlementValue(CurrencyAmountOptType value) {
                        this.interlineSettlementValue = value;
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
         *         &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/EDIST/2017.1}ListOfFlightSegmentType" maxOccurs="unbounded"/>
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
            "flightSegment"
        })
        public static class FlightSegmentList {

            @XmlElement(name = "FlightSegment", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<ListOfFlightSegmentType> flightSegment;

            /**
             * Gets the value of the flightSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ListOfFlightSegmentType }
             * 
             * 
             */
            public List<ListOfFlightSegmentType> getFlightSegment() {
                if (flightSegment == null) {
                    flightSegment = new ArrayList<ListOfFlightSegmentType>();
                }
                return this.flightSegment;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestination" maxOccurs="unbounded"/>
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
            "originDestination"
        })
        public static class OriginDestinationList {

            @XmlElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<OriginDestination> originDestination;

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
             * {@link OriginDestination }
             * 
             * 
             */
            public List<OriginDestination> getOriginDestination() {
                if (originDestination == null) {
                    originDestination = new ArrayList<OriginDestination>();
                }
                return this.originDestination;
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
         *         &lt;element name="PriceClass" type="{http://www.iata.org/IATA/EDIST/2017.1}PriceClassType_2" maxOccurs="unbounded"/>
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
            "priceClass"
        })
        public static class PriceClassList {

            @XmlElement(name = "PriceClass", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<PriceClassType2> priceClass;

            /**
             * Gets the value of the priceClass property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceClass property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceClass().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PriceClassType2 }
             * 
             * 
             */
            public List<PriceClassType2> getPriceClass() {
                if (priceClass == null) {
                    priceClass = new ArrayList<PriceClassType2>();
                }
                return this.priceClass;
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
         *         &lt;element name="Seats" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ListOfSeatType">
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
            "seats"
        })
        public static class SeatList {

            @XmlElement(name = "Seats", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<AirShoppingRS.DataLists.SeatList.Seats> seats;

            /**
             * Gets the value of the seats property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seats property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeats().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirShoppingRS.DataLists.SeatList.Seats }
             * 
             * 
             */
            public List<AirShoppingRS.DataLists.SeatList.Seats> getSeats() {
                if (seats == null) {
                    seats = new ArrayList<AirShoppingRS.DataLists.SeatList.Seats>();
                }
                return this.seats;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ListOfSeatType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Seats
                extends ListOfSeatType
            {


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
         *         &lt;element name="ServiceDefinition" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDefinitionType" maxOccurs="unbounded"/>
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
            "serviceDefinition"
        })
        public static class ServiceDefinitionList {

            @XmlElement(name = "ServiceDefinition", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<ServiceDefinitionType> serviceDefinition;

            /**
             * Gets the value of the serviceDefinition property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceDefinition property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceDefinition().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceDefinitionType }
             * 
             * 
             */
            public List<ServiceDefinitionType> getServiceDefinition() {
                if (serviceDefinition == null) {
                    serviceDefinition = new ArrayList<ServiceDefinitionType>();
                }
                return this.serviceDefinition;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AllOffersSnapshot" minOccurs="0"/>
     *         &lt;element name="AirlineOffers" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineOfferSnapshot" minOccurs="0"/>
     *                   &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
     *                           &lt;sequence>
     *                             &lt;element name="FlightsOverview" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FlightRef" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
     *                                               &lt;attribute name="ODRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                                               &lt;attribute name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ItineraryPriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemType_2" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ALaCarteOffer" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
     *                           &lt;sequence>
     *                             &lt;element name="ALaCarteOfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}ALaCarteOfferItemType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PriceCalendar" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                                     &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST/2017.1}EncodedPriceType"/>
     *                             &lt;element name="PTC" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PaxSimpleType">
     *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "allOffersSnapshot",
        "airlineOffers"
    })
    public static class OffersGroup {

        @XmlElement(name = "AllOffersSnapshot", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirlineOffersSnapshotType allOffersSnapshot;
        @XmlElement(name = "AirlineOffers", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<AirShoppingRS.OffersGroup.AirlineOffers> airlineOffers;

        /**
         * Gets the value of the allOffersSnapshot property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineOffersSnapshotType }
         *     
         */
        public AirlineOffersSnapshotType getAllOffersSnapshot() {
            return allOffersSnapshot;
        }

        /**
         * Sets the value of the allOffersSnapshot property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineOffersSnapshotType }
         *     
         */
        public void setAllOffersSnapshot(AirlineOffersSnapshotType value) {
            this.allOffersSnapshot = value;
        }

        /**
         * Gets the value of the airlineOffers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineOffers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineOffers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirShoppingRS.OffersGroup.AirlineOffers }
         * 
         * 
         */
        public List<AirShoppingRS.OffersGroup.AirlineOffers> getAirlineOffers() {
            if (airlineOffers == null) {
                airlineOffers = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers>();
            }
            return this.airlineOffers;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineOfferSnapshot" minOccurs="0"/>
         *         &lt;element name="Offer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
         *                 &lt;sequence>
         *                   &lt;element name="FlightsOverview" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FlightRef" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
         *                                     &lt;attribute name="ODRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                                     &lt;attribute name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ItineraryPriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemType_2" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ALaCarteOffer" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
         *                 &lt;sequence>
         *                   &lt;element name="ALaCarteOfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}ALaCarteOfferItemType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PriceCalendar" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *                           &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST/2017.1}EncodedPriceType"/>
         *                   &lt;element name="PTC" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PaxSimpleType">
         *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "airlineOfferSnapshot",
            "offer",
            "aLaCarteOffer",
            "priceCalendar"
        })
        public static class AirlineOffers {

            @XmlElement(name = "AirlineOfferSnapshot", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AirlineOffersSnapshotType airlineOfferSnapshot;
            @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<AirShoppingRS.OffersGroup.AirlineOffers.Offer> offer;
            @XmlElement(name = "ALaCarteOffer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AirShoppingRS.OffersGroup.AirlineOffers.ALaCarteOffer aLaCarteOffer;
            @XmlElement(name = "PriceCalendar", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar> priceCalendar;

            /**
             * Gets the value of the airlineOfferSnapshot property.
             * 
             * @return
             *     possible object is
             *     {@link AirlineOffersSnapshotType }
             *     
             */
            public AirlineOffersSnapshotType getAirlineOfferSnapshot() {
                return airlineOfferSnapshot;
            }

            /**
             * Sets the value of the airlineOfferSnapshot property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirlineOffersSnapshotType }
             *     
             */
            public void setAirlineOfferSnapshot(AirlineOffersSnapshotType value) {
                this.airlineOfferSnapshot = value;
            }

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
             * {@link AirShoppingRS.OffersGroup.AirlineOffers.Offer }
             * 
             * 
             */
            public List<AirShoppingRS.OffersGroup.AirlineOffers.Offer> getOffer() {
                if (offer == null) {
                    offer = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.Offer>();
                }
                return this.offer;
            }

            /**
             * Gets the value of the aLaCarteOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AirShoppingRS.OffersGroup.AirlineOffers.ALaCarteOffer }
             *     
             */
            public AirShoppingRS.OffersGroup.AirlineOffers.ALaCarteOffer getALaCarteOffer() {
                return aLaCarteOffer;
            }

            /**
             * Sets the value of the aLaCarteOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirShoppingRS.OffersGroup.AirlineOffers.ALaCarteOffer }
             *     
             */
            public void setALaCarteOffer(AirShoppingRS.OffersGroup.AirlineOffers.ALaCarteOffer value) {
                this.aLaCarteOffer = value;
            }

            /**
             * Gets the value of the priceCalendar property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceCalendar property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceCalendar().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar }
             * 
             * 
             */
            public List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar> getPriceCalendar() {
                if (priceCalendar == null) {
                    priceCalendar = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar>();
                }
                return this.priceCalendar;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
             *       &lt;sequence>
             *         &lt;element name="ALaCarteOfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}ALaCarteOfferItemType" maxOccurs="unbounded"/>
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
                "aLaCarteOfferItem"
            })
            public static class ALaCarteOffer
                extends OfferType2
            {

                @XmlElement(name = "ALaCarteOfferItem", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected List<ALaCarteOfferItemType> aLaCarteOfferItem;

                /**
                 * Gets the value of the aLaCarteOfferItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the aLaCarteOfferItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getALaCarteOfferItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ALaCarteOfferItemType }
                 * 
                 * 
                 */
                public List<ALaCarteOfferItemType> getALaCarteOfferItem() {
                    if (aLaCarteOfferItem == null) {
                        aLaCarteOfferItem = new ArrayList<ALaCarteOfferItemType>();
                    }
                    return this.aLaCarteOfferItem;
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
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferType_2">
             *       &lt;sequence>
             *         &lt;element name="FlightsOverview" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FlightRef" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
             *                           &lt;attribute name="ODRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
             *                           &lt;attribute name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ItineraryPriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemType_2" maxOccurs="unbounded"/>
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
                "flightsOverview",
                "offerItem"
            })
            public static class Offer
                extends OfferType2
            {

                @XmlElement(name = "FlightsOverview", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview flightsOverview;
                @XmlElement(name = "OfferItem", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected List<OfferItemType2> offerItem;

                /**
                 * Gets the value of the flightsOverview property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview }
                 *     
                 */
                public AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview getFlightsOverview() {
                    return flightsOverview;
                }

                /**
                 * Sets the value of the flightsOverview property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview }
                 *     
                 */
                public void setFlightsOverview(AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview value) {
                    this.flightsOverview = value;
                }

                /**
                 * Gets the value of the offerItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OfferItemType2 }
                 * 
                 * 
                 */
                public List<OfferItemType2> getOfferItem() {
                    if (offerItem == null) {
                        offerItem = new ArrayList<OfferItemType2>();
                    }
                    return this.offerItem;
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
                 *         &lt;element name="FlightRef" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
                 *                 &lt;attribute name="ODRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
                 *                 &lt;attribute name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ItineraryPriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
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
                    "flightRef",
                    "itineraryPriceClassRef"
                })
                public static class FlightsOverview {

                    @XmlElement(name = "FlightRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                    protected List<AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview.FlightRef> flightRef;
                    @XmlElement(name = "ItineraryPriceClassRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object itineraryPriceClassRef;

                    /**
                     * Gets the value of the flightRef property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the flightRef property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFlightRef().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview.FlightRef }
                     * 
                     * 
                     */
                    public List<AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview.FlightRef> getFlightRef() {
                        if (flightRef == null) {
                            flightRef = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.Offer.FlightsOverview.FlightRef>();
                        }
                        return this.flightRef;
                    }

                    /**
                     * Gets the value of the itineraryPriceClassRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getItineraryPriceClassRef() {
                        return itineraryPriceClassRef;
                    }

                    /**
                     * Sets the value of the itineraryPriceClassRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setItineraryPriceClassRef(Object value) {
                        this.itineraryPriceClassRef = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
                     *       &lt;attribute name="ODRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
                     *       &lt;attribute name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
                    public static class FlightRef {

                        @XmlValue
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREF")
                        protected Object value;
                        @XmlAttribute(name = "ODRef")
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREF")
                        protected Object odRef;
                        @XmlAttribute(name = "PriceClassRef")
                        @XmlIDREF
                        @XmlSchemaType(name = "IDREF")
                        protected Object priceClassRef;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setValue(Object value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the odRef property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getODRef() {
                            return odRef;
                        }

                        /**
                         * Sets the value of the odRef property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setODRef(Object value) {
                            this.odRef = value;
                        }

                        /**
                         * Gets the value of the priceClassRef property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getPriceClassRef() {
                            return priceClassRef;
                        }

                        /**
                         * Sets the value of the priceClassRef property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setPriceClassRef(Object value) {
                            this.priceClassRef = value;
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
             *         &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
             *                 &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST/2017.1}EncodedPriceType"/>
             *         &lt;element name="PTC" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PaxSimpleType">
             *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "priceCalendarDate",
                "totalPrice",
                "ptc"
            })
            public static class PriceCalendar {

                @XmlElement(name = "PriceCalendarDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate> priceCalendarDate;
                @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
                protected EncodedPriceType totalPrice;
                @XmlElement(name = "PTC", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PTC> ptc;
                @XmlAttribute(name = "LeadPriceInd")
                @XmlSchemaType(name = "anySimpleType")
                protected String leadPriceInd;

                /**
                 * Gets the value of the priceCalendarDate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the priceCalendarDate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPriceCalendarDate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate }
                 * 
                 * 
                 */
                public List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate> getPriceCalendarDate() {
                    if (priceCalendarDate == null) {
                        priceCalendarDate = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate>();
                    }
                    return this.priceCalendarDate;
                }

                /**
                 * Gets the value of the totalPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public EncodedPriceType getTotalPrice() {
                    return totalPrice;
                }

                /**
                 * Sets the value of the totalPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public void setTotalPrice(EncodedPriceType value) {
                    this.totalPrice = value;
                }

                /**
                 * Gets the value of the ptc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ptc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPTC().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PTC }
                 * 
                 * 
                 */
                public List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PTC> getPTC() {
                    if (ptc == null) {
                        ptc = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PTC>();
                    }
                    return this.ptc;
                }

                /**
                 * Gets the value of the leadPriceInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLeadPriceInd() {
                    return leadPriceInd;
                }

                /**
                 * Sets the value of the leadPriceInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLeadPriceInd(String value) {
                    this.leadPriceInd = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
                 *       &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
                public static class PriceCalendarDate {

                    @XmlValue
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar value;
                    @XmlAttribute(name = "OriginDestinationReference")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object originDestinationReference;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setValue(XMLGregorianCalendar value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the originDestinationReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getOriginDestinationReference() {
                        return originDestinationReference;
                    }

                    /**
                     * Sets the value of the originDestinationReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setOriginDestinationReference(Object value) {
                        this.originDestinationReference = value;
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
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PaxSimpleType">
                 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
                public static class PTC {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Quantity")
                    protected BigInteger quantity;

                    /**
                     * A data type for Passenger Type Code (PTC) encoding constraint: IATA (three character) Passenger Type Codes
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
                     * Gets the value of the quantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQuantity(BigInteger value) {
                        this.quantity = value;
                    }

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
     *         &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderPaymentFormType" maxOccurs="unbounded"/>
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
        "payment"
    })
    public static class Payments {

        @XmlElement(name = "Payment", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<OrderPaymentFormType> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderPaymentFormType }
         * 
         * 
         */
        public List<OrderPaymentFormType> getPayment() {
            if (payment == null) {
                payment = new ArrayList<OrderPaymentFormType>();
            }
            return this.payment;
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
     *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType" maxOccurs="unbounded"/>
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
        "promotion"
    })
    public static class Promotions {

        @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<PromotionType> promotion;

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromotionType }
         * 
         * 
         */
        public List<PromotionType> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<PromotionType>();
            }
            return this.promotion;
        }

    }

}
