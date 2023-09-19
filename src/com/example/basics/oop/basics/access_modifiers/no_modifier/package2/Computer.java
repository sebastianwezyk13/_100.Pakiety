package com.example.basics.oop.basics.access_modifiers.no_modifier.package2;

import com.example.basics.oop.basics.access_modifiers.no_modifier.package1.Product;

public class Computer extends Product {
    public Computer(){
       // name = "Computer"; spowowduje blad, brak dostepu do zmiennej z innego pakietu, gdy nie ma modyfikatora
    }
}
