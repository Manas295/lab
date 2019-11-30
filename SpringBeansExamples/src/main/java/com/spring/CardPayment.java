package com.spring;
import org.springframework.stereotype.Component;


public class CardPayment implements IPayment{
 public void executePayment() {
  System.out.println("Perform Card Payment "); 
 }
}