
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for (AGENCY) AGENT USER Seller Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from AgencyCoreRepType.
 * 
 * <p>Java class for AgentUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentUserType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AgencyCoreRepType">
 *       &lt;sequence>
 *         &lt;element name="AgentUserID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueIDContextType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UserRole" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentUserType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "agentUserID",
    "userRole"
})
@XmlSeeAlso({
    AgentUserMsgPartyCoreType.class
})
public class AgentUserType
    extends AgencyCoreRepType
{

    @XmlElement(name = "AgentUserID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected AgentUserType.AgentUserID agentUserID;
    @XmlElement(name = "UserRole", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String userRole;

    /**
     * Gets the value of the agentUserID property.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserType.AgentUserID }
     *     
     */
    public AgentUserType.AgentUserID getAgentUserID() {
        return agentUserID;
    }

    /**
     * Sets the value of the agentUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserType.AgentUserID }
     *     
     */
    public void setAgentUserID(AgentUserType.AgentUserID value) {
        this.agentUserID = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>UniqueIDContextType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AgentUserID
        extends UniqueIDContextType
    {


    }

}
