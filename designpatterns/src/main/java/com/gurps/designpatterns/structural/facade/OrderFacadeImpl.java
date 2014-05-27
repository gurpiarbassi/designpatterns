package com.gurps.designpatterns.structural.facade;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class OrderFacadeImpl implements OrderFacade{

	private InventoryManager inventoryManager;
	private PaymentProvider paymentProvider;
	
	public OrderFacadeImpl(){
		inventoryManager = new InventoryManager();
		paymentProvider = new PaymentProvider();
	}
	public Long placeOrder(List<Item> items) throws OrderException {
		BigDecimal orderTotal = BigDecimal.ZERO;
		for(Item item : items){
			if(!inventoryManager.isInStock(item)){
				throw new OrderException("Item " + item + " is not in stock. Could not place order");
			}
			orderTotal = orderTotal.add(item.getUnitPrice());
		}
		
		paymentProvider.makePayment(orderTotal);	
		
		//return the orderId when succesful
		Random randomGenerator = new Random();
		return randomGenerator.nextLong();
	}
}
