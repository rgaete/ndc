
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A date time identifies a date and time of day to various common resolutions: year, month, week, day, hour, minute, second, and fraction of second.
 * 
 * <p>Java class for DateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTimeValue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateTimeTimeZoneCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "dateTimeValue"
})
public class DateTimeType {

    @XmlElement(name = "DateTimeValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeValue;
    @XmlAttribute(name = "DateTimeTimeZoneCode")
    protected String dateTimeTimeZoneCode;

    /**
     * Gets the value of the dateTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeValue() {
        return dateTimeValue;
    }

    /**
     * Sets the value of the dateTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeValue(XMLGregorianCalendar value) {
        this.dateTimeValue = value;
    }

    /**
     * Gets the value of the dateTimeTimeZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeTimeZoneCode() {
        return dateTimeTimeZoneCode;
    }

    /**
     * Sets the value of the dateTimeTimeZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeTimeZoneCode(String value) {
        this.dateTimeTimeZoneCode = value;
    }

}
