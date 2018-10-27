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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{Smartsoft.Integration.Services}Result"/&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReturnDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse", propOrder = {
    "result",
    "returnCode",
    "returnDescription",
    "errorDetail"
})
@XmlSeeAlso({
    CardRenewalResponse.class,
    EODControlResponse.class,
    CustomerCreateResponse.class,
    CardGenerateResponse.class,
    Cvv2UnblockResponse.class,
    CardAllTransectionsResponse.class,
    GetCardInfoResponse.class,
    GetVirtualCardInfoResponse.class,
    CreateCardTransactionResponse.class,
    GetCustomerCardsResponse.class,
    GetCardStatusListResponse.class,
    GetCustomerGroupListResponse.class,
    GetCustomerTypeListResponse.class,
    CityTypeResponce.class,
    StateTypeResponce.class,
    CardEmbossRequest.class,
    GetFinancialTypeListResponse.class,
    GetLogoCodeListResponse.class,
    MainAccount.class,
    GetProductListResponse.class,
    BranchListResponse.class,
    GetTxnDefResponse.class,
    GetCardVerificationDataResponse.class,
    CardStatControlResponse.class,
    GetCustomerInfoResponse.class,
    GetCardRestrictionInfoResponse2 .class,
    CardTxnFeeProfileInfoResponse.class,
    CardPaymentResponse.class,
    CardVerificationResponse.class,
    CardLimits.class
})
public class ServiceResponse {

    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected Result result;
    @XmlElement(name = "ReturnCode")
    protected int returnCode;
    @XmlElement(name = "ReturnDescription")
    protected String returnDescription;
    @XmlElement(name = "ErrorDetail")
    protected String errorDetail;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescription() {
        return returnDescription;
    }

    /**
     * Sets the value of the returnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescription(String value) {
        this.returnDescription = value;
    }

    /**
     * Gets the value of the errorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * Sets the value of the errorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDetail(String value) {
        this.errorDetail = value;
    }

}