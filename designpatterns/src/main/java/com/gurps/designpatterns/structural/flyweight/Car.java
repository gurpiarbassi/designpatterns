package com.gurps.designpatterns.structural.flyweight;

public class Car {

	/**
	 * Intrinsic state
	 */
	private String make;
	private String model;
	private String year;
	
	private String owner; //extrinsic state

	public Car(String make, String model, String year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ ", owner=" + owner + "]";
	}

	public void printVehicleSpecifics(){
		System.out.println(toString());
	}
}
