
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
import javax.xml.datatype.Duration;


/**
 * TOTAL JOURNEY TIME/ DISTANCE definition.
 * 
 * <p>Java class for TotalJourneyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalJourneyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Distance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}DistanceUnitSimpleType"/>
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
@XmlType(name = "TotalJourneyType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "time",
    "distance"
})
public class TotalJourneyType {

    @XmlElement(name = "Time", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Duration time;
    @XmlElement(name = "Distance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected TotalJourneyType.Distance distance;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTime(Duration value) {
        this.time = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link TotalJourneyType.Distance }
     *     
     */
    public TotalJourneyType.Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalJourneyType.Distance }
     *     
     */
    public void setDistance(TotalJourneyType.Distance value) {
        this.distance = value;
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
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}DistanceUnitSimpleType"/>
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
        "value",
        "uom"
    })
    public static class Distance {

        @XmlElement(name = "Value", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;
        @XmlElement(name = "UOM", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String uom;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUOM(String value) {
            this.uom = value;
        }

    }

}
