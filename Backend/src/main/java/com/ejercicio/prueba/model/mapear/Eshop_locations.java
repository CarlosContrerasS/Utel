package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Eshop_locations {

    @JsonProperty("state")
    private JsonNode state;

    @JsonProperty("neighborhood")
    private JsonNode neighborhood;

    @JsonProperty("country")
    private JsonNode country;

    @JsonProperty("city")
    private JsonNode city;

    public Eshop_locations() {
    }

    public JsonNode getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(JsonNode neighborhood) {
        this.neighborhood = neighborhood;
    }

    public JsonNode getCountry() {
        return country;
    }

    public void setCountry(JsonNode country) {
        this.country = country;
    }

    public JsonNode getCity() {
        return city;
    }

    public void setCity(JsonNode city) {
        this.city = city;
    }

    public JsonNode getState() {
        return state;
    }

    public void setState(JsonNode state) {
        this.state = state;
    }
}
