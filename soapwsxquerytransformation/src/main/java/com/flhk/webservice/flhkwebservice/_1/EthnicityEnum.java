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
 * <p>Java class for ethnicityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ethnicityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HISPANIC_OR_LATINO"/>
 *     &lt;enumeration value="NOT_HISPANIC_OR_LATINO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ethnicityEnum")
@XmlEnum
public enum EthnicityEnum {

    HISPANIC_OR_LATINO,
    NOT_HISPANIC_OR_LATINO;

    public String value() {
        return name();
    }

    public static EthnicityEnum fromValue(String v) {
        return valueOf(v);
    }

}
