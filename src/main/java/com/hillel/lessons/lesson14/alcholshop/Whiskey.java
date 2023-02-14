package com.hillel.lessons.lesson14.alcholshop;

public class Whiskey extends Bottle {

    public Whiskey(int volume, String design, String manufacture, double grade, String type, int years) {
        super(volume, design, manufacture, grade);
        this.type = type;
        this.years = years;
    }

    private String type;
    private int years;

    public void calculateGrade(){
        double grade = getGrade();
        for (int i=years; i == 0; i--) {
            grade = grade + 1;
        }
        setGrade(grade);
    }
}
