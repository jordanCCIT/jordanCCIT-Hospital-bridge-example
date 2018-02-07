package high_st_hospital;

public class Receptionist extends Employee {

	private boolean isAnsweringPhones;

	public Receptionist(String empName, String empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
	}

	@Override
	public int getSalary() {

		return 45000;
	}

	public void answerPhones(Hospital testBuilding) {
		isAnsweringPhones = true;

	}

	public boolean getIsAnsweringPhones() {

		return isAnsweringPhones;
	}

	@Override
	public String toString() {
		return empName + "\t" + empNumber + "\t" + isAnsweringPhones;
	}
}
