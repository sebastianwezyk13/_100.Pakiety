package com.example.basics.oop.basics.access_modifiers.getters_setters;

class TestClass {
    private String name;
    private int number;

    public TestClass(){

    }

    public TestClass(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class GetSetExample {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.setName("Eniu");
        System.out.println(testClass.getName());
    }
}
