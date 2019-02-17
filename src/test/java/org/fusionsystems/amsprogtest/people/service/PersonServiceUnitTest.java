package org.fusionsystems.amsprogtest.people.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.fusionsystems.amsprogtest.people.constant.Constant;
import org.fusionsystems.amsprogtest.people.dao.PersonDao;
import org.fusionsystems.amsprogtest.people.dto.Person;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Person Service
 * 
 * @author manhei.ma
 *
 */
public class PersonServiceUnitTest {

	/**
	 * Instance of Person Service
	 */
	PersonService personService;

	@Before
	public void setUp() throws Exception {

	}

	/**
	 * Test Construction when null dao is provide. Expect
	 * IllegalArgumentException is thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullDao_expect_illegalArgument() {

		personService = new PersonServiceBean.Builder(null).build();
		personService.addPerson("Tom Seaman", 20, Constant.GENDER_MAN);
		;

	}

	/**
	 * Test addPerson for insert person. Expect no exception thrown
	 */
	@Test
	public void testAddPerson_when_insert_expect_pass() {
		PersonDao personDaoStub = new PersonDao() {
			@Override
			public void insertPerson(Person person) {

			}

			@Override
			public List<Person> selectList() {
				ArrayList<Person> personList = new ArrayList();
				Person.Builder personBuilder = new Person.Builder();
				personList.add(personBuilder.setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("Peter Seaman").setAge(40).setGender(Constant.GENDER_MAN).build());
				personList
						.add(personBuilder.setName("Joko Uehara").setAge(20).setGender(Constant.GENDER_WOMAN).build());
				return personList;
			}
		};
		personService = new PersonServiceBean.Builder(personDaoStub).build();
		personService.addPerson("Tom Seaman", 20, Constant.GENDER_MAN);

	}

	/**
	 * Test addPerson for insert person. Expect 0 average age
	 * 
	 */
	@Test
	public void testCalculateAverageAge_when_notFound_expect_0() {
		PersonDao personDaoStub = new PersonDao() {
			@Override
			public void insertPerson(Person person) {

			}

			@Override
			public List<Person> selectList() {
				ArrayList<Person> personList = new ArrayList();
				Person.Builder personBuilder = new Person.Builder();
				personList.add(personBuilder.setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("Peter Seaman").setAge(40).setGender(Constant.GENDER_MAN).build());
				personList
						.add(personBuilder.setName("Joko Uehara").setAge(20).setGender(Constant.GENDER_WOMAN).build());
				return personList;
			}
		};
		personService = new PersonServiceBean.Builder(personDaoStub).build();
		double age = personService.calculateAverageAge("Raymond");
		assertEquals(0.0, age, 0.001);
	}

	/**
	 * Test calculateAverageAge when people with age(20,30) inserted and chosen
	 * for average. Expect average age is 25
	 */
	@Test
	public void testCalculateAverageAge_when_20_30_expect_25() {
		PersonDao personDaoStub = new PersonDao() {
			@Override
			public void insertPerson(Person person) {

			}

			@Override
			public List<Person> selectList() {
				ArrayList<Person> personList = new ArrayList();
				Person.Builder personBuilder = new Person.Builder();
				personList.add(personBuilder.setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("Peter Seaman").setAge(40).setGender(Constant.GENDER_MAN).build());
				personList
						.add(personBuilder.setName("Joko Uehara").setAge(20).setGender(Constant.GENDER_WOMAN).build());
				return personList;
			}
		};
		personService = new PersonServiceBean.Builder(personDaoStub).build();
		double age = personService.calculateAverageAge("Jo");
		assertEquals(25, age, 0.001);
	}

	/**
	 * Test calculateAverageAge when people with age(30,40) inserted and chosen
	 * for average. Expect average age is 35
	 */
	@Test
	public void testCalculateAverageAge_when_30_40_expect_35() {
		PersonDao personDaoStub = new PersonDao() {
			@Override
			public void insertPerson(Person person) {

			}

			@Override
			public List<Person> selectList() {
				ArrayList<Person> personList = new ArrayList();
				Person.Builder personBuilder = new Person.Builder();
				personList.add(personBuilder.setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("Peter Seaman").setAge(40).setGender(Constant.GENDER_MAN).build());
				personList
						.add(personBuilder.setName("Joko Uehara").setAge(20).setGender(Constant.GENDER_WOMAN).build());
				return personList;
			}
		};
		personService = new PersonServiceBean.Builder(personDaoStub).build();
		double age = personService.calculateAverageAge("Seaman");
		assertEquals(35, age, 0.001);
	}

	/**
	 * Test calculateAverageAge when people with age(20,30,40) inserted and
	 * chosen for average. Expect average age is 30
	 */
	@Test
	public void testCalculateAverageAge_when_20_40_expect_30() {
		PersonDao personDaoStub = new PersonDao() {
			@Override
			public void insertPerson(Person person) {

			}

			@Override
			public List<Person> selectList() {
				ArrayList<Person> personList = new ArrayList();
				Person.Builder personBuilder = new Person.Builder();
				personList.add(personBuilder.setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("Peter Seaman").setAge(40).setGender(Constant.GENDER_MAN).build());
				personList
						.add(personBuilder.setName("Joko Uehara").setAge(20).setGender(Constant.GENDER_WOMAN).build());
				return personList;
			}
		};
		personService = new PersonServiceBean.Builder(personDaoStub).build();
		double age = personService.calculateAverageAge("a");
		assertEquals(30, age, 0.001);
	}

	/**
	 * Test calculateAverageAge when people with age(30,31) inserted and chosen
	 * for average. Expect average age is 31.5
	 */
	@Test
	public void testCalculateAverageAge_when_30_31_expect_31_5() {
		PersonDao personDaoStub = new PersonDao() {
			@Override
			public void insertPerson(Person person) {

			}

			@Override
			public List<Person> selectList() {
				ArrayList<Person> personList = new ArrayList();
				Person.Builder personBuilder = new Person.Builder();
				personList.add(personBuilder.setName("John Peter").setAge(31).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("John Seaman").setAge(30).setGender(Constant.GENDER_MAN).build());
				personList.add(personBuilder.setName("Peter Seaman").setAge(40).setGender(Constant.GENDER_MAN).build());
				personList
						.add(personBuilder.setName("Joko Uehara").setAge(20).setGender(Constant.GENDER_WOMAN).build());
				return personList;
			}
		};
		personService = new PersonServiceBean.Builder(personDaoStub).build();
		double age = personService.calculateAverageAge("John");
		assertEquals(30.5, age, 0.001);
	}
}
