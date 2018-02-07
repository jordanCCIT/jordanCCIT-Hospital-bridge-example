package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {
	@Test
	public void shouldBeAnEmployee() {
		Employee underTest = new Receptionist("Barb", "1141");
		assertThat(underTest.getName(), is("Barb"));
		assertThat(underTest.getNumber(), is("1141"));
	}

	Receptionist underTest = new Receptionist("Barb", "1141");

	@Test
	public void shouldHaveASalaryOf45000() {
		assertThat(underTest.getSalary(), is(45000));
	}

	@Test
	public void receptionistShouldBeAnsweringPhones() {
		Hospital testBuilding = new Hospital();
		underTest.answerPhones(testBuilding);
		boolean result = underTest.getIsAnsweringPhones();
		assertThat(result, is(true));
	}

	@Test
	public void receptionistShouldNotBeAnsweringPhones() {
		boolean result = underTest.getIsAnsweringPhones();
		assertThat(result, is(false));
	}
}
