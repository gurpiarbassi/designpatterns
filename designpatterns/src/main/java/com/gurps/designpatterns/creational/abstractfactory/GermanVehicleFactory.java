package com.gurps.designpatterns.creational.abstractfactory;

public class GermanVehicleFactory implements VehicleFactory {

	public Vehicle createVehicle(VehicleType type) {
		if (type.equals(VehicleType.COUPE)) {

			return new Coupe("BMW", "318", 5, Origin.GERMAN);

		} else if (type.equals(VehicleType.HATCHBACK)) {

			return new HatchBack("Audi", "A3", 3, Origin.GERMAN);

		} else if (type.equals(VehicleType.SALOON)) {

			return new Saloon("Mercedes", "S600", 5, Origin.GERMAN);
		}
		throw new IllegalArgumentException("Invalid Vehicle Type");
	}

}
