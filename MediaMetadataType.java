
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * MEDIA Metadata definition.
 * 
 * <p>Java class for MediaMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="Caption" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
 *         &lt;element name="Hint" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
 *         &lt;element name="Dimensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}ImageUnitSimpleType" minOccurs="0"/>
 *                   &lt;element name="Height" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *                   &lt;element name="Width" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *                   &lt;element name="Format" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MediaSource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *                   &lt;element name="Version" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *                   &lt;element name="FileName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
 *                   &lt;element name="Symbology" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *                   &lt;element name="Copyright" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "MediaMetadataType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "application",
    "caption",
    "hint",
    "dimensions",
    "mediaSource"
})
public class MediaMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Application", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String application;
    @XmlElement(name = "Caption", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String caption;
    @XmlElement(name = "Hint", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected String hint;
    @XmlElement(name = "Dimensions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MediaMetadataType.Dimensions dimensions;
    @XmlElement(name = "MediaSource", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected MediaMetadataType.MediaSource mediaSource;

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
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link MediaMetadataType.Dimensions }
     *     
     */
    public MediaMetadataType.Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaMetadataType.Dimensions }
     *     
     */
    public void setDimensions(MediaMetadataType.Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the mediaSource property.
     * 
     * @return
     *     possible object is
     *     {@link MediaMetadataType.MediaSource }
     *     
     */
    public MediaMetadataType.MediaSource getMediaSource() {
        return mediaSource;
    }

    /**
     * Sets the value of the mediaSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaMetadataType.MediaSource }
     *     
     */
    public void setMediaSource(MediaMetadataType.MediaSource value) {
        this.mediaSource = value;
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
     *         &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}ImageUnitSimpleType" minOccurs="0"/>
     *         &lt;element name="Height" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
     *         &lt;element name="Width" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
     *         &lt;element name="Format" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uom",
        "height",
        "width",
        "format"
    })
    public static class Dimensions {

        @XmlElement(name = "UOM", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String uom;
        @XmlElement(name = "Height", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String height;
        @XmlElement(name = "Width", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String width;
        @XmlElement(name = "Format", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String format;

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUOM(String value) {
            this.uom = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeight() {
            return height;
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeight(String value) {
            this.height = value;
        }

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidth() {
            return width;
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidth(String value) {
            this.width = value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
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
     *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
     *         &lt;element name="Version" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
     *         &lt;element name="FileName" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/>
     *         &lt;element name="Symbology" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
     *         &lt;element name="Copyright" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "version",
        "fileName",
        "symbology",
        "copyright"
    })
    public static class MediaSource {

        @XmlElement(name = "Code", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String code;
        @XmlElement(name = "Version", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String version;
        @XmlElement(name = "FileName", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String fileName;
        @XmlElement(name = "Symbology", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String symbology;
        @XmlElement(name = "Copyright", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String copyright;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the symbology property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSymbology() {
            return symbology;
        }

        /**
         * Sets the value of the symbology property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSymbology(String value) {
            this.symbology = value;
        }

        /**
         * Gets the value of the copyright property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCopyright() {
            return copyright;
        }

        /**
         * Sets the value of the copyright property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCopyright(String value) {
            this.copyright = value;
        }

    }

}
