package com.example.FlightSearch.domain.request.revalidate;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonNaming(value = PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class B {


    @JsonProperty("OTA_AirLowFareSearchRQ")
    private com.example.FlightSearch.domain.request.OTA_AirLowFareSearchRQ OTA_AirLowFareSearchRQ;

    public com.example.FlightSearch.domain.request.OTA_AirLowFareSearchRQ getOTA_AirLowFareSearchRQ() {
        return OTA_AirLowFareSearchRQ;
    }

    public void setOTA_AirLowFareSearchRQ(com.example.FlightSearch.domain.request.OTA_AirLowFareSearchRQ OTA_AirLowFareSearchRQ) {
        this.OTA_AirLowFareSearchRQ = OTA_AirLowFareSearchRQ;
    }


    @Override
    public String toString() {
        return "{" +
                "OTA_AirLowFareSearchRQ=" + OTA_AirLowFareSearchRQ+
                '}';
    }
}
