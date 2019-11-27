//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.26 at 07:05:57 PM IST 
//


package com.example.FlightSearch.ndcDomainModel.pojo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripPurposeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TripPurposeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="BusinessAndLeisure"/>
 *     &lt;enumeration value="Leisure"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TripPurposeCodeContentType")
@XmlEnum
public enum TripPurposeCodeContentType {

    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("BusinessAndLeisure")
    BUSINESS_AND_LEISURE("BusinessAndLeisure"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TripPurposeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripPurposeCodeContentType fromValue(String v) {
        for (TripPurposeCodeContentType c: TripPurposeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}