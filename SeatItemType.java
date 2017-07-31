
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A SEAT OFFER with additional Seat Characteristics information.
 * 
 * <p>Java class for SeatItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}GenericPriceType" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Location" type="{http://www.iata.org/IATA/EDIST/2017.1}SeatLocationType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatReference" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatItemType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "price",
    "descriptions",
    "location",
    "seatReference"
})
@XmlSeeAlso({
    SeatItem.class
})
public class SeatItemType {

    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected GenericPriceType price;
    @XmlElement(name = "Descriptions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Descriptions descriptions;
    @XmlElement(name = "Location", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SeatLocationType location;
    @XmlElementRef(name = "SeatReference", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> seatReference;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPriceType }
     *     
     */
    public GenericPriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPriceType }
     *     
     */
    public void setPrice(GenericPriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link SeatLocationType }
     *     
     */
    public SeatLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatLocationType }
     *     
     */
    public void setLocation(SeatLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the seatReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getSeatReference() {
        if (seatReference == null) {
            seatReference = new ArrayList<JAXBElement<Object>>();
        }
        return this.seatReference;
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

}
