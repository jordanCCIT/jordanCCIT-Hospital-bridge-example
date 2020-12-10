package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
    private static final String DOCTOR_EMPLOYEE_NUMBER = "1111";
    private static final String DOCTOR_NAME = "Bob";
    private static final String DOCTOR_SPECIALTY = "Brain";
    Doctor underTest = new Doctor(DOCTOR_NAME,DOCTOR_EMPLOYEE_NUMBER,DOCTOR_SPECIALTY);

    @Test
    public void shouldHaveAName(){
        assertEquals(underTest.getEmpName(),DOCTOR_NAME);
    }

    @Test
    public void shouldHaveANumber(){
        assertEquals(underTest.getempNumber(),DOCTOR_EMPLOYEE_NUMBER);
    }

    @Test
    public void shouldHaveASalary(){
        assertEquals(underTest.getSalary(),90000);
    }

    @Test
    public void shouldHaveASpecialty(){
        String specialty = underTest.getSpecialty();
        assertEquals(specialty,DOCTOR_SPECIALTY);
    }

    @Test
    public void shouldCareForPatient() {
        Patient testPatient1 = new Patient("1111");
        int beforeCare = testPatient1.getHealth();
        underTest.careForPatient(testPatient1);
        int afterCare = testPatient1.getHealth();
        assertEquals(beforeCare + afterCare, 20);
    }

    @Test
    public void shouldDrawBlood(){
        Patient testPatient1 = new Patient("1111");
        int beforeBloodDraw = testPatient1.getBlood();
        underTest.drawBlood(testPatient1);
        int afterBloodDraw = testPatient1.getBlood();
        assertEquals(afterBloodDraw-beforeBloodDraw,-5);
    }
}
