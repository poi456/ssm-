package com.rj1814.pojo;

import java.util.Date;

public class entity {
    private int id;
    private String name;

    public entity() {
    }

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
