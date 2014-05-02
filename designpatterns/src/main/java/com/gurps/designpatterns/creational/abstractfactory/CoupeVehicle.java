package com.gurps.designpatterns.creational.abstractfactory;

public class CoupeVehicle extends BaseVehicle{
	
	public CoupeVehicle(String make, String model, int noOfDoors, Origin origin) {
		super(make, model, noOfDoors, origin);
	}

	@Override
	public VehicleType getType() {
		return VehicleType.COUPE;
	}
	
}
