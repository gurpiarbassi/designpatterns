package com.gurps.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class Client {

	public static void main(String[] args){
		AccountService service = AccountServiceFactory.getAccountService();
		
		BigDecimal balance = service.getBalance();
		service.deposit(new BigDecimal("22.99"));
	}
}
