
package ndc;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Percent" type="{http://www.iata.org/IATA/EDIST/2017.1}Percentage" />
 *       &lt;attribute name="Period" use="required" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="LatePercent" type="{http://www.iata.org/IATA/EDIST/2017.1}Percentage" />
 *       &lt;attribute name="CancelledPercent" type="{http://www.iata.org/IATA/EDIST/2017.1}Percentage" />
 *       &lt;attribute name="SpecialHighlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OnTimePerformance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class OnTimePerformance {

    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "Period", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar period;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String type;
    @XmlAttribute(name = "LatePercent")
    protected BigDecimal latePercent;
    @XmlAttribute(name = "CancelledPercent")
    protected BigDecimal cancelledPercent;
    @XmlAttribute(name = "SpecialHighlightInd")
    protected Boolean specialHighlightInd;

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriod(XMLGregorianCalendar value) {
        this.period = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the latePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatePercent() {
        return latePercent;
    }

    /**
     * Sets the value of the latePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatePercent(BigDecimal value) {
        this.latePercent = value;
    }

    /**
     * Gets the value of the cancelledPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancelledPercent() {
        return cancelledPercent;
    }

    /**
     * Sets the value of the cancelledPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancelledPercent(BigDecimal value) {
        this.cancelledPercent = value;
    }

    /**
     * Gets the value of the specialHighlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialHighlightInd() {
        return specialHighlightInd;
    }

    /**
     * Sets the value of the specialHighlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialHighlightInd(Boolean value) {
        this.specialHighlightInd = value;
    }

}