
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for RETAILER Message Party Representation.
 * 
 * Notes:
 *  1. Derived from RetailerType.
 * 
 * <p>Java class for RetailerMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailerMsgPartyCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RetailerType">
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
@XmlType(name = "RetailerMsgPartyCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "agentUser"
})
@XmlSeeAlso({
    RetailSupplierRecipientType.class,
    RetailSupplierSenderType.class,
    RetailSupplierParticipantType.class
})
public class RetailerMsgPartyCoreType
    extends RetailerType
{

    @XmlElement(name = "AgentUser", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AgentUserType agentUser;

    /**
     * Retail Supplier Agent User information.
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
