package com.design.patterns.structural.bridgepattern;

//Refined Abstraction 2
public class Bike extends Vehicle {
    public Bike(Workshop workshop) {
        super(workshop);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        workshop.work();
    }
}
