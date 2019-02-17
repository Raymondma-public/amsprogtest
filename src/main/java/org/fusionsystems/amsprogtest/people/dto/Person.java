package org.fusionsystems.amsprogtest.people.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.fusionsystems.amsprogtest.people.utils.ValidationUtils;

/**
 * DTO of Person
 * 
 * @author manhei.ma
 *
 */
public class Person {

	/**
	 * Name of Person
	 */
	private String name;
	/**
	 * Age of Person
	 */
	private int age;
	/**
	 * Gender of person
	 */
	private String gender;

	/**
	 * Constructor of Person for instantiation
	 * 
	 * @param builder
	 */
	public Person(Builder builder) {
		super();
		this.name = builder.name;
		this.age = builder.age;
		this.gender = builder.gender;
		guardInvariants();
	}

	/**
	 * Get full name of person
	 * 
	 * @return full name of person
	 */
	public String getFullName() {
		return name;
	}

	/**
	 * Get first name of person
	 * 
	 * @return first name of person
	 */
	public String getFirstName() {
		return name.split(" ")[0];
	}

	/**
	 * Get last name of person
	 * 
	 * @return last name of person
	 */
	public String getLastName() {
		return name.split(" ")[1];
	}

	/**
	 * Get age of person
	 * 
	 * @return age of person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Get gender of person
	 * 
	 * @return gender of person
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Builder for person
	 * 
	 * @author manhei.ma
	 *
	 */
	public static class Builder {
		/**
		 * Name for building person
		 */
		private String name;
		/**
		 * Age for building person
		 */
		private int age;
		/**
		 * Gender for building person
		 */
		private String gender;

		/**
		 * Builder Constructor
		 */
		public Builder() {
			super();
		}

		/**
		 * Builder Constructor
		 * 
		 * @param name
		 * @param age
		 * @param gender
		 * 
		 */
		public Builder(String name, int age, String gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}

		/**
		 * Set name for building person
		 * 
		 * @param name
		 * @return Builder instance
		 */
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		/**
		 * Set age for building person
		 * 
		 * @param age
		 * @return Builder instance
		 */
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		/**
		 * Set gender for building person
		 * 
		 * @param gender
		 * @return Builder instance
		 */
		public Builder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		/**
		 * Build method
		 * 
		 * @return new Person instance
		 */
		public Person build() {
			return new Person(this);
		}
	}

	/**
	 * Validate different conditions for person
	 */
	private void guardInvariants() {

		ValidationUtils.guardNameFormat(name);
		ValidationUtils.guardNotNegativeNumber(age);
		ValidationUtils.guardGender(gender);
		ValidationUtils.guardNoJohnAfter50(this.getFirstName(), age);
		ValidationUtils.guardKoForWoman(this.getFirstName(), gender);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
