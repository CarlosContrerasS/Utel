package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Conditions {

    @JsonProperty("context_restrictions")
    private List<JsonNode>  context_restrictions;

    private String start_time;
    private String end_time;
    private String eligible;

    public Conditions() {
    }

    public List<JsonNode> getContext_restrictions() {
        return context_restrictions;
    }

    public void setContext_restrictions(List<JsonNode> context_restrictions) {
        this.context_restrictions = context_restrictions;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEligible() {
        return eligible;
    }

    public void setEligible(String eligible) {
        this.eligible = eligible;
    }

    @Override
    public String toString() {
        return "Conditions{" +
                "context_restrictions=" + context_restrictions +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", eligible='" + eligible + '\'' +
                '}';
    }
}
