
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Core Airline Representation.
 * 
 * Notes:
 *  1. This type contains the common properties for all defined Airline Supplier Role definitions, e.g. POA, Operating Carrier.
 *  2. This type is derived from SupplierCoreRepType.
 * 
 * <p>Java class for AirlineCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineCoreRepType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SupplierCoreRepType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineID"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineCoreRepType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "airlineID",
    "name"
})
@XmlSeeAlso({
    MarketingCarrierType.class,
    OperatingCarrierType.class,
    AirlineMsgPartyCoreType.class
})
public class AirlineCoreRepType
    extends SupplierCoreRepType
{

    @XmlElement(name = "AirlineID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected AirlineID airlineID;
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String name;

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineID }
     *     
     */
    public AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineID }
     *     
     */
    public void setAirlineID(AirlineID value) {
        this.airlineID = value;
    }

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

}
