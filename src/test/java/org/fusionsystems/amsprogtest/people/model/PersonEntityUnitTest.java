package org.fusionsystems.amsprogtest.people.model;

import static org.junit.Assert.*;

import org.fusionsystems.amsprogtest.people.constant.Constant;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for PersonEntity
 * @author manhei.ma
 *
 */
public class PersonEntityUnitTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test Constructor. Expect correct name is set  
	 */
	@Test
	public void testConstructor_expect_correctName() {
		PersonEntity pEntity = new PersonEntity("John Seaman", 30, Constant.GENDER_MAN);
		assertEquals("John Seaman", pEntity.getName());
	}

	/**
	 * Test Constructor. Expect correct age is set  
	 */
	@Test
	public void testConstructor_expect_correctAge() {
		PersonEntity pEntity = new PersonEntity("John Seaman", 30, Constant.GENDER_MAN);
		assertEquals(30, pEntity.getAge());
	}

	/**
	 * Test Constructor. Expect correct gender is set  
	 */
	@Test
	public void testConstructor_expect_correctGender() {
		PersonEntity pEntity = new PersonEntity("John Seaman", 30, Constant.GENDER_MAN);

		assertEquals(Constant.GENDER_MAN, pEntity.getGender());
	}

	/**
	 * Test setter. Expect correct name is set  
	 */
	@Test
	public void testSetName() {
		PersonEntity pEntity = new PersonEntity("John Seaman", 30, Constant.GENDER_MAN);

		pEntity.setName("Joko Uehara");

		assertEquals("Joko Uehara", pEntity.getName());
	}

	/**
	 * Test setter. Expect correct age is set  
	 */
	@Test
	public void testSetAge() {
		PersonEntity pEntity = new PersonEntity("John Seaman", 30, Constant.GENDER_MAN);

		pEntity.setAge(20);

		assertEquals(20, pEntity.getAge());
	}

	/**
	 * Test setter. Expect correct gender is set  
	 */
	@Test
	public void testSetGender() {
		PersonEntity pEntity = new PersonEntity("John Seaman", 30, Constant.GENDER_MAN);

		pEntity.setGender(Constant.GENDER_WOMAN);

		assertEquals(Constant.GENDER_WOMAN, pEntity.getGender());
	}

}
