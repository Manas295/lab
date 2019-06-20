package com.design.patterns.structural.decoratorPattern.email;

public class MainClass {

	public static void main(String args[]) {
		BasicEmail basicEmail	= new BasicEmail();
		basicEmail.body();
		
		System.out.println("---------------------------------");
		
		WishChristmas wishChristmas	= new WishChristmas(basicEmail);
		wishChristmas.body();
		
		System.out.println("---------------------------------");
		
		WishNewYear wishNewYear	= new WishNewYear(basicEmail);
		wishNewYear.body();
		
		System.out.println("---------------------------------");
		
		WishNewYear wishNewYearAndChristmas	= new WishNewYear(wishChristmas);
		wishNewYearAndChristmas.body();
	}
}
