
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * AIR PASS CORE representation.
 * 
 * <p>Java class for AirPassCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPassCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineID"/>
 *         &lt;element name="Certificate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Number">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactAppSimpleType" minOccurs="0"/>
 *                   &lt;element name="EffectivePeriod" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearPeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearMonthPeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TimePeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}QuarterPeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MonthPeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DayPeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DateTimePeriod"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DatePeriod"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPassCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "airlineID",
    "certificate"
})
@XmlSeeAlso({
    AirPassDetailType.class
})
public class AirPassCoreType {

    @XmlElement(name = "AirlineID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected AirlineID airlineID;
    @XmlElement(name = "Certificate", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<AirPassCoreType.Certificate> certificate;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Air Pass Program issuing airline designator code. Example: BA
     * 
     * Encoding Scheme: IATA/ A4A (two to three character) Airline Designator Code
     * 
     * @return
     *     possible object is
     *     {@link AirlineID }
     *     
     */
    public AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineID }
     *     
     */
    public void setAirlineID(AirlineID value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPassCoreType.Certificate }
     * 
     * 
     */
    public List<AirPassCoreType.Certificate> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<AirPassCoreType.Certificate>();
        }
        return this.certificate;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Number">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactAppSimpleType" minOccurs="0"/>
     *         &lt;element name="EffectivePeriod" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearPeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearMonthPeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TimePeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}QuarterPeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MonthPeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DayPeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DateTimePeriod"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DatePeriod"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "number",
        "application",
        "effectivePeriod"
    })
    public static class Certificate {

        @XmlElement(name = "Number", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected AirPassCoreType.Certificate.Number number;
        @XmlElement(name = "Application", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String application;
        @XmlElement(name = "EffectivePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AirPassCoreType.Certificate.EffectivePeriod effectivePeriod;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link AirPassCoreType.Certificate.Number }
         *     
         */
        public AirPassCoreType.Certificate.Number getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirPassCoreType.Certificate.Number }
         *     
         */
        public void setNumber(AirPassCoreType.Certificate.Number value) {
            this.number = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the effectivePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link AirPassCoreType.Certificate.EffectivePeriod }
         *     
         */
        public AirPassCoreType.Certificate.EffectivePeriod getEffectivePeriod() {
            return effectivePeriod;
        }

        /**
         * Sets the value of the effectivePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirPassCoreType.Certificate.EffectivePeriod }
         *     
         */
        public void setEffectivePeriod(AirPassCoreType.Certificate.EffectivePeriod value) {
            this.effectivePeriod = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearPeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}YearMonthPeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TimePeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}QuarterPeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MonthPeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DayPeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DateTimePeriod"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DatePeriod"/>
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
            "yearPeriod",
            "yearMonthPeriod",
            "timePeriod",
            "quarterPeriod",
            "monthPeriod",
            "dayPeriod",
            "dateTimePeriod",
            "datePeriod"
        })
        public static class EffectivePeriod {

            @XmlElement(name = "YearPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected YearPeriodRepType yearPeriod;
            @XmlElement(name = "YearMonthPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected YearMonthPeriodRepType yearMonthPeriod;
            @XmlElement(name = "TimePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected TimePeriodRepType timePeriod;
            @XmlElement(name = "QuarterPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected QuarterPeriodRepType quarterPeriod;
            @XmlElement(name = "MonthPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected MonthPeriodRepType monthPeriod;
            @XmlElement(name = "DayPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected DayPeriodRepType dayPeriod;
            @XmlElement(name = "DateTimePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected DateTimePeriodRepType dateTimePeriod;
            @XmlElement(name = "DatePeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected DatePeriodRepType datePeriod;

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
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
        public static class Number {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

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

        }

    }

}
