
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Shopping Request Business Object: PROGRAM Qualifiers.
 * 
 * <p>Java class for ProgramQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DiscountProgramQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}IncentiveProgramQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PrePaidProgramQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ProgramStatusQualifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramQualifierType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "discountProgramQualifier",
    "incentiveProgramQualifier",
    "prePaidProgramQualifier",
    "programStatusQualifier"
})
public class ProgramQualifierType {

    @XmlElement(name = "DiscountProgramQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected DiscountProgramType discountProgramQualifier;
    @XmlElement(name = "IncentiveProgramQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected IncentiveProgramQualifier incentiveProgramQualifier;
    @XmlElement(name = "PrePaidProgramQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PrePaidProgramQualifier prePaidProgramQualifier;
    @XmlElement(name = "ProgramStatusQualifier", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected ProgramStatusQualifier programStatusQualifier;

    /**
     * Discount Program Qualifiers; fare type for this PTC.
     * Notes:
     *  1. Supports pricing discounts and/ or other benefits from membership in Travel Discount Programs, such as AARP and AAA.
     *  2. Discount Programs may be associated to individual Travellers but will apply to ALL Travellers if no associations are specified.
     * 
     * @return
     *     possible object is
     *     {@link DiscountProgramType }
     *     
     */
    public DiscountProgramType getDiscountProgramQualifier() {
        return discountProgramQualifier;
    }

    /**
     * Sets the value of the discountProgramQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountProgramType }
     *     
     */
    public void setDiscountProgramQualifier(DiscountProgramType value) {
        this.discountProgramQualifier = value;
    }

    /**
     * Gets the value of the incentiveProgramQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link IncentiveProgramQualifier }
     *     
     */
    public IncentiveProgramQualifier getIncentiveProgramQualifier() {
        return incentiveProgramQualifier;
    }

    /**
     * Sets the value of the incentiveProgramQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncentiveProgramQualifier }
     *     
     */
    public void setIncentiveProgramQualifier(IncentiveProgramQualifier value) {
        this.incentiveProgramQualifier = value;
    }

    /**
     * Gets the value of the prePaidProgramQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidProgramQualifier }
     *     
     */
    public PrePaidProgramQualifier getPrePaidProgramQualifier() {
        return prePaidProgramQualifier;
    }

    /**
     * Sets the value of the prePaidProgramQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidProgramQualifier }
     *     
     */
    public void setPrePaidProgramQualifier(PrePaidProgramQualifier value) {
        this.prePaidProgramQualifier = value;
    }

    /**
     * Gets the value of the programStatusQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramStatusQualifier }
     *     
     */
    public ProgramStatusQualifier getProgramStatusQualifier() {
        return programStatusQualifier;
    }

    /**
     * Sets the value of the programStatusQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramStatusQualifier }
     *     
     */
    public void setProgramStatusQualifier(ProgramStatusQualifier value) {
        this.programStatusQualifier = value;
    }

}
