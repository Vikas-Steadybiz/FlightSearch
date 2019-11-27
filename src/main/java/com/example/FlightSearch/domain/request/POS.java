package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonNaming(value = PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class POS {

    @JsonProperty("Source")
    ArrayList< Source > Source = new ArrayList <> ();

    public ArrayList<com.example.FlightSearch.domain.request.Source> getSource() {
        return Source;
    }

    public void setSource(ArrayList<com.example.FlightSearch.domain.request.Source> source) {
        Source = source;
    }
}
