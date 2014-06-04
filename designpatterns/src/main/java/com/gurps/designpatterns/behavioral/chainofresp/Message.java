package com.gurps.designpatterns.behavioral.chainofresp;

import java.util.ArrayList;
import java.util.List;

public class Message {

	private MessageDirection direction;
	private List<MessageHeader> headers;
	
	public Message(MessageDirection direction){
		this.direction = direction;
		headers = new ArrayList<MessageHeader>();
	}

	public MessageDirection getDirection() {
		return direction;
	}

	public List<MessageHeader> getHeaders() {
		return headers;
	}
}
