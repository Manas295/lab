package com.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class PaymentService {
 @Autowired
 private PaymentFactory paymentFactory;

 public void setPaymentFactory(PaymentFactory paymentFactory) {
  this.paymentFactory = paymentFactory;
 }
 
 public void makePayment(String paymentType){
  IPayment payment = paymentFactory.getPayment(paymentType);
  payment.executePayment();
 }
}