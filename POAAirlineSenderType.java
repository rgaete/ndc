
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for POA (Participating Offer Airline) Sender Role. Derived from AirlineMsgPartyCoreType.
 * 
 * <p>Java class for POA_AirlineSenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POA_AirlineSenderType">
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
@XmlType(name = "POA_AirlineSenderType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class POAAirlineSenderType
    extends AirlineMsgPartyCoreType
{


}
