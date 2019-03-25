package com.spring.dependencyinjection.services;
/*
 * Now we will have actual implementation classes to send email and twitter message.
 */

public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {

		System.out.println("Email Sent to "+rec+" with message= "+msg+"");
		return true;
	}

}
