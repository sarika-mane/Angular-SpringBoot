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
 *         &lt;element name="GetTxnByIdResult" type="{Smartsoft.Integration.Services}ServiceResponse" minOccurs="0"/&gt;
 *         &lt;element name="Exist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "getTxnByIdResult",
    "exist"
})
@XmlRootElement(name = "GetTxnByIdResponse")
public class GetTxnByIdResponse {

    @XmlElement(name = "GetTxnByIdResult")
    protected ServiceResponse getTxnByIdResult;
    @XmlElement(name = "Exist")
    protected boolean exist;

    /**
     * Gets the value of the getTxnByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse }
     *     
     */
    public ServiceResponse getGetTxnByIdResult() {
        return getTxnByIdResult;
    }

    /**
     * Sets the value of the getTxnByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse }
     *     
     */
    public void setGetTxnByIdResult(ServiceResponse value) {
        this.getTxnByIdResult = value;
    }

    /**
     * Gets the value of the exist property.
     * 
     */
    public boolean isExist() {
        return exist;
    }

    /**
     * Sets the value of the exist property.
     * 
     */
    public void setExist(boolean value) {
        this.exist = value;
    }

}
