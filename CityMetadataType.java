
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for CITY Metadata.
 * 
 * <p>Java class for CityMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Directions" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Position" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityMetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "directions",
    "position"
})
public class CityMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Directions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Directions directions;
    @XmlElement(name = "Position", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Position position;

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link Directions }
     *     
     */
    public Directions getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Directions }
     *     
     */
    public void setDirections(Directions value) {
        this.directions = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

}
