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
 * <p>Java class for CardRenewalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardRenewalResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewExpiry" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardRenewalResponse", propOrder = {
    "newCardNo",
    "newExpiry"
})
public class CardRenewalResponse
    extends ServiceResponse
{

    @XmlElement(name = "NewCardNo")
    protected String newCardNo;
    @XmlElement(name = "NewExpiry")
    protected int newExpiry;

    /**
     * Gets the value of the newCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCardNo() {
        return newCardNo;
    }

    /**
     * Sets the value of the newCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCardNo(String value) {
        this.newCardNo = value;
    }

    /**
     * Gets the value of the newExpiry property.
     * 
     */
    public int getNewExpiry() {
        return newExpiry;
    }

    /**
     * Sets the value of the newExpiry property.
     * 
     */
    public void setNewExpiry(int value) {
        this.newExpiry = value;
    }

}