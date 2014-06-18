package com.gurps.designpatterns.behavioral.command;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TestCommand {

	@Test
	public void test() {
		try{
			OrderProcessCmd orderProcessCmd = Mockito.mock(OrderProcessCmdImpl.class);
			//OrderProcessCmd orderProcessCmd = new OrderProcessCmdImpl();
			RequestProperties props = new RequestProperties();
			props.put("OrderID", "12121");
			props.put("paymentId", "dffd9d9fg");
			
			orderProcessCmd.execute(props);

		    Mockito.verify(orderProcessCmd, Mockito.times(1)).execute(props);
		}catch(Exception e){
			fail("exception : " + e);
		}
	}
}
