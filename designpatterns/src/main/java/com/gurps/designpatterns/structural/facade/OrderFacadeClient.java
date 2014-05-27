package com.gurps.designpatterns.structural.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderFacadeClient {

	public static void main(String[] args){
		OrderFacade orderFacade = new OrderFacadeImpl();
		List<Item> items = new ArrayList<Item>();
		
		items.add(new Item( "ZWD", "Television",new BigDecimal("999.99")));
		items.add(new Item( "SDF", "CD Player",new BigDecimal("60.00")));
		Long orderId = null;
		
		try{
			orderId = orderFacade.placeOrder(items);
		}catch(OrderException oe){
			System.out.println("Order Exception: unable to place order - " + oe.getMessage());
		}		
	}
}
