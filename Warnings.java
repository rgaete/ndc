
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Warning" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}MultiAssociationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
    "warning"
})
@XmlRootElement(name = "Warnings", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Warnings {

    @XmlElement(name = "Warning", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<Warnings.Warning> warning;

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warnings.Warning }
     * 
     * 
     */
    public List<Warnings.Warning> getWarning() {
        if (warning == null) {
            warning = new ArrayList<Warnings.Warning>();
        }
        return this.warning;
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
     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}MultiAssociationType" minOccurs="0"/>
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
        "type",
        "remarks",
        "associations"
    })
    public static class Warning {

        @XmlElement(name = "Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String type;
        @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected RemarkType remarks;
        @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MultiAssociationType associations;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link RemarkType }
         *     
         */
        public RemarkType getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link RemarkType }
         *     
         */
        public void setRemarks(RemarkType value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link MultiAssociationType }
         *     
         */
        public MultiAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiAssociationType }
         *     
         */
        public void setAssociations(MultiAssociationType value) {
            this.associations = value;
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
