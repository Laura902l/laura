package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int topSpeed;

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, int topSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }
}
