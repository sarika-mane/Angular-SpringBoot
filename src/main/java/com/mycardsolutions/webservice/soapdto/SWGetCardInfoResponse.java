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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardDci" type="{Smartsoft.Integration.Services}CardDci"/&gt;
 *         &lt;element name="CustomerGSMNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerMidleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "customerNo",
    "cardNo",
    "barcodeNo",
    "cardDci",
    "customerGSMNo",
    "customerName",
    "customerMidleName",
    "customerSurname"
})
@XmlRootElement(name = "SWGetCardInfoResponse")
public class SWGetCardInfoResponse {

    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "BarcodeNo")
    protected String barcodeNo;
    @XmlElement(name = "CardDci", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CardDci cardDci;
    @XmlElement(name = "CustomerGSMNo")
    protected String customerGSMNo;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "CustomerMidleName")
    protected String customerMidleName;
    @XmlElement(name = "CustomerSurname")
    protected String customerSurname;

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the barcodeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodeNo() {
        return barcodeNo;
    }

    /**
     * Sets the value of the barcodeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodeNo(String value) {
        this.barcodeNo = value;
    }

    /**
     * Gets the value of the cardDci property.
     * 
     * @return
     *     possible object is
     *     {@link CardDci }
     *     
     */
    public CardDci getCardDci() {
        return cardDci;
    }

    /**
     * Sets the value of the cardDci property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDci }
     *     
     */
    public void setCardDci(CardDci value) {
        this.cardDci = value;
    }

    /**
     * Gets the value of the customerGSMNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGSMNo() {
        return customerGSMNo;
    }

    /**
     * Sets the value of the customerGSMNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGSMNo(String value) {
        this.customerGSMNo = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerMidleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMidleName() {
        return customerMidleName;
    }

    /**
     * Sets the value of the customerMidleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMidleName(String value) {
        this.customerMidleName = value;
    }

    /**
     * Gets the value of the customerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Sets the value of the customerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSurname(String value) {
        this.customerSurname = value;
    }

}
