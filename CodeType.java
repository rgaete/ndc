
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A code is a character string of letters, numbers, special characters (except escape sequences), and symbols. It represents a definitive
 * value, a method, or a property description in an abbreviated or language-independent form that is part of a finite list of allowed values.
 * 
 * <p>Java class for CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeValue" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CodeListAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CodeListIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="CodeListVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "codeValue"
})
public class CodeType {

    @XmlElement(name = "CodeValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeValue;
    @XmlAttribute(name = "CodeListAgencyIdentifier")
    protected String codeListAgencyIdentifier;
    @XmlAttribute(name = "CodeListIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListIdentifier;
    @XmlAttribute(name = "CodeListVersionIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListVersionIdentifier;

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the codeListAgencyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListAgencyIdentifier() {
        return codeListAgencyIdentifier;
    }

    /**
     * Sets the value of the codeListAgencyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListAgencyIdentifier(String value) {
        this.codeListAgencyIdentifier = value;
    }

    /**
     * Gets the value of the codeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListIdentifier() {
        return codeListIdentifier;
    }

    /**
     * Sets the value of the codeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListIdentifier(String value) {
        this.codeListIdentifier = value;
    }

    /**
     * Gets the value of the codeListVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersionIdentifier() {
        return codeListVersionIdentifier;
    }

    /**
     * Sets the value of the codeListVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersionIdentifier(String value) {
        this.codeListVersionIdentifier = value;
    }

}