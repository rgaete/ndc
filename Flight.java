
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ItineraryMetadata"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightMetadatasOrItineraryMetadata"
})
@XmlRootElement(name = "Flight", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Flight {

    @XmlElements({
        @XmlElement(name = "FlightMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = FlightMetadatas.class),
        @XmlElement(name = "ItineraryMetadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = ItineraryMetadataType.class)
    })
    protected List<Object> flightMetadatasOrItineraryMetadata;

    /**
     * Gets the value of the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightMetadatasOrItineraryMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightMetadatas }
     * {@link ItineraryMetadataType }
     * 
     * 
     */
    public List<Object> getFlightMetadatasOrItineraryMetadata() {
        if (flightMetadatasOrItineraryMetadata == null) {
            flightMetadatasOrItineraryMetadata = new ArrayList<Object>();
        }
        return this.flightMetadatasOrItineraryMetadata;
    }

}
