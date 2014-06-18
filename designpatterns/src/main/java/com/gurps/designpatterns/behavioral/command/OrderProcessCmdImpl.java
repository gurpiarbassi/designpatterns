package com.gurps.designpatterns.behavioral.command;

public class OrderProcessCmdImpl implements OrderProcessCmd {

	@Override
	public void execute(RequestProperties props) {
		String orderId = props.get("OrderID");
		String paymentId = props.get("paymentId");
		
		System.out.println("processing order...");
		
		//CALL ORDER PLACEMENT ENGINE HERE
	}
}
