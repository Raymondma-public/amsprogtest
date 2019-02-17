package org.fusionsystems.amsprogtest.people.dao;

import java.util.List;

import org.fusionsystems.amsprogtest.people.dto.Person;

/**
 * Describing actions to access the storage for Person
 * 
 * @author manhei.ma
 *
 */
public interface PersonDao {
	/**
	 * Add person to storage
	 * 
	 * @param person
	 */
	void insertPerson(Person person);

	/**
	 * Get all person from memory storage as a list
	 * 
	 * @return all person from  storage as a list
	 */
	List<Person> selectList();
}
