package com.gurps.designpatterns.structural.facade;

import java.math.BigDecimal;

public class Item {

	private String productCode;
	private String itemName;	
	private BigDecimal unitPrice;	
	
	public Item(String productCode, String itemName,
			BigDecimal unitPrice) {
		super();
		this.productCode = productCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
}
