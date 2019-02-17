package org.fusionsystems.amsprogtest.people.dto;

import static org.junit.Assert.assertEquals;

import org.fusionsystems.amsprogtest.people.constant.Constant;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit Test for Person DTO
 * 
 * @author manhei.ma
 *
 */
/**
 * @author HEI
 *
 */
public class PersonUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test Construction With Setter. Expect Full Name
	 */
	@Test
	public void testConstructionWithSetter_expect_correctFullName() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals("John Seaman", person.getFullName());
	}

	/**
	 * Test Construction With Setter. Expect Correct First Name
	 */
	@Test
	public void testConstructionWithSetter_expect_correctFirstName() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals("John", person.getFirstName());

	}

	/**
	 * Test Construction With Setter. Expect Correct Last Name
	 */
	@Test
	public void testConstructionWithSetter_expect_correctLastName() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals("Seaman", person.getLastName());

	}

	/**
	 * Test Construction With Setter. Expect Correct Age
	 */
	@Test
	public void testConstructionWithSetter_expect_correctAge() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals(30, person.getAge());

	}

	/**
	 * Test Construction With Setter. Expect Correct Gender
	 */
	@Test
	public void testConstructionWithSetter_expect_correctGender() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();
		assertEquals(Constant.GENDER_MAN, person.getGender());
	}

	/**
	 * Test Construction With Builder Constructor. Expect Correct full Name
	 */
	@Test
	public void testConstructionWithBuilderConstructor_expect_correctFullName() {
		Person.Builder builder = new Person.Builder("John Seaman", 30, Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals("John Seaman", person.getFullName());

	}

	/**
	 * Test Construction With Builder Constructor. Expect Correct First Name
	 */
	@Test
	public void testConstructionWithBuilderConstructor_expect_correctFirstName() {
		Person.Builder builder = new Person.Builder("John Seaman", 30, Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals("John", person.getFirstName());

	}

	/**
	 * Test Construction With Builder Constructor. Expect Correct Last Name
	 */
	@Test
	public void testConstructionWithBuilderConstructor_expect_correctLastName() {
		Person.Builder builder = new Person.Builder("John Seaman", 30, Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals("Seaman", person.getLastName());

	}

	/**
	 * Test Construction With Builder Constructor. Expect correct age
	 */
	@Test
	public void testConstructionWithBuilderConstructor_expect_correctAge() {
		Person.Builder builder = new Person.Builder("John Seaman", 30, Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals(30, person.getAge());
	}

	/**
	 * Test Construction With Builder Constructor. Expect correct gender
	 */
	@Test
	public void testConstructionWithBuilderConstructor_expect_correctGender() {
		Person.Builder builder = new Person.Builder("John Seaman", 30, Constant.GENDER_MAN);
		Person person = builder.build();

		assertEquals(Constant.GENDER_MAN, person.getGender());
	}

	/**
	 * Test construction when null name and negative age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullNameWithNegativeAge_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder(null, -1, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when empty name and negative age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_emptyNameWithNegativeAge_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("", -1, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when "John" and negative age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_johnWithNegativeAge_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("John Seaman", -1, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when no "John" and negative age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_notJohnWithNegativeAge_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Raymond Seaman", -1, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when first name contains "John" and negative age
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_containsJohnWithNegativeAge_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", -1, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when null name and 0 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullNameWith0Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder(null, 0, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when empty name and 0 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_emptyNameWith0Age_expect_illegalArgument() {
		Person.Builder builder = new Person.Builder("", 0, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when "John" and 0 age provided. Expect pass validation
	 */
	@Test
	public void testConstruction_when_johnNameWith0Age_expect_pass() {
		Person.Builder builder = new Person.Builder("John Seaman", 0, Constant.GENDER_MAN);
		Person person = builder.build();
	}

	/**
	 * Test construction when no "John" and 0 age provided. Expect pass
	 * validation
	 */
	@Test
	public void testConstruction_when_notJohnNameWith0Age_expect_pass() {
		Person.Builder builder = new Person.Builder("Tom Seaman", 0, Constant.GENDER_MAN);
		Person person = builder.build();
	}

	/**
	 * Test construction when first name contains "John" and 0 age provided.
	 * Expect pass validation
	 */
	@Test
	public void testConstruction_when_containsJohnNameWith0Age_expect_pass() {
		Person.Builder builder = new Person.Builder("Johnson Seaman", 0, Constant.GENDER_MAN);
		Person person = builder.build();
	}

	/**
	 * Test construction when null name and 50 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullNameWith50Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder(null, 50, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when empty name and 50 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_emptyNameWith50Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("", 50, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when "John" and 50 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test
	public void testConstruction_when_johnNameWith50Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("John Seaman", 50, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when not "John" and 50 age provided. Expect pass
	 * validation
	 */
	@Test
	public void testConstruction_when_notJohnNameWith50Age_expect_pass() {

		Person.Builder builder = new Person.Builder("Tom Seaman", 50, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when first name contains "John" and 50 age provided.
	 * Expect pass validation
	 */
	@Test
	public void testConstruction_when_containsJohnNameWith50Age_expect_pass() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 50, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when null name and 51 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullNameWith51Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder(null, 51, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when null name and 51 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_emptyNameWith51Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("", 51, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when "John" and 51 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_johnNameWith51Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("John Seaman", 51, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when not "John" and 51 age provided. Expect pass
	 * validation
	 */
	@Test
	public void testConstruction_when_notJohnNameWith51Age_expect_pass() {

		Person.Builder builder = new Person.Builder("Tom Seaman", 51, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when first name contains "John" and 51 age provided.
	 * Expect pass validation
	 */
	@Test
	public void testConstruction_when_containsJohnNameWith51Age_expect_pass() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 51, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when null name and 70 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullNameWith70Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder(null, 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when empty name and 70 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_emptyNameWith70Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when "John" and 70 age provided. Expect
	 * IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_johnNameWith70Age_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("John Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when not "John" and 70 age provided. Expect pass
	 * validation
	 */
	@Test
	public void testConstruction_when_notJohnNameWith70Age_expect_pass() {

		Person.Builder builder = new Person.Builder("Tom Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when first name contains "John" and 70 age provided.
	 * Expect pass validation
	 */
	@Test
	public void testConstruction_when_containsJohnNameWith70Age_expect_pass() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when man that first name no contains "ko" provided.
	 * Expect pass validation
	 */
	@Test
	public void testConstruction_when_manWithNoKo_expect_pass() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when man that first name contains "ko" in middle
	 * provided. Expect pass validation
	 */
	@Test
	public void testConstruction_when_manWithMiddleKo_expect_pass() {

		Person.Builder builder = new Person.Builder("Jokohn Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when man that first name end with "ko" provided. Expect
	 * pass validation
	 */
	@Test
	public void testConstruction_when_manWithEndKo_expect_pass() {

		Person.Builder builder = new Person.Builder("Jokohnko Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when man that first name is "Ko" provided. Expect pass
	 * validation
	 */
	@Test
	public void testConstruction_when_manWithFirstNameKo_expect_pass() {

		Person.Builder builder = new Person.Builder("Ko Seaman", 70, Constant.GENDER_MAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when woman that first name not contains "ko" provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_womanWithNoKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 70, Constant.GENDER_WOMAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when woman that first name contains "ko" in middle
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_womanWithMiddleKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Jokohn Seaman", 70, Constant.GENDER_WOMAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when woman that first name end with "ko" provided.
	 * Expect pass validation
	 */
	@Test
	public void testConstruction_when_womanWithEndKo_expect_pass() {

		Person.Builder builder = new Person.Builder("Jokohnko Seaman", 70, Constant.GENDER_WOMAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when woman that first name is "Ko" provided. Expect
	 * pass validation
	 */
	@Test
	public void testConstruction_when_womanWithFirstNameKo_expect_pass() {

		Person.Builder builder = new Person.Builder("Ko Seaman", 70, Constant.GENDER_WOMAN);
		Person person = builder.build();

	}

	/**
	 * Test construction when null gender and first name not contains "ko"
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullGenderWithNoKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 70, null);
		Person person = builder.build();

	}

	/**
	 * Test construction when null gender and first name contains "ko" in middle
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullGenderWithMiddleKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Jokohn Seaman", 70, null);
		Person person = builder.build();

	}

	/**
	 * Test construction when null gender and first name end with "ko" provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullGenderWithEndKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Jokohnko Seaman", 70, null);
		Person person = builder.build();

	}

	/**
	 * Test construction when null gender and first name is "Ko" provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullGenderWithFirstNameKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Ko Seaman", 70, null);
		Person person = builder.build();

	}

	/**
	 * Test construction when other gender and first name not contains "ko"
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_otherGenderWithNoKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Johnson Seaman", 70, "Other");
		Person person = builder.build();

	}

	/**
	 * Test construction when other gender and first name contains "ko" in
	 * middle provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_otherGenderWithMiddleKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Jokohn Seaman", 70, "Other");
		Person person = builder.build();

	}

	/**
	 * Test construction when other gender and first name end with "ko"
	 * provided. Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_otherGenderWithEndKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Jokohnko Seaman", 70, "Other");
		Person person = builder.build();

	}

	/**
	 * Test construction when other gender and first name is "Ko" provided.
	 * Expect IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_otherGenderWithFirstNameKo_expect_illegalArgument() {

		Person.Builder builder = new Person.Builder("Ko Seaman", 70, "Other");
		Person person = builder.build();

	}

	/**
	 * Test toString. Expect all attribute are shown
	 */
	@Test
	public void testToString_expect_allAttribute() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();
		assert (person.toString().contains("[name=John Seaman,age=30,gender=MAN]"));

	}

	/**
	 * Test equals. Expect two person are equal
	 */
	@Test
	public void testEquals_expect_equals() {
		Person.Builder builder = new Person.Builder().setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN);
		Person person = builder.build();
		Person person2 = builder.build();
		assertEquals(person, person2);

	}
}
