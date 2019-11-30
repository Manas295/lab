package com.spring;
import org.springframework.stereotype.Component;


public class CashPayment implements IPayment{
 
 public void executePayment() {
  System.out.println("Perform Cash Payment "); 
 }
}