
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * EARLIEST/LATEST Option Available/ Use definition.
 * 
 * <p>Java class for OfferValidPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferValidPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="2">
 *         &lt;element name="Earliest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Latest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferValidPeriodType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "earliestOrLatest"
})
public class OfferValidPeriodType {

    @XmlElements({
        @XmlElement(name = "Earliest", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = OfferValidPeriodType.Earliest.class),
        @XmlElement(name = "Latest", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = OfferValidPeriodType.Latest.class)
    })
    protected List<CoreDateGrpType> earliestOrLatest;

    /**
     * Gets the value of the earliestOrLatest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earliestOrLatest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarliestOrLatest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferValidPeriodType.Earliest }
     * {@link OfferValidPeriodType.Latest }
     * 
     * 
     */
    public List<CoreDateGrpType> getEarliestOrLatest() {
        if (earliestOrLatest == null) {
            earliestOrLatest = new ArrayList<CoreDateGrpType>();
        }
        return this.earliestOrLatest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Earliest
        extends CoreDateGrpType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Latest
        extends CoreDateGrpType
    {


    }

}
