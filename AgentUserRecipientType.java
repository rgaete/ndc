
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Travel Agency Message Recipient.
 * 
 * Notes:
 *  1. Derived from TrvlAgencyrMsgPartyCoreType.
 * 
 * <p>Java class for AgentUserRecipientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentUserRecipientType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}TrvlAgencyMsgPartyCoreType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentUserRecipientType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class AgentUserRecipientType
    extends TrvlAgencyMsgPartyCoreType
{


}
