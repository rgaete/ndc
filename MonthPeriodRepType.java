
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Effective/ Expiration Month Date Period Representation.
 * 
 * <p>Java class for MonthPeriodRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthPeriodRepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST/2017.1}MonthRepType" minOccurs="0"/>
 *         &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST/2017.1}MonthRepType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthPeriodRepType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "effective",
    "expiration"
})
public class MonthPeriodRepType {

    @XmlElement(name = "Effective", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MonthRepType effective;
    @XmlElement(name = "Expiration", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MonthRepType expiration;

    /**
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link MonthRepType }
     *     
     */
    public MonthRepType getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthRepType }
     *     
     */
    public void setEffective(MonthRepType value) {
        this.effective = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link MonthRepType }
     *     
     */
    public MonthRepType getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthRepType }
     *     
     */
    public void setExpiration(MonthRepType value) {
        this.expiration = value;
    }

}
