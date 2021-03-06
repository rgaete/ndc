
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OfferItemType_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemType_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalPriceDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotalAmount">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareFiledIn" minOccurs="0"/>
 *                   &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST/2017.1}DiscountType" minOccurs="0"/>
 *                   &lt;element name="Surcharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemption" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardPriceUnitType" minOccurs="0"/>
 *                     &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceType" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;element name="Fees" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS"/>
 *                   &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="FlightRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS"/>
 *                     &lt;element name="ServiceDefinitionRef">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
 *                             &lt;attribute name="SegmentRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/EDIST/2017.1}FareDetailType_2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OfferItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ModificationProhibitedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemType_2", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "totalPriceDetail",
    "service",
    "fareDetail"
})
public class OfferItemType2 {

    @XmlElement(name = "TotalPriceDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OfferItemType2 .TotalPriceDetail totalPriceDetail;
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<OfferItemType2 .Service> service;
    @XmlElement(name = "FareDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<FareDetailType2> fareDetail;
    @XmlAttribute(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String offerItemID;
    @XmlAttribute(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlAttribute(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;

    /**
     * Gets the value of the totalPriceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemType2 .TotalPriceDetail }
     *     
     */
    public OfferItemType2 .TotalPriceDetail getTotalPriceDetail() {
        return totalPriceDetail;
    }

    /**
     * Sets the value of the totalPriceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemType2 .TotalPriceDetail }
     *     
     */
    public void setTotalPriceDetail(OfferItemType2 .TotalPriceDetail value) {
        this.totalPriceDetail = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemType2 .Service }
     * 
     * 
     */
    public List<OfferItemType2 .Service> getService() {
        if (service == null) {
            service = new ArrayList<OfferItemType2 .Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType2 }
     * 
     * 
     */
    public List<FareDetailType2> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType2>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
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
     *         &lt;element name="PassengerRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS"/>
     *         &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="FlightRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS"/>
     *           &lt;element name="ServiceDefinitionRef">
     *             &lt;complexType>
     *               &lt;simpleContent>
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
     *                   &lt;attribute name="SegmentRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
     *                 &lt;/extension>
     *               &lt;/simpleContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passengerRefs",
        "serviceRef",
        "flightRefs",
        "serviceDefinitionRef"
    })
    public static class Service {

        @XmlList
        @XmlElement(name = "PassengerRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> passengerRefs;
        @XmlElement(name = "ServiceRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object serviceRef;
        @XmlList
        @XmlElement(name = "FlightRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> flightRefs;
        @XmlElement(name = "ServiceDefinitionRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OfferItemType2 .Service.ServiceDefinitionRef serviceDefinitionRef;
        @XmlAttribute(name = "ServiceID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String serviceID;

        /**
         * Gets the value of the passengerRefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerRefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getPassengerRefs() {
            if (passengerRefs == null) {
                passengerRefs = new ArrayList<Object>();
            }
            return this.passengerRefs;
        }

        /**
         * Gets the value of the serviceRef property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getServiceRef() {
            return serviceRef;
        }

        /**
         * Sets the value of the serviceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setServiceRef(Object value) {
            this.serviceRef = value;
        }

        /**
         * Gets the value of the flightRefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getFlightRefs() {
            if (flightRefs == null) {
                flightRefs = new ArrayList<Object>();
            }
            return this.flightRefs;
        }

        /**
         * Gets the value of the serviceDefinitionRef property.
         * 
         * @return
         *     possible object is
         *     {@link OfferItemType2 .Service.ServiceDefinitionRef }
         *     
         */
        public OfferItemType2 .Service.ServiceDefinitionRef getServiceDefinitionRef() {
            return serviceDefinitionRef;
        }

        /**
         * Sets the value of the serviceDefinitionRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferItemType2 .Service.ServiceDefinitionRef }
         *     
         */
        public void setServiceDefinitionRef(OfferItemType2 .Service.ServiceDefinitionRef value) {
            this.serviceDefinitionRef = value;
        }

        /**
         * Gets the value of the serviceID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceID() {
            return serviceID;
        }

        /**
         * Sets the value of the serviceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceID(String value) {
            this.serviceID = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
         *       &lt;attribute name="SegmentRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
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
        public static class ServiceDefinitionRef {

            @XmlValue
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object value;
            @XmlAttribute(name = "SegmentRefs")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> segmentRefs;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setValue(Object value) {
                this.value = value;
            }

            /**
             * Gets the value of the segmentRefs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentRefs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSegmentRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getSegmentRefs() {
                if (segmentRefs == null) {
                    segmentRefs = new ArrayList<Object>();
                }
                return this.segmentRefs;
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
     *         &lt;element name="TotalAmount">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareFiledIn" minOccurs="0"/>
     *         &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST/2017.1}DiscountType" minOccurs="0"/>
     *         &lt;element name="Surcharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemption" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardPriceUnitType" minOccurs="0"/>
     *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceType" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="Fees" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
     *               &lt;/extension>
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
        "totalAmount",
        "baseAmount",
        "fareFiledIn",
        "discount",
        "surcharges",
        "taxes",
        "taxExemption",
        "awardPricing",
        "combinationPricing",
        "fees"
    })
    public static class TotalPriceDetail {

        @XmlElement(name = "TotalAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected OfferItemType2 .TotalPriceDetail.TotalAmount totalAmount;
        @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CurrencyAmountOptType baseAmount;
        @XmlElement(name = "FareFiledIn", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FareFilingType fareFiledIn;
        @XmlElement(name = "Discount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DiscountType discount;
        @XmlElement(name = "Surcharges", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OfferItemType2 .TotalPriceDetail.Surcharges surcharges;
        @XmlElement(name = "Taxes", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TaxDetailType taxes;
        @XmlElement(name = "TaxExemption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TaxExemptionType taxExemption;
        @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "Fees", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OfferItemType2 .TotalPriceDetail.Fees fees;

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link OfferItemType2 .TotalPriceDetail.TotalAmount }
         *     
         */
        public OfferItemType2 .TotalPriceDetail.TotalAmount getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferItemType2 .TotalPriceDetail.TotalAmount }
         *     
         */
        public void setTotalAmount(OfferItemType2 .TotalPriceDetail.TotalAmount value) {
            this.totalAmount = value;
        }

        /**
         * Gets the value of the baseAmount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getBaseAmount() {
            return baseAmount;
        }

        /**
         * Sets the value of the baseAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setBaseAmount(CurrencyAmountOptType value) {
            this.baseAmount = value;
        }

        /**
         * Gets the value of the fareFiledIn property.
         * 
         * @return
         *     possible object is
         *     {@link FareFilingType }
         *     
         */
        public FareFilingType getFareFiledIn() {
            return fareFiledIn;
        }

        /**
         * Sets the value of the fareFiledIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFilingType }
         *     
         */
        public void setFareFiledIn(FareFilingType value) {
            this.fareFiledIn = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountType }
         *     
         */
        public DiscountType getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountType }
         *     
         */
        public void setDiscount(DiscountType value) {
            this.discount = value;
        }

        /**
         * Gets the value of the surcharges property.
         * 
         * @return
         *     possible object is
         *     {@link OfferItemType2 .TotalPriceDetail.Surcharges }
         *     
         */
        public OfferItemType2 .TotalPriceDetail.Surcharges getSurcharges() {
            return surcharges;
        }

        /**
         * Sets the value of the surcharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferItemType2 .TotalPriceDetail.Surcharges }
         *     
         */
        public void setSurcharges(OfferItemType2 .TotalPriceDetail.Surcharges value) {
            this.surcharges = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link TaxDetailType }
         *     
         */
        public TaxDetailType getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxDetailType }
         *     
         */
        public void setTaxes(TaxDetailType value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the taxExemption property.
         * 
         * @return
         *     possible object is
         *     {@link TaxExemptionType }
         *     
         */
        public TaxExemptionType getTaxExemption() {
            return taxExemption;
        }

        /**
         * Sets the value of the taxExemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxExemptionType }
         *     
         */
        public void setTaxExemption(TaxExemptionType value) {
            this.taxExemption = value;
        }

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType }
         *     
         */
        public CombinationPriceType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType }
         *     
         */
        public void setCombinationPricing(CombinationPriceType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the fees property.
         * 
         * @return
         *     possible object is
         *     {@link OfferItemType2 .TotalPriceDetail.Fees }
         *     
         */
        public OfferItemType2 .TotalPriceDetail.Fees getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferItemType2 .TotalPriceDetail.Fees }
         *     
         */
        public void setFees(OfferItemType2 .TotalPriceDetail.Fees value) {
            this.fees = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fees
            extends FeeSurchargeType
        {


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
         *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
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
            "surcharge"
        })
        public static class Surcharges {

            @XmlElement(name = "Surcharge", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected List<FeeSurchargeType> surcharge;

            /**
             * Gets the value of the surcharge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the surcharge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSurcharge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeSurchargeType }
             * 
             * 
             */
            public List<FeeSurchargeType> getSurcharge() {
                if (surcharge == null) {
                    surcharge = new ArrayList<FeeSurchargeType>();
                }
                return this.surcharge;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
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
            "awardPricing",
            "combinationPricing",
            "detailCurrencyPrice",
            "encodedCurrencyPrice",
            "simpleCurrencyPrice"
        })
        public static class TotalAmount {

            @XmlElement(name = "AwardPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AwardPriceUnitType awardPricing;
            @XmlElement(name = "CombinationPricing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CombinationPriceType combinationPricing;
            @XmlElement(name = "DetailCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected DetailCurrencyPriceType detailCurrencyPrice;
            @XmlElement(name = "EncodedCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected EncodedPriceType encodedCurrencyPrice;
            @XmlElement(name = "SimpleCurrencyPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected SimpleCurrencyPriceType simpleCurrencyPrice;

            /**
             * Gets the value of the awardPricing property.
             * 
             * @return
             *     possible object is
             *     {@link AwardPriceUnitType }
             *     
             */
            public AwardPriceUnitType getAwardPricing() {
                return awardPricing;
            }

            /**
             * Sets the value of the awardPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link AwardPriceUnitType }
             *     
             */
            public void setAwardPricing(AwardPriceUnitType value) {
                this.awardPricing = value;
            }

            /**
             * Gets the value of the combinationPricing property.
             * 
             * @return
             *     possible object is
             *     {@link CombinationPriceType }
             *     
             */
            public CombinationPriceType getCombinationPricing() {
                return combinationPricing;
            }

            /**
             * Sets the value of the combinationPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link CombinationPriceType }
             *     
             */
            public void setCombinationPricing(CombinationPriceType value) {
                this.combinationPricing = value;
            }

            /**
             * Gets the value of the detailCurrencyPrice property.
             * 
             * @return
             *     possible object is
             *     {@link DetailCurrencyPriceType }
             *     
             */
            public DetailCurrencyPriceType getDetailCurrencyPrice() {
                return detailCurrencyPrice;
            }

            /**
             * Sets the value of the detailCurrencyPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link DetailCurrencyPriceType }
             *     
             */
            public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
                this.detailCurrencyPrice = value;
            }

            /**
             * Gets the value of the encodedCurrencyPrice property.
             * 
             * @return
             *     possible object is
             *     {@link EncodedPriceType }
             *     
             */
            public EncodedPriceType getEncodedCurrencyPrice() {
                return encodedCurrencyPrice;
            }

            /**
             * Sets the value of the encodedCurrencyPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link EncodedPriceType }
             *     
             */
            public void setEncodedCurrencyPrice(EncodedPriceType value) {
                this.encodedCurrencyPrice = value;
            }

            /**
             * Gets the value of the simpleCurrencyPrice property.
             * 
             * @return
             *     possible object is
             *     {@link SimpleCurrencyPriceType }
             *     
             */
            public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
                return simpleCurrencyPrice;
            }

            /**
             * Sets the value of the simpleCurrencyPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link SimpleCurrencyPriceType }
             *     
             */
            public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
                this.simpleCurrencyPrice = value;
            }

        }

    }

}
