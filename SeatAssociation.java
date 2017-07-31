
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/>
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
    "segmentReferences",
    "passengerReference"
})
@XmlRootElement(name = "SeatAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class SeatAssociation {

    @XmlElement(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected SegmentReferences segmentReferences;
    @XmlList
    @XmlElement(name = "PassengerReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReference;

    /**
     * Gets the value of the segmentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReferences }
     *     
     */
    public SegmentReferences getSegmentReferences() {
        return segmentReferences;
    }

    /**
     * Sets the value of the segmentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReferences }
     *     
     */
    public void setSegmentReferences(SegmentReferences value) {
        this.segmentReferences = value;
    }

    /**
     * Gets the value of the passengerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPassengerReference() {
        if (passengerReference == null) {
            passengerReference = new ArrayList<Object>();
        }
        return this.passengerReference;
    }

}
