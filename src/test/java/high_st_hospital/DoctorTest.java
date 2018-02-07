package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	private static final String DOCTOR_EMPLOYEE_NUMBER = "1111";
	private static final String DOCTOR_NAME = "Phil";
	private static final String DOCTOR_SPECIALITY = "General";
	Doctor underTest = new Doctor(DOCTOR_NAME, DOCTOR_EMPLOYEE_NUMBER, DOCTOR_SPECIALITY);

	@Test
	public void shouldHaveAName() {
		assertThat(underTest.getName(), is(DOCTOR_NAME));
	}

	@Test
	public void shouldHaveANumber() {
		assertThat(underTest.getNumber(), is(DOCTOR_EMPLOYEE_NUMBER));
	}

	@Test
	public void shouldHaveASalary() {
		assertThat(underTest.getSalary(), is(90000));
	}

	@Test
	public void shouldHaveASpecialty() {
		String result = underTest.getSpecialty();
		assertThat(result, is(DOCTOR_SPECIALITY));
	}

}
