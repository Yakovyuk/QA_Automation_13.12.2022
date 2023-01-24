package com.hillel.lessons.lesson10.main1;

public class People {

    String name;
    int age;

        public People(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Object " + this.name + " created");
    }

    void seyHello(){
        System.out.println(name + " say hello");
    }

    int getAge() {
        return age;
    }

    void increaseAge() {
        age++;
    }

    void demo() {
        int someVariable = 10;
    }

    @Override
    public String toString() {
        return "name= " + name + ", age= " + age;
    }
}
