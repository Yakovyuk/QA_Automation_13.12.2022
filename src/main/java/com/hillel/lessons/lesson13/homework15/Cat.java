package com.hillel.lessons.lesson13.homework15;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Default name";
        }
        if (age > 0 && age < 100) {
            this.age = age;
        }
        if (weight > 0 && age < 100) {
            this.weight = weight;
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }
    public void setWeight(int weight) {
        if (weight > 0 && age < 100) {
            this.weight = weight;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
        public void sayMeow() {
        System.out.println("Meow!");
    }

}
