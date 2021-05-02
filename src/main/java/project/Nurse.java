package project;

public class Nurse extends HospitalEmployee implements MedicalDuties{

    private int numPatients;

    public Nurse(String employeeNumber, String name, int numPatient) {
        super(employeeNumber, name);
        this.numPatients = numPatient;
    }
    @Override

    public void careForPatient(Patient sickPatient) {
        sickPatient.IncreaseHealthLevel(5);
    }
    @Override

    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodlevel(5);
    }
    @Override

    public int calculatePay() {
        return 80000;
    }
}
