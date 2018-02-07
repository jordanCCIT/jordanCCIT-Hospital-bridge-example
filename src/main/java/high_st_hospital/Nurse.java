package high_st_hospital;

import java.util.ArrayList;

public class Nurse extends Employee {
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

}
