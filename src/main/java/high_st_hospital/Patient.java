package high_st_hospital;

public class Patient {
    private String patientIdentifier;
    private int health;
    private int blood;

    public Patient(String patientIdentifier) {
        this.patientIdentifier = patientIdentifier;
    }

    public String getPatientIdentifier() {
        return patientIdentifier;
    }

    public int getBlood(){
        return blood;
    }

    public void improveHealth(int care){
        health+=care;
    }

    @Override
    public String toString(){
        return patientIdentifier;
    }

    public void giveBlood(int bloodDraw){
        blood-=bloodDraw;
    }
}
