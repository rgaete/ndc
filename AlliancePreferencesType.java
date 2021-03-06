
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRLINE ALLIANCE PROGRAM Preferences.
 * 
 * <p>Java class for AlliancePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlliancePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alliance" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType">
 *                 &lt;sequence>
 *                   &lt;element name="GeoIndicatorType" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *                   &lt;element name="FlightHaulLength" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}PreferenceAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlliancePreferencesType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "alliance"
})
public class AlliancePreferencesType {

    @XmlElement(name = "Alliance", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<AlliancePreferencesType.Alliance> alliance;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the alliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlliancePreferencesType.Alliance }
     * 
     * 
     */
    public List<AlliancePreferencesType.Alliance> getAlliance() {
        if (alliance == null) {
            alliance = new ArrayList<AlliancePreferencesType.Alliance>();
        }
        return this.alliance;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType">
     *       &lt;sequence>
     *         &lt;element name="GeoIndicatorType" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
     *         &lt;element name="FlightHaulLength" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}PreferenceAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geoIndicatorType",
        "flightHaulLength"
    })
    public static class Alliance
        extends CodesetType
    {

        @XmlElement(name = "GeoIndicatorType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String geoIndicatorType;
        @XmlElement(name = "FlightHaulLength", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String flightHaulLength;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Gets the value of the geoIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeoIndicatorType() {
            return geoIndicatorType;
        }

        /**
         * Sets the value of the geoIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeoIndicatorType(String value) {
            this.geoIndicatorType = value;
        }

        /**
         * Gets the value of the flightHaulLength property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightHaulLength() {
            return flightHaulLength;
        }

        /**
         * Sets the value of the flightHaulLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightHaulLength(String value) {
            this.flightHaulLength = value;
        }

        /**
         * Gets the value of the preferencesLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesLevel() {
            return preferencesLevel;
        }

        /**
         * Sets the value of the preferencesLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesLevel(String value) {
            this.preferencesLevel = value;
        }

        /**
         * Gets the value of the preferencesContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferencesContext() {
            return preferencesContext;
        }

        /**
         * Sets the value of the preferencesContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferencesContext(String value) {
            this.preferencesContext = value;
        }

    }

}
