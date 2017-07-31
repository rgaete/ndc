
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER/ OFFER ITEM STATUS definition.
 * 
 * <p>Java class for OfferStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AugmentationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferStatusType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "status",
    "augmentationPoint"
})
public class OfferStatusType {

    @XmlElement(name = "Status", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String status;
    @XmlElement(name = "AugmentationPoint", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AugPointInfoType augmentationPoint;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the augmentationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AugPointInfoType }
     *     
     */
    public AugPointInfoType getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointInfoType }
     *     
     */
    public void setAugmentationPoint(AugPointInfoType value) {
        this.augmentationPoint = value;
    }

}
