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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCardVerificationDataRspResult" type="{Smartsoft.Integration.Services}GetCardVerificationDataResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCardVerificationDataRspResult"
})
@XmlRootElement(name = "GetCardVerificationDataRspResponse")
public class GetCardVerificationDataRspResponse {

    @XmlElement(name = "GetCardVerificationDataRspResult")
    protected GetCardVerificationDataResponse getCardVerificationDataRspResult;

    /**
     * Gets the value of the getCardVerificationDataRspResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardVerificationDataResponse }
     *     
     */
    public GetCardVerificationDataResponse getGetCardVerificationDataRspResult() {
        return getCardVerificationDataRspResult;
    }

    /**
     * Sets the value of the getCardVerificationDataRspResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardVerificationDataResponse }
     *     
     */
    public void setGetCardVerificationDataRspResult(GetCardVerificationDataResponse value) {
        this.getCardVerificationDataRspResult = value;
    }

}
