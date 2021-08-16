package com.ejercicio.prueba.model.mapear;


public class Available_sorts {
    private String id;

    private String name;

    public Available_sorts() {
    }

    public Available_sorts(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Available_sorts{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
