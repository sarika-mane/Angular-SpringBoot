//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 05:12:55 PM IST 
//


package com.mycardsolutions.webservice.soapdto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCardStatusListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardStatusListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardStatusList" type="{Smartsoft.Integration.Services}ArrayOfCardStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardStatusListResponse", propOrder = {
    "cardStatusList"
})
public class GetCardStatusListResponse
    extends ServiceResponse
{

    @XmlElement(name = "CardStatusList")
    protected ArrayOfCardStatus cardStatusList;

    /**
     * Gets the value of the cardStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardStatus }
     *     
     */
    public ArrayOfCardStatus getCardStatusList() {
        return cardStatusList;
    }

    /**
     * Sets the value of the cardStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardStatus }
     *     
     */
    public void setCardStatusList(ArrayOfCardStatus value) {
        this.cardStatusList = value;
    }

}
