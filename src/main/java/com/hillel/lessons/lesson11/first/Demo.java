package com.hillel.lessons.lesson11.first;

public class Demo {

    static void printStaticVariable() {
        System.out.println(Student.counter);
        Student.counter = 5;
    }
}
