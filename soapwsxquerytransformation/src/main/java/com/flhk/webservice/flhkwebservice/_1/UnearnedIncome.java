//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.18 at 12:24:45 PM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unearnedIncome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unearnedIncome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incomeNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="incomeStatus" type="{http://webservice.flhk.com/FLHKWebService/1.0}incomeStatusEnum" minOccurs="0"/>
 *         &lt;element name="monthlyIncomeOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="monthlySSIBenefitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="monthlySocialSecurityBenefitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="monthlyUnemploymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unearnedIncome", propOrder = {
    "incomeNumber",
    "incomeStatus",
    "monthlyIncomeOther",
    "monthlySSIBenefitAmount",
    "monthlySocialSecurityBenefitAmount",
    "monthlyUnemploymentAmount"
})
public class UnearnedIncome {

    protected Long incomeNumber;
    protected FinanceItemStatusEnum incomeStatus;
    protected BigDecimal monthlyIncomeOther;
    protected BigDecimal monthlySSIBenefitAmount;
    protected BigDecimal monthlySocialSecurityBenefitAmount;
    protected BigDecimal monthlyUnemploymentAmount;

    /**
     * Gets the value of the incomeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncomeNumber() {
        return incomeNumber;
    }

    /**
     * Sets the value of the incomeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncomeNumber(Long value) {
        this.incomeNumber = value;
    }

    /**
     * Gets the value of the incomeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FinanceItemStatusEnum }
     *     
     */
    public FinanceItemStatusEnum getIncomeStatus() {
        return incomeStatus;
    }

    /**
     * Sets the value of the incomeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanceItemStatusEnum }
     *     
     */
    public void setIncomeStatus(FinanceItemStatusEnum value) {
        this.incomeStatus = value;
    }

    /**
     * Gets the value of the monthlyIncomeOther property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyIncomeOther() {
        return monthlyIncomeOther;
    }

    /**
     * Sets the value of the monthlyIncomeOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyIncomeOther(BigDecimal value) {
        this.monthlyIncomeOther = value;
    }

    /**
     * Gets the value of the monthlySSIBenefitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlySSIBenefitAmount() {
        return monthlySSIBenefitAmount;
    }

    /**
     * Sets the value of the monthlySSIBenefitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlySSIBenefitAmount(BigDecimal value) {
        this.monthlySSIBenefitAmount = value;
    }

    /**
     * Gets the value of the monthlySocialSecurityBenefitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlySocialSecurityBenefitAmount() {
        return monthlySocialSecurityBenefitAmount;
    }

    /**
     * Sets the value of the monthlySocialSecurityBenefitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlySocialSecurityBenefitAmount(BigDecimal value) {
        this.monthlySocialSecurityBenefitAmount = value;
    }

    /**
     * Gets the value of the monthlyUnemploymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyUnemploymentAmount() {
        return monthlyUnemploymentAmount;
    }

    /**
     * Sets the value of the monthlyUnemploymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyUnemploymentAmount(BigDecimal value) {
        this.monthlyUnemploymentAmount = value;
    }

}
