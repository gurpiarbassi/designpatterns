package com.gurps.designpatterns.behavioral.chainofresp;

public class Controller {

	public static void main(String[] args){
		MessageHandler h1 = new AuthenticationHandler();
		MessageHandler h2 = new LDAPHandler();
		h1.setNextHandler(h2);
		
		Message msg = new Message(MessageDirection.OUTBOUND);
		
		h1.handleMessage(msg);
	}
}
