/*
 * Let’s say we want to send email message and twitter message to the users. 
 * For dependency injection, we need to have a base class for the services. 
 * So I have MessageService interface with single method declaration for sending message.
 */

package com.spring.dependencyinjection.services;

public interface MessageService {

	boolean sendMessage(String msg, String rec);

}
