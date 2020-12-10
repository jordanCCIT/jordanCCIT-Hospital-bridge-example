package high_st_hospital;

public class Janitor extends Employee {
    private boolean isSweeping = false;

    public Janitor(String empName, String empNumber) {
        this.empName = empName;
        this.empNumber = empNumber;
    }

    @Override
    public int getSalary() {
        return 40000;
    }

    public void sweepFloors(Hospital testBuilding) {
        this.isSweeping = true;
    }

    public boolean getIsSweeping() {
        return isSweeping;
    }

}
