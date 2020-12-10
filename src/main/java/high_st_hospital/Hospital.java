package high_st_hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private Map<String, Employee> hospitalEmployees = new HashMap<>();

    public void hire(Employee employee){
        hospitalEmployees.put(employee.empNumber, employee);
    }

    public void fire(Employee employee){
        hospitalEmployees.remove(employee.empNumber);
    }


    public int staffSize(){
        return hospitalEmployees.size();
    }

    public Collection<Employee> getAllEmployees(){
        return hospitalEmployees.values();
    }

    public String listOfAllEmployees(){
        String allEmployeesString = "";
        for(Employee i : getAllEmployees()){
            allEmployeesString += i.getEmpName() + "\n";
        }
        return allEmployeesString;
    }

    public String listOfAllSalaries(){
        String allSalariesString = "";
        for(Employee i : getAllEmployees()){
            allSalariesString += i.getEmpName() + " gets paid a salary of: " + i.getSalary() + " per year \n";
        }
        return allSalariesString;
    }

    public String listOfAllBloodDrawers(){
        String allBloodDrawers = "";
        for(Employee i: getAllEmployees()){
            if(i instanceof MedicalDuties){
                allBloodDrawers += i.getEmpName() + " is capable of drawing blood. \n";
            }
        }
        return allBloodDrawers;
    }

}
