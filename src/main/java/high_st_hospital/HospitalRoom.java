package high_st_hospital;

import java.util.ArrayList;

public abstract class HospitalRoom {

	protected ArrayList<Patient> patients = new ArrayList<>();

	public int numberOfPatients() {
		return patients.size();
	}

	public void transfer(Patient testPatient1, HospitalRoom transferTo) {
		// TODO Auto-generated method stub

	}

}
