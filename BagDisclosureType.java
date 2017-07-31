
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * Select a value from the enumerated list or enter a string value.
 *  =enumerated values=
 * N = NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
 * Y = SUBJECT TO US DOT RESERVATION AND DISCLOSURE
 * D = SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
 * 
 * <p>Java class for BagDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagDisclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagRule" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDiscloseRuleSimpleType"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
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
@XmlType(name = "BagDisclosureType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "bagRule",
    "descriptions",
    "remarks"
})
public class BagDisclosureType {

    @XmlElement(name = "BagRule", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String bagRule;
    @XmlElement(name = "Descriptions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Descriptions descriptions;
    @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected RemarkType remarks;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the bagRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagRule() {
        return bagRule;
    }

    /**
     * Sets the value of the bagRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagRule(String value) {
        this.bagRule = value;
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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
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
