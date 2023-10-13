package com.example.inheritance.abstract_classes;

public class Employee extends Person{

    @Override
    public void printInfo() {
        System.out.println("Emmployee: " + this.getName());
    }
}
