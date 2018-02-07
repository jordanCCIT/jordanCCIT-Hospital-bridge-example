package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
	Doctor underTest = new Surgeon("Hawkeye", "1112", "Heart");

	@Test
	public void surgeonsShouldInheritDoctorTraits() {
		String result = underTest.getSpecialty();
		assertThat(result, is("Heart"));
	}

	@Test
	public void surgeonsShouldMake120000() {
		int result = underTest.getSalary();
		assertThat(result, is(120000));
	}

	Surgeon underTestSurgeon = new Surgeon("Hawkeye", "1112", "Heart");

	@Test
	public void surgeonsCanBeInSurgery() {
		Patient testCase = new Patient();
		underTestSurgeon.operateOn(testCase);
		boolean result = underTestSurgeon.getIsOperating();
		assertThat(result, is(true));
	}
}
