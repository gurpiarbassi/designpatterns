package com.gurps.designpatterns.structural.decorator;

public class MessageSender {
	
	public static void main(String[] args){
		MessageSender sender = new MessageSender();
		sender.sendMessage(new XMLMessage(2, "test"));
	}
	
	public void sendMessage(Message message){
		
		if(message instanceof XMLMessage){
			AuthenticationDecorator authDecorator = new AuthenticationDecorator(message, "myUsername", "myPassword");
			System.out.println("Sending message = " + authDecorator.getPayload());
		}
		
		//optionally add the Audit Decorator here if you wish.
	}

}
