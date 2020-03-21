package com.example.application;

import java.sql.Time;

public class absence {
    public Time date;
    public Time hour;
    public String clas;
    student student;

    public absence(Time date, Time hour, String clas, com.example.application.student student) {
        this.date = date;
        this.hour = hour;
        this.clas = clas;
        this.student = student;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public com.example.application.student getStudent() {
        return student;
    }

    public void setStudent(com.example.application.student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "absence{" +
                "date=" + date +
                ", hour=" + hour +
                ", clas='" + clas + '\'' +
                ", student=" + student +
                '}';
    }
}
