package org.example;

import java.util.ArrayList;

public class HelpEr {

    public Car getRandomCar(ArrayList<Car> cars) {
        int randomIndex = new java.util.Random().nextInt(cars.size());
        return cars.get(randomIndex);
    }

    public String leftDriver(Car boss) {
        return "A " + boss.getModel() + " car with a " + boss.getDriverName() + " driver left for you.";
    };

    public String destination(Car boss) {
        return "Driver " + boss.getDriverName() + " arrived at the destination.";
    }
}
