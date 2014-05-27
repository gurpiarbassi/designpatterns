package com.gurps.designpatterns.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class TestAuthenticationDecorator {

	@Test
	public void testAuthHeader() {

		Message message = new XMLMessage(2, "test");
		AuthenticationDecorator authDecorator = new AuthenticationDecorator(message, "myUsername", "myPassword");
		String payload = authDecorator.getPayload();
		
		Assert.assertEquals("<root><auth><user>myUsername</user><password>myPassword</password></auth><msgtype>2<msgtype><identifier>test<identifier></root>", payload);
	}

}
