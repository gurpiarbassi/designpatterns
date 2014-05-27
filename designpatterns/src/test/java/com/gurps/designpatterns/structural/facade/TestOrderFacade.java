package com.gurps.designpatterns.structural.facade;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestOrderFacade {

	@Test
	public void testAllInStock() {
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
		
		Assert.assertTrue(orderId != null);
	}
	
	@Test
	public void testItemOutOfStock() {
		OrderFacade orderFacade = new OrderFacadeImpl();
		List<Item> items = new ArrayList<Item>();
		
		items.add(new Item( "ZWD", "Television",new BigDecimal("999.99")));
		items.add(new Item( "XDF", "Shirt",new BigDecimal("39.95")));
		try{
			orderFacade.placeOrder(items);
			fail("Exception should have been thrown here");
		}catch(OrderException oe){
			System.out.println("Order Exception: unable to place order - " + oe.getMessage());
		}		
	}

}
