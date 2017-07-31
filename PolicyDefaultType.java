
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Policy Notification and Text, e.g. for sensitive data notification and/or handling.
 * 
 * <p>Java class for PolicyDefaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyDefaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataPolicyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="PolicyID" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PolicyLink"/>
 *                   &lt;/choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}NodePath" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
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
@XmlType(name = "PolicyDefaultType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "policy"
})
public class PolicyDefaultType {

    @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<PolicyDefaultType.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyDefaultType.Policy }
     * 
     * 
     */
    public List<PolicyDefaultType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PolicyDefaultType.Policy>();
        }
        return this.policy;
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
     *         &lt;element name="DataPolicyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="PolicyID" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType"/>
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PolicyLink"/>
     *         &lt;/choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}NodePath" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dataPolicyInd",
        "policyID",
        "type",
        "description",
        "policyLink",
        "nodePath"
    })
    public static class Policy {

        @XmlElement(name = "DataPolicyInd", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Boolean dataPolicyInd;
        @XmlElement(name = "PolicyID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String policyID;
        @XmlElement(name = "Type", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected Object type;
        @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected String description;
        @XmlElement(name = "PolicyLink", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        @XmlSchemaType(name = "anyURI")
        protected String policyLink;
        @XmlElement(name = "NodePath", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected NodePathType nodePath;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the dataPolicyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDataPolicyInd() {
            return dataPolicyInd;
        }

        /**
         * Sets the value of the dataPolicyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDataPolicyInd(Boolean value) {
            this.dataPolicyInd = value;
        }

        /**
         * Gets the value of the policyID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyID() {
            return policyID;
        }

        /**
         * Sets the value of the policyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyID(String value) {
            this.policyID = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setType(Object value) {
            this.type = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the policyLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyLink() {
            return policyLink;
        }

        /**
         * Sets the value of the policyLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyLink(String value) {
            this.policyLink = value;
        }

        /**
         * Message Property Path information for this policy-associated element.
         * 
         * @return
         *     possible object is
         *     {@link NodePathType }
         *     
         */
        public NodePathType getNodePath() {
            return nodePath;
        }

        /**
         * Sets the value of the nodePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link NodePathType }
         *     
         */
        public void setNodePath(NodePathType value) {
            this.nodePath = value;
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
