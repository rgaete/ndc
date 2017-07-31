
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for ORA (Offer Originating Airline) Sender Role. Derived from AirlineMsgPartyCoreType.
 * 
 * <p>Java class for ORA_AirlineSenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORA_AirlineSenderType">
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
@XmlType(name = "ORA_AirlineSenderType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class ORAAirlineSenderType
    extends AirlineMsgPartyCoreType
{


}
