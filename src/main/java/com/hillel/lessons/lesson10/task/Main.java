package com.hillel.lessons.lesson10.task;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.a = 5;
        box.b = 3;
        box.c = 2;

        System.out.println(box.volume());

        ColorBox colorBox = new ColorBox();
        colorBox.a = 5;
        colorBox.b = 3;
        colorBox.c = 2;

        colorBox.color = "Green";

        System.out.println(colorBox.volume());
        System.out.println(colorBox.getColor());
    }
}
