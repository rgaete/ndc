
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for NDC-ENABLED SYSTEM Message Party Representation.
 * 
 * Notes:
 *  1. Derived from EnabledSystemType.
 * 
 * <p>Java class for EnabledSysMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnabledSysMsgPartyCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}EnabledSystemType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnabledSysMsgPartyCoreType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
@XmlSeeAlso({
    EnabledSysSenderType.class,
    EnabledSysRecipientType.class,
    EnabledSysParticipantType.class
})
public class EnabledSysMsgPartyCoreType
    extends EnabledSystemType
{


}
