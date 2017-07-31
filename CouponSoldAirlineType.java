
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AIRLINE FLIGHT COUPON definition.
 * 
 * <p>Java class for CouponSoldAirlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponSoldAirlineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDateTime" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArrivalDateTime" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Stops" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StopLocations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InfoSource" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="TourOperatorFlightID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival" minOccurs="0"/>
 *         &lt;element name="OperatingCarrier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Disclosures" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Equipment" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketedBaggageAllowance" type="{http://www.iata.org/IATA/EDIST/2017.1}AddlBaggageInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectKeyMetaAttrGroup"/>
 *       &lt;attribute name="MetadataToken" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponSoldAirlineType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "departureDateTime",
    "arrivalDateTime",
    "stops",
    "infoSource",
    "tourOperatorFlightID",
    "departure",
    "arrival",
    "operatingCarrier",
    "marketingCarrier",
    "equipment",
    "status",
    "seatNumber",
    "ticketedBaggageAllowance"
})
@XmlSeeAlso({
    ndc.CouponInfoType.SoldAirlineInfo.class,
    ndc.HistoryCouponInfoType.SoldAirlineInfo.class
})
public class CouponSoldAirlineType {

    @XmlElement(name = "DepartureDateTime", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CouponSoldAirlineType.DepartureDateTime departureDateTime;
    @XmlElement(name = "ArrivalDateTime", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CouponSoldAirlineType.ArrivalDateTime arrivalDateTime;
    @XmlElement(name = "Stops", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CouponSoldAirlineType.Stops stops;
    @XmlElement(name = "InfoSource", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String infoSource;
    @XmlElement(name = "TourOperatorFlightID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String tourOperatorFlightID;
    @XmlElement(name = "Departure", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Departure departure;
    @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightArrivalType arrival;
    @XmlElement(name = "OperatingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CouponSoldAirlineType.OperatingCarrier operatingCarrier;
    @XmlElement(name = "MarketingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MarketingCarrierFlightType marketingCarrier;
    @XmlElement(name = "Equipment", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<AircraftSummaryType> equipment;
    @XmlElement(name = "Status", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String status;
    @XmlElement(name = "SeatNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String seatNumber;
    @XmlElement(name = "TicketedBaggageAllowance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AddlBaggageInfoType ticketedBaggageAllowance;
    @XmlAttribute(name = "MetadataToken")
    protected String metadataToken;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.DepartureDateTime }
     *     
     */
    public CouponSoldAirlineType.DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.DepartureDateTime }
     *     
     */
    public void setDepartureDateTime(CouponSoldAirlineType.DepartureDateTime value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the arrivalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.ArrivalDateTime }
     *     
     */
    public CouponSoldAirlineType.ArrivalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.ArrivalDateTime }
     *     
     */
    public void setArrivalDateTime(CouponSoldAirlineType.ArrivalDateTime value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.Stops }
     *     
     */
    public CouponSoldAirlineType.Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.Stops }
     *     
     */
    public void setStops(CouponSoldAirlineType.Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link Departure }
     *     
     */
    public Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departure }
     *     
     */
    public void setDeparture(Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType }
     *     
     */
    public FlightArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType }
     *     
     */
    public void setArrival(FlightArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType.OperatingCarrier }
     *     
     */
    public CouponSoldAirlineType.OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType.OperatingCarrier }
     *     
     */
    public void setOperatingCarrier(CouponSoldAirlineType.OperatingCarrier value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public MarketingCarrierFlightType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public void setMarketingCarrier(MarketingCarrierFlightType value) {
        this.marketingCarrier = value;
    }

    /**
     * Aircraft Equipment.
     * 
     * Note: Two instances of aircraft equipment may be specified if there is a change of gauge.Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftSummaryType }
     * 
     * 
     */
    public List<AircraftSummaryType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<AircraftSummaryType>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the ticketedBaggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public AddlBaggageInfoType getTicketedBaggageAllowance() {
        return ticketedBaggageAllowance;
    }

    /**
     * Sets the value of the ticketedBaggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public void setTicketedBaggageAllowance(AddlBaggageInfoType value) {
        this.ticketedBaggageAllowance = value;
    }

    /**
     * Gets the value of the metadataToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataToken() {
        return metadataToken;
    }

    /**
     * Sets the value of the metadataToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataToken(String value) {
        this.metadataToken = value;
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
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalDateTime
        extends CoreDateGrpType
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureDateTime
        extends CoreDateGrpType
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Disclosures" minOccurs="0"/>
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
        "disclosures"
    })
    public static class OperatingCarrier
        extends OperatingCarrierFlightType
    {

        @XmlElement(name = "Disclosures", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Disclosures disclosures;

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
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
     *         &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StopLocations" minOccurs="0"/>
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
        "stopQuantity",
        "stopLocations"
    })
    public static class Stops {

        @XmlElement(name = "StopQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger stopQuantity;
        @XmlElement(name = "StopLocations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected StopLocationType stopLocations;

        /**
         * Gets the value of the stopQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStopQuantity() {
            return stopQuantity;
        }

        /**
         * Sets the value of the stopQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStopQuantity(BigInteger value) {
            this.stopQuantity = value;
        }

        /**
         * Gets the value of the stopLocations property.
         * 
         * @return
         *     possible object is
         *     {@link StopLocationType }
         *     
         */
        public StopLocationType getStopLocations() {
            return stopLocations;
        }

        /**
         * Sets the value of the stopLocations property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopLocationType }
         *     
         */
        public void setStopLocations(StopLocationType value) {
            this.stopLocations = value;
        }

    }

}
