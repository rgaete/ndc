
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SignedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OrderTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "number",
    "signedDate",
    "orderTo"
})
@XmlRootElement(name = "Check", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Check {

    @XmlElement(name = "Number", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Integer number;
    @XmlElement(name = "SignedDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signedDate;
    @XmlElement(name = "OrderTo", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String orderTo;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the signedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
    }

    /**
     * Gets the value of the orderTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTo() {
        return orderTo;
    }

    /**
     * Sets the value of the orderTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTo(String value) {
        this.orderTo = value;
    }

}
