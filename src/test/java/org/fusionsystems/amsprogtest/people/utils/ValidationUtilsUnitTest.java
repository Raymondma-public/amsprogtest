package org.fusionsystems.amsprogtest.people.utils;

import static org.junit.Assert.fail;

import org.fusionsystems.amsprogtest.people.utils.ValidationUtils;
import org.junit.Test;

/**
 * Unit test for ValidationUtils
 * 
 * @author manhei.ma
 *
 */
public class ValidationUtilsUnitTest {

	/**
	 * Test guard name format when first name last name are corret. Expect pass
	 * validation
	 */
	@Test
	public void test_guardNameFormat_when_firstNameLastNameCorrect_expect_pass() {
		ValidationUtils.guardNameFormat("John Seaman");
	}

	/**
	 * Test guard name format when empty name are corret. Expect pass validation
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNameFormat_when_emptyString_expect_illegalArguments() {

		ValidationUtils.guardNameFormat("");

	}

	/**
	 * Test guardNameFormat when null is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNameFormat_when_null_expect_IllegalArguments() {

		ValidationUtils.guardNameFormat(null);

	}

	/**
	 * Test guardNameFormat when single word is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNameFormat_when_singleWord_expect_IllegalArguments() {

		ValidationUtils.guardNameFormat("John");

	}

	/**
	 * Test guardNameFormat when more than 2 words is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNameFormat_when_multipleWords_expect_IllegalArguments() {

		ValidationUtils.guardNameFormat("John Seaman A");

	}

	/**
	 * Test guardNotNegativeNumber when positive number is provided. Expect
	 * validation pass
	 */
	@Test
	public void test_guardPositiveNumber_when_positive_expect_pass() {
		ValidationUtils.guardNotNegativeNumber(20);
	}

	/**
	 * Test guardNotNegativeNumber when 1 is provided. Expect validation pass
	 */
	@Test
	public void test_guardPositiveNumber_when_1_expect_pass() {
		ValidationUtils.guardNotNegativeNumber(1);
	}

	/**
	 * Test guardNotNegativeNumber when 0 is provided. Expect validation pass
	 */
	@Test
	public void test_guardPositiveNumber_when_zero_expect_pass() {
		ValidationUtils.guardNotNegativeNumber(0);

	}

	/**
	 * Test guardNotNegativeNumber when -1 is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardPositiveNumber_when_negativeOne_expect_IllegalArguments() {

		ValidationUtils.guardNotNegativeNumber(-1);

	}

	/**
	 * Test guardNotNegativeNumber when negative number is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardPositiveNumber_when_negative_expect_IllegalArguments() {

		ValidationUtils.guardNotNegativeNumber(-50);

	}

	/**
	 * Test guardGender when MAN is provided. Expect validation pass
	 */
	@Test
	public void test_guardGender_when_MAN_expect_pass() {
		ValidationUtils.guardGender("MAN");

	}

	/**
	 * Test guardGender when WOMAN is provided. Expect validation pass
	 */
	@Test
	public void test_guardGender_when_WOMAN_expect_pass() {
		ValidationUtils.guardGender("WOMAN");

	}

	/**
	 * Test guardGender when "man" is provided. Expect IllegalArgumentException
	 * thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_man_expect_illegalArgument() {
		ValidationUtils.guardGender("man");
	}

	/**
	 * Test guardGender when "Man" is provided. Expect IllegalArgumentException
	 * thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_Man_expect_illegalArgument() {

		ValidationUtils.guardGender("Man");

	}

	/**
	 * Test guardGender when "woman" is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_woman_expect_illegalArgument() {

		ValidationUtils.guardGender("woman");

	}

	/**
	 * Test guardGender when "Woman" is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_Woman_expect_illegalArgument() {

		ValidationUtils.guardGender("Woman");

	}

	/**
	 * Test guardGender when null is provided. Expect IllegalArgumentException
	 * thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_null_expect_illegalArgument() {

		ValidationUtils.guardGender(null);

	}

	/**
	 * Test guardGender when "" is provided. Expect IllegalArgumentException
	 * thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_emptyString_expect_illegalArgument() {
		ValidationUtils.guardGender("");
	}

	/**
	 * Test guardGender when words other than "MAN"/"WOMAN" is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardGender_when_wrongWords_expect_illegalArgument() {
		ValidationUtils.guardGender("abc");

	}

	/**
	 * Test guardNoJohnAfter50 when (null Name, negative age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_nullNameWithNegativeAge_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50(null, -20);

	}

	/**
	 * Test guardNoJohnAfter50 when (empty Name, negative age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_emptyNameWithNegativeAge_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50("", -20);

	}

	/**
	 * Test guardNoJohnAfter50 when ("John" First Name, negative age) is
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_JohnWithNegativeAge_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50("John", -20);

	}

	/**
	 * Test guardNoJohnAfter50 when ( not "John" First Name, negative age) is
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_notJohnWithNegativeAge_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50("Tom", -20);

	}

	/**
	 * Test guardNoJohnAfter50 when ( First Name contains "John", negative age)
	 * is provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_containJohnWithNegativeAge_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50("Johnson", -20);

	}

	/**
	 * Test guardNoJohnAfter50 when (null First Name, 0 age) is provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_nullNameWith0Age_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50(null, 0);

	}

	/**
	 * Test guardNoJohnAfter50 when ("John" First Name, 0 age) is provided.
	 * Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_JohnWith0Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("John", 0);
	}

	/**
	 * Test guardNoJohnAfter50 when (not "John" First Name, 0 age) is provided.
	 * Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_notJohnWith0Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Tom", 0);
	}

	/**
	 * Test guardNoJohnAfter50 when ( First Name contains "John", 0 age) is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_containsJohnWith0Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Johnsom", 0);
	}

	/**
	 * Test guardNoJohnAfter50 when (null First Name, 50 age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_nullNameWith50Age_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50(null, 50);

	}

	/**
	 * Test guardNoJohnAfter50 when ("John" First Name, 50 age) is provided.
	 * Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_JohnWith50Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("John", 50);
	}

	/**
	 * Test guardNoJohnAfter50 when (not "John" First Name, 50 age) is provided.
	 * Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_notJohnWith50Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Tom", 50);
	}

	/**
	 * Test guardNoJohnAfter50 when ( First Name contains "John", 50 age) is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_containsJohnWith50Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Johnman", 50);
	}

	/**
	 * Test guardNoJohnAfter50 when ( null First Name, 51 age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_nullNameWith51Age_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50(null, 51);
	}

	/**
	 * Test guardNoJohnAfter50 when ( "John" First Name, 51 age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_JohnWith51Age_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50("John", 51);

	}

	/**
	 * Test guardNoJohnAfter50 when ( not "John" First Name, 51 age) is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_notJohnWith51Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Tom", 0);
	}

	/**
	 * Test guardNoJohnAfter50 when ( First Name contains "John", 51 age) is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_containsJohnWith51Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Johnson", 0);
	}

	/**
	 * Test guardNoJohnAfter50 when ( null First Name, >50 age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_nullNameWithGt50Age_expect_illegalArgument() {

		ValidationUtils.guardNoJohnAfter50(null, 100);

	}

	/**
	 * Test guardNoJohnAfter50 when ( "John" First Name, >50 age) is provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardNoJohnAfter50_when_JohnWithGt50Age_expect_illegalArgument() {
		ValidationUtils.guardNoJohnAfter50("John", 100);

	}

	/**
	 * Test guardNoJohnAfter50 when ( not "John" First Name, >50 age) is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_notJohnWithGt50Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Tom", 100);
	}

	/**
	 * Test guardNoJohnAfter50 when ( First Name contains "John", >50 age) is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardNoJohnAfter50_when_containsJohnWithGt50Age_expect_pass() {
		ValidationUtils.guardNoJohnAfter50("Johnson", 100);
	}

	/**
	 * Test guardKoForWoman when MAN is * provided. Expect validation pass
	 */
	@Test
	public void test_guardKoForWoman_when_man_expect_pass() {
		ValidationUtils.guardKoForWoman("Johnson", "MAN");
	}

	/**
	 * Test guardKoForWoman when WOMAN with no "ko" is provided. Expect
	 * validation pass
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardKoForWoman_when_womanWithNoKo_expect_pass() {
		ValidationUtils.guardKoForWoman("Mary", "WOMAN");

	}

	/**
	 * Test guardKoForWoman when WOMAN with "ko" in middle is provided. Expect
	 * IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardKoForWoman_when_womanWithKoInMiddle_expect_illegalArgument() {
		ValidationUtils.guardKoForWoman("Abckod", "WOMAN");

	}

	/**
	 * Test guardKoForWoman when WOMAN with first name end with "ko" is
	 * provided. Expect validation pass
	 */
	@Test
	public void test_guardKoForWoman_when_womanEndWithKo_expect_pass() {
		ValidationUtils.guardKoForWoman("Abcdko", "WOMAN");
	}

	/**
	 * Test guardKoForWoman when WOMAN with first name is "Ko" is provided.
	 * Expect validation pass
	 */
	@Test
	public void test_guardKoForWoman_when_womanWithFirstNameKo_expect_pass() {
		ValidationUtils.guardKoForWoman("Ko", "WOMAN");
	}

	/**
	 * Test guardKoForWoman when null gender is provided. Expect
	 * IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardKoForWoman_when_nullGender_expect_illegalArgument() {
		ValidationUtils.guardKoForWoman("Abckod", null);
	}

	/**
	 * Test guardKoForWoman when gender other than "MAN"/"WOMAN" is provided.
	 * Expect IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardKoForWoman_when_otherGender_expect_illegalArgument() {
		ValidationUtils.guardKoForWoman("Abckod", "OTHER");
	}

	/**
	 * Test guardKoForWoman when null name is provided. Expect
	 * IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void test_guardKoForWoman_when_nullName_expect_illegalArgument() {
		ValidationUtils.guardKoForWoman(null, "MAN");

	}
}
