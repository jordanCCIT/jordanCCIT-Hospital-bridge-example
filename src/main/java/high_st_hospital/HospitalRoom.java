package high_st_hospital;

import java.util.HashMap;
import java.util.Map;

public abstract class HospitalRoom {

	protected Map<String, Patient> roomOccupants = new HashMap<String, Patient>();

	public abstract void checkIn(Patient patient);

	public abstract int numberOfPatients();

	public abstract void transfer(Patient testPatient1, HospitalRoom transferTo);

}
