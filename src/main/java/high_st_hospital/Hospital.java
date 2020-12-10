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



    public int staffSize(){
        return hospitalEmployees.size();
    }

    public Collection<Employee> getAllEmployees(){
        return hospitalEmployees.values();
    }
}
