
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing Parameters Notice definition.
 * 
 * <p>Java class for PricingParametersNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingParametersNoticeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}TrxProcessObjectBaseType">
 *       &lt;choice>
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AutoExchangeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="IncludeAwardReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AwardOnlyReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SimpleReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Results">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingParametersNoticeType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "query",
    "results"
})
public class PricingParametersNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Query", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PricingParametersNoticeType.Query query;
    @XmlElement(name = "Results", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PricingParametersNoticeType.Results results;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link PricingParametersNoticeType.Query }
     *     
     */
    public PricingParametersNoticeType.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParametersNoticeType.Query }
     *     
     */
    public void setQuery(PricingParametersNoticeType.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link PricingParametersNoticeType.Results }
     *     
     */
    public PricingParametersNoticeType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParametersNoticeType.Results }
     *     
     */
    public void setResults(PricingParametersNoticeType.Results value) {
        this.results = value;
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
     *       &lt;attribute name="AutoExchangeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="IncludeAwardReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AwardOnlyReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SimpleReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Query {

        @XmlAttribute(name = "AutoExchangeReqInd")
        protected Boolean autoExchangeReqInd;
        @XmlAttribute(name = "IncludeAwardReqInd")
        protected Boolean includeAwardReqInd;
        @XmlAttribute(name = "AwardOnlyReqInd")
        protected Boolean awardOnlyReqInd;
        @XmlAttribute(name = "SimpleReqInd")
        protected Boolean simpleReqInd;

        /**
         * Gets the value of the autoExchangeReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoExchangeReqInd() {
            return autoExchangeReqInd;
        }

        /**
         * Sets the value of the autoExchangeReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoExchangeReqInd(Boolean value) {
            this.autoExchangeReqInd = value;
        }

        /**
         * Gets the value of the includeAwardReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeAwardReqInd() {
            return includeAwardReqInd;
        }

        /**
         * Sets the value of the includeAwardReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeAwardReqInd(Boolean value) {
            this.includeAwardReqInd = value;
        }

        /**
         * Gets the value of the awardOnlyReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardOnlyReqInd() {
            return awardOnlyReqInd;
        }

        /**
         * Sets the value of the awardOnlyReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardOnlyReqInd(Boolean value) {
            this.awardOnlyReqInd = value;
        }

        /**
         * Gets the value of the simpleReqInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSimpleReqInd() {
            return simpleReqInd;
        }

        /**
         * Sets the value of the simpleReqInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSimpleReqInd(Boolean value) {
            this.simpleReqInd = value;
        }

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
     *       &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Results {

        @XmlAttribute(name = "AutoExchangeInd")
        protected Boolean autoExchangeInd;
        @XmlAttribute(name = "AwardIncludedInd")
        protected Boolean awardIncludedInd;
        @XmlAttribute(name = "AwardOnlyInd")
        protected Boolean awardOnlyInd;
        @XmlAttribute(name = "SimpleInd")
        protected Boolean simpleInd;

        /**
         * Gets the value of the autoExchangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoExchangeInd() {
            return autoExchangeInd;
        }

        /**
         * Sets the value of the autoExchangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoExchangeInd(Boolean value) {
            this.autoExchangeInd = value;
        }

        /**
         * Gets the value of the awardIncludedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardIncludedInd() {
            return awardIncludedInd;
        }

        /**
         * Sets the value of the awardIncludedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardIncludedInd(Boolean value) {
            this.awardIncludedInd = value;
        }

        /**
         * Gets the value of the awardOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardOnlyInd() {
            return awardOnlyInd;
        }

        /**
         * Sets the value of the awardOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardOnlyInd(Boolean value) {
            this.awardOnlyInd = value;
        }

        /**
         * Gets the value of the simpleInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSimpleInd() {
            return simpleInd;
        }

        /**
         * Sets the value of the simpleInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSimpleInd(Boolean value) {
            this.simpleInd = value;
        }

    }

}
