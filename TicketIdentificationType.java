
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Security" minOccurs="0"/>
 *         &lt;element name="TicketIssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TicketIssueTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TicketIssuePlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TicketIssueCountry" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectKeyMetaAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketIdentificationType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "owner",
    "security",
    "ticketIssueDate",
    "ticketIssueTime",
    "ticketIssuePlace",
    "ticketIssueCountry",
    "documentNumber"
})
public class TicketIdentificationType {

    @XmlElement(name = "Owner", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Object owner;
    @XmlElement(name = "Security", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Security security;
    @XmlElement(name = "TicketIssueDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ticketIssueDate;
    @XmlElement(name = "TicketIssueTime", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar ticketIssueTime;
    @XmlElement(name = "TicketIssuePlace", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String ticketIssuePlace;
    @XmlElement(name = "TicketIssueCountry", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String ticketIssueCountry;
    @XmlElement(name = "DocumentNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String documentNumber;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwner(Object value) {
        this.owner = value;
    }

    /**
     * Contains security details: viewing (display)/booking/sales location(s).
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the ticketIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketIssueDate() {
        return ticketIssueDate;
    }

    /**
     * Sets the value of the ticketIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketIssueDate(XMLGregorianCalendar value) {
        this.ticketIssueDate = value;
    }

    /**
     * Gets the value of the ticketIssueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketIssueTime() {
        return ticketIssueTime;
    }

    /**
     * Sets the value of the ticketIssueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketIssueTime(XMLGregorianCalendar value) {
        this.ticketIssueTime = value;
    }

    /**
     * Gets the value of the ticketIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuePlace() {
        return ticketIssuePlace;
    }

    /**
     * Sets the value of the ticketIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuePlace(String value) {
        this.ticketIssuePlace = value;
    }

    /**
     * Gets the value of the ticketIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssueCountry() {
        return ticketIssueCountry;
    }

    /**
     * Sets the value of the ticketIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssueCountry(String value) {
        this.ticketIssueCountry = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
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

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
    }

}
