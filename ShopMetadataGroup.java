
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Baggage" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Fare" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Flight" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Location" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Offer" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Pricing" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Qualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Seat" minOccurs="0"/>
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
    "baggage",
    "fare",
    "flight",
    "location",
    "offer",
    "pricing",
    "qualifier",
    "seat"
})
@XmlRootElement(name = "ShopMetadataGroup", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class ShopMetadataGroup {

    @XmlElement(name = "Baggage", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Baggage baggage;
    @XmlElement(name = "Fare", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareType fare;
    @XmlElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Flight flight;
    @XmlElement(name = "Location", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Location location;
    @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Offer offer;
    @XmlElement(name = "Pricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Pricing pricing;
    @XmlElement(name = "Qualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Qualifier qualifier;
    @XmlElement(name = "Seat", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Seat seat;

    /**
     * Gets the value of the baggage property.
     * 
     * @return
     *     possible object is
     *     {@link Baggage }
     *     
     */
    public Baggage getBaggage() {
        return baggage;
    }

    /**
     * Sets the value of the baggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baggage }
     *     
     */
    public void setBaggage(Baggage value) {
        this.baggage = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link FareType }
     *     
     */
    public FareType getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareType }
     *     
     */
    public void setFare(FareType value) {
        this.fare = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight(Flight value) {
        this.flight = value;
    }

    /**
     * Location-related Metadata, including Directions.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link Offer }
     *     
     */
    public Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offer }
     *     
     */
    public void setOffer(Offer value) {
        this.offer = value;
    }

    /**
     * Pricing-related Metadata, including Discount.
     * 
     * @return
     *     possible object is
     *     {@link Pricing }
     *     
     */
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pricing }
     *     
     */
    public void setPricing(Pricing value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link Qualifier }
     *     
     */
    public Qualifier getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qualifier }
     *     
     */
    public void setQualifier(Qualifier value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * @return
     *     possible object is
     *     {@link Seat }
     *     
     */
    public Seat getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seat }
     *     
     */
    public void setSeat(Seat value) {
        this.seat = value;
    }

}
