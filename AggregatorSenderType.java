
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Aggregator Message Sender Role. Derived from AggregatorMsgPartyCoreType.
 * 
 * <p>Java class for AggregatorSenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregatorSenderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorMsgPartyCoreType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatorSenderType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class AggregatorSenderType
    extends AggregatorMsgPartyCoreType
{


}
