
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Traveler FORM OF IDENTIFICATION representation.
 * 
 * <p>Java class for TravelerFOID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerFOID_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FOID" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                   &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType"/>
 *                   &lt;element name="Issuer" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "TravelerFOID_Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "foid"
})
public class TravelerFOIDType {

    @XmlElement(name = "FOID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<TravelerFOIDType.FOID> foid;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the foid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFOID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerFOIDType.FOID }
     * 
     * 
     */
    public List<TravelerFOIDType.FOID> getFOID() {
        if (foid == null) {
            foid = new ArrayList<TravelerFOIDType.FOID>();
        }
        return this.foid;
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
     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *         &lt;element name="ID" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType"/>
     *         &lt;element name="Issuer" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
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
        "type",
        "id",
        "issuer"
    })
    public static class FOID {

        @XmlElement(name = "Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String type;
        @XmlElement(name = "ID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String id;
        @XmlElement(name = "Issuer", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String issuer;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the issuer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuer() {
            return issuer;
        }

        /**
         * Sets the value of the issuer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuer(String value) {
            this.issuer = value;
        }

    }

}
