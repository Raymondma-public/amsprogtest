package org.fusionsystems.amsprogtest.people.service;

import java.util.List;

import org.fusionsystems.amsprogtest.people.dao.PersonDao;
import org.fusionsystems.amsprogtest.people.dto.Person;

/**
 * Implementation of PersonService to do action on person
 * 
 * @author manhei.ma
 *
 */
public class PersonServiceBean implements PersonService {

	/**
	 * Dao for accessing data storage
	 */
	private PersonDao personDao;

	@Override
	public void addPerson(String name, int age, String gender) {
		Person person = new Person.Builder(name, age, gender).build();
		personDao.insertPerson(person);
	}

	/**
	 * Validate attributes
	 */
	private void guardInvariants() {
		if (personDao == null) {
			throw new IllegalArgumentException("Dao should not be null.");
		}

	}

	@Override
	public double calculateAverageAge(String keyword) {
		List<Person> personList = personDao.selectList();
		double sum = 0;
		int count = 0;

		for (Person p : personList) {
			if (p.getFullName().contains(keyword)) {
				sum += p.getAge();
				count++;
			}
		}
		// to handle empty case
		if (count == 0) {
			return 0;
		}

		return sum / count;
	}

	/**
	 * Constructor for PersonServiceBean
	 * 
	 * @param builder
	 */
	public PersonServiceBean(Builder builder) {
		super();
		this.personDao = builder.personDao;
		guardInvariants();
	}

	/**
	 * 
	 * Builder class for PersonServiceBean
	 * 
	 * @author manhei.ma
	 *
	 */
	public static class Builder {

		/**
		 * PersonDao for building new PersonService instance
		 */
		private PersonDao personDao;

		/**
		 * Builder constructor
		 * 
		 * @param personDao
		 */
		public Builder(PersonDao personDao) {
			super();
			this.personDao = personDao;
		}

		/**
		 * Build method for building new PersonService instance
		 * 
		 * @return new PersonService instance
		 */
		public PersonService build() {
			return new PersonServiceBean(this);
		}
	}

}
