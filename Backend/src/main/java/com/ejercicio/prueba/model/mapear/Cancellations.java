package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Cancellations {
    private double rate;
    private double value;
    private String period;

    @JsonProperty("excluded")
    private JsonNode excluded;

    public Cancellations() {
    }

    public JsonNode getExcluded() {
        return excluded;
    }

    public void setExcluded(JsonNode excluded) {
        this.excluded = excluded;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Cancellations{" +
                "rate=" + rate +
                ", value=" + value +
                ", period='" + period + '\'' +
                '}';
    }
}
