package com.gurps.designpatterns.creational.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gurps.designpatterns.creational.factory.Vegetable;
import com.gurps.designpatterns.creational.factory.VegetableFactory;
import com.gurps.designpatterns.creational.factory.VegetableType;

public class TestVegetableFactory {

	@Test
	public void testCreateCarrot() {
		Vegetable vegetable = VegetableFactory.createVegetable(VegetableType.ROOT);
		assertEquals("green", vegetable.getColour());
		assertEquals("I am a carrot", vegetable.getDescription());
	}
	
	@Test
	public void testCreateCabbage() {
		Vegetable vegetable = VegetableFactory.createVegetable(VegetableType.LEAFY);
		assertEquals("red", vegetable.getColour());
		assertEquals("I am a cabbage", vegetable.getDescription());
	}
}
