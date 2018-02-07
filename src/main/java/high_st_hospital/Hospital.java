package high_st_hospital;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hospital {
	private HashMap<String, Employee> hospitalEmployees = new HashMap<>();

	public void hire(Employee newHire) {
		hospitalEmployees.put(newHire.empNumber, newHire);

	}

	public int staffSize() {

		return hospitalEmployees.size();
	}

	public String listEmployees() {
		String employeeList = "";
		for (Entry<String, Employee> employee : hospitalEmployees.entrySet()) {
			employeeList += employee.toString() + "\n";
		}
		return employeeList;

	}

}
