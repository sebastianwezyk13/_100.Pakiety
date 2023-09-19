package com.example.inheritance.example1;

public class Car extends Vehicle{
    Car() {
        super(); //jest wywolane z automatu
        this.type = "Car";
        this.manufacturer = "Ford";
        this.topSpeed = 200;


    }

    Car(String manufacturer, float topSpeed) {
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }


}
