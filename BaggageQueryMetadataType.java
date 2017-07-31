
package ndc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * BAGGAGE QUERY Metadata definition.
 * 
 * <p>Java class for BaggageQueryMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageQueryMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="TicketIssuePlace" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" minOccurs="0"/>
 *         &lt;element name="TicketIssueCountry" type="{http://www.iata.org/IATA/EDIST/2017.1}CountrySimpleType" minOccurs="0"/>
 *         &lt;element name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageQueryMetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "ticketIssuePlace",
    "ticketIssueCountry",
    "passengerCount",
    "totalPrice"
})
public class BaggageQueryMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "TicketIssuePlace", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String ticketIssuePlace;
    @XmlElement(name = "TicketIssueCountry", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String ticketIssueCountry;
    @XmlElement(name = "PassengerCount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger passengerCount;
    @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CurrencyAmountOptType totalPrice;

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
     * Gets the value of the passengerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerCount() {
        return passengerCount;
    }

    /**
     * Sets the value of the passengerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerCount(BigInteger value) {
        this.passengerCount = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setTotalPrice(CurrencyAmountOptType value) {
        this.totalPrice = value;
    }

}
