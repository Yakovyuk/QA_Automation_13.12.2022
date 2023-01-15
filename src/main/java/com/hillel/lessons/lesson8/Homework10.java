package com.hillel.lessons.lesson8;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m;
        int n;

        System.out.println("Введи количество строк в массиве");
        while (true) {
            if(scanner.hasNextInt()) {
                m = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Неправильный тип данных, введи число");
                scanner.nextLine();
            }
        }

        System.out.println("Введи количество столбцов в массиве");
        while (true) {
            if(scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Неправильный тип данных, введи число");
                scanner.nextLine();
            }
        }


        int[][] array1 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("array1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }


        int[][] array2 = new int[m][n];
        int temp = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array1[i].length; j++) {
                temp = array1[i][j];
                array2[i][j] = array1[j][i];
                array2[j][i] = temp;
            }
        }

        System.out.println("array2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
