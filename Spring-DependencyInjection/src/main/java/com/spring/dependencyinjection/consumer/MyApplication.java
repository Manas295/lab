/*Few important points about MyApplication class:

1. @Component annotation is added to the class, 
   so that when Spring framework will scan for the components, this class will be treated as component. 
   @Component annotation can be applied only to the class and it’s retention policy is Runtime.
   
2. @Autowired annotation is used to let Spring know that autowiring is required. 
	This can be applied to field, constructor and methods. This annotation allows us to implement constructor-based, 
	field-based or method-based dependency injection in our components.

3. For our example, her we used method-based dependency injection. 
	You can uncomment the constructor method to switch to constructor based dependency injection.
 * 
 */

package com.spring.dependencyinjection.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dependencyinjection.services.MessageService;

@Component

public class MyApplication {

	// field-based dependency injection
	// @Autowired
	private MessageService messageService;

	/*
	 * constructor-based dependency injection
	 * 
	 * @Autowired public MyApplication(MessageService svc) { this.service = svc; }
	 */
	@Autowired
	public void setService(MessageService service) {
		this.messageService = service;
	}

	public boolean processMessage(String msg, String rec) {
		return this.messageService.sendMessage(msg, rec);
	}

}
