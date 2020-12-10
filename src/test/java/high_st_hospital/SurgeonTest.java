package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SurgeonTest {
    Doctor underTest = new Surgeon("Dr. Strange", "1112","Heart");

    @Test
    public void surgeonsShouldInheritDoctorTraits(){
        String specialty = underTest.getSpecialty();
        assertEquals(specialty,"Heart");
    }

    @Test
    public void shouldHaveASalary(){
        int salary = underTest.getSalary();
        assertEquals(salary,120000);
    }

    Surgeon underTest2 = new Surgeon("Dr. Strange", "1112","Heart");

    @Test
    public void surgeonsCanBeInSurgery(){
        Patient testPatient1 = new Patient("1111");
        underTest2.operateOn(testPatient1);
        boolean result = underTest2.getIsOperating();
        assertEquals(result,true);
    }
}
