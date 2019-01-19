package com.piyush.test.creational.builder;

public class MainClass {

    public MainClass() {
        ProblemPersonClass problemPersonClass   = new ProblemPersonClass("Piyush",10);
        ProblemPersonClass problemPersonClass2   = new ProblemPersonClass("Piyush","Nautiyal",10);
        
        SolutionPersonClass solutionPersonClass = new SolutionPersonClass.Builder().setFirstName("Piyush").setAge(10).build();
        SolutionPersonClass solutionPersonClass2 = new SolutionPersonClass.Builder().setFirstName("Piyush").setLastName("Nautiyal").setAge(10).build();
    }
}
