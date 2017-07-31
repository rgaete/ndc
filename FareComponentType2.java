
package ndc;

import java.math.BigInteger;
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
 * FARE COMPONENT definition.
 * 
 * <p>Java class for FareComponentType_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentType_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}FarePriceDetailType" minOccurs="0"/>
 *         &lt;element name="FareBasis" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCode" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareRulesRemarks" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCityPair" minOccurs="0"/>
 *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TicketDesig" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareRules" minOccurs="0"/>
 *         &lt;element name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="SegmentRefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREFS">
 *                 &lt;attribute name="ON_Point" type="{http://www.iata.org/IATA/EDIST/2017.1}AirportCitySimpleType" />
 *                 &lt;attribute name="OFF_Point" type="{http://www.iata.org/IATA/EDIST/2017.1}AirportCitySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "FareComponentType_2", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "parameters",
    "price",
    "fareBasis",
    "ticketDesig",
    "fareRules",
    "priceClassRef",
    "segmentRefs"
})
public class FareComponentType2 {

    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareComponentType2 .Parameters parameters;
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FarePriceDetailType price;
    @XmlElement(name = "FareBasis", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareComponentType2 .FareBasis fareBasis;
    @XmlElement(name = "TicketDesig", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TicketDesignatorType ticketDesig;
    @XmlElement(name = "FareRules", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareRulesType fareRules;
    @XmlElement(name = "PriceClassRef", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Object priceClassRef;
    @XmlElement(name = "SegmentRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareComponentType2 .SegmentRefs segmentRefs;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType2 .Parameters }
     *     
     */
    public FareComponentType2 .Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType2 .Parameters }
     *     
     */
    public void setParameters(FareComponentType2 .Parameters value) {
        this.parameters = value;
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
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType2 .FareBasis }
     *     
     */
    public FareComponentType2 .FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType2 .FareBasis }
     *     
     */
    public void setFareBasis(FareComponentType2 .FareBasis value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the ticketDesig property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDesignatorType }
     *     
     */
    public TicketDesignatorType getTicketDesig() {
        return ticketDesig;
    }

    /**
     * Sets the value of the ticketDesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDesignatorType }
     *     
     */
    public void setTicketDesig(TicketDesignatorType value) {
        this.ticketDesig = value;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType }
     *     
     */
    public FareRulesType getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType }
     *     
     */
    public void setFareRules(FareRulesType value) {
        this.fareRules = value;
    }

    /**
     * Gets the value of the priceClassRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPriceClassRef() {
        return priceClassRef;
    }

    /**
     * Sets the value of the priceClassRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPriceClassRef(Object value) {
        this.priceClassRef = value;
    }

    /**
     * Gets the value of the segmentRefs property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType2 .SegmentRefs }
     *     
     */
    public FareComponentType2 .SegmentRefs getSegmentRefs() {
        return segmentRefs;
    }

    /**
     * Sets the value of the segmentRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType2 .SegmentRefs }
     *     
     */
    public void setSegmentRefs(FareComponentType2 .SegmentRefs value) {
        this.segmentRefs = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCode" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareRulesRemarks" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCityPair" minOccurs="0"/>
     *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fareBasisCode",
        "fareRulesRemarks",
        "fareBasisCityPair",
        "rbd"
    })
    public static class FareBasis {

        @XmlElement(name = "FareBasisCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FareBasisCodeType fareBasisCode;
        @XmlElement(name = "FareRulesRemarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected FareRulesRemarks fareRulesRemarks;
        @XmlElement(name = "FareBasisCityPair", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String fareBasisCityPair;
        @XmlElement(name = "RBD", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String rbd;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link FareBasisCodeType }
         *     
         */
        public FareBasisCodeType getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareBasisCodeType }
         *     
         */
        public void setFareBasisCode(FareBasisCodeType value) {
            this.fareBasisCode = value;
        }

        /**
         * Gets the value of the fareRulesRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link FareRulesRemarks }
         *     
         */
        public FareRulesRemarks getFareRulesRemarks() {
            return fareRulesRemarks;
        }

        /**
         * Sets the value of the fareRulesRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRulesRemarks }
         *     
         */
        public void setFareRulesRemarks(FareRulesRemarks value) {
            this.fareRulesRemarks = value;
        }

        /**
         * Gets the value of the fareBasisCityPair property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasisCityPair() {
            return fareBasisCityPair;
        }

        /**
         * Sets the value of the fareBasisCityPair property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasisCityPair(String value) {
            this.fareBasisCityPair = value;
        }

        /**
         * Gets the value of the rbd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBD() {
            return rbd;
        }

        /**
         * Sets the value of the rbd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBD(String value) {
            this.rbd = value;
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
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Parameters {

        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
     *       &lt;attribute name="ON_Point" type="{http://www.iata.org/IATA/EDIST/2017.1}AirportCitySimpleType" />
     *       &lt;attribute name="OFF_Point" type="{http://www.iata.org/IATA/EDIST/2017.1}AirportCitySimpleType" />
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
    public static class SegmentRefs {

        @XmlValue
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> value;
        @XmlAttribute(name = "ON_Point")
        protected String onPoint;
        @XmlAttribute(name = "OFF_Point")
        protected String offPoint;

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

        /**
         * Gets the value of the onPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getONPoint() {
            return onPoint;
        }

        /**
         * Sets the value of the onPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setONPoint(String value) {
            this.onPoint = value;
        }

        /**
         * Gets the value of the offPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFPoint() {
            return offPoint;
        }

        /**
         * Sets the value of the offPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFPoint(String value) {
            this.offPoint = value;
        }

    }

}
