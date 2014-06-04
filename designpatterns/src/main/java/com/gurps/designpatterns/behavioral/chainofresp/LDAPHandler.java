package com.gurps.designpatterns.behavioral.chainofresp;

public class LDAPHandler implements MessageHandler{

	private MessageHandler nextHandler = null;
	
	public void handleMessage(Message message) {
		if(!message.getHeaders().isEmpty()){
			authenticate();
		}
		
		if(nextHandler != null){
			nextHandler.handleMessage(message);
		}else{
			System.out.println("end of chain");
		}
	}

	private void authenticate() {
		System.out.println("Authenticating using LDAP");
	}

	public void setNextHandler(MessageHandler handler) {
		this.nextHandler = handler;		
	}
}
