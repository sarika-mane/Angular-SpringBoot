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
 * <p>Java class for Cvv2UnblockResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cvv2UnblockResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrCnt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SucCnt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cvv2UnblockResponse", propOrder = {
    "errCode",
    "errDescription",
    "errCnt",
    "sucCnt"
})
public class Cvv2UnblockResponse
    extends ServiceResponse
{

    @XmlElement(name = "ErrCode")
    protected String errCode;
    @XmlElement(name = "ErrDescription")
    protected String errDescription;
    @XmlElement(name = "ErrCnt")
    protected int errCnt;
    @XmlElement(name = "SucCnt")
    protected int sucCnt;

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDescription() {
        return errDescription;
    }

    /**
     * Sets the value of the errDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDescription(String value) {
        this.errDescription = value;
    }

    /**
     * Gets the value of the errCnt property.
     * 
     */
    public int getErrCnt() {
        return errCnt;
    }

    /**
     * Sets the value of the errCnt property.
     * 
     */
    public void setErrCnt(int value) {
        this.errCnt = value;
    }

    /**
     * Gets the value of the sucCnt property.
     * 
     */
    public int getSucCnt() {
        return sucCnt;
    }

    /**
     * Sets the value of the sucCnt property.
     * 
     */
    public void setSucCnt(int value) {
        this.sucCnt = value;
    }

}
