package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonNaming(value = PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Source {

    @JsonProperty("PseudoCityCode")
    private String PseudoCityCode;
    @JsonProperty("RequestorID")
    RequestorID RequestorID;

    public String getPseudoCityCode() {
        return PseudoCityCode;
    }

    public void setPseudoCityCode(String pseudoCityCode) {
        PseudoCityCode = pseudoCityCode;
    }

    public RequestorID getRequestorID() {
        return RequestorID;
    }

    public void setRequestorID(RequestorID RequestorID) {
        RequestorID = RequestorID;
    }
}
