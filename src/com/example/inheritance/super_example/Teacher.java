package com.example.inheritance.super_example;

import java.util.Locale;

public class Teacher extends Person{
    private String teachingSubject; // czego uczy nauczyciel np math

    Teacher(String name, String surname, String teachingSubject) {
        super(name, surname);
        this.setTeachingSubject(teachingSubject);
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        teachingSubject = teachingSubject.toLowerCase();

        switch (teachingSubject) {
            case  "math":
            case "english":
            case "sport":
                this.teachingSubject = teachingSubject;
                break;
            default:
                this.teachingSubject = "unknown";
        }

    }
}
