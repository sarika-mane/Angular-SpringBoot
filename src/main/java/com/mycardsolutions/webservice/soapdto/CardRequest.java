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
 * <p>Java class for CardRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmbossName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmbossName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardBranch" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CardPostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardDeliveryBranch" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PinPostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PinDeliveryBranch" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CardPostIdx" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="PinPostIdx" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="NoMoreRenewal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancialType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NoCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstantFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguagePreferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmbossType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthIntEcom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthDomEcom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthIntMoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthDomMoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuingFeeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AnnualFeeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardRequest", propOrder = {
    "customerNo",
    "applicationNo",
    "productId",
    "embossName1",
    "embossName2",
    "cardBranch",
    "cardPostType",
    "cardDeliveryBranch",
    "pinPostType",
    "pinDeliveryBranch",
    "cardPostIdx",
    "pinPostIdx",
    "noMoreRenewal",
    "logoCode",
    "financialType",
    "noCustomer",
    "cardLevel",
    "mainCardNo",
    "instantFlag",
    "languagePreferenceCode",
    "embossType",
    "cardType",
    "agreementFlag",
    "authIntEcom",
    "authDomEcom",
    "authIntMoto",
    "authDomMoto",
    "issuingFeeFlag",
    "annualFeeFlag"
})
public class CardRequest {

    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "ApplicationNo")
    protected String applicationNo;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "EmbossName1")
    protected String embossName1;
    @XmlElement(name = "EmbossName2")
    protected String embossName2;
    @XmlElement(name = "CardBranch", required = true, type = Integer.class, nillable = true)
    protected Integer cardBranch;
    @XmlElement(name = "CardPostType")
    protected String cardPostType;
    @XmlElement(name = "CardDeliveryBranch", required = true, type = Integer.class, nillable = true)
    protected Integer cardDeliveryBranch;
    @XmlElement(name = "PinPostType")
    protected String pinPostType;
    @XmlElement(name = "PinDeliveryBranch", required = true, type = Integer.class, nillable = true)
    protected Integer pinDeliveryBranch;
    @XmlElement(name = "CardPostIdx", required = true, type = Short.class, nillable = true)
    protected Short cardPostIdx;
    @XmlElement(name = "PinPostIdx", required = true, type = Short.class, nillable = true)
    protected Short pinPostIdx;
    @XmlElement(name = "NoMoreRenewal")
    protected String noMoreRenewal;
    @XmlElement(name = "LogoCode")
    protected String logoCode;
    @XmlElement(name = "FinancialType")
    protected int financialType;
    @XmlElement(name = "NoCustomer", required = true, type = Boolean.class, nillable = true)
    protected Boolean noCustomer;
    @XmlElement(name = "CardLevel")
    protected String cardLevel;
    @XmlElement(name = "MainCardNo")
    protected String mainCardNo;
    @XmlElement(name = "InstantFlag", required = true, type = Boolean.class, nillable = true)
    protected Boolean instantFlag;
    @XmlElement(name = "LanguagePreferenceCode")
    protected String languagePreferenceCode;
    @XmlElement(name = "EmbossType")
    protected String embossType;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "AgreementFlag")
    protected String agreementFlag;
    @XmlElement(name = "AuthIntEcom")
    protected String authIntEcom;
    @XmlElement(name = "AuthDomEcom")
    protected String authDomEcom;
    @XmlElement(name = "AuthIntMoto")
    protected String authIntMoto;
    @XmlElement(name = "AuthDomMoto")
    protected String authDomMoto;
    @XmlElement(name = "IssuingFeeFlag", required = true, type = Boolean.class, nillable = true)
    protected Boolean issuingFeeFlag;
    @XmlElement(name = "AnnualFeeFlag", required = true, type = Boolean.class, nillable = true)
    protected Boolean annualFeeFlag;

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
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the embossName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossName1() {
        return embossName1;
    }

    /**
     * Sets the value of the embossName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossName1(String value) {
        this.embossName1 = value;
    }

    /**
     * Gets the value of the embossName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossName2() {
        return embossName2;
    }

    /**
     * Sets the value of the embossName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossName2(String value) {
        this.embossName2 = value;
    }

    /**
     * Gets the value of the cardBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardBranch() {
        return cardBranch;
    }

    /**
     * Sets the value of the cardBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardBranch(Integer value) {
        this.cardBranch = value;
    }

    /**
     * Gets the value of the cardPostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPostType() {
        return cardPostType;
    }

    /**
     * Sets the value of the cardPostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPostType(String value) {
        this.cardPostType = value;
    }

    /**
     * Gets the value of the cardDeliveryBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardDeliveryBranch() {
        return cardDeliveryBranch;
    }

    /**
     * Sets the value of the cardDeliveryBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardDeliveryBranch(Integer value) {
        this.cardDeliveryBranch = value;
    }

    /**
     * Gets the value of the pinPostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinPostType() {
        return pinPostType;
    }

    /**
     * Sets the value of the pinPostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinPostType(String value) {
        this.pinPostType = value;
    }

    /**
     * Gets the value of the pinDeliveryBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPinDeliveryBranch() {
        return pinDeliveryBranch;
    }

    /**
     * Sets the value of the pinDeliveryBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPinDeliveryBranch(Integer value) {
        this.pinDeliveryBranch = value;
    }

    /**
     * Gets the value of the cardPostIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCardPostIdx() {
        return cardPostIdx;
    }

    /**
     * Sets the value of the cardPostIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCardPostIdx(Short value) {
        this.cardPostIdx = value;
    }

    /**
     * Gets the value of the pinPostIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPinPostIdx() {
        return pinPostIdx;
    }

    /**
     * Sets the value of the pinPostIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPinPostIdx(Short value) {
        this.pinPostIdx = value;
    }

    /**
     * Gets the value of the noMoreRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMoreRenewal() {
        return noMoreRenewal;
    }

    /**
     * Sets the value of the noMoreRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMoreRenewal(String value) {
        this.noMoreRenewal = value;
    }

    /**
     * Gets the value of the logoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoCode() {
        return logoCode;
    }

    /**
     * Sets the value of the logoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoCode(String value) {
        this.logoCode = value;
    }

    /**
     * Gets the value of the financialType property.
     * 
     */
    public int getFinancialType() {
        return financialType;
    }

    /**
     * Sets the value of the financialType property.
     * 
     */
    public void setFinancialType(int value) {
        this.financialType = value;
    }

    /**
     * Gets the value of the noCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCustomer() {
        return noCustomer;
    }

    /**
     * Sets the value of the noCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoCustomer(Boolean value) {
        this.noCustomer = value;
    }

    /**
     * Gets the value of the cardLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevel() {
        return cardLevel;
    }

    /**
     * Sets the value of the cardLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevel(String value) {
        this.cardLevel = value;
    }

    /**
     * Gets the value of the mainCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCardNo() {
        return mainCardNo;
    }

    /**
     * Sets the value of the mainCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCardNo(String value) {
        this.mainCardNo = value;
    }

    /**
     * Gets the value of the instantFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantFlag() {
        return instantFlag;
    }

    /**
     * Sets the value of the instantFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantFlag(Boolean value) {
        this.instantFlag = value;
    }

    /**
     * Gets the value of the languagePreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }

    /**
     * Sets the value of the languagePreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguagePreferenceCode(String value) {
        this.languagePreferenceCode = value;
    }

    /**
     * Gets the value of the embossType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossType() {
        return embossType;
    }

    /**
     * Sets the value of the embossType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossType(String value) {
        this.embossType = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the agreementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementFlag() {
        return agreementFlag;
    }

    /**
     * Sets the value of the agreementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementFlag(String value) {
        this.agreementFlag = value;
    }

    /**
     * Gets the value of the authIntEcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIntEcom() {
        return authIntEcom;
    }

    /**
     * Sets the value of the authIntEcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIntEcom(String value) {
        this.authIntEcom = value;
    }

    /**
     * Gets the value of the authDomEcom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDomEcom() {
        return authDomEcom;
    }

    /**
     * Sets the value of the authDomEcom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDomEcom(String value) {
        this.authDomEcom = value;
    }

    /**
     * Gets the value of the authIntMoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIntMoto() {
        return authIntMoto;
    }

    /**
     * Sets the value of the authIntMoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIntMoto(String value) {
        this.authIntMoto = value;
    }

    /**
     * Gets the value of the authDomMoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDomMoto() {
        return authDomMoto;
    }

    /**
     * Sets the value of the authDomMoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDomMoto(String value) {
        this.authDomMoto = value;
    }

    /**
     * Gets the value of the issuingFeeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssuingFeeFlag() {
        return issuingFeeFlag;
    }

    /**
     * Sets the value of the issuingFeeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssuingFeeFlag(Boolean value) {
        this.issuingFeeFlag = value;
    }

    /**
     * Gets the value of the annualFeeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnualFeeFlag() {
        return annualFeeFlag;
    }

    /**
     * Sets the value of the annualFeeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnualFeeFlag(Boolean value) {
        this.annualFeeFlag = value;
    }

}
