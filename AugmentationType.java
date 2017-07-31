
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * NDC Capability Model: AUGMENTATION POINT
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Within an NDC message document, there may be additional data that needs to be exchanged that is not defined in the NDC Digest as it is unique to an NDC implementer and their trading partners. For example, there are data elements within the NDC message payload that may subject to corporate data collection, management and dissemination policy(s), such as PCI. 
 * 
 * • Augmentation is the mechanism prescribed by NDC to create a new implementer-derived type, via the extension of an existing NDC Augmentation type—by adding a block of elements bundled together in another type called an "augmentation type." Augmentation objects explicitly show that data is just attached to an object without making a special version of that object. The end result is more like an object with bags of elements rather than a special type of object.
 * 
 * • Augmentation Point objects are substitution groups with two member elements:
 *   1) A pre-defined (default) representation provided by NDC; and,
 *   2) An AugmentationPoint element that may be substituted with a custom implementer type.
 * 
 * • Within in augmentation point, the processContents attribute is set to "lax", meaning that XML processors will attempt to obtain the schema for the required namespaces and validate any element from those namespaces; however, if the schema cannot be obtained, no errors will occur.
 * 
 * 
 * <p>Java class for AugmentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugmentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Augmentations" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace=''/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
@XmlType(name = "AugmentationType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "augmentations"
})
public class AugmentationType {

    @XmlElement(name = "Augmentations", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<AugmentationType.Augmentations> augmentations;

    /**
     * Gets the value of the augmentations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the augmentations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAugmentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugmentationType.Augmentations }
     * 
     * 
     */
    public List<AugmentationType.Augmentations> getAugmentations() {
        if (augmentations == null) {
            augmentations = new ArrayList<AugmentationType.Augmentations>();
        }
        return this.augmentations;
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
     *         &lt;any processContents='lax' namespace=''/>
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
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Augmentations {

        @XmlAnyElement(lax = true)
        protected Object any;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
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

    }

}
