package com.hillel.lessons.lesson11.homework14;

import java.time.LocalDate;
public class UserPersonalInfo {

    private final String NAME;
    private final String DAY_BIRTHDAY;
    private final String MONTH_BIRTHDAY;
    private final int YEAR_BIRTHDAY;
    private final String EMAIL;
    private final String PHONE_NUMBER;
    String surname;
    double weight;
    String pressure;
    int stepsPerDay;
    private int age;

    LocalDate dt = LocalDate.now();


    public UserPersonalInfo(String NAME, String surname, String DAY_BIRTHDAY, String MONTH_BIRTHDAY, int YEAR_BIRTHDAY, String EMAIL, String PHONE_NUMBER, double weight, String pressure, int stepsPerDay) {
        this.NAME = NAME;
        this.surname = surname;
        this.DAY_BIRTHDAY = DAY_BIRTHDAY;
        this.MONTH_BIRTHDAY = MONTH_BIRTHDAY;
        this.YEAR_BIRTHDAY = YEAR_BIRTHDAY;
        this.EMAIL = EMAIL;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        age = dt.getYear() - YEAR_BIRTHDAY;
    }


    public String getNAME() {
        return NAME;
    }

    public String getDAY_BIRTHDAY() {
        return DAY_BIRTHDAY;
    }

    public String getMONTH_BIRTHDAY() {
        return MONTH_BIRTHDAY;
    }

    public int getYEAR_BIRTHDAY() {
        return YEAR_BIRTHDAY;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public int getAge() {
        return age;
    }

    void printAccountIfo(){
        System.out.println("Ім'я та прізвище - " + NAME + surname + ";" + "\n"
                + "Вік - " + age + ";" + "\n"
                + "Дата народження - " + DAY_BIRTHDAY + "." + MONTH_BIRTHDAY + "." + YEAR_BIRTHDAY + ";" + "\n"
                + "Емейл - " + EMAIL + ";" + "\n"
                + "Телефон - " + PHONE_NUMBER + ";" + "\n"
                + "Вага - " + weight + ";" + "\n"
                + "Тиск - " + pressure + ";" + "\n"
                + "Кількість пройдених за день кроків - " + stepsPerDay + ".");
        System.out.println();
    }

}
