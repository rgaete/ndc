
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * UTM Search Campaign Referral definition.
 * 
 * <p>Java class for CampaignReferralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignReferralType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}TrxProcessObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="UTM">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReferrerURL" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" minOccurs="0"/>
 *                   &lt;element name="Other_UTMs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CampaignUTM_ParameterType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Campaign" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
 *                 &lt;attribute name="Source" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
 *                 &lt;attribute name="Medium" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
 *                 &lt;attribute name="Content" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
 *                 &lt;attribute name="Term" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Localization" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CountrySimpleType" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" />
 *                 &lt;attribute name="LanguageCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignReferralType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "utm",
    "localization"
})
public class CampaignReferralType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "UTM", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected CampaignReferralType.UTM utm;
    @XmlElement(name = "Localization", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected CampaignReferralType.Localization localization;

    /**
     * Gets the value of the utm property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignReferralType.UTM }
     *     
     */
    public CampaignReferralType.UTM getUTM() {
        return utm;
    }

    /**
     * Sets the value of the utm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignReferralType.UTM }
     *     
     */
    public void setUTM(CampaignReferralType.UTM value) {
        this.utm = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignReferralType.Localization }
     *     
     */
    public CampaignReferralType.Localization getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignReferralType.Localization }
     *     
     */
    public void setLocalization(CampaignReferralType.Localization value) {
        this.localization = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="CountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CountrySimpleType" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" />
     *       &lt;attribute name="LanguageCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Localization {

        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "LanguageCode")
        protected String languageCode;

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the languageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguageCode() {
            return languageCode;
        }

        /**
         * Sets the value of the languageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguageCode(String value) {
            this.languageCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ReferrerURL" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" minOccurs="0"/>
     *         &lt;element name="Other_UTMs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CampaignUTM_ParameterType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Campaign" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
     *       &lt;attribute name="Source" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
     *       &lt;attribute name="Medium" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
     *       &lt;attribute name="Content" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
     *       &lt;attribute name="Term" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referrerURL",
        "otherUTMs"
    })
    public static class UTM {

        @XmlElement(name = "ReferrerURL", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String referrerURL;
        @XmlElement(name = "Other_UTMs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected CampaignReferralType.UTM.OtherUTMs otherUTMs;
        @XmlAttribute(name = "Campaign")
        protected String campaign;
        @XmlAttribute(name = "Source")
        protected String source;
        @XmlAttribute(name = "Medium")
        protected String medium;
        @XmlAttribute(name = "Content")
        protected String content;
        @XmlAttribute(name = "Term")
        protected String term;

        /**
         * Gets the value of the referrerURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferrerURL() {
            return referrerURL;
        }

        /**
         * Sets the value of the referrerURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferrerURL(String value) {
            this.referrerURL = value;
        }

        /**
         * Gets the value of the otherUTMs property.
         * 
         * @return
         *     possible object is
         *     {@link CampaignReferralType.UTM.OtherUTMs }
         *     
         */
        public CampaignReferralType.UTM.OtherUTMs getOtherUTMs() {
            return otherUTMs;
        }

        /**
         * Sets the value of the otherUTMs property.
         * 
         * @param value
         *     allowed object is
         *     {@link CampaignReferralType.UTM.OtherUTMs }
         *     
         */
        public void setOtherUTMs(CampaignReferralType.UTM.OtherUTMs value) {
            this.otherUTMs = value;
        }

        /**
         * Gets the value of the campaign property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCampaign() {
            return campaign;
        }

        /**
         * Sets the value of the campaign property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCampaign(String value) {
            this.campaign = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the medium property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedium() {
            return medium;
        }

        /**
         * Sets the value of the medium property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedium(String value) {
            this.medium = value;
        }

        /**
         * Gets the value of the content property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * Sets the value of the content property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerm(String value) {
            this.term = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CampaignUTM_ParameterType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OtherUTMs
            extends CampaignUTMParameterType
        {


        }

    }

}
