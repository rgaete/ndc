
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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE Data List definition.
 * 
 * <p>Java class for ListOfServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID"/>
 *                   &lt;element name="Name">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Encoding" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceEncodingType"/>
 *                   &lt;element name="FeeMethod" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SVCDescriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDescriptionType"/>
 *                   &lt;element name="Settlement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
 *                             &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}ServicePriceType" minOccurs="0"/>
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceAssocType" minOccurs="0"/>
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
@XmlType(name = "ListOfServiceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "service"
})
public class ListOfServiceType {

    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<ListOfServiceType.Service> service;

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfServiceType.Service }
     * 
     * 
     */
    public List<ListOfServiceType.Service> getService() {
        if (service == null) {
            service = new ArrayList<ListOfServiceType.Service>();
        }
        return this.service;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID"/>
     *         &lt;element name="Name">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Encoding" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceEncodingType"/>
     *         &lt;element name="FeeMethod" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SVCDescriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDescriptionType"/>
     *         &lt;element name="Settlement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
     *                   &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}ServicePriceType" minOccurs="0"/>
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceAssocType" minOccurs="0"/>
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
        "serviceID",
        "name",
        "encoding",
        "feeMethod",
        "svcDescriptions",
        "settlement",
        "price",
        "associations"
    })
    public static class Service {

        @XmlElement(name = "ServiceID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected ServiceIDType serviceID;
        @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected ListOfServiceType.Service.Name name;
        @XmlElement(name = "Encoding", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected ServiceEncodingType encoding;
        @XmlElement(name = "FeeMethod", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfServiceType.Service.FeeMethod feeMethod;
        @XmlElement(name = "SVCDescriptions", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected ServiceDescriptionType svcDescriptions;
        @XmlElement(name = "Settlement", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ListOfServiceType.Service.Settlement settlement;
        @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ServicePriceType price;
        @XmlElement(name = "Associations", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected ServiceAssocType associations;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the serviceID property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceIDType }
         *     
         */
        public ServiceIDType getServiceID() {
            return serviceID;
        }

        /**
         * Sets the value of the serviceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceIDType }
         *     
         */
        public void setServiceID(ServiceIDType value) {
            this.serviceID = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceType.Service.Name }
         *     
         */
        public ListOfServiceType.Service.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceType.Service.Name }
         *     
         */
        public void setName(ListOfServiceType.Service.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the encoding property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceEncodingType }
         *     
         */
        public ServiceEncodingType getEncoding() {
            return encoding;
        }

        /**
         * Sets the value of the encoding property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceEncodingType }
         *     
         */
        public void setEncoding(ServiceEncodingType value) {
            this.encoding = value;
        }

        /**
         * Gets the value of the feeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceType.Service.FeeMethod }
         *     
         */
        public ListOfServiceType.Service.FeeMethod getFeeMethod() {
            return feeMethod;
        }

        /**
         * Sets the value of the feeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceType.Service.FeeMethod }
         *     
         */
        public void setFeeMethod(ListOfServiceType.Service.FeeMethod value) {
            this.feeMethod = value;
        }

        /**
         * Gets the value of the svcDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceDescriptionType }
         *     
         */
        public ServiceDescriptionType getSVCDescriptions() {
            return svcDescriptions;
        }

        /**
         * Sets the value of the svcDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceDescriptionType }
         *     
         */
        public void setSVCDescriptions(ServiceDescriptionType value) {
            this.svcDescriptions = value;
        }

        /**
         * Gets the value of the settlement property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceType.Service.Settlement }
         *     
         */
        public ListOfServiceType.Service.Settlement getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceType.Service.Settlement }
         *     
         */
        public void setSettlement(ListOfServiceType.Service.Settlement value) {
            this.settlement = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link ServicePriceType }
         *     
         */
        public ServicePriceType getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServicePriceType }
         *     
         */
        public void setPrice(ServicePriceType value) {
            this.price = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceAssocType }
         *     
         */
        public ServiceAssocType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceAssocType }
         *     
         */
        public void setAssociations(ServiceAssocType value) {
            this.associations = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FeeMethod {

            @XmlValue
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Name {

            @XmlValue
            protected String value;

            /**
             * A data type for Proper Name size constraint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
         *         &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType"/>
         *         &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/>
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
            "method",
            "interlineSettlementValue"
        })
        public static class Settlement {

            @XmlElement(name = "Method", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
            protected String method;
            @XmlElement(name = "InterlineSettlementValue", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected CurrencyAmountOptType interlineSettlementValue;

            /**
             * Gets the value of the method property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethod() {
                return method;
            }

            /**
             * Sets the value of the method property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethod(String value) {
                this.method = value;
            }

            /**
             * Gets the value of the interlineSettlementValue property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getInterlineSettlementValue() {
                return interlineSettlementValue;
            }

            /**
             * Sets the value of the interlineSettlementValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setInterlineSettlementValue(CurrencyAmountOptType value) {
                this.interlineSettlementValue = value;
            }

        }

    }

}
