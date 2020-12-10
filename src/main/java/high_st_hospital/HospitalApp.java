package high_st_hospital;

public class HospitalApp {
	public static void main(String[] args) {
		Hospital myHospital = new Hospital();

		myHospital.hire(new Doctor("Bob","1111","Heart"));
		myHospital.hire(new Nurse("Janet","1112"));
		myHospital.hire(new Surgeon("Strange","1113","Brain"));
		myHospital.hire(new Janitor("John","1114"));

		System.out.println("Here are the Employees in High Street Hospital: ");
		System.out.println(myHospital.listOfAllEmployees());
		System.out.println();

		System.out.println("Here are all the salaries of High Street Hospital: ");
		System.out.println(myHospital.listOfAllSalaries());
		System.out.println();

		System.out.println("Here are the Employees that can draw blood: ");
		System.out.println(myHospital.listOfAllBloodDrawers());
	}
}
