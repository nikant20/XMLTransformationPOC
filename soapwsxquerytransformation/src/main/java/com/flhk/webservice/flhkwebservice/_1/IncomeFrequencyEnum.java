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
 * <p>Java class for incomeFrequencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="incomeFrequencyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOURLY"/>
 *     &lt;enumeration value="WEEKLY"/>
 *     &lt;enumeration value="BI_WEEKLY"/>
 *     &lt;enumeration value="SEMI_MONTHLY"/>
 *     &lt;enumeration value="MONTHLY"/>
 *     &lt;enumeration value="YEARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "incomeFrequencyEnum")
@XmlEnum
public enum IncomeFrequencyEnum {

    HOURLY,
    WEEKLY,
    BI_WEEKLY,
    SEMI_MONTHLY,
    MONTHLY,
    YEARLY;

    public String value() {
        return name();
    }

    public static IncomeFrequencyEnum fromValue(String v) {
        return valueOf(v);
    }

}
