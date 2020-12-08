package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
    public static final String NURSE_EMPLOYEE_NUMBER = "1121";
    public static final String NURSE_NAME = "Janet";
    Nurse underTest = new Nurse(NURSE_NAME, NURSE_EMPLOYEE_NUMBER);

    @Test
    public void shouldHaveAName(){
        assertEquals(underTest.getEmpName(),NURSE_NAME);
    }

    @Test
    public void shouldHaveANumber(){
        assertEquals(underTest.getempNumber(),NURSE_EMPLOYEE_NUMBER);
    }

    @Test
    public void shouldHaveASalary(){
        assertEquals(underTest.getSalary(),50000);
    }

    @Test
    public void shouldReturnAmountOfPatientsUnderTheirCareAs1(){
        Patient testPatient1 = new Patient("1111");
        underTest.careForPatient(testPatient1);
        int result = underTest.numberOfPatients();
        assertEquals(result,1);
    }
}
