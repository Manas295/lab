package com.piyush.test.behavioral.strategyPattern;

/*
 * The context could be anything that would require changing behaviours
 */

public class Context {
	public Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy	= strategy;
	}
	
	public void sortNumbers() {
		strategy.sort();
	}
}


