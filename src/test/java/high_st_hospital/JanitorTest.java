package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	private static final String JANITOR_EMPLOYEE_NUMBER = "1131";
	private static final String JANITOR_NAME = "Bob";

	@Test
	public void janitorShouldHaveAName() {
		Employee underTest = new Janitor(JANITOR_NAME, JANITOR_EMPLOYEE_NUMBER);
		String result = underTest.getName();
		assertThat(result, is(JANITOR_NAME));
	}

	Janitor underTest = new Janitor(JANITOR_NAME, JANITOR_EMPLOYEE_NUMBER);

	@Test
	public void janitorShouldBeSweeping() {
		Hospital testBuilding = new Hospital();
		underTest.sweepFloors(testBuilding);
		boolean result = underTest.getIsSweeping();
		assertThat(result, is(true));
	}

	@Test
	public void shouldHaveANumber() {
		assertThat(underTest.getNumber(), is(JANITOR_EMPLOYEE_NUMBER));
	}

	@Test
	public void shouldHaveASalaryof40000() {
		assertThat(underTest.getSalary(), is(40000));
	}
}