package com.example.inheritance.example2.shop;

public class Computer extends Product{

    Mouse mouse;
    Keyboard keyboard;
    Monitor monitor;

    Computer() {
        mouse = new Mouse();
        keyboard = new Keyboard();
        monitor = new Monitor();

        price = 1000.0f;
    }
}
