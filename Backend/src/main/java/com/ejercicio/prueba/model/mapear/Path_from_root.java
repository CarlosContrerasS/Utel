package com.ejercicio.prueba.model.mapear;


public class Path_from_root {

    private String id;
    private String name;

    public Path_from_root() {
    }

    public Path_from_root(String id, String name) {
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
        return "Path_from_root{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
