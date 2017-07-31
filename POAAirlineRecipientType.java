
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for POA (Participating Offer Airline) Recipient Role. Derived from AirlineMsgPartyCoreType.
 * 
 * <p>Java class for POA_AirlineRecipientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POA_AirlineRecipientType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AirlineMsgPartyCoreType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POA_AirlineRecipientType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class POAAirlineRecipientType
    extends AirlineMsgPartyCoreType
{


}
