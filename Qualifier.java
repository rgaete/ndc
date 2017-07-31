
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggagePricingQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ExistingOrderQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardQualifiers" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ProgramQualifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PromotionQualifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SocialMediaQualifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SpecialFareQualifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SpecialNeedQualifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TripPurposeQualifier" minOccurs="0"/>
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
    "baggagePricingQualifier",
    "existingOrderQualifier",
    "paymentCardQualifiers",
    "programQualifiers",
    "promotionQualifiers",
    "seatQualifier",
    "serviceQualifier",
    "socialMediaQualifiers",
    "specialFareQualifiers",
    "specialNeedQualifiers",
    "tripPurposeQualifier"
})
@XmlRootElement(name = "Qualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Qualifier {

    @XmlElement(name = "BaggagePricingQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BaggagePricingQualifierType baggagePricingQualifier;
    @XmlElement(name = "ExistingOrderQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ExistingOrderQualifier existingOrderQualifier;
    @XmlElement(name = "PaymentCardQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<CardQualifierType> paymentCardQualifiers;
    @XmlElement(name = "ProgramQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ProgramQualifiers programQualifiers;
    @XmlElement(name = "PromotionQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PromotionQualifiers promotionQualifiers;
    @XmlElement(name = "SeatQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatQualifier seatQualifier;
    @XmlElement(name = "ServiceQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceQualifierPriceType serviceQualifier;
    @XmlElement(name = "SocialMediaQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SocialQualiferType socialMediaQualifiers;
    @XmlElement(name = "SpecialFareQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareQualifierType specialFareQualifiers;
    @XmlElement(name = "SpecialNeedQualifiers", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SpecialQualiferType specialNeedQualifiers;
    @XmlElement(name = "TripPurposeQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "string")
    protected TripPurposeListType tripPurposeQualifier;

    /**
     * Gets the value of the baggagePricingQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link BaggagePricingQualifierType }
     *     
     */
    public BaggagePricingQualifierType getBaggagePricingQualifier() {
        return baggagePricingQualifier;
    }

    /**
     * Sets the value of the baggagePricingQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePricingQualifierType }
     *     
     */
    public void setBaggagePricingQualifier(BaggagePricingQualifierType value) {
        this.baggagePricingQualifier = value;
    }

    /**
     * Gets the value of the existingOrderQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingOrderQualifier }
     *     
     */
    public ExistingOrderQualifier getExistingOrderQualifier() {
        return existingOrderQualifier;
    }

    /**
     * Sets the value of the existingOrderQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingOrderQualifier }
     *     
     */
    public void setExistingOrderQualifier(ExistingOrderQualifier value) {
        this.existingOrderQualifier = value;
    }

    /**
     * Contains card type, and Issuer Identification Number. Gets the value of the paymentCardQualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCardQualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCardQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardQualifierType }
     * 
     * 
     */
    public List<CardQualifierType> getPaymentCardQualifiers() {
        if (paymentCardQualifiers == null) {
            paymentCardQualifiers = new ArrayList<CardQualifierType>();
        }
        return this.paymentCardQualifiers;
    }

    /**
     * Gets the value of the programQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramQualifiers }
     *     
     */
    public ProgramQualifiers getProgramQualifiers() {
        return programQualifiers;
    }

    /**
     * Sets the value of the programQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramQualifiers }
     *     
     */
    public void setProgramQualifiers(ProgramQualifiers value) {
        this.programQualifiers = value;
    }

    /**
     * Gets the value of the promotionQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionQualifiers }
     *     
     */
    public PromotionQualifiers getPromotionQualifiers() {
        return promotionQualifiers;
    }

    /**
     * Sets the value of the promotionQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionQualifiers }
     *     
     */
    public void setPromotionQualifiers(PromotionQualifiers value) {
        this.promotionQualifiers = value;
    }

    /**
     * Gets the value of the seatQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link SeatQualifier }
     *     
     */
    public SeatQualifier getSeatQualifier() {
        return seatQualifier;
    }

    /**
     * Sets the value of the seatQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatQualifier }
     *     
     */
    public void setSeatQualifier(SeatQualifier value) {
        this.seatQualifier = value;
    }

    /**
     * Gets the value of the serviceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierPriceType }
     *     
     */
    public ServiceQualifierPriceType getServiceQualifier() {
        return serviceQualifier;
    }

    /**
     * Sets the value of the serviceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierPriceType }
     *     
     */
    public void setServiceQualifier(ServiceQualifierPriceType value) {
        this.serviceQualifier = value;
    }

    /**
     * Gets the value of the socialMediaQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SocialQualiferType }
     *     
     */
    public SocialQualiferType getSocialMediaQualifiers() {
        return socialMediaQualifiers;
    }

    /**
     * Sets the value of the socialMediaQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialQualiferType }
     *     
     */
    public void setSocialMediaQualifiers(SocialQualiferType value) {
        this.socialMediaQualifiers = value;
    }

    /**
     * Contains elements identifying eligibility for special pricing, which may be private or negotiated.
     * 
     * Notes:
     *  1. Supports pricing discounts and/ or other benefits for Travelers affiliated with companies with private fare and/ or negotiated rate contracts.
     * 
     *  2. Private Fares apply to ALL Travelers.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierType }
     *     
     */
    public FareQualifierType getSpecialFareQualifiers() {
        return specialFareQualifiers;
    }

    /**
     * Sets the value of the specialFareQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierType }
     *     
     */
    public void setSpecialFareQualifiers(FareQualifierType value) {
        this.specialFareQualifiers = value;
    }

    /**
     * Gets the value of the specialNeedQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialQualiferType }
     *     
     */
    public SpecialQualiferType getSpecialNeedQualifiers() {
        return specialNeedQualifiers;
    }

    /**
     * Sets the value of the specialNeedQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialQualiferType }
     *     
     */
    public void setSpecialNeedQualifiers(SpecialQualiferType value) {
        this.specialNeedQualifiers = value;
    }

    /**
     * Gets the value of the tripPurposeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link TripPurposeListType }
     *     
     */
    public TripPurposeListType getTripPurposeQualifier() {
        return tripPurposeQualifier;
    }

    /**
     * Sets the value of the tripPurposeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPurposeListType }
     *     
     */
    public void setTripPurposeQualifier(TripPurposeListType value) {
        this.tripPurposeQualifier = value;
    }

}
