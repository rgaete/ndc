
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The address used for postal service. Examples are post office boxes address, postal physical address, postal code
 * 
 * <p>Java class for PostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="BuildingRoom" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="POBox" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleNameType" minOccurs="0"/>
 *         &lt;element name="CountrySubdivisionName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ISO_3166CountryCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "label",
    "street",
    "buildingRoom",
    "poBox",
    "postalCode",
    "cityName",
    "countrySubdivisionName",
    "countryName",
    "countryCode"
})
public class PostalAddressType {

    @XmlElement(name = "Label", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String label;
    @XmlElement(name = "Street", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<String> street;
    @XmlElement(name = "BuildingRoom", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String buildingRoom;
    @XmlElement(name = "POBox", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBox;
    @XmlElement(name = "PostalCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "CityName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    @XmlElement(name = "CountrySubdivisionName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String countrySubdivisionName;
    @XmlElement(name = "CountryName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String countryName;
    @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String countryCode;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the street property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreet() {
        if (street == null) {
            street = new ArrayList<String>();
        }
        return this.street;
    }

    /**
     * Gets the value of the buildingRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingRoom() {
        return buildingRoom;
    }

    /**
     * Sets the value of the buildingRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingRoom(String value) {
        this.buildingRoom = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countrySubdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionName() {
        return countrySubdivisionName;
    }

    /**
     * Sets the value of the countrySubdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionName(String value) {
        this.countrySubdivisionName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
