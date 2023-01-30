package com.hillel.lessons.lesson13.homework15;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat ("Cat", 30,40);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());

        cat.setName("Bob");
        cat.setAge(9);
        cat.setWeight(13);

        System.out.println();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());

        cat.setName("");
        cat.setAge(110);
        cat.setWeight(-120);

        System.out.println();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());

    }
}
