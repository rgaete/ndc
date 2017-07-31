
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER PENALTY definition.
 * 
 * <p>Java class for OfferPenaltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPenaltyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PenaltyType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPenaltyType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlSeeAlso({
    ndc.ListOfOfferPenaltyType.Penalty.class
})
public class OfferPenaltyType
    extends PenaltyType
{


}
