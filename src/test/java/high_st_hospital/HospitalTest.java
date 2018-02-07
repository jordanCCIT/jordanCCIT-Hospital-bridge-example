package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class HospitalTest {
	private static final String DOCTOR_NAME = "Phil";
	private static final String DOCTOR_EMPLOYEE_NUMBER = "1111";
	private static final String DOCTOR_SPECIALITY = "General";
	Doctor testDoctor = new Doctor(DOCTOR_NAME, DOCTOR_EMPLOYEE_NUMBER, DOCTOR_SPECIALITY);
	private static final String NURSE_NAME = "Jackie";
	private static final String NURSE_EMPLOYEE_NUMBER = "1121";
	Nurse testNurse = new Nurse(NURSE_NAME, NURSE_EMPLOYEE_NUMBER);
	private static final String JANITOR_NAME = "Bob";
	private static final String JANITOR_EMPLOYEE_NUMBER = "1131";
	Janitor testJanitor = new Janitor(JANITOR_NAME, JANITOR_EMPLOYEE_NUMBER);
	Hospital underTest = new Hospital();

	@Test
	public void shouldHave2Employess() {
		underTest.hire(testDoctor);
		underTest.hire(testNurse);
		int result = underTest.staffSize();
		assertThat(result, is(2));
	}

	@Test

	public void shouldHave3Employees() {
		underTest.hire(testDoctor);
		underTest.hire(testNurse);
		underTest.hire(testJanitor);
		int result = underTest.staffSize();
		assertThat(result, is(3));
	}

	@Test
	public void shouldReturnAListOfAllEmployees() {
		underTest.hire(testDoctor);
		underTest.hire(testNurse);
		underTest.hire(testJanitor);
		Collection<Employee> allEmployees = new ArrayList<>(underTest.getAllEmployees());
		assertThat(underTest.getAllEmployees().contains(testDoctor), is(true));
		assertThat(allEmployees.contains(testJanitor), is(true));
		assertThat(allEmployees.contains(testNurse), is(true));
	}

	@Test
	public void shouldFireJanitors() {
		underTest.hire(testDoctor);
		underTest.hire(testNurse);
		underTest.hire(testJanitor);
		underTest.fire(JANITOR_EMPLOYEE_NUMBER);
		Collection<Employee> allEmployees = new ArrayList<>(underTest.getAllEmployees());
		assertThat(allEmployees.contains(testJanitor), is(false));
	}

}
