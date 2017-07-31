
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Core Airline Message Party Representation. Derived from AirlineCoreRepType.
 * 
 * <p>Java class for AirlineMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMsgPartyCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AirlineCoreRepType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUser" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Disclosures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMsgPartyCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "agentUser",
    "disclosures"
})
@XmlSeeAlso({
    ORAAirlineParticipantType.class,
    OperatingCarrierRecipientType.class,
    OperatingCarrierSenderType.class,
    MarketingCarrierSenderType.class,
    MarketingCarrierParticipantType.class,
    POAAirlineSenderType.class,
    MarketingCarrierRecipientType.class,
    POAAirlineRecipientType.class,
    POAAirlineParticipantType.class,
    OperatingCarrierParticipantType.class,
    ORAAirlineRecipientType.class,
    ORAAirlineSenderType.class
})
public class AirlineMsgPartyCoreType
    extends AirlineCoreRepType
{

    @XmlElement(name = "AgentUser", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AgentUserType agentUser;
    @XmlElement(name = "Disclosures", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Disclosures disclosures;

    /**
     * Gets the value of the agentUser property.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserType }
     *     
     */
    public AgentUserType getAgentUser() {
        return agentUser;
    }

    /**
     * Sets the value of the agentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserType }
     *     
     */
    public void setAgentUser(AgentUserType value) {
        this.agentUser = value;
    }

    /**
     * Gets the value of the disclosures property.
     * 
     * @return
     *     possible object is
     *     {@link Disclosures }
     *     
     */
    public Disclosures getDisclosures() {
        return disclosures;
    }

    /**
     * Sets the value of the disclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disclosures }
     *     
     */
    public void setDisclosures(Disclosures value) {
        this.disclosures = value;
    }

}
