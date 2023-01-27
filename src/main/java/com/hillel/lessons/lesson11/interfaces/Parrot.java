package com.hillel.lessons.lesson11.interfaces;

public class Parrot extends Animal implements Flyieble, Runnable {
    @Override
    public void fly() {
        System.out.println(name + " fly");
    }

    @Override
    public void run(String name) {
        System.out.println(name + " can't run");
    }
}
