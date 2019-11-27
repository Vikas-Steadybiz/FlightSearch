package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

public class FlightTypePref {

    private String MaxConnections;

    public String getMaxConnections() {
        return MaxConnections;
    }

    public void setMaxConnections(String maxConnections) {
        MaxConnections = maxConnections;
    }
}
