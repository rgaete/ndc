
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
 * OFFER TERMS definition.
 * 
 * <p>Java class for OfferTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AvailablePeriod" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferValidPeriodType"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions"/>
 *         &lt;element name="GroupSize" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferGroupSizeType"/>
 *         &lt;element name="OrderingQuantity" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferOrderQuantityType"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTermsType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "availablePeriod",
    "descriptions",
    "groupSize",
    "orderingQuantity"
})
public class OfferTermsType {

    @XmlElement(name = "AvailablePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferValidPeriodType availablePeriod;
    @XmlElement(name = "Descriptions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Descriptions descriptions;
    @XmlElement(name = "GroupSize", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferGroupSizeType groupSize;
    @XmlElement(name = "OrderingQuantity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferOrderQuantityType orderingQuantity;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the availablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public OfferValidPeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    /**
     * Sets the value of the availablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public void setAvailablePeriod(OfferValidPeriodType value) {
        this.availablePeriod = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the groupSize property.
     * 
     * @return
     *     possible object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public OfferGroupSizeType getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the value of the groupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public void setGroupSize(OfferGroupSizeType value) {
        this.groupSize = value;
    }

    /**
     * Gets the value of the orderingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public OfferOrderQuantityType getOrderingQuantity() {
        return orderingQuantity;
    }

    /**
     * Sets the value of the orderingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public void setOrderingQuantity(OfferOrderQuantityType value) {
        this.orderingQuantity = value;
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
