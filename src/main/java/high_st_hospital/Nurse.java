package high_st_hospital;

import java.util.ArrayList;

public class Nurse extends Employee implements MedicalDuties {
	private ArrayList<Patient> patientsUnderCare = new ArrayList<Patient>();

	public Nurse(String empName, String empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
	}

	@Override
	public int getSalary() {

		return 50000;
	}

	public void lookAfter(Patient patient) {
		patientsUnderCare.add(patient);
	}

	public int numberOfPatients() {
		return patientsUnderCare.size();
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.improveHealth(5);
	}

	@Override
	public void drawBloods(Patient patient) {
		patient.giveBloods(5);
	}

	@Override
	public String toString() {
		return empName + "\t" + empNumber + "\t" + this.numberOfPatients();
	}
}
