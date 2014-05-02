package com.gurps.designpatterns.creational.abstractfactory;

/**
 * 
 * @author gurps bassi
 * gurpiar.bassi@gmail.com
 *
 */
public class AbstractVehicleFactory {
	
	private AbstractVehicleFactory(){
		//prevent instantiation
	}

	public static Vehicle buildVehicle(VehicleType vehicleType, Origin origin){
		
		if(origin.equals(Origin.JAPANESE)){
			return new JapaneseVehicleFactory().createVehicle(vehicleType);
		}
		else if (origin.equals(Origin.GERMAN)){
			return new GermanVehicleFactory().createVehicle(vehicleType);
		}
		
		throw new IllegalArgumentException("Invalid origin");
	}
}
