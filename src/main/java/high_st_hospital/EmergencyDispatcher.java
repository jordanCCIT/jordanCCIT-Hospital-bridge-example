package high_st_hospital;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties {

    public EmergencyDispatcher(String name, String employeeNumber) {
        super(name, employeeNumber);
    }

    @Override
    public void careForPatient(Patient patient) {
        patient.improveHealth(5);
    }

    @Override
    public void drawBlood(Patient patient) {
        patient.giveBlood(5);
    }
}
