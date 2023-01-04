package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right!");
    }

    public void turnLeft() {
        System.out.println("Turn left!");
    }
    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nClass: " + this.carClass + "\nWeight: " + this.weight + "\nDriver: " + this.driver + "\nEngine: " + this.engine;
    }
}


