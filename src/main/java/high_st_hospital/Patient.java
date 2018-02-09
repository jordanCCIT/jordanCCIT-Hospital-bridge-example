package high_st_hospital;

public class Patient {

	private String patientIdentifier;
	private int health;
	private int bloods;

	public String getPatientIdentifier() {
		return patientIdentifier;
	}

	public int getHealth() {
		return health;
	}

	public int getBloods() {

		return bloods;
	}

	public Patient() {

	}

	public Patient(String patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}

	public void improveHealth(int care) {
		health = +care;
	}

	public void giveBloods(int bloodDraw) {

		bloods = -bloodDraw;
	}

	@Override
	public String toString() {
		return patientIdentifier;
	}
}
