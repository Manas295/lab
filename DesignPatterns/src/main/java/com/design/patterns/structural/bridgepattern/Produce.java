package com.design.patterns.structural.bridgepattern;
// Concrete Implementer 1
public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}