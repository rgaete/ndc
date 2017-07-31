
package ndc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ORDER CREATION PRICE VARIANCE RULE definition.
 * 
 * <p>Java class for PriceVarianceRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceVarianceRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleID" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/>
 *         &lt;element name="AcceptableVariance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountValue"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="EffectivePeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DatePeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DateTimePeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}QuarterPeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DayPeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MonthPeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearPeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearMonthPeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TimePeriod"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectKeyAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceVarianceRuleType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "ruleID",
    "acceptableVariance",
    "name",
    "owner",
    "effectivePeriod",
    "remarks"
})
public class PriceVarianceRuleType {

    @XmlElement(name = "RuleID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String ruleID;
    @XmlElement(name = "AcceptableVariance", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected PriceVarianceRuleType.AcceptableVariance acceptableVariance;
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PriceVarianceRuleType.Name name;
    @XmlElement(name = "Owner", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String owner;
    @XmlElement(name = "EffectivePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PriceVarianceRuleType.EffectivePeriod effectivePeriod;
    @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected RemarkType remarks;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the acceptableVariance property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleType.AcceptableVariance }
     *     
     */
    public PriceVarianceRuleType.AcceptableVariance getAcceptableVariance() {
        return acceptableVariance;
    }

    /**
     * Sets the value of the acceptableVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleType.AcceptableVariance }
     *     
     */
    public void setAcceptableVariance(PriceVarianceRuleType.AcceptableVariance value) {
        this.acceptableVariance = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleType.Name }
     *     
     */
    public PriceVarianceRuleType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleType.Name }
     *     
     */
    public void setName(PriceVarianceRuleType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleType.EffectivePeriod }
     *     
     */
    public PriceVarianceRuleType.EffectivePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleType.EffectivePeriod }
     *     
     */
    public void setEffectivePeriod(PriceVarianceRuleType.EffectivePeriod value) {
        this.effectivePeriod = value;
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

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountValue"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue" minOccurs="0"/>
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
        "currencyAmountValue",
        "percentageValue"
    })
    public static class AcceptableVariance {

        @XmlElement(name = "CurrencyAmountValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected CurrencyAmountOptType currencyAmountValue;
        @XmlElement(name = "PercentageValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected BigDecimal percentageValue;

        /**
         * Gets the value of the currencyAmountValue property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getCurrencyAmountValue() {
            return currencyAmountValue;
        }

        /**
         * Sets the value of the currencyAmountValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setCurrencyAmountValue(CurrencyAmountOptType value) {
            this.currencyAmountValue = value;
        }

        /**
         * Gets the value of the percentageValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentageValue() {
            return percentageValue;
        }

        /**
         * Sets the value of the percentageValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentageValue(BigDecimal value) {
            this.percentageValue = value;
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DatePeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DateTimePeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}QuarterPeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DayPeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MonthPeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearPeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearMonthPeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TimePeriod"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datePeriod",
        "dateTimePeriod",
        "quarterPeriod",
        "dayPeriod",
        "monthPeriod",
        "yearPeriod",
        "yearMonthPeriod",
        "timePeriod"
    })
    public static class EffectivePeriod {

        @XmlElement(name = "DatePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DatePeriodRepType datePeriod;
        @XmlElement(name = "DateTimePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DateTimePeriodRepType dateTimePeriod;
        @XmlElement(name = "QuarterPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected QuarterPeriodRepType quarterPeriod;
        @XmlElement(name = "DayPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected DayPeriodRepType dayPeriod;
        @XmlElement(name = "MonthPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MonthPeriodRepType monthPeriod;
        @XmlElement(name = "YearPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected YearPeriodRepType yearPeriod;
        @XmlElement(name = "YearMonthPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected YearMonthPeriodRepType yearMonthPeriod;
        @XmlElement(name = "TimePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TimePeriodRepType timePeriod;

        /**
         * Gets the value of the datePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DatePeriodRepType }
         *     
         */
        public DatePeriodRepType getDatePeriod() {
            return datePeriod;
        }

        /**
         * Sets the value of the datePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatePeriodRepType }
         *     
         */
        public void setDatePeriod(DatePeriodRepType value) {
            this.datePeriod = value;
        }

        /**
         * Gets the value of the dateTimePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public DateTimePeriodRepType getDateTimePeriod() {
            return dateTimePeriod;
        }

        /**
         * Sets the value of the dateTimePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public void setDateTimePeriod(DateTimePeriodRepType value) {
            this.dateTimePeriod = value;
        }

        /**
         * Gets the value of the quarterPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public QuarterPeriodRepType getQuarterPeriod() {
            return quarterPeriod;
        }

        /**
         * Sets the value of the quarterPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public void setQuarterPeriod(QuarterPeriodRepType value) {
            this.quarterPeriod = value;
        }

        /**
         * Gets the value of the dayPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DayPeriodRepType }
         *     
         */
        public DayPeriodRepType getDayPeriod() {
            return dayPeriod;
        }

        /**
         * Sets the value of the dayPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayPeriodRepType }
         *     
         */
        public void setDayPeriod(DayPeriodRepType value) {
            this.dayPeriod = value;
        }

        /**
         * Gets the value of the monthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public MonthPeriodRepType getMonthPeriod() {
            return monthPeriod;
        }

        /**
         * Sets the value of the monthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public void setMonthPeriod(MonthPeriodRepType value) {
            this.monthPeriod = value;
        }

        /**
         * Gets the value of the yearPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearPeriodRepType }
         *     
         */
        public YearPeriodRepType getYearPeriod() {
            return yearPeriod;
        }

        /**
         * Sets the value of the yearPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearPeriodRepType }
         *     
         */
        public void setYearPeriod(YearPeriodRepType value) {
            this.yearPeriod = value;
        }

        /**
         * Gets the value of the yearMonthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public YearMonthPeriodRepType getYearMonthPeriod() {
            return yearMonthPeriod;
        }

        /**
         * Sets the value of the yearMonthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public void setYearMonthPeriod(YearMonthPeriodRepType value) {
            this.yearMonthPeriod = value;
        }

        /**
         * Gets the value of the timePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link TimePeriodRepType }
         *     
         */
        public TimePeriodRepType getTimePeriod() {
            return timePeriod;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodRepType }
         *     
         */
        public void setTimePeriod(TimePeriodRepType value) {
            this.timePeriod = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
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
    public static class Name {

        @XmlValue
        protected String value;

        /**
         * A data type for Proper Name size constraint.
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
