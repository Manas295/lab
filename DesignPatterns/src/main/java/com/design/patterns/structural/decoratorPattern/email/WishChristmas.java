package com.design.patterns.structural.decoratorPattern.email;

public class WishChristmas extends Decorator{

	public WishChristmas(IEmail iEmail) {
		super(iEmail);
	}
	
	public void body() {
		super.body();
		System.out.println("Happy christmas..");
	}
}
