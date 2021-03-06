
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * NDC Capability Model: FARE - FARE DETAIL
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Fare Component information
 * • Fare Rules information
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Code Indicator to represent pricing method (IATA PADIS Code List for data element 5387 - Price Type Qualifier)
 * • Price Class association
 * • Associated Flight Mileage
 * • Fare Remarks
 * • Tour Code support (A special code arranged between the travel agency and the sales representative for a particular airline. When the agent enters the tour code into the reservation and ticketing system, it will input certain information onto the ticket. For example, agent commisions, specific fare fules that supercede the published fare rules etc.)
 * 
 *  ============
 * Metadata
 *  ============
 * • FareMetadata
 * 
 * <p>Java class for FareDetailType_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailType_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareIndicatorCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>IATA_CodeType">
 *                 &lt;attribute name="FiledFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerRefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREFS">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}FarePriceDetailType"/>
 *         &lt;element name="FareComponent" type="{http://www.iata.org/IATA/EDIST/2017.1}FareComponentType_2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightMileage" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TourCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailType_2", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "fareIndicatorCode",
    "passengerRefs",
    "price",
    "fareComponent",
    "flightMileage",
    "tourCode",
    "remarks"
})
public class FareDetailType2 {

    @XmlElement(name = "FareIndicatorCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareDetailType2 .FareIndicatorCode fareIndicatorCode;
    @XmlElement(name = "PassengerRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareDetailType2 .PassengerRefs passengerRefs;
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected FarePriceDetailType price;
    @XmlElement(name = "FareComponent", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<FareComponentType2> fareComponent;
    @XmlElement(name = "FlightMileage", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightMileageType flightMileage;
    @XmlElement(name = "TourCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String tourCode;
    @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected RemarkType remarks;

    /**
     * Gets the value of the fareIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType2 .FareIndicatorCode }
     *     
     */
    public FareDetailType2 .FareIndicatorCode getFareIndicatorCode() {
        return fareIndicatorCode;
    }

    /**
     * Sets the value of the fareIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType2 .FareIndicatorCode }
     *     
     */
    public void setFareIndicatorCode(FareDetailType2 .FareIndicatorCode value) {
        this.fareIndicatorCode = value;
    }

    /**
     * Gets the value of the passengerRefs property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType2 .PassengerRefs }
     *     
     */
    public FareDetailType2 .PassengerRefs getPassengerRefs() {
        return passengerRefs;
    }

    /**
     * Sets the value of the passengerRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType2 .PassengerRefs }
     *     
     */
    public void setPassengerRefs(FareDetailType2 .PassengerRefs value) {
        this.passengerRefs = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link FarePriceDetailType }
     *     
     */
    public FarePriceDetailType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePriceDetailType }
     *     
     */
    public void setPrice(FarePriceDetailType value) {
        this.price = value;
    }

    /**
     * Gets the value of the fareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType2 }
     * 
     * 
     */
    public List<FareComponentType2> getFareComponent() {
        if (fareComponent == null) {
            fareComponent = new ArrayList<FareComponentType2>();
        }
        return this.fareComponent;
    }

    /**
     * Gets the value of the flightMileage property.
     * 
     * @return
     *     possible object is
     *     {@link FlightMileageType }
     *     
     */
    public FlightMileageType getFlightMileage() {
        return flightMileage;
    }

    /**
     * Sets the value of the flightMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMileageType }
     *     
     */
    public void setFlightMileage(FlightMileageType value) {
        this.flightMileage = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>IATA_CodeType">
     *       &lt;attribute name="FiledFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    public static class FareIndicatorCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FiledFareInd")
        protected Boolean filedFareInd;

        /**
         * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, 101.EQP, or 101.EQP.X.
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
         * Gets the value of the filedFareInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFiledFareInd() {
            return filedFareInd;
        }

        /**
         * Sets the value of the filedFareInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFiledFareInd(Boolean value) {
            this.filedFareInd = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREFS">
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
    public static class PassengerRefs {

        @XmlValue
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getValue() {
            if (value == null) {
                value = new ArrayList<Object>();
            }
            return this.value;
        }

    }

}
