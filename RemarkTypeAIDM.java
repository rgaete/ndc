
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Additional, supplementary information about the document or service.
 * 
 * <p>Java class for RemarkTypeAIDM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarkTypeAIDM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DisplayIndicator" type="{http://www.iata.org/IATA/EDIST/2017.1}IndicatorType" />
 *       &lt;attribute name="Timestamp" type="{http://www.iata.org/IATA/EDIST/2017.1}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkTypeAIDM", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlSeeAlso({
    ndc.PassengerType.Remark.class
})
public class RemarkTypeAIDM {

    @XmlAttribute(name = "DisplayIndicator")
    protected Boolean displayIndicator;
    @XmlAttribute(name = "Timestamp")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the displayIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayIndicator() {
        return displayIndicator;
    }

    /**
     * Sets the value of the displayIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayIndicator(Boolean value) {
        this.displayIndicator = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
