
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Any document which may be used to identify a person or verify aspects of a person's personal identity. If issued in a small, standard credit card size form, it is usually called an identity card. Some countries issue formal identity documents, while others may require identity verification using informal documents. When the identity document incorporates a person's photograph, it may be called photo ID.
 * 
 * In the absence of a formal identity document, a driver's license may be accepted in many countries for identity verification. Most countries accept passports as a form of identification.
 * 
 * <p>Java class for IdentityDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentityDocumentNumber" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType"/>
 *         &lt;element name="IdentityDocumentType" type="{http://www.iata.org/IATA/EDIST/2017.1}IdentityDocumentTypeCodeType"/>
 *         &lt;element name="IssuingCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ISO_3166CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ISO_3166CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ISO_3166CountryCodeType" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.iata.org/IATA/EDIST/2017.1}DateType" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.iata.org/IATA/EDIST/2017.1}DateType" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/EDIST/2017.1}DateType" minOccurs="0"/>
 *         &lt;element name="Birthplace" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.iata.org/IATA/EDIST/2017.1}GenderCodeType" minOccurs="0"/>
 *         &lt;element name="NameTitle" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameType" minOccurs="0"/>
 *         &lt;element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortNameType" minOccurs="0"/>
 *         &lt;element name="Visa" type="{http://www.iata.org/IATA/EDIST/2017.1}VisaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocumentType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "identityDocumentNumber",
    "identityDocumentType",
    "issuingCountryCode",
    "citizenshipCountryCode",
    "residenceCountryCode",
    "issueDate",
    "expiryDate",
    "birthdate",
    "birthplace",
    "gender",
    "nameTitle",
    "givenName",
    "middleName",
    "surname",
    "surnameSuffix",
    "visa"
})
public class IdentityDocumentType {

    @XmlElement(name = "IdentityDocumentNumber", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocumentNumber;
    @XmlElement(name = "IdentityDocumentType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String identityDocumentType;
    @XmlElement(name = "IssuingCountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String issuingCountryCode;
    @XmlElement(name = "CitizenshipCountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String citizenshipCountryCode;
    @XmlElement(name = "ResidenceCountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String residenceCountryCode;
    @XmlElement(name = "IssueDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "ExpiryDate", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Birthdate", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "Birthplace", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String birthplace;
    @XmlElement(name = "Gender", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    @XmlSchemaType(name = "string")
    protected GenderCodeContentType gender;
    @XmlElement(name = "NameTitle", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String nameTitle;
    @XmlElement(name = "GivenName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<String> givenName;
    @XmlElement(name = "MiddleName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<String> middleName;
    @XmlElement(name = "Surname", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String surname;
    @XmlElement(name = "SurnameSuffix", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String surnameSuffix;
    @XmlElement(name = "Visa", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<VisaType> visa;

    /**
     * Gets the value of the identityDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocumentNumber() {
        return identityDocumentNumber;
    }

    /**
     * Sets the value of the identityDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocumentNumber(String value) {
        this.identityDocumentNumber = value;
    }

    /**
     * Gets the value of the identityDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocumentType() {
        return identityDocumentType;
    }

    /**
     * Sets the value of the identityDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocumentType(String value) {
        this.identityDocumentType = value;
    }

    /**
     * Gets the value of the issuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Sets the value of the issuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the birthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * Sets the value of the birthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplace(String value) {
        this.birthplace = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeContentType }
     *     
     */
    public GenderCodeContentType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeContentType }
     *     
     */
    public void setGender(GenderCodeContentType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the surnameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameSuffix() {
        return surnameSuffix;
    }

    /**
     * Sets the value of the surnameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameSuffix(String value) {
        this.surnameSuffix = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaType }
     * 
     * 
     */
    public List<VisaType> getVisa() {
        if (visa == null) {
            visa = new ArrayList<VisaType>();
        }
        return this.visa;
    }

}
