package org.fusionsystems.amsprogtest.people.model;

/**
 * Person Model form data source
 * 
 * @author manhei.am
 *
 */
public class PersonEntity {
	/**
	 * Name of person
	 */
	private String name;
	/**
	 * Age of person
	 */
	private int age;
	/**
	 * Gender of person
	 */
	private String gender;
	/**
	 * Constructor of PersonEntity
	 * @param name
	 * @param age
	 * @param gender
	 */
	public PersonEntity(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * Return name of person
	 * @return name of person
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set name of person
	 * @param
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get age of person
	 * @return age of person
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Set age of person
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Get gender of person
	 * @return gender 
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * Set gender of person
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	

}
