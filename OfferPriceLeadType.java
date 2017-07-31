
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * LEAD PRICING CALENDAR Pricing definition.
 * 
 * Price information for alternate dates.
 * 
 * Notes:
 *  1. This is based on lead pricing specified in the AirShoppingRQ/ AttributeQuery/Flight node Arrival and/ or Departure elements.
 * 
 *  2. This capability may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only.The technical implementation of this capability is not dictated by this specification.
 * 
 *  3. If implemented, the client application will typically send new a new shopping request if any of these window shopping dates are selected.
 * 
 * <p>Java class for OfferPriceLeadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPriceLeadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestedDate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferPriceLeadDetailType">
 *                 &lt;sequence>
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *       &lt;attribute name="OfferItemID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ModificationProhibitedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPriceLeadType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "requestedDate",
    "fareDetail"
})
@XmlSeeAlso({
    ndc.PricedFlightOfferType.OfferPrice.class,
    ndc.PricedFlightOfferCoreType.OfferPrice.class
})
public class OfferPriceLeadType {

    @XmlElement(name = "RequestedDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected OfferPriceLeadType.RequestedDate requestedDate;
    @XmlElement(name = "FareDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FareDetailType fareDetail;
    @XmlAttribute(name = "OfferItemID")
    @XmlSchemaType(name = "anySimpleType")
    protected String offerItemID;
    @XmlAttribute(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPriceLeadType.RequestedDate }
     *     
     */
    public OfferPriceLeadType.RequestedDate getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPriceLeadType.RequestedDate }
     *     
     */
    public void setRequestedDate(OfferPriceLeadType.RequestedDate value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OfferPriceLeadDetailType">
     *       &lt;sequence>
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associations"
    })
    public static class RequestedDate
        extends OfferPriceLeadDetailType
    {

        @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<PricedFlightOfferAssocType> associations;

        /**
         * Gets the value of the associations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedFlightOfferAssocType }
         * 
         * 
         */
        public List<PricedFlightOfferAssocType> getAssociations() {
            if (associations == null) {
                associations = new ArrayList<PricedFlightOfferAssocType>();
            }
            return this.associations;
        }

    }

}
