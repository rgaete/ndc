
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TotalJourney" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightReferences" minOccurs="0"/>
 *         &lt;element name="CheckedBag" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                   &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CarryOnBag" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                   &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
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
    "totalJourney",
    "flightReferences",
    "checkedBag",
    "carryOnBag"
})
@XmlRootElement(name = "OriginDestination", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class OriginDestination
    extends OriginDestinationType
{

    @XmlElement(name = "TotalJourney", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TotalJourneyType totalJourney;
    @XmlElement(name = "FlightReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FlightReferences flightReferences;
    @XmlElement(name = "CheckedBag", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OriginDestination.CheckedBag checkedBag;
    @XmlElement(name = "CarryOnBag", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OriginDestination.CarryOnBag carryOnBag;

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
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

    /**
     * Gets the value of the checkedBag property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestination.CheckedBag }
     *     
     */
    public OriginDestination.CheckedBag getCheckedBag() {
        return checkedBag;
    }

    /**
     * Sets the value of the checkedBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestination.CheckedBag }
     *     
     */
    public void setCheckedBag(OriginDestination.CheckedBag value) {
        this.checkedBag = value;
    }

    /**
     * Gets the value of the carryOnBag property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestination.CarryOnBag }
     *     
     */
    public OriginDestination.CarryOnBag getCarryOnBag() {
        return carryOnBag;
    }

    /**
     * Sets the value of the carryOnBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestination.CarryOnBag }
     *     
     */
    public void setCarryOnBag(OriginDestination.CarryOnBag value) {
        this.carryOnBag = value;
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
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
     *         &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
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
        "baggageDeterminingCarrier",
        "bdcAnalysisResult"
    })
    public static class CarryOnBag {

        @XmlElement(name = "BaggageDeterminingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlElement(name = "BDC_AnalysisResult", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String bdcAnalysisResult;

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the bdcAnalysisResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBDCAnalysisResult() {
            return bdcAnalysisResult;
        }

        /**
         * Sets the value of the bdcAnalysisResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBDCAnalysisResult(String value) {
            this.bdcAnalysisResult = value;
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
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
     *         &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
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
        "baggageDeterminingCarrier",
        "bdcAnalysisResult"
    })
    public static class CheckedBag {

        @XmlElement(name = "BaggageDeterminingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlElement(name = "BDC_AnalysisResult", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String bdcAnalysisResult;

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the bdcAnalysisResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBDCAnalysisResult() {
            return bdcAnalysisResult;
        }

        /**
         * Sets the value of the bdcAnalysisResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBDCAnalysisResult(String value) {
            this.bdcAnalysisResult = value;
        }

    }

}
