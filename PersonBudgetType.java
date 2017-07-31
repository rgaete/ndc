
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for PER PERSON BUDGET Qualifier.
 * 
 * <p>Java class for PersonBudgetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonBudgetType">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBudgetType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "amount"
})
public class PersonBudgetType {

    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected PersonBudgetType.Amount amount;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBudgetType.Amount }
     *     
     */
    public PersonBudgetType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBudgetType.Amount }
     *     
     */
    public void setAmount(PersonBudgetType.Amount value) {
        this.amount = value;
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
