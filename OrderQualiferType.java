
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Shopping Request Business Object: EXISTING ORDER Qualifiers.
 * 
 * <p>Java class for OrderQualiferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQualiferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderKeys"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQualiferType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "orderKeys"
})
@XmlSeeAlso({
    ExistingOrderQualifier.class
})
public class OrderQualiferType {

    @XmlElement(name = "OrderKeys", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OrderKeysType orderKeys;

    /**
     * Gets the value of the orderKeys property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType }
     *     
     */
    public OrderKeysType getOrderKeys() {
        return orderKeys;
    }

    /**
     * Sets the value of the orderKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType }
     *     
     */
    public void setOrderKeys(OrderKeysType value) {
        this.orderKeys = value;
    }

}
