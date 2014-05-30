package com.gurps.designpatterns.structural.proxy;

import java.math.BigDecimal;

public interface AccountService {

	BigDecimal getBalance();
	
	void deposit(BigDecimal amount);
}
