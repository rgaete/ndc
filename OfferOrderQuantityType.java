
package ndc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * MINIMUM/ MAXIMUM Offer Ordering Quantity definition.
 * 
 * <p>Java class for OfferOrderQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferOrderQuantityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferOrderQuantityType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "minimum",
    "maximum"
})
public class OfferOrderQuantityType {

    @XmlElement(name = "Minimum", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimum;
    @XmlElement(name = "Maximum", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximum;

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimum(BigInteger value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximum(BigInteger value) {
        this.maximum = value;
    }

}
