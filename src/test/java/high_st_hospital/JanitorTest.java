package high_st_hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class JanitorTest {
    private static final String JANITOR_NAME ="Bob";
    private static final String JANITOR_EMPLOYEE_NUMBER = "1111";

    @Test
    public void janitorShouldHaveAName(){
        Janitor underTest = new Janitor(JANITOR_NAME,JANITOR_EMPLOYEE_NUMBER);
        String result = underTest.getEmpName();
        assertEquals(result,JANITOR_NAME);
    }

    Janitor underTest = new Janitor(JANITOR_NAME,JANITOR_EMPLOYEE_NUMBER);

    @Test
    public void shouldHaveASalaryOf40000(){
        assertEquals(underTest.getSalary(),40000);
    }

    @Test
    public void shouldHaveEmployeeNumber(){
        assertEquals(underTest.getempNumber(), JANITOR_EMPLOYEE_NUMBER);
    }

    @Test
    public void janitorShouldBeSweeping(){
        Hospital testBuilding = new Hospital();
        underTest.sweepFloors(testBuilding);
        boolean result = underTest.getIsSweeping();
        assertEquals(result,true);
    }

}