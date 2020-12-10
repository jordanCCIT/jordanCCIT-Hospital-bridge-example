package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class HospitalTest {
    private static final String DOCTOR_EMPLOYEE_NUMBER = "1111";
    private static final String DOCTOR_NAME = "Bob";
    private static final String DOCTOR_SPECIALTY = "Brain";
    Doctor underTestDoc = new Doctor(DOCTOR_NAME,DOCTOR_EMPLOYEE_NUMBER,DOCTOR_SPECIALTY);
    private static final String NURSE_EMPLOYEE_NUMBER = "1112";
    private static final String NURSE_NAME = "Bobby";
    Nurse underTestNurse = new Nurse(NURSE_NAME,NURSE_EMPLOYEE_NUMBER);
    private static final String SURGEON_EMPLOYEE_NUMBER = "1113";
    private static final String SURGEON_NAME = "Bobbert";
    private static final String SURGEON_SPECIALTY = "Heart";
    Surgeon underTestSurgeon = new Surgeon(SURGEON_NAME,SURGEON_EMPLOYEE_NUMBER,SURGEON_SPECIALTY);
    Hospital underTestHosp = new Hospital();

    @Test
    public void shouldHaveTwoEmployees(){
        underTestHosp.hire(underTestNurse);
        underTestHosp.hire(underTestDoc);
        int result = underTestHosp.staffSize();
        assertEquals(result,2);
    }

    @Test
    public void shouldReturnListOfAllEmployees(){
        underTestHosp.hire(underTestNurse);
        underTestHosp.hire(underTestDoc);
        underTestHosp.hire(underTestSurgeon);
        Collection<Employee> allEmployees = new ArrayList<>(underTestHosp.getAllEmployees());
        assertEquals(underTestHosp.getAllEmployees().contains(underTestNurse),true);
        assertEquals(allEmployees.contains(underTestSurgeon),true);
        assertEquals(allEmployees.contains(underTestDoc),true);

    }

}
