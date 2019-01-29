/* 1. @Configuration annotation is used to let Spring know that it’s a Configuration class.
 * 
 * 2. @ComponentScan annotation is used with @Configuration annotation to specify the packages to look for Component classes.
 * 
 * 3. @Bean annotation is used to let Spring framework know that this method should be used to get the bean implementation to inject in Component classes.
 */

package com.spring.dependencyinjection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.dependencyinjection.services.EmailService;
import com.spring.dependencyinjection.services.MessageService;

@Configuration
@ComponentScan("com.spring.dependencyinjection.consumer")
public class DIConfiguration {
	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
	

}
