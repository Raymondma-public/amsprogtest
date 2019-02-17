package org.fusionsystems.amsprogtest.people.service;

import static org.junit.Assert.*;

import org.fusionsystems.amsprogtest.people.constant.Constant;
import org.fusionsystems.amsprogtest.people.dao.PersonDao;
import org.fusionsystems.amsprogtest.people.dao.PersonDaoBean;
import org.junit.Before;
import org.junit.Test;

/**
 * Integration test for Person Service
 * 
 * @author manhei.ma
 *
 */
public class PersonServiceIntegrationTest {

	/**
	 * Instance of person service
	 */
	PersonService personService;

	@Before
	public void setUp() throws Exception {
		PersonDaoBean.Builder personDaoBuilder = new PersonDaoBean.Builder();
		PersonDao personDao = personDaoBuilder.build();

		PersonServiceBean.Builder personServiceBuilder = new PersonServiceBean.Builder(personDao);
		personService = personServiceBuilder.build();
	}

	/**
	 * Test calculateAverageAge when no people inserted. Expect average age is 0
	 */
	@Test
	public void testCalculateAverageAge_when_noPeople_expect_0() {
		double avgAge = personService.calculateAverageAge("Joko");
		assertEquals(0, avgAge, 0.001);

	}

	/**
	 * Test calculateAverageAge when people with age(20) inserted and chosen for average. Expect average age is 20
	 */
	@Test
	public void testCalculateAverageAge_when_20_expect_20() {
		personService.addPerson("Tom Seaman", 30, Constant.GENDER_MAN);
		personService.addPerson("Peter Seaman", 40, Constant.GENDER_MAN);
		personService.addPerson("Joko Uehara", 20, Constant.GENDER_WOMAN);

		double avgAge = personService.calculateAverageAge("Joko");
		assertEquals(20, avgAge, 0.001);

	}

	/**
	 * Test calculateAverageAge when people with age(20,30) inserted and chosen for average. Expect average age is 25
	 */
	@Test
	public void testCalculateAverageAge_when_20_30_expect_25() {
		personService.addPerson("Tom Seaman", 30, Constant.GENDER_MAN);
		personService.addPerson("Peter Seaman", 40, Constant.GENDER_MAN);
		personService.addPerson("Joko Uehara", 20, Constant.GENDER_WOMAN);

		double avgAge = personService.calculateAverageAge("o");
		assertEquals(25, avgAge, 0.001);

	}

	/**
	 * Test calculateAverageAge when people with age(20,30,40) inserted and chosen for average. Expect average age is 30
	 */
	@Test
	public void testCalculateAverageAge_when_30_40_expect_35() {
		personService.addPerson("Tom Seaman", 30, Constant.GENDER_MAN);
		personService.addPerson("Peter Seaman", 40, Constant.GENDER_MAN);
		personService.addPerson("Joko Uehara", 20, Constant.GENDER_WOMAN);

		double avgAge = personService.calculateAverageAge("a");
		assertEquals(30, avgAge, 0.001);

	}

}
