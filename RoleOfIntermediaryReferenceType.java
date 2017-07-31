
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Intermediary to Intermediary Role Association.
 * 
 * <p>Java class for RoleOfIntermediaryReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleOfIntermediaryReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="supplier_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleOfIntermediaryReferenceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class RoleOfIntermediaryReferenceType {

    @XmlAttribute(name = "supplier_ref", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object supplierRef;

    /**
     * Gets the value of the supplierRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplierRef() {
        return supplierRef;
    }

    /**
     * Sets the value of the supplierRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplierRef(Object value) {
        this.supplierRef = value;
    }

}
