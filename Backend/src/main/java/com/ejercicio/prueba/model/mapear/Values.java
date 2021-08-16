package com.ejercicio.prueba.model.mapear;

import java.util.List;

public class Values {
    private String id;

    private String name;

    private List<Path_from_root> path_from_root;

    public Values() {
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

    public List<Path_from_root> getPath_from_root() {
        return path_from_root;
    }

    public void setPath_from_root(List<Path_from_root> path_from_root) {
        this.path_from_root = path_from_root;
    }

    @Override
    public String toString() {
        return "Values{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", path_from_root=" + path_from_root +
                '}';
    }
}
