package com.gurps.designpatterns.creational.prototype;

import org.junit.Assert;

import org.junit.Test;

public class TestAnimalCloningFactory {

	@Test
	public void testGetClone() {
		AnimalCloningFactory factory = new AnimalCloningFactory();
		Sheep sheep = new Sheep();
		
		Animal clonedSheep1 = factory.getClone(sheep);
		Animal clonedSheep2 = factory.getClone(sheep);
		
		System.out.println(System.identityHashCode(clonedSheep1));
		System.out.println(System.identityHashCode(clonedSheep2));
		
		Assert.assertNotEquals(System.identityHashCode(clonedSheep1), System.identityHashCode(clonedSheep2));
	}

}
