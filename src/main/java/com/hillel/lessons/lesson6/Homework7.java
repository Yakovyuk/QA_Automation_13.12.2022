package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);
        int userValue;

        System.out.println("Угадай число от 0 до 10");

        while (true) {
            if(scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Неправильный тип данных, введи число");
                scanner.nextLine();
            }
        }


        for ( int i = 1; ; i++) {
            if (userValue == randomNumber) {
                System.out.println("Поздравляю, Вы угадали число!");
                break;
            } if (i == 3) {
                System.out.println("К сожалению вы не угадали число");
                break;
            } else if (userValue > randomNumber) {
                System.out.println("К сожалению вы не угадали число,загаданное число меньше");
                while (true) {
                    if (scanner.hasNextInt()) {
                        userValue = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Неправильный тип данных, введи число");
                        scanner.nextLine();
                    }
                }
            } else {
                System.out.println("К сожалению вы не угадали число,загаданное число больше");
                while (true) {
                    if (scanner.hasNextInt()) {
                        userValue = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.println("Неправильный тип данных, введи число");
                        scanner.nextLine();
                    }
                }
            }
        }

    }
}
