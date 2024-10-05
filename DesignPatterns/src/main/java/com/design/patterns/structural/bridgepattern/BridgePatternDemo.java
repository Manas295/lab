package com.design.patterns.structural.bridgepattern;
public class BridgePatternDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(new Produce());
        car.manufacture();

        Vehicle bike = new Bike(new Assemble());
        bike.manufacture();

        // Mix and match
        Vehicle anotherCar = new Car(new Assemble());
        anotherCar.manufacture();

        Vehicle anotherBike = new Bike(new Produce());
        anotherBike.manufacture();
    }
}
