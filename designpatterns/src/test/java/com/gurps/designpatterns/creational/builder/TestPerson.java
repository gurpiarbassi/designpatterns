package com.gurps.designpatterns.creational.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	@Test
	public void testPersonBuild() {
		Person person = new Person.PersonBuilder("John", "Doe").age(10).occupation("Manager").countryOfBirth("Australlia").build();
		
		assertEquals("John", person.getFirstName());
		assertEquals("Doe", person.getLastName());
		assertEquals("Manager", person.getOccupation());
		assertEquals(10, person.getAge());
		assertEquals("Australlia", person.getCountryOfBirth());
	}
}
