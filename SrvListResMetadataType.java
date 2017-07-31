
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Service List Response Metadata definition.
 * 
 * <p>Java class for SrvListResMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SrvListResMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shopping" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShopMetadataGroup"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Passenger" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerMetadata"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Other" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherMetadata" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CityMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CodesetMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ContactMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EquivalentID_Metadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LanguageMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentFormMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RuleMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StateProvMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ZoneMetadatas"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvListResMetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "shopping",
    "passenger",
    "other"
})
@XmlSeeAlso({
    ndc.ServiceListRS.Metadata.class
})
public class SrvListResMetadataType {

    @XmlElement(name = "Shopping", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SrvListResMetadataType.Shopping shopping;
    @XmlElement(name = "Passenger", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SrvListResMetadataType.Passenger passenger;
    @XmlElement(name = "Other", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SrvListResMetadataType.Other other;

    /**
     * Gets the value of the shopping property.
     * 
     * @return
     *     possible object is
     *     {@link SrvListResMetadataType.Shopping }
     *     
     */
    public SrvListResMetadataType.Shopping getShopping() {
        return shopping;
    }

    /**
     * Sets the value of the shopping property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrvListResMetadataType.Shopping }
     *     
     */
    public void setShopping(SrvListResMetadataType.Shopping value) {
        this.shopping = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link SrvListResMetadataType.Passenger }
     *     
     */
    public SrvListResMetadataType.Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrvListResMetadataType.Passenger }
     *     
     */
    public void setPassenger(SrvListResMetadataType.Passenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link SrvListResMetadataType.Other }
     *     
     */
    public SrvListResMetadataType.Other getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrvListResMetadataType.Other }
     *     
     */
    public void setOther(SrvListResMetadataType.Other value) {
        this.other = value;
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
     *         &lt;element name="OtherMetadata" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CityMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CodesetMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ContactMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EquivalentID_Metadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LanguageMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentFormMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RuleMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StateProvMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ZoneMetadatas"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "otherMetadata"
    })
    public static class Other {

        @XmlElement(name = "OtherMetadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<SrvListResMetadataType.Other.OtherMetadata> otherMetadata;

        /**
         * Gets the value of the otherMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SrvListResMetadataType.Other.OtherMetadata }
         * 
         * 
         */
        public List<SrvListResMetadataType.Other.OtherMetadata> getOtherMetadata() {
            if (otherMetadata == null) {
                otherMetadata = new ArrayList<SrvListResMetadataType.Other.OtherMetadata>();
            }
            return this.otherMetadata;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CityMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CodesetMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ContactMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EquivalentID_Metadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LanguageMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentFormMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RuleMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StateProvMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ZoneMetadatas"/>
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
            "addressMetadatas",
            "aircraftMetadatas",
            "airportMetadatas",
            "cityMetadatas",
            "codesetMetadatas",
            "contactMetadatas",
            "countryMetadatas",
            "currencyMetadatas",
            "descriptionMetadatas",
            "equivalentIDMetadatas",
            "languageMetadatas",
            "paymentCardMetadatas",
            "paymentFormMetadatas",
            "priceMetadatas",
            "ruleMetadatas",
            "stateProvMetadatas",
            "zoneMetadatas"
        })
        public static class OtherMetadata {

            @XmlElement(name = "AddressMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AddressMetadatas addressMetadatas;
            @XmlElement(name = "AircraftMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AircraftMetadatas aircraftMetadatas;
            @XmlElement(name = "AirportMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AirportMetadatas airportMetadatas;
            @XmlElement(name = "CityMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CityMetadatas cityMetadatas;
            @XmlElement(name = "CodesetMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CodesetMetadatas codesetMetadatas;
            @XmlElement(name = "ContactMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected ContactMetadatas contactMetadatas;
            @XmlElement(name = "CountryMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CountryMetadatas countryMetadatas;
            @XmlElement(name = "CurrencyMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CurrencyMetadatas currencyMetadatas;
            @XmlElement(name = "DescriptionMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected DescriptionMetadatas descriptionMetadatas;
            @XmlElement(name = "EquivalentID_Metadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected EquivalentIDMetadatas equivalentIDMetadatas;
            @XmlElement(name = "LanguageMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected LanguageMetadatas languageMetadatas;
            @XmlElement(name = "PaymentCardMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected PaymentCardMetadatas paymentCardMetadatas;
            @XmlElement(name = "PaymentFormMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected PaymentFormMetadatas paymentFormMetadatas;
            @XmlElement(name = "PriceMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected PriceMetadatas priceMetadatas;
            @XmlElement(name = "RuleMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected RuleMetadatas ruleMetadatas;
            @XmlElement(name = "StateProvMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected StateProvMetadatas stateProvMetadatas;
            @XmlElement(name = "ZoneMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected ZoneMetadatas zoneMetadatas;

            /**
             * Gets the value of the addressMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link AddressMetadatas }
             *     
             */
            public AddressMetadatas getAddressMetadatas() {
                return addressMetadatas;
            }

            /**
             * Sets the value of the addressMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressMetadatas }
             *     
             */
            public void setAddressMetadatas(AddressMetadatas value) {
                this.addressMetadatas = value;
            }

            /**
             * Gets the value of the aircraftMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link AircraftMetadatas }
             *     
             */
            public AircraftMetadatas getAircraftMetadatas() {
                return aircraftMetadatas;
            }

            /**
             * Sets the value of the aircraftMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link AircraftMetadatas }
             *     
             */
            public void setAircraftMetadatas(AircraftMetadatas value) {
                this.aircraftMetadatas = value;
            }

            /**
             * Gets the value of the airportMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link AirportMetadatas }
             *     
             */
            public AirportMetadatas getAirportMetadatas() {
                return airportMetadatas;
            }

            /**
             * Sets the value of the airportMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirportMetadatas }
             *     
             */
            public void setAirportMetadatas(AirportMetadatas value) {
                this.airportMetadatas = value;
            }

            /**
             * Gets the value of the cityMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CityMetadatas }
             *     
             */
            public CityMetadatas getCityMetadatas() {
                return cityMetadatas;
            }

            /**
             * Sets the value of the cityMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CityMetadatas }
             *     
             */
            public void setCityMetadatas(CityMetadatas value) {
                this.cityMetadatas = value;
            }

            /**
             * Gets the value of the codesetMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CodesetMetadatas }
             *     
             */
            public CodesetMetadatas getCodesetMetadatas() {
                return codesetMetadatas;
            }

            /**
             * Sets the value of the codesetMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodesetMetadatas }
             *     
             */
            public void setCodesetMetadatas(CodesetMetadatas value) {
                this.codesetMetadatas = value;
            }

            /**
             * Gets the value of the contactMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link ContactMetadatas }
             *     
             */
            public ContactMetadatas getContactMetadatas() {
                return contactMetadatas;
            }

            /**
             * Sets the value of the contactMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactMetadatas }
             *     
             */
            public void setContactMetadatas(ContactMetadatas value) {
                this.contactMetadatas = value;
            }

            /**
             * Gets the value of the countryMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CountryMetadatas }
             *     
             */
            public CountryMetadatas getCountryMetadatas() {
                return countryMetadatas;
            }

            /**
             * Sets the value of the countryMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CountryMetadatas }
             *     
             */
            public void setCountryMetadatas(CountryMetadatas value) {
                this.countryMetadatas = value;
            }

            /**
             * Gets the value of the currencyMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyMetadatas }
             *     
             */
            public CurrencyMetadatas getCurrencyMetadatas() {
                return currencyMetadatas;
            }

            /**
             * Sets the value of the currencyMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyMetadatas }
             *     
             */
            public void setCurrencyMetadatas(CurrencyMetadatas value) {
                this.currencyMetadatas = value;
            }

            /**
             * Gets the value of the descriptionMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link DescriptionMetadatas }
             *     
             */
            public DescriptionMetadatas getDescriptionMetadatas() {
                return descriptionMetadatas;
            }

            /**
             * Sets the value of the descriptionMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link DescriptionMetadatas }
             *     
             */
            public void setDescriptionMetadatas(DescriptionMetadatas value) {
                this.descriptionMetadatas = value;
            }

            /**
             * Gets the value of the equivalentIDMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link EquivalentIDMetadatas }
             *     
             */
            public EquivalentIDMetadatas getEquivalentIDMetadatas() {
                return equivalentIDMetadatas;
            }

            /**
             * Sets the value of the equivalentIDMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquivalentIDMetadatas }
             *     
             */
            public void setEquivalentIDMetadatas(EquivalentIDMetadatas value) {
                this.equivalentIDMetadatas = value;
            }

            /**
             * Gets the value of the languageMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link LanguageMetadatas }
             *     
             */
            public LanguageMetadatas getLanguageMetadatas() {
                return languageMetadatas;
            }

            /**
             * Sets the value of the languageMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link LanguageMetadatas }
             *     
             */
            public void setLanguageMetadatas(LanguageMetadatas value) {
                this.languageMetadatas = value;
            }

            /**
             * Gets the value of the paymentCardMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardMetadatas }
             *     
             */
            public PaymentCardMetadatas getPaymentCardMetadatas() {
                return paymentCardMetadatas;
            }

            /**
             * Sets the value of the paymentCardMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardMetadatas }
             *     
             */
            public void setPaymentCardMetadatas(PaymentCardMetadatas value) {
                this.paymentCardMetadatas = value;
            }

            /**
             * Gets the value of the paymentFormMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentFormMetadatas }
             *     
             */
            public PaymentFormMetadatas getPaymentFormMetadatas() {
                return paymentFormMetadatas;
            }

            /**
             * Sets the value of the paymentFormMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentFormMetadatas }
             *     
             */
            public void setPaymentFormMetadatas(PaymentFormMetadatas value) {
                this.paymentFormMetadatas = value;
            }

            /**
             * Gets the value of the priceMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link PriceMetadatas }
             *     
             */
            public PriceMetadatas getPriceMetadatas() {
                return priceMetadatas;
            }

            /**
             * Sets the value of the priceMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceMetadatas }
             *     
             */
            public void setPriceMetadatas(PriceMetadatas value) {
                this.priceMetadatas = value;
            }

            /**
             * Gets the value of the ruleMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link RuleMetadatas }
             *     
             */
            public RuleMetadatas getRuleMetadatas() {
                return ruleMetadatas;
            }

            /**
             * Sets the value of the ruleMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link RuleMetadatas }
             *     
             */
            public void setRuleMetadatas(RuleMetadatas value) {
                this.ruleMetadatas = value;
            }

            /**
             * Gets the value of the stateProvMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link StateProvMetadatas }
             *     
             */
            public StateProvMetadatas getStateProvMetadatas() {
                return stateProvMetadatas;
            }

            /**
             * Sets the value of the stateProvMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link StateProvMetadatas }
             *     
             */
            public void setStateProvMetadatas(StateProvMetadatas value) {
                this.stateProvMetadatas = value;
            }

            /**
             * Gets the value of the zoneMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link ZoneMetadatas }
             *     
             */
            public ZoneMetadatas getZoneMetadatas() {
                return zoneMetadatas;
            }

            /**
             * Sets the value of the zoneMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZoneMetadatas }
             *     
             */
            public void setZoneMetadatas(ZoneMetadatas value) {
                this.zoneMetadatas = value;
            }

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerMetadata"/>
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
        "passengerMetadata"
    })
    public static class Passenger {

        @XmlElement(name = "PassengerMetadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected PassengerMetadataType passengerMetadata;

        /**
         * Gets the value of the passengerMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerMetadataType }
         *     
         */
        public PassengerMetadataType getPassengerMetadata() {
            return passengerMetadata;
        }

        /**
         * Sets the value of the passengerMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerMetadataType }
         *     
         */
        public void setPassengerMetadata(PassengerMetadataType value) {
            this.passengerMetadata = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ShopMetadataGroup"/>
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
        "shopMetadataGroup"
    })
    public static class Shopping {

        @XmlElement(name = "ShopMetadataGroup", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected ShopMetadataGroup shopMetadataGroup;

        /**
         * Gets the value of the shopMetadataGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ShopMetadataGroup }
         *     
         */
        public ShopMetadataGroup getShopMetadataGroup() {
            return shopMetadataGroup;
        }

        /**
         * Sets the value of the shopMetadataGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShopMetadataGroup }
         *     
         */
        public void setShopMetadataGroup(ShopMetadataGroup value) {
            this.shopMetadataGroup = value;
        }

    }

}
