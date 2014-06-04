package com.gurps.designpatterns.behavioral.chainofresp;

public interface MessageHandler {

	void handleMessage(Message message);
	
	void setNextHandler(MessageHandler handler);
}
