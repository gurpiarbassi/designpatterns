package com.gurps.designpatterns.structural.proxy;

public class AccountServiceFactory {
	
	/**
	 * Requesting an instance of AccountService will give you back a proxy
	 * instead of the real service.
	 * @return AccountService - a proxy object
	 */
	public static AccountService getAccountService(){
		return new AccountServiceProxy();
	}	
}
