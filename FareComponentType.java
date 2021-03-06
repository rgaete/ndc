
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


/**
 * FARE COMPONENT definition.
 * 
 * <p>Java class for FareComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentType">
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReference" minOccurs="0"/>
 *         &lt;element name="PriceBreakdown" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}FarePriceDetailType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "FareComponentType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "parameters",
    "segmentReference",
    "priceBreakdown",
    "fareBasis",
    "ticketDesig",
    "fareRules"
})
public class FareComponentType {

    @XmlElement(name = "Parameters", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareComponentType.Parameters parameters;
    @XmlElement(name = "SegmentReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SegmentReference segmentReference;
    @XmlElement(name = "PriceBreakdown", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareComponentType.PriceBreakdown priceBreakdown;
    @XmlElement(name = "FareBasis", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareComponentType.FareBasis fareBasis;
    @XmlElement(name = "TicketDesig", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TicketDesignatorType ticketDesig;
    @XmlElement(name = "FareRules", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareRulesType fareRules;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.Parameters }
     *     
     */
    public FareComponentType.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.Parameters }
     *     
     */
    public void setParameters(FareComponentType.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReference }
     *     
     */
    public SegmentReference getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReference }
     *     
     */
    public void setSegmentReference(SegmentReference value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the priceBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.PriceBreakdown }
     *     
     */
    public FareComponentType.PriceBreakdown getPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * Sets the value of the priceBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.PriceBreakdown }
     *     
     */
    public void setPriceBreakdown(FareComponentType.PriceBreakdown value) {
        this.priceBreakdown = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.FareBasis }
     *     
     */
    public FareComponentType.FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.FareBasis }
     *     
     */
    public void setFareBasis(FareComponentType.FareBasis value) {
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}FarePriceDetailType"/>
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
        "price"
    })
    public static class PriceBreakdown {

        @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected FarePriceDetailType price;

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

    }

}
