package com.gurps.designpatterns.behavioral.chainofresp;

import org.junit.Test;
import org.mockito.Mockito;

public class TestChainOfResp {

	
	@Test
	public void test() {
		
		MessageHandler authHandler = new AuthenticationHandler();
		MessageHandler ldapHandler = Mockito.mock(LDAPHandler.class);
		
		
		Message msg = new Message(MessageDirection.OUTBOUND);
		msg.getHeaders().add(new MessageHeader("Test"));
		
		authHandler.setNextHandler(ldapHandler);
		authHandler.handleMessage(msg);
		
		//verify responsibility passed onto LDAPHandler
		Mockito.verify(ldapHandler, Mockito.times(1)).handleMessage(msg);
	}
}
