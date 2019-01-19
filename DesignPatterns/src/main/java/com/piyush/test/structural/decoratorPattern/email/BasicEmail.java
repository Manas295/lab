package com.piyush.test.structural.decoratorPattern.email;

public class BasicEmail implements IEmail {

	public void body() {
		System.out.println("This is body of basic email.");
	}
}
