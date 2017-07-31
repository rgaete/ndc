
package ndc;

import java.math.BigDecimal;
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
 * A data type for Baggage Allowance by Dimensions.
 * 
 * <p>Java class for BagAllowanceDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowanceDimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableParty" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAppSimpleType" minOccurs="0"/>
 *         &lt;element name="DimensionUOM" type="{http://www.iata.org/IATA/EDIST/2017.1}SizeUnitSimpleType"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="MaxLinear">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                   &lt;/extension>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="MinLinear">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                   &lt;/extension>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="Dimensions" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDimensionSimpleType"/>
 *                     &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                     &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="ApplicableBag" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/>
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
@XmlType(name = "BagAllowanceDimensionType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "applicableParty",
    "dimensionUOM",
    "maxLinear",
    "minLinear",
    "dimensions",
    "applicableBag",
    "descriptions"
})
public class BagAllowanceDimensionType {

    @XmlElement(name = "ApplicableParty", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String applicableParty;
    @XmlElement(name = "DimensionUOM", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlSchemaType(name = "string")
    protected SizeUnitSimpleType dimensionUOM;
    @XmlElement(name = "MaxLinear", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagAllowanceDimensionType.MaxLinear maxLinear;
    @XmlElement(name = "MinLinear", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BagAllowanceDimensionType.MinLinear minLinear;
    @XmlElement(name = "Dimensions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<BagAllowanceDimensionType.Dimensions> dimensions;
    @XmlElement(name = "ApplicableBag", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String applicableBag;
    @XmlElement(name = "Descriptions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Descriptions descriptions;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the applicableParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableParty() {
        return applicableParty;
    }

    /**
     * Sets the value of the applicableParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableParty(String value) {
        this.applicableParty = value;
    }

    /**
     * Gets the value of the dimensionUOM property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public SizeUnitSimpleType getDimensionUOM() {
        return dimensionUOM;
    }

    /**
     * Sets the value of the dimensionUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public void setDimensionUOM(SizeUnitSimpleType value) {
        this.dimensionUOM = value;
    }

    /**
     * Gets the value of the maxLinear property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceDimensionType.MaxLinear }
     *     
     */
    public BagAllowanceDimensionType.MaxLinear getMaxLinear() {
        return maxLinear;
    }

    /**
     * Sets the value of the maxLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceDimensionType.MaxLinear }
     *     
     */
    public void setMaxLinear(BagAllowanceDimensionType.MaxLinear value) {
        this.maxLinear = value;
    }

    /**
     * Gets the value of the minLinear property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceDimensionType.MinLinear }
     *     
     */
    public BagAllowanceDimensionType.MinLinear getMinLinear() {
        return minLinear;
    }

    /**
     * Sets the value of the minLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceDimensionType.MinLinear }
     *     
     */
    public void setMinLinear(BagAllowanceDimensionType.MinLinear value) {
        this.minLinear = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowanceDimensionType.Dimensions }
     * 
     * 
     */
    public List<BagAllowanceDimensionType.Dimensions> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<BagAllowanceDimensionType.Dimensions>();
        }
        return this.dimensions;
    }

    /**
     * Gets the value of the applicableBag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBag() {
        return applicableBag;
    }

    /**
     * Sets the value of the applicableBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBag(String value) {
        this.applicableBag = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
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
     *         &lt;element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDimensionSimpleType"/>
     *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "category",
        "maxValue",
        "minValue"
    })
    public static class Dimensions {

        @XmlElement(name = "Category", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String category;
        @XmlElement(name = "MaxValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected BigDecimal maxValue;
        @XmlElement(name = "MinValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Object minValue;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the maxValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxValue() {
            return maxValue;
        }

        /**
         * Sets the value of the maxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxValue(BigDecimal value) {
            this.maxValue = value;
        }

        /**
         * Gets the value of the minValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMinValue() {
            return minValue;
        }

        /**
         * Sets the value of the minValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMinValue(Object value) {
            this.minValue = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
    public static class MaxLinear {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the value property.
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
    public static class MinLinear {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the value property.
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

    }

}
