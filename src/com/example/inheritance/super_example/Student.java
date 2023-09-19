package com.example.inheritance.super_example;

public class Student extends Person{
    private int grade; //rocznik np 1

    Student() {

    }

    Student(String name, String surname, int grade) {
        super(name,surname);
        //this.name = name; // to jest ok i to samo co wyzej
        this.setType("Student");
        this.setGrade(grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade > 0 && grade < 8)  this.grade = grade;
    }
}
