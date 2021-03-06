
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order FARE RULES definition.
 * 
 * <p>Java class for OrderFareRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFareRulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Penalty" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateFare" minOccurs="0"/>
 *         &lt;element name="AdvanceStay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvancePurchase" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvanceTicketing" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MinimumStay" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MaximumStay" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderFareRulesType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "penalty",
    "corporateFare",
    "advanceStay",
    "remarks"
})
public class OrderFareRulesType {

    @XmlElement(name = "Penalty", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected PenaltyDetailType penalty;
    @XmlElement(name = "CorporateFare", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CorporateFare corporateFare;
    @XmlElement(name = "AdvanceStay", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected OrderFareRulesType.AdvanceStay advanceStay;
    @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected RemarkType remarks;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyDetailType }
     *     
     */
    public PenaltyDetailType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyDetailType }
     *     
     */
    public void setPenalty(PenaltyDetailType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the corporateFare property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFare }
     *     
     */
    public CorporateFare getCorporateFare() {
        return corporateFare;
    }

    /**
     * Sets the value of the corporateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFare }
     *     
     */
    public void setCorporateFare(CorporateFare value) {
        this.corporateFare = value;
    }

    /**
     * Gets the value of the advanceStay property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFareRulesType.AdvanceStay }
     *     
     */
    public OrderFareRulesType.AdvanceStay getAdvanceStay() {
        return advanceStay;
    }

    /**
     * Sets the value of the advanceStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFareRulesType.AdvanceStay }
     *     
     */
    public void setAdvanceStay(OrderFareRulesType.AdvanceStay value) {
        this.advanceStay = value;
    }

    /**
     * Fare Remark(s).
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvancePurchase" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvanceTicketing" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MinimumStay" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MaximumStay" minOccurs="0"/>
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
        "advancePurchase",
        "advanceTicketing",
        "minimumStay",
        "maximumStay"
    })
    public static class AdvanceStay {

        @XmlElement(name = "AdvancePurchase", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AdvancePurchase advancePurchase;
        @XmlElement(name = "AdvanceTicketing", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AdvanceTicketing advanceTicketing;
        @XmlElement(name = "MinimumStay", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MinimumStay minimumStay;
        @XmlElement(name = "MaximumStay", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MaximumStay maximumStay;

        /**
         * Gets the value of the advancePurchase property.
         * 
         * @return
         *     possible object is
         *     {@link AdvancePurchase }
         *     
         */
        public AdvancePurchase getAdvancePurchase() {
            return advancePurchase;
        }

        /**
         * Sets the value of the advancePurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvancePurchase }
         *     
         */
        public void setAdvancePurchase(AdvancePurchase value) {
            this.advancePurchase = value;
        }

        /**
         * Gets the value of the advanceTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvanceTicketing }
         *     
         */
        public AdvanceTicketing getAdvanceTicketing() {
            return advanceTicketing;
        }

        /**
         * Sets the value of the advanceTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvanceTicketing }
         *     
         */
        public void setAdvanceTicketing(AdvanceTicketing value) {
            this.advanceTicketing = value;
        }

        /**
         * Gets the value of the minimumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MinimumStay }
         *     
         */
        public MinimumStay getMinimumStay() {
            return minimumStay;
        }

        /**
         * Sets the value of the minimumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinimumStay }
         *     
         */
        public void setMinimumStay(MinimumStay value) {
            this.minimumStay = value;
        }

        /**
         * Gets the value of the maximumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MaximumStay }
         *     
         */
        public MaximumStay getMaximumStay() {
            return maximumStay;
        }

        /**
         * Sets the value of the maximumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaximumStay }
         *     
         */
        public void setMaximumStay(MaximumStay value) {
            this.maximumStay = value;
        }

    }

}
