package com.gurps.designpatterns.creational.abstractfactory;

public interface Vehicle {

	String getModel();
	String getMake();
	int getNoOfDoors();
	VehicleType getType();
	Origin getOrigin();
}
