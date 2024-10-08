package com.design.patterns.structural.bridgepattern;
// Refined Abstraction 1
public class Car extends Vehicle {
    public Car(Workshop workshop) {
        super(workshop);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        workshop.work();
    }
}