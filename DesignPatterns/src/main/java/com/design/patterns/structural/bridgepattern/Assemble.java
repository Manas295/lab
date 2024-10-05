package com.design.patterns.structural.bridgepattern;

//Concrete Implementer 2
public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("Assembled");
    }
}
