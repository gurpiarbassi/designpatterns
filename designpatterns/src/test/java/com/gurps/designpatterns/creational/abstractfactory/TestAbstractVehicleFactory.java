package com.gurps.designpatterns.creational.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAbstractVehicleFactory {

	@Test
	public void testCreateJapaneseHatchBack() {
		Vehicle vehicle = AbstractVehicleFactory.buildVehicle(VehicleType.HATCHBACK, Origin.JAPANESE);
		assertTrue(vehicle instanceof HatchBack);
		assertEquals("Honda", vehicle.getMake());
		assertEquals("Jazz", vehicle.getModel());
		assertEquals(3, vehicle.getNoOfDoors());
		assertEquals(VehicleType.HATCHBACK, vehicle.getType());
		assertEquals(Origin.JAPANESE, vehicle.getOrigin());
	}
	
	@Test
	public void testCreateJapaneseCoupe() {
		Vehicle vehicle = AbstractVehicleFactory.buildVehicle(VehicleType.COUPE, Origin.JAPANESE);
		assertTrue(vehicle instanceof Coupe);
		assertEquals("Toyota", vehicle.getMake());
		assertEquals("Celica", vehicle.getModel());
		assertEquals(3, vehicle.getNoOfDoors());
		assertEquals(VehicleType.COUPE, vehicle.getType());
		assertEquals(Origin.JAPANESE, vehicle.getOrigin());
	}
	
	@Test
	public void testCreateJapaneseSaloon() {
		Vehicle vehicle = AbstractVehicleFactory.buildVehicle(VehicleType.SALOON, Origin.JAPANESE);
		assertTrue(vehicle instanceof Saloon);
		assertEquals("Toyota", vehicle.getMake());
		assertEquals("Avensis", vehicle.getModel());
		assertEquals(5, vehicle.getNoOfDoors());
		assertEquals(VehicleType.SALOON, vehicle.getType());
		assertEquals(Origin.JAPANESE, vehicle.getOrigin());
	}
	
	@Test
	public void testCreateGermanHatchBack() {
		Vehicle vehicle = AbstractVehicleFactory.buildVehicle(VehicleType.HATCHBACK, Origin.GERMAN);
		assertTrue(vehicle instanceof HatchBack);
		assertEquals("Audi", vehicle.getMake());
		assertEquals("A3", vehicle.getModel());
		assertEquals(3, vehicle.getNoOfDoors());
		assertEquals(VehicleType.HATCHBACK, vehicle.getType());
		assertEquals(Origin.GERMAN, vehicle.getOrigin());
	}
	
	@Test
	public void testCreateGermanCoupe() {
		Vehicle vehicle = AbstractVehicleFactory.buildVehicle(VehicleType.COUPE, Origin.GERMAN);
		assertTrue(vehicle instanceof Coupe);
		assertEquals("BMW", vehicle.getMake());
		assertEquals("318", vehicle.getModel());
		assertEquals(5, vehicle.getNoOfDoors());
		assertEquals(VehicleType.COUPE, vehicle.getType());
		assertEquals(Origin.GERMAN, vehicle.getOrigin());
	}
	
	@Test
	public void testCreateGermanSaloon() {
		Vehicle vehicle = AbstractVehicleFactory.buildVehicle(VehicleType.SALOON, Origin.GERMAN);
		assertTrue(vehicle instanceof Saloon);
		assertEquals("Mercedes", vehicle.getMake());
		assertEquals("S600", vehicle.getModel());
		assertEquals(5, vehicle.getNoOfDoors());
		assertEquals(VehicleType.SALOON, vehicle.getType());
		assertEquals(Origin.GERMAN, vehicle.getOrigin());
	}
}
