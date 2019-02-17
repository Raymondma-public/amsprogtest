package org.fusionsystems.amsprogtest.people.dao;

import java.util.ArrayList;
import java.util.List;

import org.fusionsystems.amsprogtest.people.dto.Person;
import org.fusionsystems.amsprogtest.people.model.PersonEntity;

/**
 * Implementation of PersonDao to access memory storage for person
 * 
 * @author manhei.ma
 *
 */
public class PersonDaoBean implements PersonDao {
	/**
	 * List of person storing in memory
	 */
	private List<PersonEntity> personList;

	@Override
	public void insertPerson(Person person) {
		PersonEntity personEntity = new PersonEntity(person.getFullName(), person.getAge(), person.getGender());
		personList.add(personEntity);
	}

	@Override
	public List<Person> selectList() {
		List<Person> selectList = new ArrayList();
		Person.Builder builder = new Person.Builder();
		for (PersonEntity p : personList) {
			Person person = builder.setName(p.getName()).setAge(p.getAge()).setGender(p.getGender()).build();
			selectList.add(person);
		}
		return selectList;
	}

	/**
	 * Constructor for instantiation
	 * 
	 * @param builder
	 */
	public PersonDaoBean(Builder builder) {
		super();
		this.personList = builder.personList;

	}

	/**
	 * Builder class
	 * 
	 * @author manhei.ma
	 *
	 */
	public static class Builder {
		private List<PersonEntity> personList;

		/**
		 * Constructor for builder
		 */
		public Builder() {
			personList = new ArrayList();
		}

		/**
		 * Build method for instantiating PersonDaoBean
		 * 
		 * @return new instance of PersonDao
		 */
		public PersonDao build() {
			return new PersonDaoBean(this);
		}
	}

}
