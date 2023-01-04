package com.company.details;
public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return this.power;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }
}
