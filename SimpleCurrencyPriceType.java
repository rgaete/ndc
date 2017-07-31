
package ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * SIMPLE CURRENCY PRICE BASIS UNIT: NO price break-down, taxes and/or fees.
 * 
 * <p>Java class for SimpleCurrencyPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleCurrencyPriceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>CurrencyAmountOptType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCurrencyPriceType", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
public class SimpleCurrencyPriceType
    extends CurrencyAmountOptType
{


}
