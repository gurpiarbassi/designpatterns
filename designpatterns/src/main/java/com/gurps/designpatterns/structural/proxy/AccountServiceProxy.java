package com.gurps.designpatterns.structural.proxy;

import java.math.BigDecimal;

/**
 * The service proxy can be used to access the real object
 * remotly, or check the callers authorisation/authentication 
 * before making a call to the real object.
 * 
 * @author gurps
 *
 */
public class AccountServiceProxy implements AccountService{

	private AccountServiceImpl realAccountService = null;
	
	public AccountServiceProxy(){
		realAccountService = new AccountServiceImpl();
	}
	public BigDecimal getBalance() {
		System.out.println("proxying method call");
		BigDecimal balance = realAccountService.getBalance();
		System.out.println("finished proxying method call");
		return balance;
	}

	public void deposit(BigDecimal amount) {
		System.out.println("proxying method call");
		realAccountService.deposit(amount);
		System.out.println("finished proxying method call");
	}

}
