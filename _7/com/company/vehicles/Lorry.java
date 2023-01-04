package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int carryingCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return this.carryingCapacity;
    }
}
