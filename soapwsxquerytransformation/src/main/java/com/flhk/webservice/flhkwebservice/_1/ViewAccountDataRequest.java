//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.13 at 10:03:46 AM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewAccountDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewAccountDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.flhk.com/FLHKWebService/1.0}serviceRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservice.flhk.com/FLHKWebService/1.0}familyAccountId"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewAccountDataRequest", propOrder = {
    "familyAccountId"
})
public class ViewAccountDataRequest
    extends ServiceRequest
{

    @XmlElement(namespace = "http://webservice.flhk.com/FLHKWebService/1.0")
    protected long familyAccountId;

    /**
     * Gets the value of the familyAccountId property.
     * 
     */
    public long getFamilyAccountId() {
        return familyAccountId;
    }

    /**
     * Sets the value of the familyAccountId property.
     * 
     */
    public void setFamilyAccountId(long value) {
        this.familyAccountId = value;
    }

}
