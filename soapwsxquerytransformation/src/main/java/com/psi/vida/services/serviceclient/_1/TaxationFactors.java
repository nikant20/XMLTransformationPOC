//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxationFactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxationFactors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimedBy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="claimsDependent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasCofiler" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primaryTaxFilerIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxationFactors", propOrder = {
    "claimedBy",
    "claimsDependent",
    "hasCofiler",
    "primaryTaxFilerIndicator"
})
public class TaxationFactors {

    protected Boolean claimedBy;
    protected Boolean claimsDependent;
    protected Boolean hasCofiler;
    protected Boolean primaryTaxFilerIndicator;

    /**
     * Gets the value of the claimedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimedBy() {
        return claimedBy;
    }

    /**
     * Sets the value of the claimedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimedBy(Boolean value) {
        this.claimedBy = value;
    }

    /**
     * Gets the value of the claimsDependent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimsDependent() {
        return claimsDependent;
    }

    /**
     * Sets the value of the claimsDependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimsDependent(Boolean value) {
        this.claimsDependent = value;
    }

    /**
     * Gets the value of the hasCofiler property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCofiler() {
        return hasCofiler;
    }

    /**
     * Sets the value of the hasCofiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCofiler(Boolean value) {
        this.hasCofiler = value;
    }

    /**
     * Gets the value of the primaryTaxFilerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryTaxFilerIndicator() {
        return primaryTaxFilerIndicator;
    }

    /**
     * Sets the value of the primaryTaxFilerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryTaxFilerIndicator(Boolean value) {
        this.primaryTaxFilerIndicator = value;
    }

}
