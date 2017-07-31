
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OTHER CONTACT METHOD definition.
 * 
 * <p>Java class for OtherContactMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherContactMethodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ContactCoreType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/>
 *         &lt;element name="Value" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType"/>
 *         &lt;element name="GroupName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherContactMethodType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "name",
    "value",
    "groupName"
})
public class OtherContactMethodType
    extends ContactCoreType
{

    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String name;
    @XmlElement(name = "Value", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String value;
    @XmlElement(name = "GroupName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String groupName;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

}
