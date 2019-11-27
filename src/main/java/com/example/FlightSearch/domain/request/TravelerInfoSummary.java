package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

public class TravelerInfoSummary {

    ArrayList< Integer > SeatsRequested = new ArrayList < > ();
    ArrayList < AirTravelerAvail > AirTravelerAvail = new ArrayList < > ();


    public ArrayList<Integer> getSeatsRequested() {
        return SeatsRequested;
    }

    public void setSeatsRequested(ArrayList<Integer> seatsRequested) {
        SeatsRequested = seatsRequested;
    }

    public ArrayList<com.example.FlightSearch.domain.request.AirTravelerAvail> getAirTravelerAvail() {
        return AirTravelerAvail;
    }

    public void setAirTravelerAvail(ArrayList<com.example.FlightSearch.domain.request.AirTravelerAvail> airTravelerAvail) {
        AirTravelerAvail = airTravelerAvail;
    }
}
