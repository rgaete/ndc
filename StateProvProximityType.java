
package ndc;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * STATE/PROVINCE PROXIMITY representation.
 * 
 * Note: This contains either the requested maximum distance search radius values -or- the actual Proximity information, which is typically used to specify the results from the named location radius search.
 * 
 * <p>Java class for StateProvProximityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateProvProximityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}LocationProximityType">
 *       &lt;sequence>
 *         &lt;element name="StateCode">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>StateProvCodeType">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}PreferenceAttrGroup"/>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}RadiusAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "StateProvProximityType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "stateCode"
})
public class StateProvProximityType
    extends LocationProximityType
{

    @XmlElement(name = "StateCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected StateProvProximityType.StateCode stateCode;

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvProximityType.StateCode }
     *     
     */
    public StateProvProximityType.StateCode getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvProximityType.StateCode }
     *     
     */
    public void setStateCode(StateProvProximityType.StateCode value) {
        this.stateCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>StateProvCodeType">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}PreferenceAttrGroup"/>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}RadiusAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StateCode
        extends StateProvCodeType
    {

        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "Area")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger area;
        @XmlAttribute(name = "UOM")
        protected DistanceUnitListType uom;

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
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArea(BigInteger value) {
            this.area = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitListType }
         *     
         */
        public DistanceUnitListType getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitListType }
         *     
         */
        public void setUOM(DistanceUnitListType value) {
            this.uom = value;
        }

    }

}
