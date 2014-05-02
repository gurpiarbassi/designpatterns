package com.gurps.designpatterns.creational.abstractfactory;

public abstract class BaseVehicle implements Vehicle{

	private String model;
	private String make;
	private int noOfDoors;
	private Origin origin;
	
	public BaseVehicle(String make, String model, int noOfDoors, Origin origin) {
		super();
		this.model = model;
		this.make = make;
		this.noOfDoors = noOfDoors;
		this.origin = origin;
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public Origin getOrigin() {
		return origin;
	}

	public abstract VehicleType getType();
}
