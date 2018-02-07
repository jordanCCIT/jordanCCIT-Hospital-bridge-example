package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmergencyDispatcherTest {
	EmergencyDispatcher underTest = new EmergencyDispatcher("Tina", "1161");

	@Test
	public void shouldBeAReceptionist() {
		String name = underTest.getName();
		String empNum = underTest.getNumber();
		assertThat(name, is("Tina"));
		assertThat(empNum, is("1161"));
		assertThat(underTest.getSalary(), is(45000));
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
