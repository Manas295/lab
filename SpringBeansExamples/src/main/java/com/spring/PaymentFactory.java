package com.spring;
public interface PaymentFactory {
 public IPayment getPayment(String paymentType);
}