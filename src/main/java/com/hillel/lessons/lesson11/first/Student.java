package com.hillel.lessons.lesson11.first;

public class Student {

    static int counter = 0;
    String name;
    String surname;
    int age;
    private double avgPoint;


    public Student(String name, String surname, int age, double avgPoint) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avgPoint = avgPoint;

        System.out.println(this);
    }

    public Student(String name, String surname, int age) {
        this(name, surname, age, 0.0);
    }

    public Student(String name, String surname) {
        this(name, surname, 0);
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public String getName() {
        return name;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
