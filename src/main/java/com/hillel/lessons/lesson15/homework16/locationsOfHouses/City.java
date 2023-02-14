package com.hillel.lessons.lesson15.homework16.locationsOfHouses;

import com.hillel.lessons.lesson15.homework16.abstractValues.Location;
import com.hillel.lessons.lesson15.homework16.enams.Insurance;

public class City extends Location {

    private  final Insurance insurance;

    public City(int price, String type, String repair, Insurance insurance) {
        super(price, type, repair);
        this.insurance = insurance;
    }

    @Override
    public String toString(){
        System.out.println();
        return "Location = City," + "\n"
                + "Price = " + getPrice() + "UAH" + "\n"
                + "type = " + getType() + "\n"
                + "repair = " + getRepair() + "\n"
                + "Insurance = " + insurance.toString() + "\n"
                + "used home price after 3 year = " + threeYearsExploitation() + "UAH";
    }

    @Override
    public int threeYearsExploitation(){
        double countExploitation = 0.55;
        return (int) (getPrice() * countExploitation);
    }

}
