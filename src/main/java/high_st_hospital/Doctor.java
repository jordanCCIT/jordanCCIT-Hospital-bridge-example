package high_st_hospital;

public class Doctor extends Employee {

	private String doctorSpeciality;

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

}
