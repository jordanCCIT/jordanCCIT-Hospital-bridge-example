package high_st_hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empName, String empNumber, String speciality) {
		super(empName, empNumber, speciality);

	}

	@Override
	public int getSalary() {

		return 120000;
	}

	public boolean getIsOperating() {

		return isOperating;
	}

	public void operateOn(Patient patient) {
		// patient.improveHealth(20);
		isOperating = true;

	}

	@Override
	public String toString() {
		return empName + "\t" + empNumber + "\t" + doctorSpeciality + "\t" + isOperating;
	}
}
