package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TPA_Extensions {

    IntelliSellTransaction IntelliSellTransaction;
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    ArrayList< Flight > Flight = new ArrayList < > ();
}
