
package ndc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for CURRENCY Metadata.
 * 
 * <p>Java class for CurrencyMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="Decimals" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyMetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "application",
    "decimals",
    "name"
})
@XmlSeeAlso({
    CurrencyMetadata.class
})
public class CurrencyMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Application", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String application;
    @XmlElement(name = "Decimals", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected BigInteger decimals;
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String name;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the decimals property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimals() {
        return decimals;
    }

    /**
     * Sets the value of the decimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimals(BigInteger value) {
        this.decimals = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
