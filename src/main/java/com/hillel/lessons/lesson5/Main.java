package com.hillel.lesssons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        int a = 10;
//        int b = 5;

//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
//
//        boolean isBigger = a > b;
//
//        System.out.println(isBigger);


//        boolean booleanTrue = true;
//
//        System.out.println(booleanTrue);

//        int a = 5;
//        int b = 5;

//        if (a > b) {
//            System.out.println("a > b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        }
//        if (a < b) {
//            System.out.println("a < b");
//        }
//        if (a == b) {
//            System.out.println("a == b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else if (a == b) {
//            System.out.println("a == b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a == b");
//        }



//        int a = 1;
//        int b = 2;
//        int c = 3;

//        a < b - true
//        b > c - false
//        System.out.println(a < b && b > c);
//        if (a < b && b > c) {
//            System.out.println("Hello");
//        }

//        System.out.println(b > c && ++a < b);
//
//        System.out.println("a = " + a);


//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a == b");
//            }
//        } else {
//            System.out.println("a < b");
//        }

//        int a = 1;
//        int b = 2;
//        int c = 3;

//        System.out.println(a > b || b++ == c);
//        System.out.println(a > b && ++b == c);
//        System.out.println(a < b && ++b == c && b++ != c);
//
//        System.out.println("b = " + b);


//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            if (a == b) {
//                System.out.println("a = b");
//            } else {
//                System.out.println("a < b");
//            }
//        }
//
//        // (умова) ? вираз1 : вираз2
//        System.out.println((a > b) ? "a > b" : (a == b) ? "a = b" : "a < b");


//        int a = 3;
//
//        if (a == 1) {
//            System.out.println("do something 1");
//        } else if (a == 2) {
//            System.out.println("do something 2");
//        } else if (a == 3) {
//            System.out.println("do something 3");
//        } else if (a == 4) {
//            System.out.println("do something 4");
//        } else if (a == 5) {
//            System.out.println("do something 5");
//        } else if (a == 6) {
//            System.out.println("do something 6");
//        } else {
//            System.out.println("do default");
//        }


//        int a = 75;
//        switch (a) {
//            case 1: {
//                System.out.println("do something 1");
//                break;
//            }
//            case 2: {
//                System.out.println("do something 2");
//                break;
//            }
//            case 3: {
//                System.out.println("do something 3");
//                break;
//            }
//            case 4: {
//                System.out.println("do something 4");
//                break;
//            }
//            case 5: {
//                System.out.println("do something 5");
//                break;
//            }
//            case 6: {
//                System.out.println("do something 6");
//                break;
//            }
//            default: {
//                System.out.println("do default");
//                break;
//            }
//        }


//        String str = "QWERTY";
//        String str2 = new String("QWERTY");


//        System.out.println(str == str2);
//        System.out.println(str.equalsIgnoreCase(str2));

//        switch (str) {
//            case "QWERT" : {
//                System.out.println("1");
//                break;
//            }
//            case "Q" : {
//                System.out.println("2");
//                break;
//            }
//            case "QWERTY" : {
//                System.out.println("3");
//                break;
//            }
//        }


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter integer");
//        int value = scanner.nextInt();
//
//        System.out.println("value = " + value);

//        String next = scanner.nextLine();
//        System.out.println("next = " + next);
//
//
//        String next2 = scanner.nextLine();
//        System.out.println("next2 = " + next2);


//        int value = scanner.nextInt();
//        System.out.println("value = " + value);
//        int value2 = scanner.nextInt();
//        System.out.println("value2 = " + value2);
//        scanner.nextLine();
//
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.println("value = " + value);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }


    }
}