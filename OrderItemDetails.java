
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OrderItemDetail" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderCommision"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderInstructions"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderItemSettlement" type="{http://www.iata.org/IATA/EDIST/2017.1}SettlementType" minOccurs="0"/>
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
    "orderItemDetail",
    "orderItemSettlement"
})
@XmlRootElement(name = "OrderItemDetails", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class OrderItemDetails {

    @XmlElement(name = "OrderItemDetail", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected List<OrderItemDetails.OrderItemDetail> orderItemDetail;
    @XmlElement(name = "OrderItemSettlement", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected SettlementType orderItemSettlement;

    /**
     * Gets the value of the orderItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemDetails.OrderItemDetail }
     * 
     * 
     */
    public List<OrderItemDetails.OrderItemDetail> getOrderItemDetail() {
        if (orderItemDetail == null) {
            orderItemDetail = new ArrayList<OrderItemDetails.OrderItemDetail>();
        }
        return this.orderItemDetail;
    }

    /**
     * Gets the value of the orderItemSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType }
     *     
     */
    public SettlementType getOrderItemSettlement() {
        return orderItemSettlement;
    }

    /**
     * Sets the value of the orderItemSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType }
     *     
     */
    public void setOrderItemSettlement(SettlementType value) {
        this.orderItemSettlement = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderCommision"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderInstructions"/>
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
        "orderCommision",
        "orderInstructions"
    })
    public static class OrderItemDetail {

        @XmlElement(name = "OrderCommision", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderCommissionType orderCommision;
        @XmlElement(name = "OrderInstructions", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected OrderInstructions orderInstructions;

        /**
         * Details of the commission claimed by a Travel Agent for selling air transportation/services on behalf of an airline.
         * 
         * @return
         *     possible object is
         *     {@link OrderCommissionType }
         *     
         */
        public OrderCommissionType getOrderCommision() {
            return orderCommision;
        }

        /**
         * Sets the value of the orderCommision property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCommissionType }
         *     
         */
        public void setOrderCommision(OrderCommissionType value) {
            this.orderCommision = value;
        }

        /**
         * Gets the value of the orderInstructions property.
         * 
         * @return
         *     possible object is
         *     {@link OrderInstructions }
         *     
         */
        public OrderInstructions getOrderInstructions() {
            return orderInstructions;
        }

        /**
         * Sets the value of the orderInstructions property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderInstructions }
         *     
         */
        public void setOrderInstructions(OrderInstructions value) {
            this.orderInstructions = value;
        }

    }

}
