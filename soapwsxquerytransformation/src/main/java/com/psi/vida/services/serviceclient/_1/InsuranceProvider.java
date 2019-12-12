//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employerInsuranceCobra" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="employerInsuranceProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerInsuranceRetiree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasHealthInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insuranceMonthlyCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="insuranceProviderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="insuranceProviders" type="{http://services.vida.psi.com/ServiceClient/1.0}insuranceProviderEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="otherInsurancePolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInsuranceProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceProvider", propOrder = {
    "employerInsuranceCobra",
    "employerInsuranceProviderName",
    "employerInsuranceRetiree",
    "hasHealthInsurance",
    "insuranceMonthlyCost",
    "insuranceProviderId",
    "insuranceProviders",
    "jpaVersion",
    "otherInsurancePolicyNumber",
    "otherInsuranceProviderName"
})
public class InsuranceProvider {

    protected Boolean employerInsuranceCobra;
    protected String employerInsuranceProviderName;
    protected Boolean employerInsuranceRetiree;
    protected Boolean hasHealthInsurance;
    protected BigDecimal insuranceMonthlyCost;
    protected Long insuranceProviderId;
    @XmlElement(nillable = true)
    protected List<InsuranceProviderEnum> insuranceProviders;
    protected Long jpaVersion;
    protected String otherInsurancePolicyNumber;
    protected String otherInsuranceProviderName;

    /**
     * Gets the value of the employerInsuranceCobra property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployerInsuranceCobra() {
        return employerInsuranceCobra;
    }

    /**
     * Sets the value of the employerInsuranceCobra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployerInsuranceCobra(Boolean value) {
        this.employerInsuranceCobra = value;
    }

    /**
     * Gets the value of the employerInsuranceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerInsuranceProviderName() {
        return employerInsuranceProviderName;
    }

    /**
     * Sets the value of the employerInsuranceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerInsuranceProviderName(String value) {
        this.employerInsuranceProviderName = value;
    }

    /**
     * Gets the value of the employerInsuranceRetiree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployerInsuranceRetiree() {
        return employerInsuranceRetiree;
    }

    /**
     * Sets the value of the employerInsuranceRetiree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployerInsuranceRetiree(Boolean value) {
        this.employerInsuranceRetiree = value;
    }

    /**
     * Gets the value of the hasHealthInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    /**
     * Sets the value of the hasHealthInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHealthInsurance(Boolean value) {
        this.hasHealthInsurance = value;
    }

    /**
     * Gets the value of the insuranceMonthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceMonthlyCost() {
        return insuranceMonthlyCost;
    }

    /**
     * Sets the value of the insuranceMonthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceMonthlyCost(BigDecimal value) {
        this.insuranceMonthlyCost = value;
    }

    /**
     * Gets the value of the insuranceProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuranceProviderId() {
        return insuranceProviderId;
    }

    /**
     * Sets the value of the insuranceProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuranceProviderId(Long value) {
        this.insuranceProviderId = value;
    }

    /**
     * Gets the value of the insuranceProviders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceProviders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceProviderEnum }
     * 
     * 
     */
    public List<InsuranceProviderEnum> getInsuranceProviders() {
        if (insuranceProviders == null) {
            insuranceProviders = new ArrayList<InsuranceProviderEnum>();
        }
        return this.insuranceProviders;
    }

    /**
     * Gets the value of the jpaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJpaVersion() {
        return jpaVersion;
    }

    /**
     * Sets the value of the jpaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJpaVersion(Long value) {
        this.jpaVersion = value;
    }

    /**
     * Gets the value of the otherInsurancePolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsurancePolicyNumber() {
        return otherInsurancePolicyNumber;
    }

    /**
     * Sets the value of the otherInsurancePolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsurancePolicyNumber(String value) {
        this.otherInsurancePolicyNumber = value;
    }

    /**
     * Gets the value of the otherInsuranceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInsuranceProviderName() {
        return otherInsuranceProviderName;
    }

    /**
     * Sets the value of the otherInsuranceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInsuranceProviderName(String value) {
        this.otherInsuranceProviderName = value;
    }

}
