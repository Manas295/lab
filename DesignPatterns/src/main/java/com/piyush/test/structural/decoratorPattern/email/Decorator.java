package com.piyush.test.structural.decoratorPattern.email;

public abstract class Decorator implements IEmail {
	IEmail iEmail;
	
	public Decorator(IEmail iEmail) {
		this.iEmail	= iEmail;
	}
	
	public void body() {
		iEmail.body();
	}
}
