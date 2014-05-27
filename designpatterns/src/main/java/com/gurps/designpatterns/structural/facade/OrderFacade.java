package com.gurps.designpatterns.structural.facade;

import java.util.List;

public interface OrderFacade {

	Long placeOrder(List<Item> items) throws OrderException;
}
