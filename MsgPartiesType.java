
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Authentication and Notification of NDC Actors participating in the message/ transaction. Note that information about parties is intended for business use, it is not intended for transaction authentication and routing of the message.
 * 
 * <p>Java class for MsgPartiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgPartiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUserSender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorSender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemSender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierSender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Sender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierSender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Sender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailPartnerSender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencySender"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateSender"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Participants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Participant" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorParticipant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemParticipant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierParticipant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Participant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierParticipant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Participant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailSupplierParticipant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyParticipant" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateParticipant" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recipient" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUserRecipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorRecipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemRecipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierRecipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Recipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierRecipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Recipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailPartnerRecipient"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyRecipient"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
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
@XmlType(name = "MsgPartiesType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "sender",
    "participants",
    "recipient"
})
public class MsgPartiesType {

    @XmlElement(name = "Sender", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected MsgPartiesType.Sender sender;
    @XmlElementRef(name = "Participants", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgPartiesType.Participants> participants;
    @XmlElementRef(name = "Recipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MsgPartiesType.Recipient> recipient;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType.Sender }
     *     
     */
    public MsgPartiesType.Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType.Sender }
     *     
     */
    public void setSender(MsgPartiesType.Sender value) {
        this.sender = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgPartiesType.Participants }{@code >}
     *     
     */
    public JAXBElement<MsgPartiesType.Participants> getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgPartiesType.Participants }{@code >}
     *     
     */
    public void setParticipants(JAXBElement<MsgPartiesType.Participants> value) {
        this.participants = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MsgPartiesType.Recipient }{@code >}
     *     
     */
    public JAXBElement<MsgPartiesType.Recipient> getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MsgPartiesType.Recipient }{@code >}
     *     
     */
    public void setRecipient(JAXBElement<MsgPartiesType.Recipient> value) {
        this.recipient = value;
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
     *         &lt;element name="Participant" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorParticipant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemParticipant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierParticipant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Participant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierParticipant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Participant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailSupplierParticipant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyParticipant" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateParticipant" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
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
        "participant"
    })
    public static class Participants {

        @XmlElement(name = "Participant", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<MsgPartiesType.Participants.Participant> participant;

        /**
         * Gets the value of the participant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MsgPartiesType.Participants.Participant }
         * 
         * 
         */
        public List<MsgPartiesType.Participants.Participant> getParticipant() {
            if (participant == null) {
                participant = new ArrayList<MsgPartiesType.Participants.Participant>();
            }
            return this.participant;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorParticipant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemParticipant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierParticipant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Participant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierParticipant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Participant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailSupplierParticipant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyParticipant" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateParticipant" minOccurs="0"/>
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
            "aggregatorParticipant",
            "enabledSystemParticipant",
            "marketingCarrierParticipant",
            "oraParticipant",
            "operatingCarrierParticipant",
            "poaParticipant",
            "retailSupplierParticipant",
            "travelAgencyParticipant",
            "corporateParticipant"
        })
        public static class Participant {

            @XmlElement(name = "AggregatorParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected AggregatorParticipantType aggregatorParticipant;
            @XmlElement(name = "EnabledSystemParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected EnabledSysParticipantType enabledSystemParticipant;
            @XmlElement(name = "MarketingCarrierParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected MarketingCarrierParticipantType marketingCarrierParticipant;
            @XmlElement(name = "ORA_Participant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected ORAAirlineParticipantType oraParticipant;
            @XmlElement(name = "OperatingCarrierParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected OperatingCarrierParticipantType operatingCarrierParticipant;
            @XmlElement(name = "POA_Participant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected POAAirlineParticipantType poaParticipant;
            @XmlElement(name = "RetailSupplierParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected RetailSupplierParticipantType retailSupplierParticipant;
            @XmlElement(name = "TravelAgencyParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected TravelAgencyParticipantType travelAgencyParticipant;
            @XmlElement(name = "CorporateParticipant", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CorporateParticipant corporateParticipant;

            /**
             * Gets the value of the aggregatorParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link AggregatorParticipantType }
             *     
             */
            public AggregatorParticipantType getAggregatorParticipant() {
                return aggregatorParticipant;
            }

            /**
             * Sets the value of the aggregatorParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link AggregatorParticipantType }
             *     
             */
            public void setAggregatorParticipant(AggregatorParticipantType value) {
                this.aggregatorParticipant = value;
            }

            /**
             * Gets the value of the enabledSystemParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link EnabledSysParticipantType }
             *     
             */
            public EnabledSysParticipantType getEnabledSystemParticipant() {
                return enabledSystemParticipant;
            }

            /**
             * Sets the value of the enabledSystemParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnabledSysParticipantType }
             *     
             */
            public void setEnabledSystemParticipant(EnabledSysParticipantType value) {
                this.enabledSystemParticipant = value;
            }

            /**
             * Gets the value of the marketingCarrierParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link MarketingCarrierParticipantType }
             *     
             */
            public MarketingCarrierParticipantType getMarketingCarrierParticipant() {
                return marketingCarrierParticipant;
            }

            /**
             * Sets the value of the marketingCarrierParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link MarketingCarrierParticipantType }
             *     
             */
            public void setMarketingCarrierParticipant(MarketingCarrierParticipantType value) {
                this.marketingCarrierParticipant = value;
            }

            /**
             * Gets the value of the oraParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link ORAAirlineParticipantType }
             *     
             */
            public ORAAirlineParticipantType getORAParticipant() {
                return oraParticipant;
            }

            /**
             * Sets the value of the oraParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link ORAAirlineParticipantType }
             *     
             */
            public void setORAParticipant(ORAAirlineParticipantType value) {
                this.oraParticipant = value;
            }

            /**
             * Gets the value of the operatingCarrierParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link OperatingCarrierParticipantType }
             *     
             */
            public OperatingCarrierParticipantType getOperatingCarrierParticipant() {
                return operatingCarrierParticipant;
            }

            /**
             * Sets the value of the operatingCarrierParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperatingCarrierParticipantType }
             *     
             */
            public void setOperatingCarrierParticipant(OperatingCarrierParticipantType value) {
                this.operatingCarrierParticipant = value;
            }

            /**
             * Gets the value of the poaParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link POAAirlineParticipantType }
             *     
             */
            public POAAirlineParticipantType getPOAParticipant() {
                return poaParticipant;
            }

            /**
             * Sets the value of the poaParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link POAAirlineParticipantType }
             *     
             */
            public void setPOAParticipant(POAAirlineParticipantType value) {
                this.poaParticipant = value;
            }

            /**
             * Gets the value of the retailSupplierParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link RetailSupplierParticipantType }
             *     
             */
            public RetailSupplierParticipantType getRetailSupplierParticipant() {
                return retailSupplierParticipant;
            }

            /**
             * Sets the value of the retailSupplierParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link RetailSupplierParticipantType }
             *     
             */
            public void setRetailSupplierParticipant(RetailSupplierParticipantType value) {
                this.retailSupplierParticipant = value;
            }

            /**
             * Gets the value of the travelAgencyParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link TravelAgencyParticipantType }
             *     
             */
            public TravelAgencyParticipantType getTravelAgencyParticipant() {
                return travelAgencyParticipant;
            }

            /**
             * Sets the value of the travelAgencyParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelAgencyParticipantType }
             *     
             */
            public void setTravelAgencyParticipant(TravelAgencyParticipantType value) {
                this.travelAgencyParticipant = value;
            }

            /**
             * Gets the value of the corporateParticipant property.
             * 
             * @return
             *     possible object is
             *     {@link CorporateParticipant }
             *     
             */
            public CorporateParticipant getCorporateParticipant() {
                return corporateParticipant;
            }

            /**
             * Sets the value of the corporateParticipant property.
             * 
             * @param value
             *     allowed object is
             *     {@link CorporateParticipant }
             *     
             */
            public void setCorporateParticipant(CorporateParticipant value) {
                this.corporateParticipant = value;
            }

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUserRecipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorRecipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemRecipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierRecipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Recipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierRecipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Recipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailPartnerRecipient"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyRecipient"/>
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
        "agentUserRecipient",
        "aggregatorRecipient",
        "enabledSystemRecipient",
        "marketingCarrierRecipient",
        "oraRecipient",
        "operatingCarrierRecipient",
        "poaRecipient",
        "retailPartnerRecipient",
        "travelAgencyRecipient"
    })
    public static class Recipient {

        @XmlElement(name = "AgentUserRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AgentUserRecipientType agentUserRecipient;
        @XmlElement(name = "AggregatorRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AggregatorRecipientType aggregatorRecipient;
        @XmlElement(name = "EnabledSystemRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected EnabledSysRecipientType enabledSystemRecipient;
        @XmlElement(name = "MarketingCarrierRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MarketingCarrierRecipientType marketingCarrierRecipient;
        @XmlElement(name = "ORA_Recipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ORAAirlineRecipientType oraRecipient;
        @XmlElement(name = "OperatingCarrierRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OperatingCarrierRecipientType operatingCarrierRecipient;
        @XmlElement(name = "POA_Recipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected POAAirlineRecipientType poaRecipient;
        @XmlElement(name = "RetailPartnerRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected RetailSupplierRecipientType retailPartnerRecipient;
        @XmlElement(name = "TravelAgencyRecipient", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TravelAgencyRecipientType travelAgencyRecipient;

        /**
         * Gets the value of the agentUserRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link AgentUserRecipientType }
         *     
         */
        public AgentUserRecipientType getAgentUserRecipient() {
            return agentUserRecipient;
        }

        /**
         * Sets the value of the agentUserRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentUserRecipientType }
         *     
         */
        public void setAgentUserRecipient(AgentUserRecipientType value) {
            this.agentUserRecipient = value;
        }

        /**
         * Gets the value of the aggregatorRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link AggregatorRecipientType }
         *     
         */
        public AggregatorRecipientType getAggregatorRecipient() {
            return aggregatorRecipient;
        }

        /**
         * Sets the value of the aggregatorRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link AggregatorRecipientType }
         *     
         */
        public void setAggregatorRecipient(AggregatorRecipientType value) {
            this.aggregatorRecipient = value;
        }

        /**
         * Gets the value of the enabledSystemRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link EnabledSysRecipientType }
         *     
         */
        public EnabledSysRecipientType getEnabledSystemRecipient() {
            return enabledSystemRecipient;
        }

        /**
         * Sets the value of the enabledSystemRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnabledSysRecipientType }
         *     
         */
        public void setEnabledSystemRecipient(EnabledSysRecipientType value) {
            this.enabledSystemRecipient = value;
        }

        /**
         * Gets the value of the marketingCarrierRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link MarketingCarrierRecipientType }
         *     
         */
        public MarketingCarrierRecipientType getMarketingCarrierRecipient() {
            return marketingCarrierRecipient;
        }

        /**
         * Sets the value of the marketingCarrierRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketingCarrierRecipientType }
         *     
         */
        public void setMarketingCarrierRecipient(MarketingCarrierRecipientType value) {
            this.marketingCarrierRecipient = value;
        }

        /**
         * Gets the value of the oraRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link ORAAirlineRecipientType }
         *     
         */
        public ORAAirlineRecipientType getORARecipient() {
            return oraRecipient;
        }

        /**
         * Sets the value of the oraRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORAAirlineRecipientType }
         *     
         */
        public void setORARecipient(ORAAirlineRecipientType value) {
            this.oraRecipient = value;
        }

        /**
         * Gets the value of the operatingCarrierRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingCarrierRecipientType }
         *     
         */
        public OperatingCarrierRecipientType getOperatingCarrierRecipient() {
            return operatingCarrierRecipient;
        }

        /**
         * Sets the value of the operatingCarrierRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingCarrierRecipientType }
         *     
         */
        public void setOperatingCarrierRecipient(OperatingCarrierRecipientType value) {
            this.operatingCarrierRecipient = value;
        }

        /**
         * Gets the value of the poaRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link POAAirlineRecipientType }
         *     
         */
        public POAAirlineRecipientType getPOARecipient() {
            return poaRecipient;
        }

        /**
         * Sets the value of the poaRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link POAAirlineRecipientType }
         *     
         */
        public void setPOARecipient(POAAirlineRecipientType value) {
            this.poaRecipient = value;
        }

        /**
         * Gets the value of the retailPartnerRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link RetailSupplierRecipientType }
         *     
         */
        public RetailSupplierRecipientType getRetailPartnerRecipient() {
            return retailPartnerRecipient;
        }

        /**
         * Sets the value of the retailPartnerRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetailSupplierRecipientType }
         *     
         */
        public void setRetailPartnerRecipient(RetailSupplierRecipientType value) {
            this.retailPartnerRecipient = value;
        }

        /**
         * Gets the value of the travelAgencyRecipient property.
         * 
         * @return
         *     possible object is
         *     {@link TravelAgencyRecipientType }
         *     
         */
        public TravelAgencyRecipientType getTravelAgencyRecipient() {
            return travelAgencyRecipient;
        }

        /**
         * Sets the value of the travelAgencyRecipient property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelAgencyRecipientType }
         *     
         */
        public void setTravelAgencyRecipient(TravelAgencyRecipientType value) {
            this.travelAgencyRecipient = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUserSender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorSender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemSender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierSender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ORA_Sender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierSender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}POA_Sender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailPartnerSender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencySender"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateSender"/>
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
        "agentUserSender",
        "aggregatorSender",
        "enabledSystemSender",
        "marketingCarrierSender",
        "oraSender",
        "operatingCarrierSender",
        "poaSender",
        "retailPartnerSender",
        "travelAgencySender",
        "corporateSender"
    })
    public static class Sender {

        @XmlElement(name = "AgentUserSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AgentUserSenderType agentUserSender;
        @XmlElement(name = "AggregatorSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected AggregatorSenderType aggregatorSender;
        @XmlElement(name = "EnabledSystemSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected EnabledSysSenderType enabledSystemSender;
        @XmlElement(name = "MarketingCarrierSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MarketingCarrierSenderType marketingCarrierSender;
        @XmlElement(name = "ORA_Sender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ORAAirlineSenderType oraSender;
        @XmlElement(name = "OperatingCarrierSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OperatingCarrierSenderType operatingCarrierSender;
        @XmlElement(name = "POA_Sender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected POAAirlineSenderType poaSender;
        @XmlElement(name = "RetailPartnerSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected RetailSupplierSenderType retailPartnerSender;
        @XmlElement(name = "TravelAgencySender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected TravelAgencySenderType travelAgencySender;
        @XmlElement(name = "CorporateSender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CorporateSender corporateSender;

        /**
         * Gets the value of the agentUserSender property.
         * 
         * @return
         *     possible object is
         *     {@link AgentUserSenderType }
         *     
         */
        public AgentUserSenderType getAgentUserSender() {
            return agentUserSender;
        }

        /**
         * Sets the value of the agentUserSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgentUserSenderType }
         *     
         */
        public void setAgentUserSender(AgentUserSenderType value) {
            this.agentUserSender = value;
        }

        /**
         * Gets the value of the aggregatorSender property.
         * 
         * @return
         *     possible object is
         *     {@link AggregatorSenderType }
         *     
         */
        public AggregatorSenderType getAggregatorSender() {
            return aggregatorSender;
        }

        /**
         * Sets the value of the aggregatorSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link AggregatorSenderType }
         *     
         */
        public void setAggregatorSender(AggregatorSenderType value) {
            this.aggregatorSender = value;
        }

        /**
         * Gets the value of the enabledSystemSender property.
         * 
         * @return
         *     possible object is
         *     {@link EnabledSysSenderType }
         *     
         */
        public EnabledSysSenderType getEnabledSystemSender() {
            return enabledSystemSender;
        }

        /**
         * Sets the value of the enabledSystemSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnabledSysSenderType }
         *     
         */
        public void setEnabledSystemSender(EnabledSysSenderType value) {
            this.enabledSystemSender = value;
        }

        /**
         * Gets the value of the marketingCarrierSender property.
         * 
         * @return
         *     possible object is
         *     {@link MarketingCarrierSenderType }
         *     
         */
        public MarketingCarrierSenderType getMarketingCarrierSender() {
            return marketingCarrierSender;
        }

        /**
         * Sets the value of the marketingCarrierSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketingCarrierSenderType }
         *     
         */
        public void setMarketingCarrierSender(MarketingCarrierSenderType value) {
            this.marketingCarrierSender = value;
        }

        /**
         * Gets the value of the oraSender property.
         * 
         * @return
         *     possible object is
         *     {@link ORAAirlineSenderType }
         *     
         */
        public ORAAirlineSenderType getORASender() {
            return oraSender;
        }

        /**
         * Sets the value of the oraSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link ORAAirlineSenderType }
         *     
         */
        public void setORASender(ORAAirlineSenderType value) {
            this.oraSender = value;
        }

        /**
         * Gets the value of the operatingCarrierSender property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingCarrierSenderType }
         *     
         */
        public OperatingCarrierSenderType getOperatingCarrierSender() {
            return operatingCarrierSender;
        }

        /**
         * Sets the value of the operatingCarrierSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingCarrierSenderType }
         *     
         */
        public void setOperatingCarrierSender(OperatingCarrierSenderType value) {
            this.operatingCarrierSender = value;
        }

        /**
         * Gets the value of the poaSender property.
         * 
         * @return
         *     possible object is
         *     {@link POAAirlineSenderType }
         *     
         */
        public POAAirlineSenderType getPOASender() {
            return poaSender;
        }

        /**
         * Sets the value of the poaSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link POAAirlineSenderType }
         *     
         */
        public void setPOASender(POAAirlineSenderType value) {
            this.poaSender = value;
        }

        /**
         * Gets the value of the retailPartnerSender property.
         * 
         * @return
         *     possible object is
         *     {@link RetailSupplierSenderType }
         *     
         */
        public RetailSupplierSenderType getRetailPartnerSender() {
            return retailPartnerSender;
        }

        /**
         * Sets the value of the retailPartnerSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetailSupplierSenderType }
         *     
         */
        public void setRetailPartnerSender(RetailSupplierSenderType value) {
            this.retailPartnerSender = value;
        }

        /**
         * Gets the value of the travelAgencySender property.
         * 
         * @return
         *     possible object is
         *     {@link TravelAgencySenderType }
         *     
         */
        public TravelAgencySenderType getTravelAgencySender() {
            return travelAgencySender;
        }

        /**
         * Sets the value of the travelAgencySender property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelAgencySenderType }
         *     
         */
        public void setTravelAgencySender(TravelAgencySenderType value) {
            this.travelAgencySender = value;
        }

        /**
         * Gets the value of the corporateSender property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateSender }
         *     
         */
        public CorporateSender getCorporateSender() {
            return corporateSender;
        }

        /**
         * Sets the value of the corporateSender property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateSender }
         *     
         */
        public void setCorporateSender(CorporateSender value) {
            this.corporateSender = value;
        }

    }

}
