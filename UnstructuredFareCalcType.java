
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * COUPON-RELATED UNSTRUCTURED FARE CALCULATION definition.
 * 
 * <p>Java class for UnstructuredFareCalcType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredFareCalcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purpose" type="{http://www.iata.org/IATA/EDIST/2017.1}CouponPurposeListType" minOccurs="0"/>
 *         &lt;element name="PricingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9a-zA-Z]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9a-zA-Z]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Info" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="67"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "UnstructuredFareCalcType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "purpose",
    "pricingCode",
    "reportingCode",
    "info"
})
public class UnstructuredFareCalcType {

    @XmlElement(name = "Purpose", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "string")
    protected CouponPurposeListType purpose;
    @XmlElement(name = "PricingCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String pricingCode;
    @XmlElement(name = "ReportingCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String reportingCode;
    @XmlElement(name = "Info", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String info;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CouponPurposeListType }
     *     
     */
    public CouponPurposeListType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponPurposeListType }
     *     
     */
    public void setPurpose(CouponPurposeListType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the pricingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCode() {
        return pricingCode;
    }

    /**
     * Sets the value of the pricingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCode(String value) {
        this.pricingCode = value;
    }

    /**
     * Gets the value of the reportingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCode() {
        return reportingCode;
    }

    /**
     * Sets the value of the reportingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCode(String value) {
        this.reportingCode = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
