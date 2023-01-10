package com.hillel.lesssons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];
////        int array2[] = new int[5];
//
//        array[0] = 1;
//        array[1] = 2;
////        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//
//
//        int[] array2 = {1, 2, 3, 4, 5};
//        int[] array3 = new int[]{1, 2, 3, 4, 5};
//
//
//        System.out.println(array.length);
//        System.out.println(array2.length);
//        System.out.println(array3.length);


//        int[] array = new int[10];
//        System.out.println(array.length);
//        array[array.length - 1] = 10;


//        int[] array = new int[5];

//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (i + 1);
//        }
//
////        System.out.println(array);
//
////        for (int i = 0; i < array.length; i++) {
////            System.out.println(array[i]);
////        }
//
//        System.out.println(Arrays.toString(array));


//        int[] array = null;
//
//        array = new int[10];
//        System.out.println(array.length);


//        int[] array = {1, 2, 3, 4, 5};

//        for (int value : array) {
//            System.out.println(value);
//        }
//        System.out.println("Before");
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 3) {
//                array[i] = 99;
//            }
//        }
//        System.out.println("After");
//        System.out.println(Arrays.toString(array));


//        System.out.println("Before");
//        System.out.println(Arrays.toString(array));
//        for (int value : array) {
//            if (value == 3) {
//                value = 99;
//            }
//        }
//        System.out.println("After");
//        System.out.println(Arrays.toString(array));


//        int[] array = {1, 2, 3, 4, 6};
//
//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }
//
//        System.out.println("sum = " + sum);
//
//        double avg = (double) sum / array.length;
//        System.out.println("avg = " + avg);
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > avg) {
//                array[i] = 77;
//            }
//        }
//
//        System.out.println(Arrays.toString(array));


//        int[] array = {-1, 45, 66, -57, 9, 34, 99, 23, 54, 67, 8};
//
////        int min = Integer.MAX_VALUE;
////        int max = Integer.MIN_VALUE;
//        int min = array[0];
//        int max = array[0];
//
//        for (int value : array) {
////            if (value < min) {
////                min = value;
////            }
////            if (value > max) {
////                max = value;
////            }
//
//            min = Math.min(min, value);
//            max = Math.max(max, value);
//        }
//
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);


//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
////            if (array.length - 1 == i) {
////                System.out.print(array[i]);
////            } else {
////                System.out.print(array[i] + ", ");
////            }
//
//            System.out.print(array[i] + ((array.length - 1 == i) ? "" : ", " ));
//        }



//        int[] array1 = {1, 2, 3, 4, 5};

        // BAD VERSION!!!!!!!!!!!!!!!!!
//        int[] array2 = array1;
//
//
//        System.out.println("array 1: " + Arrays.toString(array1));
//        System.out.println("array 2: " + Arrays.toString(array2));
//
//
//        array2[0] = 99;
//
//        System.out.println();
//        System.out.println("array 1: " + Arrays.toString(array1));
//        System.out.println("array 2: " + Arrays.toString(array2));


        int[] array1 = {1, 2, 3, 4, 5};

        // GOOD VERSION
        int[] array2 = new int[array1.length];

        System.out.println("array 1: " + Arrays.toString(array1));
        System.out.println("array 2: " + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println();
        System.out.println("array 1: " + Arrays.toString(array1));
        System.out.println("array 2: " + Arrays.toString(array2));



    }







    static void demoLoopInLoop() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            int userValue = -1;

            System.out.println("Please enter integer");
            while (true) {
                if (scanner.hasNextInt()) {
                    userValue = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Wrong data, try again!");
                    scanner.nextLine();
                }
            }

            System.out.println("iteration: " + (i + 1));
            System.out.println("userValue = " + userValue);

        }
    }
}