package com.gurps.designpatterns.creational.builder;

/**
 * The builder pattern prevents the headache caused by the 
 * telescoping constructor problem.
 * 
 * It also ensures that mutator method calls are thread safe.
 * @author gurps
 *
 */
public class Person {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String occupation;
	private final String countryOfBirth;

	/**
	 * private constructor to prevent instantiation via client code.
	 * @param personBuilder
	 */
	private Person(PersonBuilder personBuilder) {
		this.firstName = personBuilder.firstName;
		this.lastName = personBuilder.lastName;
		this.age = personBuilder.age;
		this.occupation = personBuilder.occupation;
		this.countryOfBirth = personBuilder.countryOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public static class PersonBuilder {

		private final String firstName; //required field
		private final String lastName; //required field
		private int age;
		private String occupation;
		private String countryOfBirth;

		/**
		 * constructor andles only the required fields.
		 * @param firstName
		 * @param lastName
		 */
		public PersonBuilder(String firstName, String lastName) {

			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder occupation(String occupation) {
			this.occupation = occupation;
			return this;

		}

		public PersonBuilder countryOfBirth(String countyOfBirth) {
			this.countryOfBirth = countyOfBirth;
			return this;

		}

		public Person build() {
			return new Person(this);

		}
	}
}
