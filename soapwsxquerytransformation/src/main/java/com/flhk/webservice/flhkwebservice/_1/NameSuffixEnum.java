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
 * <p>Java class for nameSuffixEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nameSuffixEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JR"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VII"/>
 *     &lt;enumeration value="VIII"/>
 *     &lt;enumeration value="IX"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="ESQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nameSuffixEnum")
@XmlEnum
public enum NameSuffixEnum {

    JR,
    SR,
    I,
    II,
    III,
    IV,
    V,
    VI,
    VII,
    VIII,
    IX,
    X,
    ESQ;

    public String value() {
        return name();
    }

    public static NameSuffixEnum fromValue(String v) {
        return valueOf(v);
    }

}
