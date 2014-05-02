package com.gurps.designpatterns.creational.abstractfactory;

public class JapaneseVehicleFactory implements VehicleFactory {

	public Vehicle createVehicle(VehicleType type) {
		if (type.equals(VehicleType.COUPE)) {
			
			return new Coupe("Toyota", "Celica", 3, Origin.JAPANESE);
			
		} else if (type.equals(VehicleType.HATCHBACK)) {
			
			return new HatchBack("Honda", "Jazz", 3, Origin.JAPANESE);

		} else if (type.equals(VehicleType.SALOON)) {

			return new Saloon("Toyota", "Avensis", 5, Origin.JAPANESE);
		}
		throw new IllegalArgumentException("Invalid Vehicle Type");
	}

}
