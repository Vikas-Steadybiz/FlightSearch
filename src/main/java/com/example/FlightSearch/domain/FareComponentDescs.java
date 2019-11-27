package com.example.FlightSearch.domain;

import java.util.ArrayList;

public class FareComponentDescs {
    private float id;
    private String governingCarrier;
    private float fareAmount;
    private String fareCurrency;
    private String fareBasisCode;
    private String farePassengerType;
    private float publishedFareAmount;
    private String directionality;
    private String direction;
    private String notValidBefore;
    private String notValidAfter;
    private String applicablePricingCategories;
    private String vendorCode;
    private String fareTypeBitmap;
    private String fareType;
    private String fareTariff;
    private String fareRule;
    ArrayList< Segments > segments = new ArrayList <> ();
}
