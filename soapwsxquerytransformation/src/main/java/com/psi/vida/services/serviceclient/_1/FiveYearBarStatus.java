//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.09 at 03:15:58 PM IST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fiveYearBarStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fiveYearBarStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MET"/>
 *     &lt;enumeration value="NOT_MET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fiveYearBarStatus")
@XmlEnum
public enum FiveYearBarStatus {

    MET,
    NOT_MET;

    public String value() {
        return name();
    }

    public static FiveYearBarStatus fromValue(String v) {
        return valueOf(v);
    }

}
