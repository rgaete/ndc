
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Baggage Allowance by Weight.
 * 
 * <p>Java class for BagAllowanceWeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowanceWeightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableParty" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAppSimpleType" minOccurs="0"/>
 *         &lt;element name="MaximumWeight" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}WeightUnitSimpleType"/>
 *                   &lt;element name="SpreadOverBagsQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "BagAllowanceWeightType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "applicableParty",
    "maximumWeight",
    "applicableBag",
    "descriptions"
})
@XmlSeeAlso({
    WeightAllowance.class
})
public class BagAllowanceWeightType {

    @XmlElement(name = "ApplicableParty", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String applicableParty;
    @XmlElement(name = "MaximumWeight", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<BagAllowanceWeightType.MaximumWeight> maximumWeight;
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
     * Gets the value of the maximumWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowanceWeightType.MaximumWeight }
     * 
     * 
     */
    public List<BagAllowanceWeightType.MaximumWeight> getMaximumWeight() {
        if (maximumWeight == null) {
            maximumWeight = new ArrayList<BagAllowanceWeightType.MaximumWeight>();
        }
        return this.maximumWeight;
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
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}WeightUnitSimpleType"/>
     *         &lt;element name="SpreadOverBagsQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "value",
        "uom",
        "spreadOverBagsQuantity"
    })
    public static class MaximumWeight {

        @XmlElement(name = "Value", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected BigDecimal value;
        @XmlElement(name = "UOM", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        @XmlSchemaType(name = "string")
        protected WeightUnitSimpleType uom;
        @XmlElement(name = "SpreadOverBagsQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Integer spreadOverBagsQuantity;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link WeightUnitSimpleType }
         *     
         */
        public WeightUnitSimpleType getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightUnitSimpleType }
         *     
         */
        public void setUOM(WeightUnitSimpleType value) {
            this.uom = value;
        }

        /**
         * Gets the value of the spreadOverBagsQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSpreadOverBagsQuantity() {
            return spreadOverBagsQuantity;
        }

        /**
         * Sets the value of the spreadOverBagsQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSpreadOverBagsQuantity(Integer value) {
            this.spreadOverBagsQuantity = value;
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