package com.example.FlightSearch.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)

@JsonNaming(value = PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class RequestorID {

    @JsonProperty("Type")
    private String Type;
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("CompanyName")
    CompanyName CompanyName;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public CompanyName getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(CompanyName companyName) {
        CompanyName = companyName;
    }
}
