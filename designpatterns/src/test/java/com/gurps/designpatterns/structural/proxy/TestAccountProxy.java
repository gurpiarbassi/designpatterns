package com.gurps.designpatterns.structural.proxy;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class TestAccountProxy {

	@Test
	public void test() {
		AccountService service = AccountServiceFactory.getAccountService();
		BigDecimal balance = service.getBalance();
		Assert.assertEquals(BigDecimal.ZERO, balance);
	}

}
