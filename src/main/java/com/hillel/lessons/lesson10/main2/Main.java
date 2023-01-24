package com.hillel.lessons.lesson10.main2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bobik";

        Cat cat = new Cat();
        cat.name = "Barsik";

        dog.run();
        dog.swim();

        cat.run();
        cat.jump();

        Parrot parrot = new Parrot();

        System.out.println();
        parrot.name = "Kesha";
        parrot.run();

    }
}
