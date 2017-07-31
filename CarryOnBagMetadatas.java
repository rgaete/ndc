
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBagMetadata" maxOccurs="unbounded"/>
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
    "carryOnBagMetadata"
})
@XmlRootElement(name = "CarryOnBagMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class CarryOnBagMetadatas {

    @XmlElement(name = "CarryOnBagMetadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<BaggageCarryOnMetadataType> carryOnBagMetadata;

    /**
     * Gets the value of the carryOnBagMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnBagMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnBagMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageCarryOnMetadataType }
     * 
     * 
     */
    public List<BaggageCarryOnMetadataType> getCarryOnBagMetadata() {
        if (carryOnBagMetadata == null) {
            carryOnBagMetadata = new ArrayList<BaggageCarryOnMetadataType>();
        }
        return this.carryOnBagMetadata;
    }

}
