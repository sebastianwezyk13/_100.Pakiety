package com.example.inheritance.example2.shop;

/*
klasa shop
klasa product( price,name, manufacturer, productionYear)
Klasa Mouse extends Product (numButton = 3)
klasa VerticalMouse extends Mouse()
Klasa Monitor extends Product (resolution = 1080)
Klasa keyboard extends Product (numKeys = 104)
Klasa Computer extends Product (Mouse, Monitor, Keyboard)

dodajemy pusty konstruktor do kadej klasy, ustawiamy dla nich pola danej klasy
tworzymy egzemplarze klas w metodzie main
kazda klasa w oddzielnym pliku java, ale wszystko w package ...shop
*/


public class Shop {

    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        System.out.println(computer.monitor.resolution);

        System.out.println("Monitor price: " + monitor.price);
        System.out.println("Keyboard price: " + keyboard.price);
        System.out.println("computer price: " + computer.price);
    }
}
