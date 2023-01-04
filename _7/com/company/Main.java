package com.company;
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(" John M\t", 3);
        Engine engine = new Engine(42, "Toyota");
        Car car = new Car("AGA", "Compact", 1430, driver, engine);
        Lorry lorry = new Lorry("Zenos", "Large", 3933, driver, engine, 23);
        SportCar sportCar = new SportCar("BAW", "Sport", 2640, driver, engine, 300);

        car.start();
        car.turnLeft();
        car.stop();
        System.out.println();
        System.out.println(car);
        System.out.println();
        lorry.start();
        lorry.turnLeft();
        lorry.stop();
        System.out.println(lorry);
        System.out.println();
        sportCar.start();
        sportCar.turnRight();
        sportCar.stop();
        System.out.println(sportCar);

    }
}
