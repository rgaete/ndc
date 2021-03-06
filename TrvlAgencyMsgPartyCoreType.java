
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for TRAVEL AGENCY Message Party Representation.
 * 
 * Notes: Derived from TravelAgencyType.
 * 
 * <p>Java class for TrvlAgencyMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrvlAgencyMsgPartyCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrvlAgencyMsgPartyCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "agentUser"
})
@XmlSeeAlso({
    AgentUserRecipientType.class,
    TravelAgencyRecipientType.class,
    TravelAgencyParticipantType.class,
    TravelAgencySenderType.class
})
public class TrvlAgencyMsgPartyCoreType
    extends TravelAgencyType
{

    @XmlElement(name = "AgentUser", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AgentUserType agentUser;

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

}
