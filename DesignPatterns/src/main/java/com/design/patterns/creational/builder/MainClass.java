package com.design.patterns.creational.builder;

public class MainClass {

	public static void main(String[] args) {

		ProblemPersonClass problemPersonClass   = new ProblemPersonClass("Piyush",10);
		System.out.println(problemPersonClass);
		ProblemPersonClass problemPersonClass2   = new ProblemPersonClass("Piyush","Nautiyal",10);
		System.out.println(problemPersonClass2);

		SolutionPersonClass solutionPersonClass = new SolutionPersonClass.Builder().setFirstName("Piyush").setAge(10).build();
		System.out.println(solutionPersonClass);
		SolutionPersonClass solutionPersonClass2 = new SolutionPersonClass.Builder().setFirstName("Piyush").setLastName("Nautiyal").setAge(10).build();
		System.out.println(solutionPersonClass2);
	}
}

