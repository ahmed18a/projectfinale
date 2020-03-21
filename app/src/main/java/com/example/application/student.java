package com.example.application;

public class student {
    public String name;
    public float id;
    public String clas;

    public student(String name, float id, String clas) {
        this.name = name;
        this.id = id;
        this.clas = clas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", clas='" + clas + '\'' +
                '}';
    }
}
