
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COUNTRY PROXIMITY representation.
 * 
 * Notes:
 *  1. This contains either the requested maximum distance search radius values -or- the actual Proximity information, which is typically used to specify the results from the named location radius search.
 * 
 * <p>Java class for CountryProximityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryProximityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}LocationProximityType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryProximityType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "countryCode"
})
public class CountryProximityType
    extends LocationProximityType
{

    @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected CountryCode countryCode;

    /**
     * Country Code. Examples: US, FR
     * 
     * Encoding Scheme: ISO 3166-1 (two character) Country Code
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

}
