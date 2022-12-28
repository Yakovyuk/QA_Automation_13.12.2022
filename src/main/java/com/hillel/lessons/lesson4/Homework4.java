package com.hillel.lessons.lesson4;

public class Homework4 {
    public static void main(String[] args) {

        int a = (int) (1 + Math.random() * 11);
        int b = (int) (1 + Math.random() * 11);
        int c = (int) (1 + Math.random() * 11);


        int volume = a * b * c;
        System.out.println("Об'єм паралелепіпеда = " + volume);

        int length = 4 * a + 4 * b + 4 * c;
        System.out.println("Довжина паралелепіпеда = " + length);

    }
}
