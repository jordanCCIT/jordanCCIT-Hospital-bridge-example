package high_st_hospital;

public class WaitingRoom extends HospitalRoom {
	public void checkIn(Patient patient) {
		patients.add(patient);

	}

	@Override
	public int numberOfPatients() {
		// TODO Auto-generated method stub
		return 1;
	}

}
