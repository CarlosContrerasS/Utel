package com.ejercicio.prueba.model.mapear;

public class Values_ {
    private String id;
    private String name;
    private Integer results;

    public Values_() {
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

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Values_{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", results=" + results +
                '}';
    }
}
