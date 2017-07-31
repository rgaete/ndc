
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Associations.
 * 
 * <p>Java class for ServiceAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Passenger" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AllPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReferences"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Flight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;choice maxOccurs="2">
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationReferences"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
 *                   &lt;/choice>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Offer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferReferences"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherAssociations" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceOtherAssocType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssocType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "passenger",
    "flight",
    "offer",
    "otherAssociations",
    "seatReference"
})
@XmlSeeAlso({
    ndc.ServiceCoreType.Associations.class
})
public class ServiceAssocType {

    @XmlElement(name = "Passenger", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceAssocType.Passenger passenger;
    @XmlElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceAssocType.Flight flight;
    @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceAssocType.Offer offer;
    @XmlElement(name = "OtherAssociations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceOtherAssocType otherAssociations;
    @XmlElement(name = "SeatReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object seatReference;

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Passenger }
     *     
     */
    public ServiceAssocType.Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Passenger }
     *     
     */
    public void setPassenger(ServiceAssocType.Passenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Flight }
     *     
     */
    public ServiceAssocType.Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Flight }
     *     
     */
    public void setFlight(ServiceAssocType.Flight value) {
        this.flight = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Offer }
     *     
     */
    public ServiceAssocType.Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Offer }
     *     
     */
    public void setOffer(ServiceAssocType.Offer value) {
        this.offer = value;
    }

    /**
     * Gets the value of the otherAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOtherAssocType }
     *     
     */
    public ServiceOtherAssocType getOtherAssociations() {
        return otherAssociations;
    }

    /**
     * Sets the value of the otherAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOtherAssocType }
     *     
     */
    public void setOtherAssociations(ServiceOtherAssocType value) {
        this.otherAssociations = value;
    }

    /**
     * Gets the value of the seatReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSeatReference() {
        return seatReference;
    }

    /**
     * Sets the value of the seatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSeatReference(Object value) {
        this.seatReference = value;
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
     *         &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;choice maxOccurs="2">
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationReferences"/>
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
     *         &lt;/choice>
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
        "allFlightInd",
        "allOriginDestinationInd",
        "allSegmentInd",
        "originDestinationReferencesOrSegmentReferences"
    })
    public static class Flight {

        @XmlElement(name = "AllFlightInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Boolean allFlightInd;
        @XmlElement(name = "AllOriginDestinationInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Boolean allOriginDestinationInd;
        @XmlElement(name = "AllSegmentInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Boolean allSegmentInd;
        @XmlElementRefs({
            @XmlElementRef(name = "OriginDestinationReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = SegmentReferences.class, required = false)
        })
        protected List<Object> originDestinationReferencesOrSegmentReferences;

        /**
         * Gets the value of the allFlightInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllFlightInd() {
            return allFlightInd;
        }

        /**
         * Sets the value of the allFlightInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllFlightInd(Boolean value) {
            this.allFlightInd = value;
        }

        /**
         * Gets the value of the allOriginDestinationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllOriginDestinationInd() {
            return allOriginDestinationInd;
        }

        /**
         * Sets the value of the allOriginDestinationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllOriginDestinationInd(Boolean value) {
            this.allOriginDestinationInd = value;
        }

        /**
         * Gets the value of the allSegmentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllSegmentInd() {
            return allSegmentInd;
        }

        /**
         * Sets the value of the allSegmentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllSegmentInd(Boolean value) {
            this.allSegmentInd = value;
        }

        /**
         * Gets the value of the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationReferencesOrSegmentReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
         * {@link SegmentReferences }
         * 
         * 
         */
        public List<Object> getOriginDestinationReferencesOrSegmentReferences() {
            if (originDestinationReferencesOrSegmentReferences == null) {
                originDestinationReferencesOrSegmentReferences = new ArrayList<Object>();
            }
            return this.originDestinationReferencesOrSegmentReferences;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferReferences"/>
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
        "offerReferences"
    })
    public static class Offer {

        @XmlList
        @XmlElement(name = "OfferReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> offerReferences;

        /**
         * Gets the value of the offerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getOfferReferences() {
            if (offerReferences == null) {
                offerReferences = new ArrayList<Object>();
            }
            return this.offerReferences;
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
     *         &lt;element name="AllPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReferences"/>
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
        "allPassengerInd",
        "passengerReferences"
    })
    public static class Passenger {

        @XmlElement(name = "AllPassengerInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Boolean allPassengerInd;
        @XmlList
        @XmlElement(name = "PassengerReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> passengerReferences;

        /**
         * Gets the value of the allPassengerInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllPassengerInd() {
            return allPassengerInd;
        }

        /**
         * Sets the value of the allPassengerInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllPassengerInd(Boolean value) {
            this.allPassengerInd = value;
        }

        /**
         * Association to multiple Traveler instance(s). Example: Traveler1 Traveler2
         * 
         * Note: May be Recognized or Anonymous Traveler (by PTC) instance(s).Gets the value of the passengerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getPassengerReferences() {
            if (passengerReferences == null) {
                passengerReferences = new ArrayList<Object>();
            }
            return this.passengerReferences;
        }

    }

}