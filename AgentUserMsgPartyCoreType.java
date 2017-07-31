
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for AGENT USER Message Party Representation.
 * 
 * Notes:
 *  1. Derived from AgentUserType.
 * 
 * <p>Java class for AgentUserMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentUserMsgPartyCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AgentUserType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentUserMsgPartyCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlSeeAlso({
    AgentUserSenderType.class
})
public class AgentUserMsgPartyCoreType
    extends AgentUserType
{


}
