
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Offer Instructions.
 * 
 * <p>Java class for OfferInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferInstructionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ClassOfServiceUpgrade" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferClassUpgradeType"/>
 *         &lt;element name="FreeFormTextInstruction" type="{http://www.iata.org/IATA/EDIST/2017.1}FreeFormInstructionsType"/>
 *         &lt;element name="SpecialBookingInstruction" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferInstructionType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "classOfServiceUpgrade",
    "freeFormTextInstruction",
    "specialBookingInstruction"
})
@XmlSeeAlso({
    ndc.ListOfOfferInstructionsType.Instruction.class
})
public class OfferInstructionType {

    @XmlElement(name = "ClassOfServiceUpgrade", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OfferClassUpgradeType classOfServiceUpgrade;
    @XmlElement(name = "FreeFormTextInstruction", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FreeFormInstructionsType freeFormTextInstruction;
    @XmlElement(name = "SpecialBookingInstruction", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String specialBookingInstruction;

    /**
     * Gets the value of the classOfServiceUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link OfferClassUpgradeType }
     *     
     */
    public OfferClassUpgradeType getClassOfServiceUpgrade() {
        return classOfServiceUpgrade;
    }

    /**
     * Sets the value of the classOfServiceUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferClassUpgradeType }
     *     
     */
    public void setClassOfServiceUpgrade(OfferClassUpgradeType value) {
        this.classOfServiceUpgrade = value;
    }

    /**
     * Gets the value of the freeFormTextInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormInstructionsType }
     *     
     */
    public FreeFormInstructionsType getFreeFormTextInstruction() {
        return freeFormTextInstruction;
    }

    /**
     * Sets the value of the freeFormTextInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormInstructionsType }
     *     
     */
    public void setFreeFormTextInstruction(FreeFormInstructionsType value) {
        this.freeFormTextInstruction = value;
    }

    /**
     * Gets the value of the specialBookingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialBookingInstruction() {
        return specialBookingInstruction;
    }

    /**
     * Sets the value of the specialBookingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialBookingInstruction(String value) {
        this.specialBookingInstruction = value;
    }

}
