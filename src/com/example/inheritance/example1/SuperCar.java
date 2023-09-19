package com.example.inheritance.example1;

public class SuperCar extends Car{

    SuperCar() {
        type = "SuperCar";
        topSpeed = 300.0f;
    }

    public void setSuperMode() {
        System.out.println("Sport mode activated");
    }
}
