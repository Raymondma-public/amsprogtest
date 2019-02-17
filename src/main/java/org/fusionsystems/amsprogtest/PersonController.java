package org.fusionsystems.amsprogtest;

import org.fusionsystems.amsprogtest.people.service.PersonService;

/**
 * This is the entry point of the program
 * 
 * @author manhei.ma
 * 
 */
public class PersonController {

	/**
	 * PersonService for doing actual logic
	 */
	private PersonService personService;

	/**
	 * Constructor for instantiating the controller
	 * 
	 * @param builder
	 */
	public PersonController(Builder builder) {
		this.personService = builder.personService;
		guardInvariants();
	}

	/**
	 * Add person to storage
	 * 
	 * @param name
	 * @param age
	 * @param gender
	 * @throws IllegalArgumentException
	 *             if name,age,gender is not valid
	 */
	public void addPerson(String name, int age, String gender) {
		personService.addPerson(name, age, gender);
	}

	/**
	 * Calling service for calculating average age for people with provided
	 * keyword in the name.
	 * 
	 * @param keyword
	 * @return average age for people with provided keyword in the name
	 */
	public double calculateAverageAge(String keyword) {
		return personService.calculateAverageAge(keyword);
	}

	/**
	 * Checking for attributes validation
	 */
	private void guardInvariants() {
		if (personService == null) {
			throw new IllegalArgumentException("personService should not be null");
		}
	}

	/**
	 * Builder class
	 * 
	 * @author manhei.ma
	 *
	 */
	public static class Builder {
		/**
		 * PersonService for instantiation
		 */
		private PersonService personService;

		/**
		 * Constructor for builder
		 * 
		 * @param personService
		 */
		public Builder(PersonService personService) {
			super();
			this.personService = personService;
		}

		/**
		 * Build method for building new PersonController
		 * 
		 * @param personService
		 * @return new PersonController
		 */
		public PersonController build() {
			return new PersonController(this);
		}
	}
}
