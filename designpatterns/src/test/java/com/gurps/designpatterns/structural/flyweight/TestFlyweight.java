package com.gurps.designpatterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author gurps
 * We use flyweight when we have code that is slow, and resource intensive.
 * It is named flyweight after the boxing weight class, to indicate its light weight footprint.
 * 
 * The objective is to convert many independent objects into just a few shared objects.
 * Instead of creating objects using the new operator, we use a factory to create them which can provide a level of caching too.
 
 * Key is too split a objects instantiation data into intrinsic and extrinsic. Try and make as much as possible as extrinsic.
 * 
 * The example here assumes that the Car object has 3 intrinsic attributes: make, model and year.
 * The owner of the car is deemed to be extrinsic.
 *
 */
public class TestFlyweight {

	@Test
	public void testFlyweightCreation() {

		Car car1 = FlyweightCarFactory.getInstance().createCar("Ford", "Focus",
				"2000");

		Car car2 = FlyweightCarFactory.getInstance().createCar("Ford", "Focus",
				"2000");

		Assert.assertTrue(car1 == car2); // ensure the same flyweight is retrieved.

		car1.setOwner("Mike");
		car1.printVehicleSpecifics();
		car2.setOwner("Bob");
		car2.printVehicleSpecifics();
	}
}
