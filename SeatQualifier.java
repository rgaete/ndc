
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Assignment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatCoreType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatAssociation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
    "assignment"
})
@XmlRootElement(name = "SeatQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class SeatQualifier {

    @XmlElement(name = "Assignment", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<SeatQualifier.Assignment> assignment;

    /**
     * Gets the value of the assignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatQualifier.Assignment }
     * 
     * 
     */
    public List<SeatQualifier.Assignment> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<SeatQualifier.Assignment>();
        }
        return this.assignment;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatCoreType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatAssociation" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "seatAssociation"
    })
    public static class Assignment
        extends SeatCoreType
    {

        @XmlElement(name = "SeatAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected SeatAssociation seatAssociation;

        /**
         * Gets the value of the seatAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link SeatAssociation }
         *     
         */
        public SeatAssociation getSeatAssociation() {
            return seatAssociation;
        }

        /**
         * Sets the value of the seatAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatAssociation }
         *     
         */
        public void setSeatAssociation(SeatAssociation value) {
            this.seatAssociation = value;
        }

    }

}
