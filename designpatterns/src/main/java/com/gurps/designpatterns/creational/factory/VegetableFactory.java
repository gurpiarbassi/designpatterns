package com.gurps.designpatterns.creational.factory;


public class VegetableFactory {

	public static Vegetable createVegetable(VegetableType type) {

		if (type.equals(VegetableType.ROOT)) {

			return new Carrot();
			
		} else if (type.equals(VegetableType.LEAFY)) {

			return new Cabbage();
		}

		throw new IllegalArgumentException("unsupported vegetable type");
	}
}
