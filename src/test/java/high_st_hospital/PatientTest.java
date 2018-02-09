package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {
	private static final String PATIENT_NUMBER = "111-11-1111";

	@Test
	public void shouldHaveAPatientNumber() {
		Patient underTest = new Patient(PATIENT_NUMBER);
		String result = underTest.getPatientIdentifier();
		assertThat(result, is(PATIENT_NUMBER));
	}
}
