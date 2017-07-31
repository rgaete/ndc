
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedBagMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CarryOnBagMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDisclosureMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDetailMetadata"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggageQueryMetadata"/>
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
    "checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas"
})
@XmlRootElement(name = "Baggage", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Baggage {

    @XmlElements({
        @XmlElement(name = "CheckedBagMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = CheckedBagMetadatas.class),
        @XmlElement(name = "CarryOnBagMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = CarryOnBagMetadatas.class),
        @XmlElement(name = "BaggageDisclosureMetadatas", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = BaggageDisclosureMetadatas.class),
        @XmlElement(name = "BaggageDetailMetadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = BaggageDetailMetadataType.class),
        @XmlElement(name = "BaggageQueryMetadata", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = BaggageQueryMetadataType.class)
    })
    protected List<Object> checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas;

    /**
     * Gets the value of the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckedBagMetadatas }
     * {@link CarryOnBagMetadatas }
     * {@link BaggageDisclosureMetadatas }
     * {@link BaggageDetailMetadataType }
     * {@link BaggageQueryMetadataType }
     * 
     * 
     */
    public List<Object> getCheckedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas() {
        if (checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas == null) {
            checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas = new ArrayList<Object>();
        }
        return this.checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas;
    }

}
