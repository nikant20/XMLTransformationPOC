//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.18 at 12:24:45 PM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewAccountDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewAccountDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountData" type="{http://webservice.flhk.com/FLHKWebService/1.0}accountData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewAccountDataResponse", propOrder = {
    "accountData"
})
public class ViewAccountDataResponse {

    protected AccountData accountData;

    /**
     * Gets the value of the accountData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountData }
     *     
     */
    public AccountData getAccountData() {
        return accountData;
    }

    /**
     * Sets the value of the accountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountData }
     *     
     */
    public void setAccountData(AccountData value) {
        this.accountData = value;
    }

}
