//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.26 at 07:05:57 PM IST 
//


package com.example.FlightSearch.ndcDomainModel.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
 * 
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCodeNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         &lt;element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         &lt;element name="CountryDialingCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryDialingCodeType" minOccurs="0"/>
 *         &lt;element name="ExtensionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", propOrder = {
    "areaCodeNumber",
    "contactTypeText",
    "countryDialingCode",
    "extensionNumber",
    "phoneNumber"
})
public class PhoneType {

    @XmlElement(name = "AreaCodeNumber")
    protected String areaCodeNumber;
    @XmlElement(name = "ContactTypeText")
    protected String contactTypeText;
    @XmlElement(name = "CountryDialingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryDialingCode;
    @XmlElement(name = "ExtensionNumber")
    protected String extensionNumber;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;

    /**
     * Gets the value of the areaCodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCodeNumber() {
        return areaCodeNumber;
    }

    /**
     * Sets the value of the areaCodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCodeNumber(String value) {
        this.areaCodeNumber = value;
    }

    /**
     * Gets the value of the contactTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeText() {
        return contactTypeText;
    }

    /**
     * Sets the value of the contactTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeText(String value) {
        this.contactTypeText = value;
    }

    /**
     * Gets the value of the countryDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDialingCode(String value) {
        this.countryDialingCode = value;
    }

    /**
     * Gets the value of the extensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Sets the value of the extensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNumber(String value) {
        this.extensionNumber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
