
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
 * 
 * <p>Java class for LoyaltyProgramAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyProgramAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alliance" type="{http://www.iata.org/IATA/EDIST/2017.1}AllianceType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Airline" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineTypeAIDM" minOccurs="0"/>
 *           &lt;element name="ProviderName" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleNameType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ProgramName" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleNameType" minOccurs="0"/>
 *         &lt;element name="ProgramCode" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/EDIST/2017.1}URI_Type" minOccurs="0"/>
 *         &lt;element name="SignInID" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="TierCode" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType" minOccurs="0"/>
 *         &lt;element name="TierName" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="TierPriority" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramAccountType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "alliance",
    "airline",
    "providerName",
    "programName",
    "programCode",
    "accountNumber",
    "url",
    "signInID",
    "tierCode",
    "tierName",
    "tierPriority"
})
public class LoyaltyProgramAccountType {

    @XmlElement(name = "Alliance", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AllianceType alliance;
    @XmlElement(name = "Airline", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AirlineTypeAIDM airline;
    @XmlElement(name = "ProviderName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providerName;
    @XmlElement(name = "ProgramName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    @XmlElement(name = "ProgramCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programCode;
    @XmlElement(name = "AccountNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountNumber;
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "SignInID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String signInID;
    @XmlElement(name = "TierCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tierCode;
    @XmlElement(name = "TierName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String tierName;
    @XmlElement(name = "TierPriority", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String tierPriority;

    /**
     * Gets the value of the alliance property.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineTypeAIDM }
     *     
     */
    public AirlineTypeAIDM getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineTypeAIDM }
     *     
     */
    public void setAirline(AirlineTypeAIDM value) {
        this.airline = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the signInID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignInID() {
        return signInID;
    }

    /**
     * Sets the value of the signInID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignInID(String value) {
        this.signInID = value;
    }

    /**
     * Gets the value of the tierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierCode() {
        return tierCode;
    }

    /**
     * Sets the value of the tierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierCode(String value) {
        this.tierCode = value;
    }

    /**
     * Gets the value of the tierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierName() {
        return tierName;
    }

    /**
     * Sets the value of the tierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierName(String value) {
        this.tierName = value;
    }

    /**
     * Gets the value of the tierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierPriority() {
        return tierPriority;
    }

    /**
     * Sets the value of the tierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierPriority(String value) {
        this.tierPriority = value;
    }

}
