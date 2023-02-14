package com.hillel.lessons.lesson15.homework16.enams;

public enum Insurance {

    ONEYEAR(12),
    TWOYEAR(24),
    THREEYEAR(36);
    final int month;


    Insurance(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return month + " Month";
    }
}
