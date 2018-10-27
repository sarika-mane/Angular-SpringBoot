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
 * <p>Java class for GetCardInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardInfoList" type="{Smartsoft.Integration.Services}ArrayOfCardDetailInfo" minOccurs="0"/&gt;
 *         &lt;element name="CustomerMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardInfoResponse", propOrder = {
    "cardInfoList",
    "customerMobilePhone"
})
public class GetCardInfoResponse
    extends ServiceResponse
{

    @XmlElement(name = "CardInfoList")
    protected ArrayOfCardDetailInfo cardInfoList;
    @XmlElement(name = "CustomerMobilePhone")
    protected String customerMobilePhone;

    /**
     * Gets the value of the cardInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardDetailInfo }
     *     
     */
    public ArrayOfCardDetailInfo getCardInfoList() {
        return cardInfoList;
    }

    /**
     * Sets the value of the cardInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardDetailInfo }
     *     
     */
    public void setCardInfoList(ArrayOfCardDetailInfo value) {
        this.cardInfoList = value;
    }

    /**
     * Gets the value of the customerMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMobilePhone() {
        return customerMobilePhone;
    }

    /**
     * Sets the value of the customerMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMobilePhone(String value) {
        this.customerMobilePhone = value;
    }

}
