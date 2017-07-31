
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * MEDIA data list definition.
 * 
 * <p>Java class for ListOfMediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfMediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Media" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ObjectID" type="{http://www.iata.org/IATA/EDIST/2017.1}MediaID_Type" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MediaLink" minOccurs="0"/>
 *                   &lt;element name="AttachmentID" type="{http://www.iata.org/IATA/EDIST/2017.1}MediaID_Type" minOccurs="0"/>
 *                   &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfMediaType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "media"
})
public class ListOfMediaType {

    @XmlElement(name = "Media", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<ListOfMediaType.Media> media;

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfMediaType.Media }
     * 
     * 
     */
    public List<ListOfMediaType.Media> getMedia() {
        if (media == null) {
            media = new ArrayList<ListOfMediaType.Media>();
        }
        return this.media;
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
     *         &lt;element name="ObjectID" type="{http://www.iata.org/IATA/EDIST/2017.1}MediaID_Type" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MediaLink" minOccurs="0"/>
     *         &lt;element name="AttachmentID" type="{http://www.iata.org/IATA/EDIST/2017.1}MediaID_Type" minOccurs="0"/>
     *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objectID",
        "mediaLink",
        "attachmentID",
        "descriptions"
    })
    public static class Media {

        @XmlElement(name = "ObjectID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MediaIDType objectID;
        @XmlElement(name = "MediaLink", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MediaLink mediaLink;
        @XmlElement(name = "AttachmentID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected MediaIDType attachmentID;
        @XmlElement(name = "Descriptions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Descriptions descriptions;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the objectID property.
         * 
         * @return
         *     possible object is
         *     {@link MediaIDType }
         *     
         */
        public MediaIDType getObjectID() {
            return objectID;
        }

        /**
         * Sets the value of the objectID property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaIDType }
         *     
         */
        public void setObjectID(MediaIDType value) {
            this.objectID = value;
        }

        /**
         * Description-associated MEDIA LINK.
         * 
         * @return
         *     possible object is
         *     {@link MediaLink }
         *     
         */
        public MediaLink getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaLink }
         *     
         */
        public void setMediaLink(MediaLink value) {
            this.mediaLink = value;
        }

        /**
         * Gets the value of the attachmentID property.
         * 
         * @return
         *     possible object is
         *     {@link MediaIDType }
         *     
         */
        public MediaIDType getAttachmentID() {
            return attachmentID;
        }

        /**
         * Sets the value of the attachmentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaIDType }
         *     
         */
        public void setAttachmentID(MediaIDType value) {
            this.attachmentID = value;
        }

        /**
         * Gets the value of the descriptions property.
         * 
         * @return
         *     possible object is
         *     {@link Descriptions }
         *     
         */
        public Descriptions getDescriptions() {
            return descriptions;
        }

        /**
         * Sets the value of the descriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Descriptions }
         *     
         */
        public void setDescriptions(Descriptions value) {
            this.descriptions = value;
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
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

    }

}
