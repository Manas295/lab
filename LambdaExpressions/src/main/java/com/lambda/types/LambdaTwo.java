package com.lambda.types;



public class LambdaTwo {

	public static void main(String[] args) {
		Greeting morning = (str) -> ("Greetings " + str + "!");	
		Greeting evening = (str) -> ("Evening " + str + "!");	
		System.out.println(morning.greet("John"));
		System.out.println(evening.greet("John"));
	}
	
}

interface Greeting
{
	public String greet(String str);
}