package com.hillel.lessons.lesson11.first;

public class Main {
    public static void main(String[] args) {

        runApp();

        Student student = new Student("Den", "Lonzhanskyi");
        Student student1 = new Student("Alex","Lonzhanskyi", 31);
        Student student3 = new Student("Oleg", "Lonzhanskyi", 31, 1.2);

        Student.counter = 10;

        System.out.println(Student.counter);

        System.out.println();
        System.out.println();
        Demo.printStaticVariable();
        System.out.println(Student.counter);

        System.out.println(student.getAvgPoint());
        student.setAvgPoint(11.1);

    }

    static void runApp() {
        Student student = new Student("Den", "Lonzhanskyi");
    }
}
