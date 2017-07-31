
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FailedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "associations",
    "remarks"
})
@XmlRootElement(name = "Failed", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class Failed {

    @XmlElement(name = "Code", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String code;
    @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderItemAssociationType associations;
    @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected RemarkType remarks;
    @XmlAttribute(name = "FailedInd")
    protected Boolean failedInd;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public OrderItemAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType }
     *     
     */
    public void setAssociations(OrderItemAssociationType value) {
        this.associations = value;
    }

    /**
     * Payment Remark(s).
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
     * Gets the value of the failedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailedInd() {
        return failedInd;
    }

    /**
     * Sets the value of the failedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailedInd(Boolean value) {
        this.failedInd = value;
    }

}
