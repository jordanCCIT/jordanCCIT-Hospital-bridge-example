package high_st_hospital;

public class Receptionist extends Employee {

    private boolean isAnsweringPhones;

    public Receptionist(String name, String employeeNumber){
        this.empName = name;
        this.empNumber = employeeNumber;
    }

    @Override
    public int getSalary() {
        return 45000;
    }

    public void answeringPhones(Hospital specificHospital){
        isAnsweringPhones = true;
    }

    public boolean getIsAnsweringPhones(){
        return isAnsweringPhones;
    }

    @Override
    public String toString(){
        return empName + "\t" + empNumber + "\t" + isAnsweringPhones;
    }
}
