
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="MarketMessage" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionType">
 *                 &lt;sequence>
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}MultiAssociationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "", propOrder = {
    "marketMessage"
})
@XmlRootElement(name = "MarketingMessages", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class MarketingMessages {

    @XmlElement(name = "MarketMessage", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<MarketingMessages.MarketMessage> marketMessage;

    /**
     * Gets the value of the marketMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingMessages.MarketMessage }
     * 
     * 
     */
    public List<MarketingMessages.MarketMessage> getMarketMessage() {
        if (marketMessage == null) {
            marketMessage = new ArrayList<MarketingMessages.MarketMessage>();
        }
        return this.marketMessage;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionType">
     *       &lt;sequence>
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}MultiAssociationType" minOccurs="0"/>
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
    public static class MarketMessage
        extends DescriptionType
    {

        @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MultiAssociationType associations;

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link MultiAssociationType }
         *     
         */
        public MultiAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiAssociationType }
         *     
         */
        public void setAssociations(MultiAssociationType value) {
            this.associations = value;
        }

    }

}
