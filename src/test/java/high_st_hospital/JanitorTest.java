package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {
	@Test
	public void janitorShouldHaveAName() {
		Employee underTest = new Janitor("Bob", "1131");
		String result = underTest.getName();
		assertThat(result, is("Bob"));
	}

	Janitor underTest = new Janitor("Bob", "1131");

	@Test
	public void janitorShouldBeSweeping() {
		Hospital testBuilding = new Hospital();
		underTest.sweepFloors(testBuilding);
		boolean result = underTest.getIsSweeping();
		assertThat(result, is(true));
	}

	@Test
	public void shouldHaveANumber() {
		assertThat(underTest.getNumber(), is("1131"));
	}

	@Test
	public void shouldHaveASalaryof40000() {
		assertThat(underTest.getSalary(), is(40000));
	}
}