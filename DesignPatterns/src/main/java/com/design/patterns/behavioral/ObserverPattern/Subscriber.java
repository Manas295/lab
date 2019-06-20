package com.design.patterns.behavioral.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("I got new release.");
	}

}
