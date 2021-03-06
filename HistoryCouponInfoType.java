
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * COUPON definition.
 * 
 * <p>Java class for HistoryCouponInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryCouponInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouponNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="PrevStatus" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *         &lt;element name="SettlementAuthCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="TransactionTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SoldAirlineInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CouponSoldAirlineType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrentAirlineInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CheckedInAirlineInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Party"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryCouponInfoType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "couponNumber",
    "status",
    "prevStatus",
    "settlementAuthCode",
    "transactionTimeStamp",
    "soldAirlineInfo",
    "currentAirlineInfo",
    "checkedInAirlineInfo",
    "party"
})
public class HistoryCouponInfoType {

    @XmlElement(name = "CouponNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Integer couponNumber;
    @XmlElement(name = "Status", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String status;
    @XmlElement(name = "PrevStatus", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String prevStatus;
    @XmlElement(name = "SettlementAuthCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String settlementAuthCode;
    @XmlElement(name = "TransactionTimeStamp", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTimeStamp;
    @XmlElement(name = "SoldAirlineInfo", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected HistoryCouponInfoType.SoldAirlineInfo soldAirlineInfo;
    @XmlElement(name = "CurrentAirlineInfo", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CouponSoldAirlineType currentAirlineInfo;
    @XmlElement(name = "CheckedInAirlineInfo", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CouponSoldAirlineType checkedInAirlineInfo;
    @XmlElement(name = "Party", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected MsgPartiesType party;

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponNumber(Integer value) {
        this.couponNumber = value;
    }

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
     * Gets the value of the prevStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevStatus() {
        return prevStatus;
    }

    /**
     * Sets the value of the prevStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevStatus(String value) {
        this.prevStatus = value;
    }

    /**
     * Gets the value of the settlementAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthCode() {
        return settlementAuthCode;
    }

    /**
     * Sets the value of the settlementAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthCode(String value) {
        this.settlementAuthCode = value;
    }

    /**
     * Gets the value of the transactionTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTimeStamp() {
        return transactionTimeStamp;
    }

    /**
     * Sets the value of the transactionTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTimeStamp(XMLGregorianCalendar value) {
        this.transactionTimeStamp = value;
    }

    /**
     * Gets the value of the soldAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryCouponInfoType.SoldAirlineInfo }
     *     
     */
    public HistoryCouponInfoType.SoldAirlineInfo getSoldAirlineInfo() {
        return soldAirlineInfo;
    }

    /**
     * Sets the value of the soldAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryCouponInfoType.SoldAirlineInfo }
     *     
     */
    public void setSoldAirlineInfo(HistoryCouponInfoType.SoldAirlineInfo value) {
        this.soldAirlineInfo = value;
    }

    /**
     * Gets the value of the currentAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public CouponSoldAirlineType getCurrentAirlineInfo() {
        return currentAirlineInfo;
    }

    /**
     * Sets the value of the currentAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public void setCurrentAirlineInfo(CouponSoldAirlineType value) {
        this.currentAirlineInfo = value;
    }

    /**
     * Gets the value of the checkedInAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public CouponSoldAirlineType getCheckedInAirlineInfo() {
        return checkedInAirlineInfo;
    }

    /**
     * Sets the value of the checkedInAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public void setCheckedInAirlineInfo(CouponSoldAirlineType value) {
        this.checkedInAirlineInfo = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType }
     *     
     */
    public MsgPartiesType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType }
     *     
     */
    public void setParty(MsgPartiesType value) {
        this.party = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CouponSoldAirlineType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SoldAirlineInfo
        extends CouponSoldAirlineType
    {


    }

}
