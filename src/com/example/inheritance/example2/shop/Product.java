package com.example.inheritance.example2.shop;

public class Product {
     float price;
     String name;
     String manufacturer;
     int productionYear;


    Product() {
        price = 100.0f;
        name = "unknown";
        manufacturer = "unknown";
        //productionYear = 0; //nie trzeba robic deklaracji, bo z automatu ustawi 0 jak wartosc poczatkowa wynosi 0.

    }
}
