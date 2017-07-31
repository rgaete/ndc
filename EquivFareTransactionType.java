
package ndc;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * EQUIVALENT FARE TRANSACTION definition.
 * 
 * <p>Java class for EquivFareTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivFareTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CurrencyAmountOptType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Purpose" type="{http://www.iata.org/IATA/EDIST/2017.1}CouponPurposeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EquivRate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquivFareTransactionType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "amount",
    "purpose"
})
public class EquivFareTransactionType {

    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected EquivFareTransactionType.Amount amount;
    @XmlElement(name = "Purpose", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "string")
    protected CouponPurposeListType purpose;
    @XmlAttribute(name = "EquivRate")
    protected BigDecimal equivRate;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link EquivFareTransactionType.Amount }
     *     
     */
    public EquivFareTransactionType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivFareTransactionType.Amount }
     *     
     */
    public void setAmount(EquivFareTransactionType.Amount value) {
        this.amount = value;
    }

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
     * Gets the value of the equivRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquivRate() {
        return equivRate;
    }

    /**
     * Sets the value of the equivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquivRate(BigDecimal value) {
        this.equivRate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CurrencyAmountOptType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amount
        extends CurrencyAmountOptType
    {


    }

}
