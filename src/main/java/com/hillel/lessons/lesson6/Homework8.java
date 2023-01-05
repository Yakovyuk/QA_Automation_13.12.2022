package com.hillel.lessons.lesson6;

public class Homework8 {
    public static void main(String[] args) {
        int counter = 0;
        int value = 0;

        while (counter <= 100) {
            String s = String.valueOf(++value);
            if ((s.contains("4") || s.contains("9"))) {
                continue;
            }
            System.out.println(value);
            counter++;
        }

    }
}
