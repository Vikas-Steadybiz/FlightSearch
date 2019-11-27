package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginDestinationInformation {

    private String RPH;
    private String DepartureDateTime;
    OriginLocation OriginLocation;
    DestinationLocation DestinationLocation;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    TPA_Extensions TPA_Extensions;
}
