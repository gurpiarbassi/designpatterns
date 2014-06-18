package com.gurps.designpatterns.behavioral.command;

public interface OrderProcessCmd{

	void execute(RequestProperties props) throws Exception;
}
