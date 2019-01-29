/*
 * Java Dependency Injection – Service Consumer
 * We are not required to have base interfaces for 
 * consumer classes but I will have a Consumer interface declaring contract for consumer classes.
 */
package com.java.dependencyinjection.consumer;

public interface Consumer {
	public void processMessages(String msg, String rec);
}
