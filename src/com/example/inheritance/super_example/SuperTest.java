package com.example.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania", "Kowalskaiii", 5);
        Teacher teacher = new Teacher("Adam", "dobry", "math");
        Director director = new Director("Seba", "Wazy", 2);

        System.out.println(teacher.getTeachingSubject());
    }
}
