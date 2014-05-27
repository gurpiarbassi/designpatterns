package com.gurps.designpatterns.structural.decorator;

public class XMLMessage extends BaseMessage implements Message{

	
	public XMLMessage(int msgType, String identifier){
		super(msgType, identifier);
	}
	
	public String getPayload() {
		StringBuilder builder = new StringBuilder();
		builder.append("<root>")
			   .append("<msgtype>" + getMsgType() + "<msgtype>")
			   .append("<identifier>" + getIdentifier() + "<identifier>")
			   .append("</root>");
		
		return builder.toString();
	}

}
