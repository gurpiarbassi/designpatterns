package com.gurps.designpatterns.creational.abstractfactory;

public class Saloon extends BaseVehicle{

	public Saloon(String make, String model, int noOfDoors , Origin origin) {
		super(make, model, noOfDoors, origin);
	}

	@Override
	public VehicleType getType() {
		return VehicleType.SALOON;
	}
	
}
