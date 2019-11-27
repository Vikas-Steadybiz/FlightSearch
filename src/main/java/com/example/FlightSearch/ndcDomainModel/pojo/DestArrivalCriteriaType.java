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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A Customer's requested Destination arrival time and location.
 * 
 * <p>Java class for DestArrivalCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestArrivalCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BoardingGateID_Type" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_LocationCodeType"/>
 *         &lt;element name="StationName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         &lt;element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *         &lt;element name="TimeAfterMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="TimeBeforeMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestArrivalCriteriaType", propOrder = {
    "boardingGateID",
    "date",
    "iataLocationCode",
    "stationName",
    "terminalName",
    "time",
    "timeAfterMeasure",
    "timeBeforeMeasure"
})
public class DestArrivalCriteriaType {

    @XmlElement(name = "BoardingGateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String boardingGateID;
    @XmlElement(name = "Date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "IATA_LocationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iataLocationCode;
    @XmlElement(name = "StationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stationName;
    @XmlElement(name = "TerminalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String terminalName;
    @XmlElement(name = "Time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "TimeAfterMeasure")
    protected MeasureType timeAfterMeasure;
    @XmlElement(name = "TimeBeforeMeasure")
    protected MeasureType timeBeforeMeasure;

    /**
     * Gets the value of the boardingGateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingGateID(String value) {
        this.boardingGateID = value;
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
     * Gets the value of the iataLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the terminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
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

    /**
     * Gets the value of the timeAfterMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeAfterMeasure() {
        return timeAfterMeasure;
    }

    /**
     * Sets the value of the timeAfterMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTimeAfterMeasure(MeasureType value) {
        this.timeAfterMeasure = value;
    }

    /**
     * Gets the value of the timeBeforeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeBeforeMeasure() {
        return timeBeforeMeasure;
    }

    /**
     * Sets the value of the timeBeforeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTimeBeforeMeasure(MeasureType value) {
        this.timeBeforeMeasure = value;
    }

}
