package com.example.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania", "Kowalska", 5);
        Teacher teacher = new Teacher("Adam", "dobry", "math");
        Director director = new Director("Seba", "Waz", 2);

        System.out.println(teacher.getTeachingSubject());
    }
}
