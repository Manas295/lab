package com.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main( String[] args ){
     AbstractApplicationContext context = new ClassPathXmlApplicationContext
      ("applicationcontext.xml");
     PaymentService payService = (PaymentService)context.getBean("payServiceBean");
     
     payService.makePayment("cardPayment");

     context.registerShutdownHook();   
 } 
}