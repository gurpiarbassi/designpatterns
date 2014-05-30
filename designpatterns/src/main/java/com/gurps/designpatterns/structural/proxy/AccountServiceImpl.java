package com.gurps.designpatterns.structural.proxy;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {

	public BigDecimal getBalance() {
		System.out.println("printing balance in real service.");
		return BigDecimal.ZERO;
	}

	public void deposit(BigDecimal amount) {
		System.out.println("depositing " + amount.toPlainString() + " in real service.");
	}
}
