//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 05:12:55 PM IST 
//


package com.mycardsolutions.webservice.soapdto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTopupToPrepaidObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTopupToPrepaidObj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TopupToPrepaidObj" type="{Smartsoft.Integration.Services}TopupToPrepaidObj" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTopupToPrepaidObj", propOrder = {
    "topupToPrepaidObj"
})
public class ArrayOfTopupToPrepaidObj {

    @XmlElement(name = "TopupToPrepaidObj", nillable = true)
    protected List<TopupToPrepaidObj> topupToPrepaidObj;

    /**
     * Gets the value of the topupToPrepaidObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topupToPrepaidObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopupToPrepaidObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopupToPrepaidObj }
     * 
     * 
     */
    public List<TopupToPrepaidObj> getTopupToPrepaidObj() {
        if (topupToPrepaidObj == null) {
            topupToPrepaidObj = new ArrayList<TopupToPrepaidObj>();
        }
        return this.topupToPrepaidObj;
    }

}
