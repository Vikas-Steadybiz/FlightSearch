package com.example.FlightSearch.domain;

import java.util.ArrayList;

public class GroupedItineraryResponse {

    private String version;
    ArrayList< Messages > messages = new ArrayList <>() ;
    Statistics StatisticsObject;
    ArrayList < ScheduleDescs > scheduleDescs = new ArrayList < > ();
    ArrayList < TaxDescs > taxDescs = new ArrayList < > ();
    ArrayList < TaxSummaryDescs > taxSummaryDescs = new ArrayList < > ();
    ArrayList < FareComponentDescs > fareComponentDescs = new ArrayList < > ();
    ArrayList < ValidatingCarrierDescs > validatingCarrierDescs = new ArrayList <> ();
    ArrayList < BaggageAllowanceDescs  > baggageAllowanceDescs = new ArrayList < > ();
    ArrayList < LegDescs > legDescs = new ArrayList < > ();
    ArrayList < ItineraryGroups > itineraryGroups = new ArrayList <  > ();

}
