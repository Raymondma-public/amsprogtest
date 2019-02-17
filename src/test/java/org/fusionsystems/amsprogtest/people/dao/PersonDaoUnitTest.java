package org.fusionsystems.amsprogtest.people.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.fusionsystems.amsprogtest.people.constant.Constant;
import org.fusionsystems.amsprogtest.people.dto.Person;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Person Dao
 * 
 * @author manhei.ma
 *
 */
public class PersonDaoUnitTest {

	/**
	 * PersonDao instance
	 */
	PersonDao personDao;

	/**
	 * Initialize person dao
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		personDao = new PersonDaoBean.Builder().build();
	}

	/**
	 * Test Create builder when no person insert. Expect empty
	 */
	@Test
	public void testCreateBuilder_when_noInsert_expect_empty() {
		List<Person> personList = personDao.selectList();
		assert (personList.isEmpty());
	}

	/**
	 * Test Insert one person. Expect data correct
	 */
	@Test
	public void testInsertPerson_expect_dataCorrect() {
		String[] names = new String[] { "John Seaman" };
		int[] ages = new int[] { 20 };
		String[] genders = new String[] { Constant.GENDER_MAN };

		Person.Builder builder = new Person.Builder();
		for (int i = 0; i < names.length; i++) {
			Person person = builder.setName(names[i]).setAge(ages[i]).setGender(genders[i]).build();
			personDao.insertPerson(person);
		}
		List<Person> personList = personDao.selectList();
		assert (personList.size() == 1);
		int i = 0;
		for (Person p : personList) {
			assertEquals(names[i], p.getFullName());
			assertEquals(ages[i], p.getAge());
			assertEquals(genders[i], p.getGender());
			i++;
		}

	}

	/**
	 * Test Insert 2 person. Expect data correct
	 */
	@Test
	public void testInsert2Person() {
		String[] names = new String[] { "John Seaman", "Ako Horse" };
		int[] ages = new int[] { 20, 70 };
		String[] genders = new String[] { Constant.GENDER_MAN, Constant.GENDER_WOMAN };

		Person.Builder builder = new Person.Builder();
		for (int i = 0; i < names.length; i++) {
			Person person = builder.setName(names[i]).setAge(ages[i]).setGender(genders[i]).build();
			personDao.insertPerson(person);
		}
		List<Person> personList = personDao.selectList();
		assert (personList.size() == 1);
		int i = 0;
		for (Person p : personList) {
			assertEquals(names[i], p.getFullName());
			assertEquals(ages[i], p.getAge());
			assertEquals(genders[i], p.getGender());
			i++;
		}

	}

}
