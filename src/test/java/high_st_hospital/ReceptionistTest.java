package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {
	@Test
	public void shouldAnswerPhone() {
		Employee underTest = new Receptionist("Barb", "1141");
	}

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

}
