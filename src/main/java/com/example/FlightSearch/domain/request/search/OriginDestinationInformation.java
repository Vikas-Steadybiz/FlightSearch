package com.example.FlightSearch.domain.request.search;

import com.example.FlightSearch.domain.request.DestinationLocation;
import com.example.FlightSearch.domain.request.OriginLocation;
import com.example.FlightSearch.domain.request.TPA_Extensions;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginDestinationInformation {

    private String RPH;
    private String DepartureDateTime;
    OriginLocation OriginLocation;
    DestinationLocation DestinationLocation;

}
