package com.gurps.designpatterns.structural.decorator;

public abstract class BaseMessageDecorator implements Message{

	//Maintain a reference to the original message here.
	protected Message originalMessage;
		
	public BaseMessageDecorator(Message message){
		this.originalMessage = message;
	}
}
