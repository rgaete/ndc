
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated Offer Detail definition.
 * 
 * <p>Java class for OfferDetailInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDetailInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferInstructionReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferPenaltyReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferTermReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDetailInfoAssocType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "offerInstructionReferences",
    "offerPenaltyReferences",
    "offerTermReferences"
})
public class OfferDetailInfoAssocType {

    @XmlElement(name = "OfferInstructionReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object offerInstructionReferences;
    @XmlElement(name = "OfferPenaltyReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object offerPenaltyReferences;
    @XmlList
    @XmlElement(name = "OfferTermReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> offerTermReferences;

    /**
     * Gets the value of the offerInstructionReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferInstructionReferences() {
        return offerInstructionReferences;
    }

    /**
     * Sets the value of the offerInstructionReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferInstructionReferences(Object value) {
        this.offerInstructionReferences = value;
    }

    /**
     * Gets the value of the offerPenaltyReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOfferPenaltyReferences() {
        return offerPenaltyReferences;
    }

    /**
     * Sets the value of the offerPenaltyReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOfferPenaltyReferences(Object value) {
        this.offerPenaltyReferences = value;
    }

    /**
     * Gets the value of the offerTermReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTermReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTermReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOfferTermReferences() {
        if (offerTermReferences == null) {
            offerTermReferences = new ArrayList<Object>();
        }
        return this.offerTermReferences;
    }

}