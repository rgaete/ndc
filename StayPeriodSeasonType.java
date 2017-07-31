
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * A data type for Season (Months/ Quarters) with Minimum/ Maximum Stay Duration.
 * 
 * <p>Java class for StayPeriodSeasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayPeriodSeasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Month" maxOccurs="12"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}QuarterPeriod" maxOccurs="4"/>
 *         &lt;/choice>
 *         &lt;element name="MinimumStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="MaximumStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
@XmlType(name = "StayPeriodSeasonType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "month",
    "quarterPeriod",
    "minimumStay",
    "maximumStay"
})
public class StayPeriodSeasonType {

    @XmlElement(name = "Month", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<MonthRepType> month;
    @XmlElement(name = "QuarterPeriod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<QuarterPeriodRepType> quarterPeriod;
    @XmlElement(name = "MinimumStay", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected Duration minimumStay;
    @XmlElement(name = "MaximumStay", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected Duration maximumStay;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the month property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the month property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthRepType }
     * 
     * 
     */
    public List<MonthRepType> getMonth() {
        if (month == null) {
            month = new ArrayList<MonthRepType>();
        }
        return this.month;
    }

    /**
     * Gets the value of the quarterPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quarterPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuarterPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuarterPeriodRepType }
     * 
     * 
     */
    public List<QuarterPeriodRepType> getQuarterPeriod() {
        if (quarterPeriod == null) {
            quarterPeriod = new ArrayList<QuarterPeriodRepType>();
        }
        return this.quarterPeriod;
    }

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumStay(Duration value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumStay(Duration value) {
        this.maximumStay = value;
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
