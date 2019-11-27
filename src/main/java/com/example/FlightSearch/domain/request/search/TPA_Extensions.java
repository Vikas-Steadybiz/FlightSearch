package com.example.FlightSearch.domain.request.search;

import com.example.FlightSearch.domain.request.Flight;
import com.example.FlightSearch.domain.request.IntelliSellTransaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TPA_Extensions {

    IntelliSellTransaction IntelliSellTransaction;

}
