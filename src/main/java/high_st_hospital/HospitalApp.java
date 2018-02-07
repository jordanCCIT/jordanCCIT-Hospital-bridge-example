package high_st_hospital;

public class HospitalApp {

	public static void main(String[] args) {
		Hospital myHospital = new Hospital();
		myHospital.hire(new Doctor("Phil", "1111", "General"));
		myHospital.hire(new Surgeon("Hawkeye", "1112", "Heart"));
		myHospital.hire(new Nurse("Jackie", "1121"));
		myHospital.hire(new Receptionist("Alice", "1131"));
		myHospital.hire(new Janitor("Ash", "1141"));
		myHospital.hire(new EmergencyDispatcher("Tina", "1161"));

		System.out.println("Here are the employees at myHospital:");
		System.out.println(myHospital.listOfAllEmployees());
		System.out.println();

		System.out.println("Here are the salaries at myHospital:");
		System.out.println(myHospital.listOfAllSalaries());
		System.out.println();

		System.out.println("Some employees can draw blood:");
		System.out.println(myHospital.listofBloodDrawers());
	}
}
