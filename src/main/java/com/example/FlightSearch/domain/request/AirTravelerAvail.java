package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

public class AirTravelerAvail {

    ArrayList< PassengerTypeQuantity > PassengerTypeQuantity = new ArrayList <  > ();

    public ArrayList<com.example.FlightSearch.domain.request.PassengerTypeQuantity> getPassengerTypeQuantity() {
        return PassengerTypeQuantity;
    }

    public void setPassengerTypeQuantity(ArrayList<com.example.FlightSearch.domain.request.PassengerTypeQuantity> passengerTypeQuantity) {
        PassengerTypeQuantity = passengerTypeQuantity;
    }
}
