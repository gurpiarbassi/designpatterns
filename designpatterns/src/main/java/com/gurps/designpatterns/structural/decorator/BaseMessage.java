package com.gurps.designpatterns.structural.decorator;

public abstract class BaseMessage implements Message {

	private int msgType;
	private String identifier;
	
	public BaseMessage(int msgType, String identifier) {
		super();
		this.msgType = msgType;
		this.identifier = identifier;
	}

	public int getMsgType() {
		return msgType;
	}

	public String getIdentifier() {
		return identifier;
	}
}
