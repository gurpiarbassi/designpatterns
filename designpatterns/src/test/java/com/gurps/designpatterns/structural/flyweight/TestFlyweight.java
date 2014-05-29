package com.gurps.designpatterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author gurps
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

		car1.setColour("RED");
		car1.printVehicleSpecifics();
		car2.setColour("BLUE");
		car2.printVehicleSpecifics();
	}
}
