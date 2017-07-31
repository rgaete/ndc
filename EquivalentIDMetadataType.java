
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
 * A data type for EQUIVALENT IDENTIFIER Metadata.
 * 
 * <p>Java class for EquivalentID_MetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentID_MetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="EquivID" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EquivalentID_Key"/>
 *                   &lt;element name="ID_Value" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
 *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquivalentID_MetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "equivID"
})
public class EquivalentIDMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "EquivID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<EquivalentIDMetadataType.EquivID> equivID;

    /**
     * Gets the value of the equivID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquivalentIDMetadataType.EquivID }
     * 
     * 
     */
    public List<EquivalentIDMetadataType.EquivID> getEquivID() {
        if (equivID == null) {
            equivID = new ArrayList<EquivalentIDMetadataType.EquivID>();
        }
        return this.equivID;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EquivalentID_Key"/>
     *         &lt;element name="ID_Value" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueStringID_SimpleType"/>
     *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "equivalentIDKey",
        "idValue",
        "owner"
    })
    public static class EquivID {

        @XmlElement(name = "EquivalentID_Key", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String equivalentIDKey;
        @XmlElement(name = "ID_Value", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String idValue;
        @XmlElement(name = "Owner", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String owner;
        @XmlAttribute(name = "metarefs")
        @XmlIDREF
        protected List<Object> metarefs;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "MetadataKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String metadataKey;

        /**
         * Gets the value of the equivalentIDKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquivalentIDKey() {
            return equivalentIDKey;
        }

        /**
         * Sets the value of the equivalentIDKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquivalentIDKey(String value) {
            this.equivalentIDKey = value;
        }

        /**
         * Gets the value of the idValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDValue() {
            return idValue;
        }

        /**
         * Sets the value of the idValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDValue(String value) {
            this.idValue = value;
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

        /**
         * Gets the value of the metarefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the metarefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMetarefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getMetarefs() {
            if (metarefs == null) {
                metarefs = new ArrayList<Object>();
            }
            return this.metarefs;
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
         * Gets the value of the metadataKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadataKey() {
            return metadataKey;
        }

        /**
         * Sets the value of the metadataKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadataKey(String value) {
            this.metadataKey = value;
        }

    }

}
