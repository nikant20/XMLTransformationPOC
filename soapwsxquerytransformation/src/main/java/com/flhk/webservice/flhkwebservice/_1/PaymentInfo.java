//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.11 at 12:34:02 PM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentStatus" type="{http://webservice.flhk.com/FLHKWebService/1.0}paymentStatusEnum"/>
 *         &lt;element name="nextDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="amountDue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lastPaymentReceivedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastPaymentAmountReceived" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentInfo", propOrder = {
    "paymentStatus",
    "nextDueDate",
    "amountDue",
    "lastPaymentReceivedDate",
    "lastPaymentAmountReceived",
    "accountBalance"
})
public class PaymentInfo {

    @XmlElement(required = true)
    protected PaymentStatusEnum paymentStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextDueDate;
    protected BigDecimal amountDue;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPaymentReceivedDate;
    protected BigDecimal lastPaymentAmountReceived;
    @XmlElement(required = true)
    protected BigDecimal accountBalance;

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusEnum }
     *     
     */
    public PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusEnum }
     *     
     */
    public void setPaymentStatus(PaymentStatusEnum value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the nextDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextDueDate() {
        return nextDueDate;
    }

    /**
     * Sets the value of the nextDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextDueDate(XMLGregorianCalendar value) {
        this.nextDueDate = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountDue(BigDecimal value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the lastPaymentReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentReceivedDate() {
        return lastPaymentReceivedDate;
    }

    /**
     * Sets the value of the lastPaymentReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentReceivedDate(XMLGregorianCalendar value) {
        this.lastPaymentReceivedDate = value;
    }

    /**
     * Gets the value of the lastPaymentAmountReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPaymentAmountReceived() {
        return lastPaymentAmountReceived;
    }

    /**
     * Sets the value of the lastPaymentAmountReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPaymentAmountReceived(BigDecimal value) {
        this.lastPaymentAmountReceived = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountBalance(BigDecimal value) {
        this.accountBalance = value;
    }

}
