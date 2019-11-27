package com.example.FlightSearch.domain.request;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

public class Flight {

    private String ClassOfService;
    private Long Number;
    private String DepartureDateTime;
    private String ArrivalDateTime;
    private String Type;
    OriginLocation OriginLocation;
    DestinationLocation DestinationLocation;
    Airline Airline;
}
