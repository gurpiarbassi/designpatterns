package com.gurps.designpatterns.behavioral.chainofresp;

public class AuthenticationHandler implements MessageHandler{

	private MessageHandler nextHandler = null;
	
	/**
	 * @return true if the message can be handled, otherwise false.
	 */
	public void handleMessage(Message message) {
		if(message.getDirection() == MessageDirection.OUTBOUND){
			//add authentication info
			System.out.println("Adding authentication headers");
			message.getHeaders().add(new MessageHeader("User = xx, pwd = xcdfdf!£$F:"));
		}
		
		if(nextHandler != null){
			nextHandler.handleMessage(message);
		}else{
			System.out.println("end of chain");
		}

	}

	public void setNextHandler(MessageHandler next) {
		this.nextHandler = next;
		
	}
}
