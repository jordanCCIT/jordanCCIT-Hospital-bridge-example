package high_st_hospital;

public abstract class Employee {

	protected String empName;
	protected String empNumber;

	public String getName() {

		return empName;
	}

	public String getNumber() {

		return empNumber;
	}

	public abstract int getSalary();

	public String salaryInfo() {
		return "This employee's salary is " + getSalary();
	}

	@Override
	public String toString() {
		return empName;
	}
}