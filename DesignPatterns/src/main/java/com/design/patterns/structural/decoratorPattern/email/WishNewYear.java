package com.design.patterns.structural.decoratorPattern.email;

public class WishNewYear extends Decorator {

	public WishNewYear(IEmail iEmail) {
		super(iEmail);
	}

	public void body() {
		super.body();
		System.out.println("Happy new year");
	}
}
