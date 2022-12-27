package com.hillel.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        byte byteVariable;

        byteVariable = 100;
        System.out.println(byteVariable);

        byteVariable = 101;
        System.out.println(byteVariable);

        byteVariable = 102;
        System.out.println(byteVariable);

        short shortVariable = 32000;
        int intVariable = 2123456789;

        long longVariable = 242342432422324L;

        float floatVariable = 1.23231242F;
        double doubleVariable = 1.23231242;
        System.out.println();


        char charVariable = 'A';
        char charVriableTwo = 65;
        char charVariableFree = '\u00B0';
        /* Char может принимать только один символ или значение по таблице аски */
        System.out.println(charVariable);
        System.out.println(charVriableTwo);
        System.out.println(charVariableFree);
        System.out.println(charVariable);
        System.out.println(charVriableTwo);
        System.out.println(charVariableFree);
        System.out.println(charVariable);
        System.out.println(charVriableTwo);
        System.out.println(charVariableFree);

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        String str = "23231";

        byte byte1 = 127;

        short short1 = byte1;

        System.out.println(short1);

        char charA = 'A';
        int intA = charA;
        System.out.println(intA);

        int x = 10;
        byte y = (byte) x;
        System.out.println(x);
        System.out.println(y);

    }
}
