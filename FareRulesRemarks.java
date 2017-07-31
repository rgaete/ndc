
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
 *         &lt;element name="FareRulesRemark" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                   &lt;element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType"/>
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
    "fareRulesRemark"
})
@XmlRootElement(name = "FareRulesRemarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class FareRulesRemarks {

    @XmlElement(name = "FareRulesRemark", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<FareRulesRemarks.FareRulesRemark> fareRulesRemark;

    /**
     * Gets the value of the fareRulesRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRulesRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRulesRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRulesRemarks.FareRulesRemark }
     * 
     * 
     */
    public List<FareRulesRemarks.FareRulesRemark> getFareRulesRemark() {
        if (fareRulesRemark == null) {
            fareRulesRemark = new ArrayList<FareRulesRemarks.FareRulesRemark>();
        }
        return this.fareRulesRemark;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType">
     *       &lt;sequence>
     *         &lt;element name="Category" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *         &lt;element name="Text" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType"/>
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
        "category",
        "text"
    })
    public static class FareRulesRemark
        extends KeyWithMetaObjectBaseType
    {

        @XmlElement(name = "Category", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String category;
        @XmlElement(name = "Text", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected String text;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
