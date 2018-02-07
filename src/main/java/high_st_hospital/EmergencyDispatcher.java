package high_st_hospital;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties {

	public EmergencyDispatcher(String empName, String empNumber) {
		super(empName, empNumber);

	}

	@Override
	public void careForPatient(Patient patient) {
		patient.improveHealth(5);
	}

	@Override
	public void drawBloods(Patient patient) {
		patient.giveBloods(5);
	}

}
