
package ndc;

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
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OrderInstructionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfServiceUpgrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FreeFormTextInstruction" minOccurs="0"/>
 *         &lt;element name="SpecialBookingInstruction" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
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
    "classOfServiceUpgrade",
    "freeFormTextInstruction",
    "specialBookingInstruction"
})
@XmlRootElement(name = "OrderInstructions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class OrderInstructions
    extends OrderInstructionType
{

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
