package com.design.patterns.behavioral.strategyPattern;

public class MainClass {

	public static void main(String[] args) {
		Strategy bubbleSort	= new ConcreteClassBubbleSort();
		Strategy slectionSort	= new ConcreteClassSelectionSort();
		
		Context context	= new Context(bubbleSort);
		context.sortNumbers();
		
		System.out.println("-------------------------------------");
		
		Context context2	= new Context(slectionSort);
		context2.sortNumbers();
	}
}
