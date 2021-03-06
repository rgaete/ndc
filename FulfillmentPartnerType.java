
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
 * PARTNER ROLE: FULFILLMENT PARTNER, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from PartnerCoreRepType.
 * 
 * <p>Java class for FulfillmentPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentPartnerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PartnerCoreRepType">
 *       &lt;sequence>
 *         &lt;element name="Fulfillments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fulfillment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfferValidDates" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Start" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="End" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Location" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "FulfillmentPartnerType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "fulfillments"
})
public class FulfillmentPartnerType
    extends PartnerCoreRepType
{

    @XmlElement(name = "Fulfillments", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected FulfillmentPartnerType.Fulfillments fulfillments;

    /**
     * Gets the value of the fulfillments property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentPartnerType.Fulfillments }
     *     
     */
    public FulfillmentPartnerType.Fulfillments getFulfillments() {
        return fulfillments;
    }

    /**
     * Sets the value of the fulfillments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentPartnerType.Fulfillments }
     *     
     */
    public void setFulfillments(FulfillmentPartnerType.Fulfillments value) {
        this.fulfillments = value;
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
     *         &lt;element name="Fulfillment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfferValidDates" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Start" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="End" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Location" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "fulfillment"
    })
    public static class Fulfillments {

        @XmlElement(name = "Fulfillment", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
        protected List<FulfillmentPartnerType.Fulfillments.Fulfillment> fulfillment;

        /**
         * Gets the value of the fulfillment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fulfillment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFulfillment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FulfillmentPartnerType.Fulfillments.Fulfillment }
         * 
         * 
         */
        public List<FulfillmentPartnerType.Fulfillments.Fulfillment> getFulfillment() {
            if (fulfillment == null) {
                fulfillment = new ArrayList<FulfillmentPartnerType.Fulfillments.Fulfillment>();
            }
            return this.fulfillment;
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
         *         &lt;element name="OfferValidDates" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Start" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="End" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Location" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
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
        @XmlType(name = "", propOrder = {
            "offerValidDates",
            "location"
        })
        public static class Fulfillment {

            @XmlElement(name = "OfferValidDates", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates offerValidDates;
            @XmlElement(name = "Location", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
            protected FulfillmentPartnerType.Fulfillments.Fulfillment.Location location;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

            /**
             * Gets the value of the offerValidDates property.
             * 
             * @return
             *     possible object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates }
             *     
             */
            public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates getOfferValidDates() {
                return offerValidDates;
            }

            /**
             * Sets the value of the offerValidDates property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates }
             *     
             */
            public void setOfferValidDates(FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates value) {
                this.offerValidDates = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.Location }
             *     
             */
            public FulfillmentPartnerType.Fulfillments.Fulfillment.Location getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.Location }
             *     
             */
            public void setLocation(FulfillmentPartnerType.Fulfillments.Fulfillment.Location value) {
                this.location = value;
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "airportCode",
                "structuredAddress"
            })
            public static class Location {

                @XmlElement(name = "AirportCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected AirportCode airportCode;
                @XmlElement(name = "StructuredAddress", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected StructuredAddrType structuredAddress;

                /**
                 * Gets the value of the airportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirportCode }
                 *     
                 */
                public AirportCode getAirportCode() {
                    return airportCode;
                }

                /**
                 * Sets the value of the airportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirportCode }
                 *     
                 */
                public void setAirportCode(AirportCode value) {
                    this.airportCode = value;
                }

                /**
                 * Gets the value of the structuredAddress property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredAddrType }
                 *     
                 */
                public StructuredAddrType getStructuredAddress() {
                    return structuredAddress;
                }

                /**
                 * Sets the value of the structuredAddress property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredAddrType }
                 *     
                 */
                public void setStructuredAddress(StructuredAddrType value) {
                    this.structuredAddress = value;
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
             *         &lt;element name="Start" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="End" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
             *               &lt;/extension>
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
            @XmlType(name = "", propOrder = {
                "start",
                "end"
            })
            public static class OfferValidDates {

                @XmlElement(name = "Start", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start start;
                @XmlElement(name = "End", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
                protected FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End end;

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start }
                 *     
                 */
                public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start }
                 *     
                 */
                public void setStart(FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start value) {
                    this.start = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End }
                 *     
                 */
                public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End }
                 *     
                 */
                public void setEnd(FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End value) {
                    this.end = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class End
                    extends CoreDateGrpType
                {


                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Start
                    extends CoreDateGrpType
                {


                }

            }

        }

    }

}
