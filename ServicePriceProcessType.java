
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response Message Processing.
 * 
 * <p>Java class for ServicePriceProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePriceProcessType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OrderProcessResultType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Alerts" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Notices" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePriceProcessType", namespace = "http://www.iata.org/IATA/EDIST/2017.1", propOrder = {
    "alerts",
    "notices",
    "remarks"
})
public class ServicePriceProcessType
    extends OrderProcessResultType
{

    @XmlElement(name = "Alerts", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected AlertsType alerts;
    @XmlElement(name = "Notices", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected Notices notices;
    @XmlElement(name = "Remarks", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected RemarkType remarks;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link AlertsType }
     *     
     */
    public AlertsType getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertsType }
     *     
     */
    public void setAlerts(AlertsType value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link Notices }
     *     
     */
    public Notices getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notices }
     *     
     */
    public void setNotices(Notices value) {
        this.notices = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
    }

}
