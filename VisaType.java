
package ndc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An official entry in a Passport or other Travel Document made by an official of a government to indicate that the bearer has been granted authority to enter or re-enter the country or region concerned.
 * 
 * <p>Java class for VisaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisaNumber" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="VisaType" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="VisaHostCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnterBeforeDate" type="{http://www.iata.org/IATA/EDIST/2017.1}DateType" minOccurs="0"/>
 *         &lt;element name="DurationOfStay" type="{http://www.iata.org/IATA/EDIST/2017.1}OrdinalType" minOccurs="0"/>
 *         &lt;element name="NumberOfEntries" type="{http://www.iata.org/IATA/EDIST/2017.1}OrdinalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "visaNumber",
    "visaType",
    "visaHostCountryCode",
    "enterBeforeDate",
    "durationOfStay",
    "numberOfEntries"
})
public class VisaType {

    @XmlElement(name = "VisaNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String visaNumber;
    @XmlElement(name = "VisaType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String visaType;
    @XmlElement(name = "VisaHostCountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String visaHostCountryCode;
    @XmlElement(name = "EnterBeforeDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enterBeforeDate;
    @XmlElement(name = "DurationOfStay", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BigInteger durationOfStay;
    @XmlElement(name = "NumberOfEntries", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BigInteger numberOfEntries;

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaType() {
        return visaType;
    }

    /**
     * Sets the value of the visaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaType(String value) {
        this.visaType = value;
    }

    /**
     * Gets the value of the visaHostCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaHostCountryCode() {
        return visaHostCountryCode;
    }

    /**
     * Sets the value of the visaHostCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaHostCountryCode(String value) {
        this.visaHostCountryCode = value;
    }

    /**
     * Gets the value of the enterBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnterBeforeDate() {
        return enterBeforeDate;
    }

    /**
     * Sets the value of the enterBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnterBeforeDate(XMLGregorianCalendar value) {
        this.enterBeforeDate = value;
    }

    /**
     * Gets the value of the durationOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDurationOfStay() {
        return durationOfStay;
    }

    /**
     * Sets the value of the durationOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDurationOfStay(BigInteger value) {
        this.durationOfStay = value;
    }

    /**
     * Gets the value of the numberOfEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEntries() {
        return numberOfEntries;
    }

    /**
     * Sets the value of the numberOfEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEntries(BigInteger value) {
        this.numberOfEntries = value;
    }

}
