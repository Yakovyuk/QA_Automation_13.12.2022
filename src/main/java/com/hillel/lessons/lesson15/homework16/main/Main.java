package com.hillel.lessons.lesson15.homework16.main;

import com.hillel.lessons.lesson15.homework16.enams.Insurance;
import com.hillel.lessons.lesson15.homework16.locationsOfHouses.City;
import com.hillel.lessons.lesson15.homework16.locationsOfHouses.ResortTown;
import com.hillel.lessons.lesson15.homework16.locationsOfHouses.Village;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ResortTown resortTownHouse1 = new ResortTown(300000, "High-rise building", "euro repair", Insurance.ONEYEAR);
        City cityHouse1 = new City(100000, "six storey house", "soviet repair", Insurance.TWOYEAR);
        Village villageHouse1 = new Village(50000, "private house", "without repair", Insurance.THREEYEAR);

        System.out.println(resortTownHouse1);
        System.out.println(cityHouse1);
        System.out.println(villageHouse1);

    }
}
