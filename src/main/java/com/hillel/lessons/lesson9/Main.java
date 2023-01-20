package com.hillel.lessons.lesson9;

public class Main {
    public static void main(String[] args) {

//    static void printHelloWorld() {
//        System.out.println("Hello World");
//    }
//
//    static void printHello(String name) {
//
//        System.out.println("Hello " + name);
//    }

        //        printHelloWord();

//        String name = "Den";
//        printHello(name);


//        int x = 5;
//        demo(x);
//        System.out.println("After method: " + x);
//
//
//        demo2(10, 2, 22, 22);

//        int result = getSum(10, 5);
//        System.out.println("result = " + result);
//
//
//        System.out.println("result = " + getSum(15, 15));

//        printSomething(getSum(15, 15));


//        runApp();


//        System.out.println(getSum(5, 10));
//        System.out.println(getSum(5, 10, 15));
//        System.out.println(getSum(5, 10, 15, 20));


//        5! = 120;
//        int n = 5;
//        int result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//
//        System.out.println(result);
//
//        System.out.println(getFactorial(5));


        System.out.println(evclid(124, 68));

    }

    static int evclid(int a, int b) {

//        if (b == 0) {
//            return a;
//        }
//
//        return evclid(b, a % b);


        return b != 0 ? evclid(b, a % b) : a;
    }


//    static int accerman(int m, int n) {
//        if (m == 0) {
//            return n + 1;
//        }
//        if (m > 0 && n == 0) {
//            return accerman(m-1, 1);
//        }
//
//        return ?
//    }

    static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }


    static void demoRecursion(int n) {
        if (n > 0) {
            System.out.println(n);

            demoRecursion(--n);
        }
    }


    static double getSum(double a, int b) {
        return a + b;
    }

    static double getSum(double a, double b) {
        return a + b;
    }

    static int getSum(int a, int b) {
//        int sum = a + b;
//        return sum;
        return getSum(a, b, 0);
    }

    static int getSum(int a, int b, int c) {
        return getSum(a, b, c, 0);
    }

    static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static void runApp() {
        runApp2();
    }

    static void runApp2() {
        int sum = getSum(15, 15);
        printSomething(sum);
    }


    static void printSomething(int value) {
        System.out.println(value);
    }


    static void printHelloWord() {
        System.out.println("Hello Word");
    }

    static void printHello(String name) {
        System.out.println("Hello " + name);
        name = "sgertyertgererg";
    }


    static void demo(int y) {
        y = 10;
        System.out.println(y);
    }

    static void demo2(int x, int y, int z, int k) {
        y = 10;
        System.out.println(y);
    }

}
