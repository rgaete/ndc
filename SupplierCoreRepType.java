
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for SUPPLIER GROUP, Core Representation.
 * 
 * <p>Java class for SupplierCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierCoreRepType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ActorObjectType">
 *       &lt;sequence>
 *         &lt;element name="OtherIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherID" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CodesetValueSimpleType">
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierCoreRepType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "otherIDs"
})
@XmlSeeAlso({
    AirlineCoreRepType.class,
    RetailerType.class
})
public class SupplierCoreRepType
    extends ActorObjectType
{

    @XmlElement(name = "OtherIDs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SupplierCoreRepType.OtherIDs otherIDs;

    /**
     * Gets the value of the otherIDs property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCoreRepType.OtherIDs }
     *     
     */
    public SupplierCoreRepType.OtherIDs getOtherIDs() {
        return otherIDs;
    }

    /**
     * Sets the value of the otherIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCoreRepType.OtherIDs }
     *     
     */
    public void setOtherIDs(SupplierCoreRepType.OtherIDs value) {
        this.otherIDs = value;
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
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CodesetValueSimpleType">
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
        protected List<SupplierCoreRepType.OtherIDs.OtherID> otherID;

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
         * {@link SupplierCoreRepType.OtherIDs.OtherID }
         * 
         * 
         */
        public List<SupplierCoreRepType.OtherIDs.OtherID> getOtherID() {
            if (otherID == null) {
                otherID = new ArrayList<SupplierCoreRepType.OtherIDs.OtherID>();
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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CodesetValueSimpleType">
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

            /**
             * Examples: A, ABC, 1
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

        }

    }

}
