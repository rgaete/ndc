
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage Offer Association definition.
 * 
 * <p>Java class for BagOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagOfferAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AssociatedPassenger"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ApplicableFlight"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferDetailAssociation" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BagDetailAssociation" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AssociatedService" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OtherAssociation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagOfferAssocType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "associatedPassenger",
    "applicableFlight",
    "offerDetailAssociation",
    "bagDetailAssociation",
    "associatedService",
    "otherAssociation"
})
public class BagOfferAssocType {

    @XmlElement(name = "AssociatedPassenger", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected PassengerInfoAssocType associatedPassenger;
    @XmlElement(name = "ApplicableFlight", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ApplicableFlight applicableFlight;
    @XmlElement(name = "OfferDetailAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferDetailInfoAssocType offerDetailAssociation;
    @XmlElement(name = "BagDetailAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagDetailAssociation bagDetailAssociation;
    @XmlElement(name = "AssociatedService", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceInfoAssocType associatedService;
    @XmlElement(name = "OtherAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OtherOfferAssocType otherAssociation;

    /**
     * Gets the value of the associatedPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public PassengerInfoAssocType getAssociatedPassenger() {
        return associatedPassenger;
    }

    /**
     * Sets the value of the associatedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public void setAssociatedPassenger(PassengerInfoAssocType value) {
        this.associatedPassenger = value;
    }

    /**
     * Gets the value of the applicableFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableFlight }
     *     
     */
    public ApplicableFlight getApplicableFlight() {
        return applicableFlight;
    }

    /**
     * Sets the value of the applicableFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableFlight }
     *     
     */
    public void setApplicableFlight(ApplicableFlight value) {
        this.applicableFlight = value;
    }

    /**
     * Gets the value of the offerDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetailAssociation() {
        return offerDetailAssociation;
    }

    /**
     * Sets the value of the offerDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetailAssociation(OfferDetailInfoAssocType value) {
        this.offerDetailAssociation = value;
    }

    /**
     * Gets the value of the bagDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssociation }
     *     
     */
    public BagDetailAssociation getBagDetailAssociation() {
        return bagDetailAssociation;
    }

    /**
     * Sets the value of the bagDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssociation }
     *     
     */
    public void setBagDetailAssociation(BagDetailAssociation value) {
        this.bagDetailAssociation = value;
    }

    /**
     * Gets the value of the associatedService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getAssociatedService() {
        return associatedService;
    }

    /**
     * Sets the value of the associatedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setAssociatedService(ServiceInfoAssocType value) {
        this.associatedService = value;
    }

    /**
     * Gets the value of the otherAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public OtherOfferAssocType getOtherAssociation() {
        return otherAssociation;
    }

    /**
     * Sets the value of the otherAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public void setOtherAssociation(OtherOfferAssocType value) {
        this.otherAssociation = value;
    }

}
