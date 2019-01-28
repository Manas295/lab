package com.java.dependencyinjection.service;

public class SMSServiceImpl implements MessageService {

	public void sendMessage(String msg, String rec) {
		System.out.println("SMS sent to : "+rec+" with message= "+msg);
	}

}
