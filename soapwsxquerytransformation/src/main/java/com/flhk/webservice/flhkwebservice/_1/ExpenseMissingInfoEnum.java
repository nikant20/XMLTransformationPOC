//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.18 at 12:24:45 PM IST 
//


package com.flhk.webservice.flhkwebservice._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expenseMissingInfoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="expenseMissingInfoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCOMPLETE_DAYCARE_EXPENSE_INCARE_NAME"/>
 *     &lt;enumeration value="INCOMPLETE_DAYCARE_EXPENSE_AMOUNT"/>
 *     &lt;enumeration value="INCOMPLETE_DAYCARE_EXPENSE_PAYOR"/>
 *     &lt;enumeration value="INCOMPLETE_CHILD_SUPPORT_EXPENSE_AMOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "expenseMissingInfoEnum")
@XmlEnum
public enum ExpenseMissingInfoEnum {

    INCOMPLETE_DAYCARE_EXPENSE_INCARE_NAME,
    INCOMPLETE_DAYCARE_EXPENSE_AMOUNT,
    INCOMPLETE_DAYCARE_EXPENSE_PAYOR,
    INCOMPLETE_CHILD_SUPPORT_EXPENSE_AMOUNT;

    public String value() {
        return name();
    }

    public static ExpenseMissingInfoEnum fromValue(String v) {
        return valueOf(v);
    }

}
