//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.11 at 12:34:02 PM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceReply" type="{http://webservice.flhk.com/FLHKWebService/1.0}serviceReplyEnum"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmation", propOrder = {
    "serviceReply",
    "message"
})
public class Confirmation {

    @XmlElement(required = true)
    protected ServiceReplyEnum serviceReply;
    protected String message;

    /**
     * Gets the value of the serviceReply property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceReplyEnum }
     *     
     */
    public ServiceReplyEnum getServiceReply() {
        return serviceReply;
    }

    /**
     * Sets the value of the serviceReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceReplyEnum }
     *     
     */
    public void setServiceReply(ServiceReplyEnum value) {
        this.serviceReply = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}