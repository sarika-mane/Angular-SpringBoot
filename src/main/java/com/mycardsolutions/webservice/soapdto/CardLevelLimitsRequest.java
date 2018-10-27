//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 05:12:55 PM IST 
//


package com.mycardsolutions.webservice.soapdto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardLevelLimitsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardLevelLimitsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckDailyAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckWeeklyAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckYearlyAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckDailyCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckWeeklyCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckMonthlyCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckYearlyCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CheckSingleAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxSingleAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxDailyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxWeeklyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxMonthlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxYearlyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MaxDailyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxWeeklyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxMonthlyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxYearlyCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardLevelLimitsRequest", propOrder = {
    "limitType",
    "checkDailyAmount",
    "checkWeeklyAmount",
    "checkMonthlyAmount",
    "checkYearlyAmount",
    "checkDailyCount",
    "checkWeeklyCount",
    "checkMonthlyCount",
    "checkYearlyCount",
    "checkSingleAmount",
    "maxSingleAmount",
    "maxDailyAmount",
    "maxWeeklyAmount",
    "maxMonthlyAmount",
    "maxYearlyAmount",
    "maxDailyCount",
    "maxWeeklyCount",
    "maxMonthlyCount",
    "maxYearlyCount"
})
public class CardLevelLimitsRequest {

    @XmlElement(name = "LimitType")
    protected String limitType;
    @XmlElement(name = "CheckDailyAmount")
    protected boolean checkDailyAmount;
    @XmlElement(name = "CheckWeeklyAmount")
    protected boolean checkWeeklyAmount;
    @XmlElement(name = "CheckMonthlyAmount")
    protected boolean checkMonthlyAmount;
    @XmlElement(name = "CheckYearlyAmount")
    protected boolean checkYearlyAmount;
    @XmlElement(name = "CheckDailyCount")
    protected boolean checkDailyCount;
    @XmlElement(name = "CheckWeeklyCount")
    protected boolean checkWeeklyCount;
    @XmlElement(name = "CheckMonthlyCount")
    protected boolean checkMonthlyCount;
    @XmlElement(name = "CheckYearlyCount")
    protected boolean checkYearlyCount;
    @XmlElement(name = "CheckSingleAmount")
    protected boolean checkSingleAmount;
    @XmlElement(name = "MaxSingleAmount", required = true)
    protected BigDecimal maxSingleAmount;
    @XmlElement(name = "MaxDailyAmount", required = true)
    protected BigDecimal maxDailyAmount;
    @XmlElement(name = "MaxWeeklyAmount", required = true)
    protected BigDecimal maxWeeklyAmount;
    @XmlElement(name = "MaxMonthlyAmount", required = true)
    protected BigDecimal maxMonthlyAmount;
    @XmlElement(name = "MaxYearlyAmount", required = true)
    protected BigDecimal maxYearlyAmount;
    @XmlElement(name = "MaxDailyCount")
    protected int maxDailyCount;
    @XmlElement(name = "MaxWeeklyCount")
    protected int maxWeeklyCount;
    @XmlElement(name = "MaxMonthlyCount")
    protected int maxMonthlyCount;
    @XmlElement(name = "MaxYearlyCount")
    protected int maxYearlyCount;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the checkDailyAmount property.
     * 
     */
    public boolean isCheckDailyAmount() {
        return checkDailyAmount;
    }

    /**
     * Sets the value of the checkDailyAmount property.
     * 
     */
    public void setCheckDailyAmount(boolean value) {
        this.checkDailyAmount = value;
    }

    /**
     * Gets the value of the checkWeeklyAmount property.
     * 
     */
    public boolean isCheckWeeklyAmount() {
        return checkWeeklyAmount;
    }

    /**
     * Sets the value of the checkWeeklyAmount property.
     * 
     */
    public void setCheckWeeklyAmount(boolean value) {
        this.checkWeeklyAmount = value;
    }

    /**
     * Gets the value of the checkMonthlyAmount property.
     * 
     */
    public boolean isCheckMonthlyAmount() {
        return checkMonthlyAmount;
    }

    /**
     * Sets the value of the checkMonthlyAmount property.
     * 
     */
    public void setCheckMonthlyAmount(boolean value) {
        this.checkMonthlyAmount = value;
    }

    /**
     * Gets the value of the checkYearlyAmount property.
     * 
     */
    public boolean isCheckYearlyAmount() {
        return checkYearlyAmount;
    }

    /**
     * Sets the value of the checkYearlyAmount property.
     * 
     */
    public void setCheckYearlyAmount(boolean value) {
        this.checkYearlyAmount = value;
    }

    /**
     * Gets the value of the checkDailyCount property.
     * 
     */
    public boolean isCheckDailyCount() {
        return checkDailyCount;
    }

    /**
     * Sets the value of the checkDailyCount property.
     * 
     */
    public void setCheckDailyCount(boolean value) {
        this.checkDailyCount = value;
    }

    /**
     * Gets the value of the checkWeeklyCount property.
     * 
     */
    public boolean isCheckWeeklyCount() {
        return checkWeeklyCount;
    }

    /**
     * Sets the value of the checkWeeklyCount property.
     * 
     */
    public void setCheckWeeklyCount(boolean value) {
        this.checkWeeklyCount = value;
    }

    /**
     * Gets the value of the checkMonthlyCount property.
     * 
     */
    public boolean isCheckMonthlyCount() {
        return checkMonthlyCount;
    }

    /**
     * Sets the value of the checkMonthlyCount property.
     * 
     */
    public void setCheckMonthlyCount(boolean value) {
        this.checkMonthlyCount = value;
    }

    /**
     * Gets the value of the checkYearlyCount property.
     * 
     */
    public boolean isCheckYearlyCount() {
        return checkYearlyCount;
    }

    /**
     * Sets the value of the checkYearlyCount property.
     * 
     */
    public void setCheckYearlyCount(boolean value) {
        this.checkYearlyCount = value;
    }

    /**
     * Gets the value of the checkSingleAmount property.
     * 
     */
    public boolean isCheckSingleAmount() {
        return checkSingleAmount;
    }

    /**
     * Sets the value of the checkSingleAmount property.
     * 
     */
    public void setCheckSingleAmount(boolean value) {
        this.checkSingleAmount = value;
    }

    /**
     * Gets the value of the maxSingleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSingleAmount() {
        return maxSingleAmount;
    }

    /**
     * Sets the value of the maxSingleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSingleAmount(BigDecimal value) {
        this.maxSingleAmount = value;
    }

    /**
     * Gets the value of the maxDailyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxDailyAmount() {
        return maxDailyAmount;
    }

    /**
     * Sets the value of the maxDailyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxDailyAmount(BigDecimal value) {
        this.maxDailyAmount = value;
    }

    /**
     * Gets the value of the maxWeeklyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWeeklyAmount() {
        return maxWeeklyAmount;
    }

    /**
     * Sets the value of the maxWeeklyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWeeklyAmount(BigDecimal value) {
        this.maxWeeklyAmount = value;
    }

    /**
     * Gets the value of the maxMonthlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxMonthlyAmount() {
        return maxMonthlyAmount;
    }

    /**
     * Sets the value of the maxMonthlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxMonthlyAmount(BigDecimal value) {
        this.maxMonthlyAmount = value;
    }

    /**
     * Gets the value of the maxYearlyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxYearlyAmount() {
        return maxYearlyAmount;
    }

    /**
     * Sets the value of the maxYearlyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxYearlyAmount(BigDecimal value) {
        this.maxYearlyAmount = value;
    }

    /**
     * Gets the value of the maxDailyCount property.
     * 
     */
    public int getMaxDailyCount() {
        return maxDailyCount;
    }

    /**
     * Sets the value of the maxDailyCount property.
     * 
     */
    public void setMaxDailyCount(int value) {
        this.maxDailyCount = value;
    }

    /**
     * Gets the value of the maxWeeklyCount property.
     * 
     */
    public int getMaxWeeklyCount() {
        return maxWeeklyCount;
    }

    /**
     * Sets the value of the maxWeeklyCount property.
     * 
     */
    public void setMaxWeeklyCount(int value) {
        this.maxWeeklyCount = value;
    }

    /**
     * Gets the value of the maxMonthlyCount property.
     * 
     */
    public int getMaxMonthlyCount() {
        return maxMonthlyCount;
    }

    /**
     * Sets the value of the maxMonthlyCount property.
     * 
     */
    public void setMaxMonthlyCount(int value) {
        this.maxMonthlyCount = value;
    }

    /**
     * Gets the value of the maxYearlyCount property.
     * 
     */
    public int getMaxYearlyCount() {
        return maxYearlyCount;
    }

    /**
     * Sets the value of the maxYearlyCount property.
     * 
     */
    public void setMaxYearlyCount(int value) {
        this.maxYearlyCount = value;
    }

}
