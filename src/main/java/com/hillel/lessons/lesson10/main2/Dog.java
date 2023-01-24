package com.hillel.lessons.lesson10.main2;

public class Dog extends Animal{

    void swim() {
        System.out.println(name + " swim");
    }

    @Override
    void run() {
        super.run();
        System.out.println(name + " happy");
    }
}
