package org.fusionsystems.amsprogtest;

import static org.junit.Assert.assertEquals;

import org.fusionsystems.amsprogtest.people.constant.Constant;
import org.fusionsystems.amsprogtest.people.service.PersonService;
import org.junit.Test;

/**
 * Unit test for Person Controller
 * 
 * @author manhei.ma
 *
 */
public class PersonControllerUnitTest {

	/**
	 * Test Construction when person service is null. Expect no IllegalArgumentException thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testConstruction_when_nullService_expect_illegalArgumentException() {

		PersonController.Builder builder = new PersonController.Builder(null);
		PersonController personController = builder.build();

	}

	/**
	 * Test add person. Expect no exception thrown
	 */
	@Test
	public void testAddPerson_expect_noExceptionThrown() {
		PersonService personServiceStub = new PersonService() {

			@Override
			public void addPerson(String name, int age, String gender) {
			}

			@Override
			public double calculateAverageAge(String keyword) {
				return 0;
			}

		};
		PersonController.Builder builder = new PersonController.Builder(personServiceStub);
		PersonController personController = builder.build();

		personController.addPerson("John Seaman", 30, Constant.GENDER_MAN);
	}

	/**
	 * Test Construction when person service is null. Expect no IllegalArgumentException thrown
	 */
	@Test
	public void testCalculateAverageAge_expect_noExceptionThrown() {
		PersonService personServiceStub = new PersonService() {

			@Override
			public void addPerson(String name, int age, String gender) {
			}

			@Override
			public double calculateAverageAge(String keyword) {
				return 30;
			}

		};
		PersonController.Builder builder = new PersonController.Builder(personServiceStub);
		PersonController personController = builder.build();

		double avgAge = personController.calculateAverageAge("e");
		assertEquals(30.0, avgAge, 0.001);
	}

}
