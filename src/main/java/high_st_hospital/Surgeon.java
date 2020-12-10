package high_st_hospital;

public class Surgeon extends Doctor {
    private boolean isOperating;

    public Surgeon(String empName, String empNumber, String doctorSpecialty) {
        super(empName, empNumber, doctorSpecialty);
    }

    @Override
    public int getSalary(){
        return 120000;
    }

    public void operateOn(Patient patient){
        isOperating = true;
    }

    public boolean getIsOperating() {
        return isOperating;
    }

    @Override
    public String toString(){
        return empName + "\t" + empNumber + "\t" + this.doctorSpecialty + "\t" + isOperating;
    }
}
