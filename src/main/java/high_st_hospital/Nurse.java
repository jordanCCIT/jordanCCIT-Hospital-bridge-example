package high_st_hospital;

import java.util.ArrayList;

public class Nurse extends Employee implements MedicalDuties{

    private ArrayList<Patient> patientsUnderCare = new ArrayList<>();

    public Nurse(String empName, String empNumber){
        this.empName = empName;
        this.empNumber = empNumber;
    }

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public void careForPatient(Patient patient) {

    }

    @Override
    public void drawBlood(Patient patient) {

    }

    public int numberOfPatients(){
        return patientsUnderCare.size();
    }
}
