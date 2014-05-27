package com.gurps.designpatterns.structural.composite;

/**
 * Models a Generic GUI Component
 * @author gurps
 *
 */
public interface Component {
	
	void refresh();
	
	String getType();
	
	int getNoOfSubComponents();
}
