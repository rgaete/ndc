
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllianceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllianceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}AllianceCodeType" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/EDIST/2017.1}URI_Type" minOccurs="0"/>
 *         &lt;element name="Airline" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineTypeAIDM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllianceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "name",
    "code",
    "url",
    "airline"
})
public class AllianceType {

    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String name;
    @XmlElement(name = "Code", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String code;
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "Airline", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<AirlineTypeAIDM> airline;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineTypeAIDM }
     * 
     * 
     */
    public List<AirlineTypeAIDM> getAirline() {
        if (airline == null) {
            airline = new ArrayList<AirlineTypeAIDM>();
        }
        return this.airline;
    }

}
