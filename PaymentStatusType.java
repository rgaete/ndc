
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * PAYMENT STATUS definition.
 * 
 * <p>Java class for PaymentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *         &lt;element name="IncompletePayment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "statusCode",
    "incompletePayment"
})
@XmlSeeAlso({
    ndc.PaymentProcessType.Status.class
})
public class PaymentStatusType {

    @XmlElement(name = "StatusCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String statusCode;
    @XmlElement(name = "IncompletePayment", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PaymentStatusType.IncompletePayment incompletePayment;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the incompletePayment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusType.IncompletePayment }
     *     
     */
    public PaymentStatusType.IncompletePayment getIncompletePayment() {
        return incompletePayment;
    }

    /**
     * Sets the value of the incompletePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusType.IncompletePayment }
     *     
     */
    public void setIncompletePayment(PaymentStatusType.IncompletePayment value) {
        this.incompletePayment = value;
    }


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
     *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusCode",
        "associations",
        "remarks"
    })
    public static class IncompletePayment {

        @XmlElement(name = "StatusCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String statusCode;
        @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected OrderItemAssociationType associations;
        @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected RemarkType remarks;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
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

    }

}
