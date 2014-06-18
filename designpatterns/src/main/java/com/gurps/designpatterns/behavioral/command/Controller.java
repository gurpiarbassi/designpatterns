package com.gurps.designpatterns.behavioral.command;

public class Controller {

	public static void main(String args[]) throws Exception{
		
		//TODO use command factory here
		OrderProcessCmd orderProcessCmd = new OrderProcessCmdImpl();
		RequestProperties props = new RequestProperties();
		props.put("OrderID", "12121");
		props.put("paymentId", "dffd9d9fg");
		
		orderProcessCmd.execute(props);
	}
}
