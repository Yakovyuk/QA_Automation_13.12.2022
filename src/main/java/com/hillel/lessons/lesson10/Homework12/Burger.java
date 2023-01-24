package com.hillel.lessons.lesson10.Homework12;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер звичайний складається з" + this.bun + "," + this.meat + "," + this.cheese + "," + this.greens + " і" + this.mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Бургер дієтичний складається з" + this.bun + "," + this.meat + "," + this.cheese + " і" + this.greens);
    }

    public Burger(String bun, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер вегетеріанський складається з" + this.bun + "," + this.cheese + "," + this.greens + " і" + this.mayonnaise);
    }
}
