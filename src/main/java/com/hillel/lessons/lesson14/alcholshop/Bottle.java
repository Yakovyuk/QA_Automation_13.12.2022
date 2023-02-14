package com.hillel.lessons.lesson14.alcholshop;

public abstract class Bottle {
    private int volume;
    private String design;
    private String manufacture;
    private double grade;

    public Bottle(int volume, String design, String manufacture, double grade) {
        this.volume = volume;
        this.design = design;
        this.manufacture = manufacture;
        this.grade = grade;
    }

    public int getVolume() {
        return volume;
    }

    public String getDesign() {
        return design;
    }

    public String getManufacture() {
        return manufacture;
    }

    public double getGrade() {
        return grade;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
