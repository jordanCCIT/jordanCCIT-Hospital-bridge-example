package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	private static final String NURSE_EMPLOYEE_NUMBER = "1121";
	private static final String NURSE_NAME = "Jackie";
	Nurse underTest = new Nurse(NURSE_NAME, NURSE_EMPLOYEE_NUMBER);

	@Test
	public void shouldHaveAName() {
		assertThat(underTest.getName(), is(NURSE_NAME));
	}

	@Test
	public void shouldHaveANumber() {
		assertThat(underTest.getNumber(), is(NURSE_EMPLOYEE_NUMBER));
	}

	@Test
	public void shouldHaveASalary() {
		assertThat(underTest.getSalary(), is(50000));
	}

	@Test
	public void shouldReturnAmountOfPatientsUnderTheirCareAs1() {
		Patient testCase1 = new Patient();
		underTest.lookAfter(testCase1);
		int result = underTest.numberOfPatients();
		assertThat(result, is(1));
	}

	@Test
	public void shouldReturnAmountOfPatientsUnderTheirCareAs2() {
		Patient testCase1 = new Patient();
		Patient testCase2 = new Patient();
		underTest.lookAfter(testCase1);
		underTest.lookAfter(testCase2);
		int result = underTest.numberOfPatients();
		assertThat(result, is(2));
	}

	@Test
	public void shouldCareForPatient() {
		Patient testCase1 = new Patient();
		int preCareHealth = testCase1.getHealth();
		underTest.careForPatient(testCase1);
		int postCareHealth = testCase1.getHealth();
		assertThat(postCareHealth - preCareHealth, is(5));
	}

	@Test
	public void shouldDrawBloodFromPatient() {
		Patient testCase1 = new Patient();
		int preDrawBloods = testCase1.getBloods();
		underTest.drawBloods(testCase1);
		int postDrawBloods = testCase1.getBloods();
		assertThat(postDrawBloods - preDrawBloods, is(-5));
	}
}
