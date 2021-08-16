package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Values_attribute {
    private String id;
    private String name;

    @JsonProperty("struct")
    private JsonNode struct;


    private String source;

    public Values_attribute() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonNode getStruct() {
        return struct;
    }

    public void setStruct(JsonNode struct) {
        this.struct = struct;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Values_attribute{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", struct='" + struct + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
