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
 * <p>Java class for StateTypeResponce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateTypeResponce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{Smartsoft.Integration.Services}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StateList" type="{Smartsoft.Integration.Services}ArrayOfStateTypeInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateTypeResponce", propOrder = {
    "stateList"
})
public class StateTypeResponce
    extends ServiceResponse
{

    @XmlElement(name = "StateList")
    protected ArrayOfStateTypeInfo stateList;

    /**
     * Gets the value of the stateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStateTypeInfo }
     *     
     */
    public ArrayOfStateTypeInfo getStateList() {
        return stateList;
    }

    /**
     * Sets the value of the stateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStateTypeInfo }
     *     
     */
    public void setStateList(ArrayOfStateTypeInfo value) {
        this.stateList = value;
    }

}