package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Attributes {
    private String id;
    private String value_id;
    private String name;
    private String value_name;

    @JsonProperty("value_struct")
    private JsonNode value_struct;

    private String attribute_group_id;
    private String source;
    private String attribute_group_name;

    private List<Values_attribute> values;

    public Attributes() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue_id() {
        return value_id;
    }

    public void setValue_id(String value_id) {
        this.value_id = value_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue_name() {
        return value_name;
    }

    public void setValue_name(String value_name) {
        this.value_name = value_name;
    }

    public String getAttribute_group_id() {
        return attribute_group_id;
    }

    public void setAttribute_group_id(String attribute_group_id) {
        this.attribute_group_id = attribute_group_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAttribute_group_name() {
        return attribute_group_name;
    }

    public void setAttribute_group_name(String attribute_group_name) {
        this.attribute_group_name = attribute_group_name;
    }

    public List<Values_attribute> getValues() {
        return values;
    }

    public void setValues(List<Values_attribute> values) {
        this.values = values;
    }

    public JsonNode getValue_struct() {
        return value_struct;
    }

    public void setValue_struct(JsonNode value_struct) {
        this.value_struct = value_struct;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "id='" + id + '\'' +
                ", value_id='" + value_id + '\'' +
                ", name='" + name + '\'' +
                ", value_name='" + value_name + '\'' +
                ", value_struct='" + value_struct + '\'' +
                ", attribute_group_id='" + attribute_group_id + '\'' +
                ", source='" + source + '\'' +
                ", attribute_group_name='" + attribute_group_name + '\'' +
                ", values=" + values +
                '}';
    }
}
