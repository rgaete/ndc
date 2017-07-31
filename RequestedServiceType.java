
package ndc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Recursive element to allow nested selections of services from a bundle of services.
 * 
 * <p>Java class for RequestedServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDefinitionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SelectedService" type="{http://www.iata.org/IATA/EDIST/2017.1}RequestedServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedServiceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "serviceDefinitionID",
    "selectedService"
})
@XmlSeeAlso({
    ndc.OrderRequestType.Offer.OfferItem.ServiceSelection.class
})
public class RequestedServiceType {

    @XmlElement(name = "ServiceDefinitionID", namespace = "http://www.iata.org/IATA/EDIST/2017.1", required = true)
    protected String serviceDefinitionID;
    @XmlElement(name = "SelectedService", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<RequestedServiceType> selectedService;

    /**
     * Gets the value of the serviceDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionID() {
        return serviceDefinitionID;
    }

    /**
     * Sets the value of the serviceDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDefinitionID(String value) {
        this.serviceDefinitionID = value;
    }

    /**
     * Gets the value of the selectedService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedServiceType }
     * 
     * 
     */
    public List<RequestedServiceType> getSelectedService() {
        if (selectedService == null) {
            selectedService = new ArrayList<RequestedServiceType>();
        }
        return this.selectedService;
    }

}
