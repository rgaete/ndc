
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for Optional Service Coupon.
 * 
 * <p>Java class for ServiceCouponType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCouponType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstantPurchase" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="FeeBasis" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="CouponType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SrvceCouponSimpleType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "ServiceCouponType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "instantPurchase",
    "feeBasis",
    "couponType"
})
public class ServiceCouponType {

    @XmlElement(name = "InstantPurchase", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String instantPurchase;
    @XmlElement(name = "FeeBasis", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String feeBasis;
    @XmlElement(name = "CouponType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected ServiceCouponType.CouponType couponType;

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantPurchase(String value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the feeBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeBasis() {
        return feeBasis;
    }

    /**
     * Sets the value of the feeBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeBasis(String value) {
        this.feeBasis = value;
    }

    /**
     * Gets the value of the couponType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCouponType.CouponType }
     *     
     */
    public ServiceCouponType.CouponType getCouponType() {
        return couponType;
    }

    /**
     * Sets the value of the couponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCouponType.CouponType }
     *     
     */
    public void setCouponType(ServiceCouponType.CouponType value) {
        this.couponType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>SrvceCouponSimpleType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CouponType {

        @XmlValue
        protected String value;

        /**
         * A data type for Service Coupon Type.
         * 
         * Examples: E-Ticket, Flight, No_EMD, Standalone, Ticket, Other
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

    }

}