package com.cameron.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {

    @JsonProperty("default")
    private RateDetails defaultRate;

    public RateDetails getDefaultRate() {
        return defaultRate;
    }

    public void setDefaultRate(RateDetails defaultRate) {
        this.defaultRate = defaultRate;
    }
}