package high_st_hospital;

public class Doctor extends Employee implements MedicalDuties {

	protected String doctorSpeciality;

	public Doctor(String empName, String empNumber, String speciality) {

		this.empName = empName;
		this.empNumber = empNumber;
		this.doctorSpeciality = speciality;
	}

	@Override
	public int getSalary() {

		return 90000;
	}

	public String getSpecialty() {

		return doctorSpeciality;
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.improveHealth(20);

	}

	@Override
	public void drawBloods(Patient patient) {
		patient.giveBloods(5);

	}

	@Override
	public String toString() {
		return empName + "\t" + empNumber + "\t" + doctorSpeciality;
	}
}
