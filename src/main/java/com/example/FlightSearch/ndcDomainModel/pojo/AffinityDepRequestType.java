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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Departure information for affinity shopping requests.
 * 
 * <p>Java class for AffinityDepRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityDepRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivision" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountrySubDivisionType" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         &lt;element name="ProximityDistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}StationType" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityDepRequestType", propOrder = {
    "country",
    "countrySubDivision",
    "date",
    "proximityDistanceMeasure",
    "station",
    "time"
})
public class AffinityDepRequestType {

    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "CountrySubDivision")
    protected CountrySubDivisionType countrySubDivision;
    @XmlElement(name = "Date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "ProximityDistanceMeasure")
    protected MeasureType proximityDistanceMeasure;
    @XmlElement(name = "Station")
    protected StationType station;
    @XmlElement(name = "Time")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public CountrySubDivisionType getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * Sets the value of the countrySubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public void setCountrySubDivision(CountrySubDivisionType value) {
        this.countrySubDivision = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the proximityDistanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getProximityDistanceMeasure() {
        return proximityDistanceMeasure;
    }

    /**
     * Sets the value of the proximityDistanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setProximityDistanceMeasure(MeasureType value) {
        this.proximityDistanceMeasure = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStation(StationType value) {
        this.station = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

}
