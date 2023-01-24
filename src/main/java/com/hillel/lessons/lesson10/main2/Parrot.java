package com.hillel.lessons.lesson10.main2;

public class Parrot extends Animal {

    void fly() {
        System.out.println(name + "fly");
    }

    @Override
    void run() {
        System.out.println(name + " can't run!!");
    }
}

