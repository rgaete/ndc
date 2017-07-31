
package ndc;

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
 * A data type for a Flight.
 * 
 * <p>Java class for FlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationKey" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TotalJourney" minOccurs="0"/>
 *         &lt;element name="Flight" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentKey" minOccurs="0"/>
 *                   &lt;element name="Indicators" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PricingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ConnectionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="E_TicketIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="TicketlessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Status" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival"/>
 *                   &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType"/>
 *                   &lt;element name="OperatingCarrier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Disclosures" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Equipment" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CabinType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfService" minOccurs="0"/>
 *                   &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightDetailType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "originDestinationKey",
    "totalJourney",
    "flight"
})
@XmlSeeAlso({
    ndc.ItineraryType.Flight.class,
    ndc.BaggageListRQ.Query.OriginDestination.class
})
public class FlightType {

    @XmlElement(name = "OriginDestinationKey", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String originDestinationKey;
    @XmlElement(name = "TotalJourney", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TotalJourneyType totalJourney;
    @XmlElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<FlightType.Flight> flight;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the originDestinationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationKey() {
        return originDestinationKey;
    }

    /**
     * Sets the value of the originDestinationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationKey(String value) {
        this.originDestinationKey = value;
    }

    /**
     * Gets the value of the totalJourney property.
     * 
     * @return
     *     possible object is
     *     {@link TotalJourneyType }
     *     
     */
    public TotalJourneyType getTotalJourney() {
        return totalJourney;
    }

    /**
     * Sets the value of the totalJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalJourneyType }
     *     
     */
    public void setTotalJourney(TotalJourneyType value) {
        this.totalJourney = value;
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
     * {@link FlightType.Flight }
     * 
     * 
     */
    public List<FlightType.Flight> getFlight() {
        if (flight == null) {
            flight = new ArrayList<FlightType.Flight>();
        }
        return this.flight;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentKey" minOccurs="0"/>
     *         &lt;element name="Indicators" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PricingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ConnectionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="E_TicketIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="TicketlessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Status" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival"/>
     *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType"/>
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Equipment" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CabinType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfService" minOccurs="0"/>
     *         &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightDetailType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "segmentKey",
        "indicators",
        "status",
        "departure",
        "arrival",
        "marketingCarrier",
        "operatingCarrier",
        "equipment",
        "cabinType",
        "classOfService",
        "details"
    })
    public static class Flight {

        @XmlElement(name = "SegmentKey", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String segmentKey;
        @XmlElement(name = "Indicators", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FlightType.Flight.Indicators indicators;
        @XmlElement(name = "Status", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FlightType.Flight.Status status;
        @XmlElement(name = "Departure", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected Departure departure;
        @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected FlightArrivalType arrival;
        @XmlElement(name = "MarketingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected MarketingCarrierFlightType marketingCarrier;
        @XmlElement(name = "OperatingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FlightType.Flight.OperatingCarrier operatingCarrier;
        @XmlElement(name = "Equipment", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AircraftSummaryType equipment;
        @XmlElement(name = "CabinType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CabinType cabinType;
        @XmlElement(name = "ClassOfService", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FlightCOSCoreType classOfService;
        @XmlElement(name = "Details", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FlightDetailType details;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the segmentKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentKey() {
            return segmentKey;
        }

        /**
         * Sets the value of the segmentKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentKey(String value) {
            this.segmentKey = value;
        }

        /**
         * Gets the value of the indicators property.
         * 
         * @return
         *     possible object is
         *     {@link FlightType.Flight.Indicators }
         *     
         */
        public FlightType.Flight.Indicators getIndicators() {
            return indicators;
        }

        /**
         * Sets the value of the indicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightType.Flight.Indicators }
         *     
         */
        public void setIndicators(FlightType.Flight.Indicators value) {
            this.indicators = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link FlightType.Flight.Status }
         *     
         */
        public FlightType.Flight.Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightType.Flight.Status }
         *     
         */
        public void setStatus(FlightType.Flight.Status value) {
            this.status = value;
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
         * Gets the value of the operatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link FlightType.Flight.OperatingCarrier }
         *     
         */
        public FlightType.Flight.OperatingCarrier getOperatingCarrier() {
            return operatingCarrier;
        }

        /**
         * Sets the value of the operatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightType.Flight.OperatingCarrier }
         *     
         */
        public void setOperatingCarrier(FlightType.Flight.OperatingCarrier value) {
            this.operatingCarrier = value;
        }

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link AircraftSummaryType }
         *     
         */
        public AircraftSummaryType getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link AircraftSummaryType }
         *     
         */
        public void setEquipment(AircraftSummaryType value) {
            this.equipment = value;
        }

        /**
         * Gets the value of the cabinType property.
         * 
         * @return
         *     possible object is
         *     {@link CabinType }
         *     
         */
        public CabinType getCabinType() {
            return cabinType;
        }

        /**
         * Sets the value of the cabinType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinType }
         *     
         */
        public void setCabinType(CabinType value) {
            this.cabinType = value;
        }

        /**
         * Gets the value of the classOfService property.
         * 
         * @return
         *     possible object is
         *     {@link FlightCOSCoreType }
         *     
         */
        public FlightCOSCoreType getClassOfService() {
            return classOfService;
        }

        /**
         * Sets the value of the classOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightCOSCoreType }
         *     
         */
        public void setClassOfService(FlightCOSCoreType value) {
            this.classOfService = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailType }
         *     
         */
        public FlightDetailType getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailType }
         *     
         */
        public void setDetails(FlightDetailType value) {
            this.details = value;
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
         *       &lt;attribute name="PricingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ConnectionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="E_TicketIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="TicketlessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Indicators {

            @XmlAttribute(name = "PricingIndicator")
            protected Boolean pricingIndicator;
            @XmlAttribute(name = "ConnectionIndicator")
            protected Boolean connectionIndicator;
            @XmlAttribute(name = "E_TicketIndicator")
            protected Boolean eTicketIndicator;
            @XmlAttribute(name = "TicketlessIndicator")
            protected Boolean ticketlessIndicator;

            /**
             * Gets the value of the pricingIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPricingIndicator() {
                return pricingIndicator;
            }

            /**
             * Sets the value of the pricingIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPricingIndicator(Boolean value) {
                this.pricingIndicator = value;
            }

            /**
             * Gets the value of the connectionIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConnectionIndicator() {
                return connectionIndicator;
            }

            /**
             * Sets the value of the connectionIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConnectionIndicator(Boolean value) {
                this.connectionIndicator = value;
            }

            /**
             * Gets the value of the eTicketIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isETicketIndicator() {
                return eTicketIndicator;
            }

            /**
             * Sets the value of the eTicketIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setETicketIndicator(Boolean value) {
                this.eTicketIndicator = value;
            }

            /**
             * Gets the value of the ticketlessIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTicketlessIndicator() {
                return ticketlessIndicator;
            }

            /**
             * Sets the value of the ticketlessIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTicketlessIndicator(Boolean value) {
                this.ticketlessIndicator = value;
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
         *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "statusCode"
        })
        public static class Status {

            @XmlElement(name = "StatusCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected String statusCode;
            @XmlAttribute(name = "ChangeOfGaugeInd")
            protected Boolean changeOfGaugeInd;
            @XmlAttribute(name = "ScheduleChangeInd")
            protected Boolean scheduleChangeInd;

            /**
             * Gets the value of the statusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCode() {
                return statusCode;
            }

            /**
             * Sets the value of the statusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCode(String value) {
                this.statusCode = value;
            }

            /**
             * Gets the value of the changeOfGaugeInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChangeOfGaugeInd() {
                return changeOfGaugeInd;
            }

            /**
             * Sets the value of the changeOfGaugeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChangeOfGaugeInd(Boolean value) {
                this.changeOfGaugeInd = value;
            }

            /**
             * Gets the value of the scheduleChangeInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isScheduleChangeInd() {
                return scheduleChangeInd;
            }

            /**
             * Sets the value of the scheduleChangeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setScheduleChangeInd(Boolean value) {
                this.scheduleChangeInd = value;
            }

        }

    }

}
