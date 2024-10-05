package com.design.patterns.structural.bridgepattern;
//Abstraction interface
public abstract class Vehicle {
    protected Workshop workshop;

    protected Vehicle(Workshop workshop) {
        this.workshop = workshop;
    }

    abstract public void manufacture();
}
