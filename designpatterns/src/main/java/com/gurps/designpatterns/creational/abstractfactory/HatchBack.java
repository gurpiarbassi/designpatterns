package com.gurps.designpatterns.creational.abstractfactory;

public class HatchBack extends BaseVehicle{

	public HatchBack(String make, String model, int noOfDoors, Origin origin) {
		super(make, model, noOfDoors, origin);
	}

	@Override
	public VehicleType getType(){
		return VehicleType.HATCHBACK;
	}
}
