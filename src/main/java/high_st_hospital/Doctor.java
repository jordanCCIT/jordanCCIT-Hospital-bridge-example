package high_st_hospital;

public class Doctor extends Employee implements MedicalDuties {
    protected String doctorSpecialty;

    public Doctor(String empName, String empNumber, String doctorSpecialty) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.doctorSpecialty = doctorSpecialty;
    }

    @Override
    public int getSalary() {
        return 90000;
    }

    @Override
    public void careForPatient(Patient patient) {
        patient.improveHealth(20);
    }

    public String getSpecialty(){
        return doctorSpecialty;
    }

    @Override
    public void drawBlood(Patient patient) {
        patient.giveBlood(5);
    }

    @Override
    public String toString(){
        return empName + "\t" + empNumber + "\t" + this.doctorSpecialty;
    }

}