
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
@XmlRootElement(name = "Preference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Preference {

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
