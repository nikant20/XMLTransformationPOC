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
 * <p>Java class for submitRenewal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitRenewal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.flhk.com/FLHKWebService/1.0}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="renewal" type="{http://webservice.flhk.com/FLHKWebService/1.0}application" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitRenewal", propOrder = {
    "renewal"
})
public class SubmitRenewal
    extends ServiceRequest
{

    protected Application renewal;

    /**
     * Gets the value of the renewal property.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    public Application getRenewal() {
        return renewal;
    }

    /**
     * Sets the value of the renewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    public void setRenewal(Application value) {
        this.renewal = value;
    }

}
