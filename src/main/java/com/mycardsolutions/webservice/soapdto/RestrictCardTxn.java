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
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarcodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inputtype" type="{Smartsoft.Integration.Services}OP_TYPE"/&gt;
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
    "cardNo",
    "barcodeNo",
    "txnCode",
    "startDate",
    "endDate",
    "inputtype"
})
@XmlRootElement(name = "RestrictCardTxn")
public class RestrictCardTxn {

    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "BarcodeNo")
    protected String barcodeNo;
    @XmlElement(name = "TxnCode")
    protected String txnCode;
    @XmlElement(name = "StartDate", required = true, type = Integer.class, nillable = true)
    protected Integer startDate;
    @XmlElement(name = "EndDate", required = true, type = Integer.class, nillable = true)
    protected Integer endDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OPTYPE inputtype;

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
     * Gets the value of the txnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnCode() {
        return txnCode;
    }

    /**
     * Sets the value of the txnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnCode(String value) {
        this.txnCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartDate(Integer value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndDate(Integer value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the inputtype property.
     * 
     * @return
     *     possible object is
     *     {@link OPTYPE }
     *     
     */
    public OPTYPE getInputtype() {
        return inputtype;
    }

    /**
     * Sets the value of the inputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTYPE }
     *     
     */
    public void setInputtype(OPTYPE value) {
        this.inputtype = value;
    }

}
