package high_st_hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	private Map<String, Employee> hospitalEmployees = new HashMap<>();

	public void hire(Employee newHire) {
		hospitalEmployees.put(newHire.empNumber, newHire);

	}

	public void fire(String employeeNumber) {
		hospitalEmployees.remove(employeeNumber);
	}

	public Collection<Employee> getAllEmployees() {
		return hospitalEmployees.values();
	}

	public int staffSize() {
		return hospitalEmployees.size();
	}

	public String listOfAllEmployees() {
		String allEmployeesString = "";
		Collection<Employee> allEmployees = new ArrayList<>(hospitalEmployees.values());
		for (Employee employee : allEmployees) {
			allEmployeesString += employee + "\n";
		}
		return allEmployeesString;
	}

	public String listOfAllSalaries() {
		String allSalariesString = "";
		Collection<Employee> allEmployees = new ArrayList<>(hospitalEmployees.values());
		for (Employee employee : allEmployees) {
			allSalariesString += employee.getName() + " gets paid a salary of " + employee.getSalary() + " per year.\n";
		}
		return allSalariesString;
	}

	public String listofBloodDrawers() {
		String allBloodDrawersString = "";

		for (Employee employee : hospitalEmployees.values()) {
			if (employee instanceof MedicalDuties) {
				allBloodDrawersString += employee.getName() + " is capable of drawing blood.\n";
			}
		}
		return allBloodDrawersString;

	}

}
