package org.fusionsystems.amsprogtest.people.utils;

import org.fusionsystems.amsprogtest.people.constant.Constant;

/**
 * Utils for validation
 * 
 * @author manhei.ma
 *
 */
public class ValidationUtils {
	/**
	 * Private constructor for preventing instantiation
	 */
	private ValidationUtils() {

	}

	/**
	 * To validate the name format for people
	 * 
	 * @param fullName
	 */
	public static void guardNameFormat(String fullName) {
		if (fullName == null) {
			throw new IllegalArgumentException("fullName=" + fullName
					+ " . Message:Name must be in format ¡§First Last¡¨ (examples: John Seaman, Caroline Horse)");
		}
		String names[] = fullName.split(" ");
		if (names.length != 2) {
			throw new IllegalArgumentException("fullName=" + fullName
					+ " . Message:Name must be in format ¡§First Last¡¨ (examples: John Seaman, Caroline Horse)");
		}

	}

	/**
	 * To ensure number is not negative
	 * 
	 * @param age
	 */
	public static void guardNotNegativeNumber(int age) {
		if (age < 0) {
			throw new IllegalArgumentException(
					"age=" + age + " . Message:Age must be not negative integer (examples: 0, 1, 2¡K)");
		}
	}

	/**
	 * To ensure gender is valid
	 * 
	 * @param gender
	 */
	public static void guardGender(String gender) {
		if (gender == null) {
			throw new IllegalArgumentException(
					"gender=" + gender + " . Message:Gender is one of the following ¡V MAN, WOMAN");
		}

		if (!gender.equals(Constant.GENDER_MAN) && !gender.equals(Constant.GENDER_WOMAN)) {
			throw new IllegalArgumentException(
					"gender=" + gender + " . Message:Gender is one of the following ¡V MAN, WOMAN");
		}
	}

	/**
	 * To ensure if age is more than 50, then first name cannot be John (For
	 * example John Seaman cannot have 55 years, but can have 35 years)
	 * 
	 * @param firstName
	 * @param age
	 */
	public static void guardNoJohnAfter50(String firstName, int age) {
		guardNotNegativeNumber(age);

		if (firstName == null) {
			throw new IllegalArgumentException(
					"firstName=" + firstName + " age=" + age + " Message: First name should not be null");
		}
		if (age > 50 && firstName.equals("John")) {
			throw new IllegalArgumentException("firstName=" + firstName + " age=" + age
					+ " Message:If age is more than 50, then first name cannot be John (for example John Seaman cannot have 55 years, but can have 35 years)");
		}
	}

	/**
	 * To ensure if gender is WOMAN, then first name must end with ¡§ko¡¨ (for
	 * example Tomoko Seaman is valid for WOMAN, Caroline Seaman is NOT valid
	 * for WOMAN)
	 * 
	 * @param firstName
	 * @param gender
	 */
	public static void guardKoForWoman(String firstName, String gender) {
		guardGender(gender);

		if (firstName == null) {
			throw new IllegalArgumentException(
					"firstName=" + firstName + " gender=" + gender + " Message: First name should not be null");
		}

		if (gender.equals(Constant.GENDER_WOMAN) && !(firstName.endsWith("ko") || firstName.equals("Ko"))) {
			throw new IllegalArgumentException("firstName=" + firstName + " gender=" + gender
					+ " Message: If gender is WOMAN, then first name must end with ¡§ko¡¨ (for example Tomoko Seaman is valid for WOMAN, Caroline Seaman is NOT valid for WOMAN)");
		}

	}

}
