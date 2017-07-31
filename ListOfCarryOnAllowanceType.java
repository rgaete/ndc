
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * CARRY-ON ALLOWANCE data list definition.
 * 
 * <p>Java class for ListOfCarryOnAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCarryOnAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarryOnAllowance" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AllowanceDescription" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DimensionAllowance" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WeightAllowance" minOccurs="0"/>
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/>
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
@XmlType(name = "ListOfCarryOnAllowanceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "carryOnAllowance"
})
public class ListOfCarryOnAllowanceType {

    @XmlElement(name = "CarryOnAllowance", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<ListOfCarryOnAllowanceType.CarryOnAllowance> carryOnAllowance;

    /**
     * Gets the value of the carryOnAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfCarryOnAllowanceType.CarryOnAllowance }
     * 
     * 
     */
    public List<ListOfCarryOnAllowanceType.CarryOnAllowance> getCarryOnAllowance() {
        if (carryOnAllowance == null) {
            carryOnAllowance = new ArrayList<ListOfCarryOnAllowanceType.CarryOnAllowance>();
        }
        return this.carryOnAllowance;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AllowanceDescription" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DimensionAllowance" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WeightAllowance" minOccurs="0"/>
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allowanceDescription",
        "dimensionAllowance",
        "pieceAllowance",
        "weightAllowance",
        "baggageDeterminingCarrier"
    })
    public static class CarryOnAllowance {

        @XmlElement(name = "AllowanceDescription", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BagAllowanceDescType allowanceDescription;
        @XmlElement(name = "DimensionAllowance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BagAllowanceDimensionType dimensionAllowance;
        @XmlElement(name = "PieceAllowance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<PieceAllowance> pieceAllowance;
        @XmlElement(name = "WeightAllowance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected WeightAllowance weightAllowance;
        @XmlElement(name = "BaggageDeterminingCarrier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the allowanceDescription property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public BagAllowanceDescType getAllowanceDescription() {
            return allowanceDescription;
        }

        /**
         * Sets the value of the allowanceDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public void setAllowanceDescription(BagAllowanceDescType value) {
            this.allowanceDescription = value;
        }

        /**
         * Gets the value of the dimensionAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public BagAllowanceDimensionType getDimensionAllowance() {
            return dimensionAllowance;
        }

        /**
         * Sets the value of the dimensionAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public void setDimensionAllowance(BagAllowanceDimensionType value) {
            this.dimensionAllowance = value;
        }

        /**
         * Gets the value of the pieceAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PieceAllowance }
         * 
         * 
         */
        public List<PieceAllowance> getPieceAllowance() {
            if (pieceAllowance == null) {
                pieceAllowance = new ArrayList<PieceAllowance>();
            }
            return this.pieceAllowance;
        }

        /**
         * Gets the value of the weightAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link WeightAllowance }
         *     
         */
        public WeightAllowance getWeightAllowance() {
            return weightAllowance;
        }

        /**
         * Sets the value of the weightAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightAllowance }
         *     
         */
        public void setWeightAllowance(WeightAllowance value) {
            this.weightAllowance = value;
        }

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

    }

}