
package ndc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * FLIGHT DETAIL definition.
 * 
 * <p>Java class for FlightDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightSegmentType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightDistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightDuration" minOccurs="0"/>
 *         &lt;element name="Stops" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StopLocations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ResDateTime" minOccurs="0"/>
 *         &lt;element name="TourOperatorFlightID" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
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
@XmlType(name = "FlightDetailType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "flightSegmentType",
    "flightDistance",
    "flightDuration",
    "stops",
    "resDateTime",
    "tourOperatorFlightID"
})
public class FlightDetailType {

    @XmlElement(name = "FlightSegmentType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String flightSegmentType;
    @XmlElement(name = "FlightDistance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightDistanceType flightDistance;
    @XmlElement(name = "FlightDuration", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightDurationType flightDuration;
    @XmlElement(name = "Stops", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightDetailType.Stops stops;
    @XmlElement(name = "ResDateTime", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ResDateTime resDateTime;
    @XmlElement(name = "TourOperatorFlightID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String tourOperatorFlightID;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the flightSegmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentType() {
        return flightSegmentType;
    }

    /**
     * Sets the value of the flightSegmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentType(String value) {
        this.flightSegmentType = value;
    }

    /**
     * Gets the value of the flightDistance property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDistanceType }
     *     
     */
    public FlightDistanceType getFlightDistance() {
        return flightDistance;
    }

    /**
     * Sets the value of the flightDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDistanceType }
     *     
     */
    public void setFlightDistance(FlightDistanceType value) {
        this.flightDistance = value;
    }

    /**
     * Gets the value of the flightDuration property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDurationType }
     *     
     */
    public FlightDurationType getFlightDuration() {
        return flightDuration;
    }

    /**
     * Sets the value of the flightDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDurationType }
     *     
     */
    public void setFlightDuration(FlightDurationType value) {
        this.flightDuration = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailType.Stops }
     *     
     */
    public FlightDetailType.Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailType.Stops }
     *     
     */
    public void setStops(FlightDetailType.Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the resDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ResDateTime }
     *     
     */
    public ResDateTime getResDateTime() {
        return resDateTime;
    }

    /**
     * Sets the value of the resDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResDateTime }
     *     
     */
    public void setResDateTime(ResDateTime value) {
        this.resDateTime = value;
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
     *         &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
