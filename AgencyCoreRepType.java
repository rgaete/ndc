
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for Core Agency (Seller) Group Representation.
 * 
 * Notes:
 *  1. This type contains the common properties for all defined Agency Seller Role definitions, e.g. TravelAgency, Travel Agent.
 *  2. This type is derived from SellerCoreRepType.
 * 
 * <p>Java class for AgencyCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyCoreRepType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SellerCoreRepType">
 *       &lt;sequence>
 *         &lt;element name="OtherIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherID" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                           &lt;attribute name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PseudoCity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PseudoCitySimpleType">
 *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_NbrSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyCoreRepType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "otherIDs",
    "pseudoCity",
    "iataNumber"
})
@XmlSeeAlso({
    AgentUserType.class,
    TravelAgencyType.class
})
public class AgencyCoreRepType
    extends SellerCoreRepType
{

    @XmlElement(name = "OtherIDs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AgencyCoreRepType.OtherIDs otherIDs;
    @XmlElement(name = "PseudoCity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AgencyCoreRepType.PseudoCity pseudoCity;
    @XmlElement(name = "IATA_Number", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String iataNumber;

    /**
     * Gets the value of the otherIDs property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCoreRepType.OtherIDs }
     *     
     */
    public AgencyCoreRepType.OtherIDs getOtherIDs() {
        return otherIDs;
    }

    /**
     * Sets the value of the otherIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCoreRepType.OtherIDs }
     *     
     */
    public void setOtherIDs(AgencyCoreRepType.OtherIDs value) {
        this.otherIDs = value;
    }

    /**
     * Gets the value of the pseudoCity property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCoreRepType.PseudoCity }
     *     
     */
    public AgencyCoreRepType.PseudoCity getPseudoCity() {
        return pseudoCity;
    }

    /**
     * Sets the value of the pseudoCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCoreRepType.PseudoCity }
     *     
     */
    public void setPseudoCity(AgencyCoreRepType.PseudoCity value) {
        this.pseudoCity = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
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
     *         &lt;element name="OtherID" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *                 &lt;attribute name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
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
    @XmlType(name = "", propOrder = {
        "otherID"
    })
    public static class OtherIDs {

        @XmlElement(name = "OtherID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<AgencyCoreRepType.OtherIDs.OtherID> otherID;

        /**
         * Gets the value of the otherID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgencyCoreRepType.OtherIDs.OtherID }
         * 
         * 
         */
        public List<AgencyCoreRepType.OtherIDs.OtherID> getOtherID() {
            if (otherID == null) {
                otherID = new ArrayList<AgencyCoreRepType.OtherIDs.OtherID>();
            }
            return this.otherID;
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
         *       &lt;attribute name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" />
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
        public static class OtherID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Description")
            protected String description;
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
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PseudoCitySimpleType">
     *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class PseudoCity {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Owner")
        protected String owner;

        /**
         * A data type for  Pseudo City Code encoding constraint. Example: AAA2
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
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

    }

}
