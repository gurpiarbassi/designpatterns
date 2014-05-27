package com.gurps.designpatterns.structural.facade;

public class InventoryManager {

	public boolean isInStock(Item item){
		//perform logic here to determine if item is in stock
		if(item.getProductCode().startsWith("X")){
			System.out.println("Item " + item.getProductCode() + " is not in stock");
			return false;
		}
		
		System.out.println("Item " + item.getProductCode() + " is in stock!");
		return true;
	}
}
