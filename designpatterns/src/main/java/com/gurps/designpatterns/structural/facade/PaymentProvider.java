package com.gurps.designpatterns.structural.facade;

import java.math.BigDecimal;

public class PaymentProvider {

	public void makePayment(BigDecimal amount){
		System.out.println("Making payment for " + amount.toPlainString());
		//code here to call payment engine to make payment
	}
}
