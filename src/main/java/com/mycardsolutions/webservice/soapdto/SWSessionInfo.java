//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 05:12:55 PM IST 
//


package com.mycardsolutions.webservice.soapdto;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for SWSessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWSessionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Roles" type="{SWSharedTypes}ArrayOfLong" minOccurs="0"/&gt;
 *         &lt;element name="CurrentMenuItemGuid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CurrentScreenID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScreenVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScreenClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CultureInfoID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ComputerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Database" type="{SWSharedTypes}SystemDatabase"/&gt;
 *         &lt;element name="LoginType" type="{SWSharedTypes}LoginTypeEnum"/&gt;
 *         &lt;element name="UserCodeWithDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MbrId" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsAdminMbrUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ClientReqTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TableAuth" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChannelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReqGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWSessionInfo", namespace = "SWSharedTypes", propOrder = {
    "guid",
    "userCode",
    "branchUser",
    "branchId",
    "roles",
    "currentMenuItemGuid",
    "currentScreenID",
    "currentScreenVersion",
    "currentScreenClass",
    "language",
    "cultureInfoID",
    "computerName",
    "ipAddress",
    "database",
    "loginType",
    "userCodeWithDomain",
    "countryCode",
    "mbrId",
    "currencyCode",
    "isAdminMbrUser",
    "clientReqTime",
    "tableAuth",
    "lastLoginDate",
    "lastLoginTime",
    "channelCode",
    "reqGuid",
    "eventName",
    "eventResourceName",
    "eventId"
})
public class SWSessionInfo {

    @XmlElement(name = "GUID")
    protected long guid;
    @XmlElement(name = "UserCode")
    protected String userCode;
    @XmlElement(name = "BranchUser")
    protected boolean branchUser;
    @XmlElement(name = "BranchId")
    protected int branchId;
    @XmlElement(name = "Roles")
    protected ArrayOfLong2 roles;
    @XmlElement(name = "CurrentMenuItemGuid")
    protected long currentMenuItemGuid;
    @XmlElement(name = "CurrentScreenID")
    protected String currentScreenID;
    @XmlElement(name = "CurrentScreenVersion")
    protected String currentScreenVersion;
    @XmlElement(name = "CurrentScreenClass")
    protected String currentScreenClass;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "CultureInfoID")
    protected int cultureInfoID;
    @XmlElement(name = "ComputerName")
    protected String computerName;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "Database", required = true)
    @XmlSchemaType(name = "string")
    protected SystemDatabase database;
    @XmlElement(name = "LoginType", required = true)
    @XmlSchemaType(name = "string")
    protected LoginTypeEnum loginType;
    @XmlElement(name = "UserCodeWithDomain")
    protected String userCodeWithDomain;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "MbrId")
    protected short mbrId;
    @XmlElement(name = "CurrencyCode")
    protected int currencyCode;
    @XmlElement(name = "IsAdminMbrUser")
    protected boolean isAdminMbrUser;
    @XmlElement(name = "ClientReqTime")
    protected int clientReqTime;
    @XmlElement(name = "TableAuth")
    protected boolean tableAuth;
    @XmlElement(name = "LastLoginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;
    @XmlElement(name = "LastLoginTime")
    protected int lastLoginTime;
    @XmlElement(name = "ChannelCode")
    protected String channelCode;
    @XmlElement(name = "ReqGuid")
    protected String reqGuid;
    @XmlElement(name = "EventName")
    protected String eventName;
    @XmlElement(name = "EventResourceName")
    protected String eventResourceName;
    @XmlElement(name = "EventId")
    protected long eventId;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the guid property.
     * 
     */
    public long getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     */
    public void setGUID(long value) {
        this.guid = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the branchUser property.
     * 
     */
    public boolean isBranchUser() {
        return branchUser;
    }

    /**
     * Sets the value of the branchUser property.
     * 
     */
    public void setBranchUser(boolean value) {
        this.branchUser = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     */
    public int getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     */
    public void setBranchId(int value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong2 }
     *     
     */
    public ArrayOfLong2 getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong2 }
     *     
     */
    public void setRoles(ArrayOfLong2 value) {
        this.roles = value;
    }

    /**
     * Gets the value of the currentMenuItemGuid property.
     * 
     */
    public long getCurrentMenuItemGuid() {
        return currentMenuItemGuid;
    }

    /**
     * Sets the value of the currentMenuItemGuid property.
     * 
     */
    public void setCurrentMenuItemGuid(long value) {
        this.currentMenuItemGuid = value;
    }

    /**
     * Gets the value of the currentScreenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentScreenID() {
        return currentScreenID;
    }

    /**
     * Sets the value of the currentScreenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentScreenID(String value) {
        this.currentScreenID = value;
    }

    /**
     * Gets the value of the currentScreenVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentScreenVersion() {
        return currentScreenVersion;
    }

    /**
     * Sets the value of the currentScreenVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentScreenVersion(String value) {
        this.currentScreenVersion = value;
    }

    /**
     * Gets the value of the currentScreenClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentScreenClass() {
        return currentScreenClass;
    }

    /**
     * Sets the value of the currentScreenClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentScreenClass(String value) {
        this.currentScreenClass = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the cultureInfoID property.
     * 
     */
    public int getCultureInfoID() {
        return cultureInfoID;
    }

    /**
     * Sets the value of the cultureInfoID property.
     * 
     */
    public void setCultureInfoID(int value) {
        this.cultureInfoID = value;
    }

    /**
     * Gets the value of the computerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerName() {
        return computerName;
    }

    /**
     * Sets the value of the computerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerName(String value) {
        this.computerName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDatabase }
     *     
     */
    public SystemDatabase getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDatabase }
     *     
     */
    public void setDatabase(SystemDatabase value) {
        this.database = value;
    }

    /**
     * Gets the value of the loginType property.
     * 
     * @return
     *     possible object is
     *     {@link LoginTypeEnum }
     *     
     */
    public LoginTypeEnum getLoginType() {
        return loginType;
    }

    /**
     * Sets the value of the loginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginTypeEnum }
     *     
     */
    public void setLoginType(LoginTypeEnum value) {
        this.loginType = value;
    }

    /**
     * Gets the value of the userCodeWithDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCodeWithDomain() {
        return userCodeWithDomain;
    }

    /**
     * Sets the value of the userCodeWithDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCodeWithDomain(String value) {
        this.userCodeWithDomain = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the mbrId property.
     * 
     */
    public short getMbrId() {
        return mbrId;
    }

    /**
     * Sets the value of the mbrId property.
     * 
     */
    public void setMbrId(short value) {
        this.mbrId = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     */
    public int getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     */
    public void setCurrencyCode(int value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the isAdminMbrUser property.
     * 
     */
    public boolean isIsAdminMbrUser() {
        return isAdminMbrUser;
    }

    /**
     * Sets the value of the isAdminMbrUser property.
     * 
     */
    public void setIsAdminMbrUser(boolean value) {
        this.isAdminMbrUser = value;
    }

    /**
     * Gets the value of the clientReqTime property.
     * 
     */
    public int getClientReqTime() {
        return clientReqTime;
    }

    /**
     * Sets the value of the clientReqTime property.
     * 
     */
    public void setClientReqTime(int value) {
        this.clientReqTime = value;
    }

    /**
     * Gets the value of the tableAuth property.
     * 
     */
    public boolean isTableAuth() {
        return tableAuth;
    }

    /**
     * Sets the value of the tableAuth property.
     * 
     */
    public void setTableAuth(boolean value) {
        this.tableAuth = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDate(XMLGregorianCalendar value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     */
    public int getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     */
    public void setLastLoginTime(int value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the reqGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqGuid() {
        return reqGuid;
    }

    /**
     * Sets the value of the reqGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqGuid(String value) {
        this.reqGuid = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the eventResourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventResourceName() {
        return eventResourceName;
    }

    /**
     * Sets the value of the eventResourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventResourceName(String value) {
        this.eventResourceName = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     */
    public long getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     */
    public void setEventId(long value) {
        this.eventId = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}