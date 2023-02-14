package com.hillel.lessons.lesson15.homework16.abstractValues;

import com.hillel.lessons.lesson15.homework16.interfaces.UsedHomePriceCounter;

public abstract class Location implements UsedHomePriceCounter{
    private int price;
    private String type;
    private String repair;

    public Location(int price, String type, String repair) {
        this.price = price;
        this.type = type;
        this.repair = repair;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getRepair() {
        return repair;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }
}
