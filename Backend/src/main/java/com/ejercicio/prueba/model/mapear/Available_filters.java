package com.ejercicio.prueba.model.mapear;


import java.util.List;

public class Available_filters {

    private String id;
    private String name;
    private String type;

    private List<Values_> values;

    public Available_filters() {
    }

    public Available_filters(String id, String name, String type, List<Values_> values) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.values = values;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Values_> getValues() {
        return values;
    }

    public void setValues(List<Values_> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Available_filters{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", values=" + values +
                '}';
    }
}
