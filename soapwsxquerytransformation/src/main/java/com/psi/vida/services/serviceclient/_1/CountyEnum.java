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
 * <p>Java class for countyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="countyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALACHUA"/>
 *     &lt;enumeration value="BAKER"/>
 *     &lt;enumeration value="BAY"/>
 *     &lt;enumeration value="BRADFORD"/>
 *     &lt;enumeration value="BREVARD"/>
 *     &lt;enumeration value="BROWARD"/>
 *     &lt;enumeration value="CALHOUN"/>
 *     &lt;enumeration value="CHARLOTTE"/>
 *     &lt;enumeration value="CITRUS"/>
 *     &lt;enumeration value="CLAY"/>
 *     &lt;enumeration value="COLLIER"/>
 *     &lt;enumeration value="COLUMBIA"/>
 *     &lt;enumeration value="MIAMI_DADE"/>
 *     &lt;enumeration value="DESOTO"/>
 *     &lt;enumeration value="DIXIE"/>
 *     &lt;enumeration value="DUVAL"/>
 *     &lt;enumeration value="ESCAMBIA"/>
 *     &lt;enumeration value="FLAGLER"/>
 *     &lt;enumeration value="FRANKLIN"/>
 *     &lt;enumeration value="GADSDEN"/>
 *     &lt;enumeration value="GILCHRIST"/>
 *     &lt;enumeration value="GLADES"/>
 *     &lt;enumeration value="GULF"/>
 *     &lt;enumeration value="HAMILTON"/>
 *     &lt;enumeration value="HARDEE"/>
 *     &lt;enumeration value="HENDRY"/>
 *     &lt;enumeration value="HERNANDO"/>
 *     &lt;enumeration value="HIGHLANDS"/>
 *     &lt;enumeration value="HILLSBOROUGH"/>
 *     &lt;enumeration value="HOLMES"/>
 *     &lt;enumeration value="INDIAN_RIVER"/>
 *     &lt;enumeration value="JACKSON"/>
 *     &lt;enumeration value="JEFFERSON"/>
 *     &lt;enumeration value="LAFAYETTE"/>
 *     &lt;enumeration value="LAKE"/>
 *     &lt;enumeration value="LEE"/>
 *     &lt;enumeration value="LEON"/>
 *     &lt;enumeration value="LEVY"/>
 *     &lt;enumeration value="LIBERTY"/>
 *     &lt;enumeration value="MADISON"/>
 *     &lt;enumeration value="MANATEE"/>
 *     &lt;enumeration value="MARION"/>
 *     &lt;enumeration value="MARTIN"/>
 *     &lt;enumeration value="MONROE"/>
 *     &lt;enumeration value="NASSAU"/>
 *     &lt;enumeration value="OKALOOSA"/>
 *     &lt;enumeration value="OKEECHOBEE"/>
 *     &lt;enumeration value="ORANGE"/>
 *     &lt;enumeration value="OSCEOLA"/>
 *     &lt;enumeration value="PALM_BEACH"/>
 *     &lt;enumeration value="PASCO"/>
 *     &lt;enumeration value="PINELLAS"/>
 *     &lt;enumeration value="POLK"/>
 *     &lt;enumeration value="PUTNAM"/>
 *     &lt;enumeration value="SAINT_JOHNS"/>
 *     &lt;enumeration value="SAINT_LUCIE"/>
 *     &lt;enumeration value="SANTA_ROSA"/>
 *     &lt;enumeration value="SARASOTA"/>
 *     &lt;enumeration value="SEMINOLE"/>
 *     &lt;enumeration value="SUMTER"/>
 *     &lt;enumeration value="SUWANNEE"/>
 *     &lt;enumeration value="TAYLOR"/>
 *     &lt;enumeration value="UNION"/>
 *     &lt;enumeration value="VOLUSIA"/>
 *     &lt;enumeration value="WAKULLA"/>
 *     &lt;enumeration value="WALTON"/>
 *     &lt;enumeration value="WASHINGTON"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "countyEnum")
@XmlEnum
public enum CountyEnum {

    ALACHUA,
    BAKER,
    BAY,
    BRADFORD,
    BREVARD,
    BROWARD,
    CALHOUN,
    CHARLOTTE,
    CITRUS,
    CLAY,
    COLLIER,
    COLUMBIA,
    MIAMI_DADE,
    DESOTO,
    DIXIE,
    DUVAL,
    ESCAMBIA,
    FLAGLER,
    FRANKLIN,
    GADSDEN,
    GILCHRIST,
    GLADES,
    GULF,
    HAMILTON,
    HARDEE,
    HENDRY,
    HERNANDO,
    HIGHLANDS,
    HILLSBOROUGH,
    HOLMES,
    INDIAN_RIVER,
    JACKSON,
    JEFFERSON,
    LAFAYETTE,
    LAKE,
    LEE,
    LEON,
    LEVY,
    LIBERTY,
    MADISON,
    MANATEE,
    MARION,
    MARTIN,
    MONROE,
    NASSAU,
    OKALOOSA,
    OKEECHOBEE,
    ORANGE,
    OSCEOLA,
    PALM_BEACH,
    PASCO,
    PINELLAS,
    POLK,
    PUTNAM,
    SAINT_JOHNS,
    SAINT_LUCIE,
    SANTA_ROSA,
    SARASOTA,
    SEMINOLE,
    SUMTER,
    SUWANNEE,
    TAYLOR,
    UNION,
    VOLUSIA,
    WAKULLA,
    WALTON,
    WASHINGTON,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CountyEnum fromValue(String v) {
        return valueOf(v);
    }

}
