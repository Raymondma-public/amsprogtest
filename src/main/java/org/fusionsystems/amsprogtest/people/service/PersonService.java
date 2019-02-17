package org.fusionsystems.amsprogtest.people.service;

/**
 * Describe actions for person
 * @author manhei.ma
 *
 */
public interface PersonService {
	/**
	 * Add person to storage
	 * @param name
	 * @param age
	 * @param gender
	 */
	public void addPerson(String name, int age, String gender);

	/**
	 * Compute average age for person with name containing provided keyword
	 * @param keyword
	 * @return average age for person with name containing provided keyword
	 */
	public double calculateAverageAge(String keyword);
}
