package com.example.FlightSearch.domain.request.search;

import com.example.FlightSearch.domain.request.POS;
import com.example.FlightSearch.domain.request.TravelPreferences;
import com.example.FlightSearch.domain.request.TravelerInfoSummary;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonNaming(value = PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OTA_AirLowFareSearchRQ {


    @JsonProperty("Version")
    private String Version;
    @JsonProperty("POS")
    private POS POS;
    @JsonProperty("OriginDestinationInformation")
    ArrayList<com.example.FlightSearch.domain.request.search.OriginDestinationInformation> OriginDestinationInformation = new ArrayList<>();
    @JsonProperty("TravelPreferences")
    private TravelPreferences TravelPreferences;
    @JsonProperty("TravelerInfoSummary")
    private TravelerInfoSummary TravelerInfoSummary;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("TPA_Extensions")
    private com.example.FlightSearch.domain.request.search.TPA_Extensions TPA_Extensions;

//    public OTA_AirLowFareSearchRQ() {
//    }
//
//    public OTA_AirLowFareSearchRQ(String Version, POS POSObject, ArrayList<com.example.FlightSearch.domain.request.OriginDestinationInformation> originDestinationInformation, com.example.FlightSearch.domain.request.TravelPreferences travelPreferences, com.example.FlightSearch.domain.request.TravelerInfoSummary travelerInfoSummary, TPA_Extensions TPA_extensions) {
//        Version = Version;
//        this.POSObject = POSObject;
//        OriginDestinationInformation = originDestinationInformation;
//        TravelPreferences = travelPreferences;
//        TravelerInfoSummary = travelerInfoSummary;
//        this.TPA_extensions = TPA_extensions;
//    }


    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public POS getPOS() {
        return POS;
    }

    public void setPOS(POS POS) {
        this.POS = POS;
    }

    public ArrayList<com.example.FlightSearch.domain.request.search.OriginDestinationInformation> getOriginDestinationInformation() {
        return OriginDestinationInformation;
    }

    public void setOriginDestinationInformation(ArrayList<com.example.FlightSearch.domain.request.search.OriginDestinationInformation> originDestinationInformation) {
        OriginDestinationInformation = originDestinationInformation;
    }

    public com.example.FlightSearch.domain.request.TravelPreferences getTravelPreferences() {
        return TravelPreferences;
    }

    public void setTravelPreferences(com.example.FlightSearch.domain.request.TravelPreferences travelPreferences) {
        TravelPreferences = travelPreferences;
    }

    public com.example.FlightSearch.domain.request.TravelerInfoSummary getTravelerInfoSummary() {
        return TravelerInfoSummary;
    }

    public void setTravelerInfoSummary(com.example.FlightSearch.domain.request.TravelerInfoSummary travelerInfoSummary) {
        TravelerInfoSummary = travelerInfoSummary;
    }

//    public TPA_Extensions getTPA_Extensions() {
//        return TPA_Extensions;
//    }
//
//    public void setTPA_Extensions(TPA_Extensions TPA_Extensions) {
//        this.TPA_Extensions = TPA_Extensions;
//    }


    @Override
    public String toString() {
        return "{" +
                "Version='" + Version + '\'' +
                ", POS=" + POS +
                ", OriginDestinationInformation=" + OriginDestinationInformation +
                ", TravelPreferences=" + TravelPreferences +
                ", TravelerInfoSummary=" + TravelerInfoSummary +
                ", TPA_Extensions=" + TPA_Extensions +
                '}';
    }

}