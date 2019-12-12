//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="members" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="member" type="{http://services.vida.psi.com/ServiceClient/1.0}member" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountContactInfo" type="{http://services.vida.psi.com/ServiceClient/1.0}accountContactInfo" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="couponsRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultLanguage" type="{http://services.vida.psi.com/ServiceClient/1.0}languagePreferenceEnum" minOccurs="0"/>
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAccountData", propOrder = {
    "members",
    "accountContactInfo",
    "accountNumber",
    "couponsRequested",
    "defaultLanguage",
    "jpaVersion"
})
public class UpdateAccountData {

    protected UpdateAccountData.Members members;
    protected AccountContactInfo accountContactInfo;
    protected Long accountNumber;
    protected Boolean couponsRequested;
    protected LanguagePreferenceEnum defaultLanguage;
    protected Long jpaVersion;

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAccountData.Members }
     *     
     */
    public UpdateAccountData.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAccountData.Members }
     *     
     */
    public void setMembers(UpdateAccountData.Members value) {
        this.members = value;
    }

    /**
     * Gets the value of the accountContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContactInfo }
     *     
     */
    public AccountContactInfo getAccountContactInfo() {
        return accountContactInfo;
    }

    /**
     * Sets the value of the accountContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContactInfo }
     *     
     */
    public void setAccountContactInfo(AccountContactInfo value) {
        this.accountContactInfo = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the couponsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCouponsRequested() {
        return couponsRequested;
    }

    /**
     * Sets the value of the couponsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCouponsRequested(Boolean value) {
        this.couponsRequested = value;
    }

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagePreferenceEnum }
     *     
     */
    public LanguagePreferenceEnum getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagePreferenceEnum }
     *     
     */
    public void setDefaultLanguage(LanguagePreferenceEnum value) {
        this.defaultLanguage = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="member" type="{http://services.vida.psi.com/ServiceClient/1.0}member" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "member"
    })
    public static class Members {

        protected List<Member> member;

        /**
         * Gets the value of the member property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the member property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMember().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Member }
         * 
         * 
         */
        public List<Member> getMember() {
            if (member == null) {
                member = new ArrayList<Member>();
            }
            return this.member;
        }

    }

}