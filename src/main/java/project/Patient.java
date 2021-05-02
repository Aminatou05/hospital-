package project;

public class Patient {

    private int HealthLevel;
    private int bloodLevel;



    public int getHealthLevel() {
        return HealthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }


    public Patient() {
        HealthLevel = 10;
        bloodLevel = 20;

    }
    //overloadedconstructors are very popular code blocks to overload)

    public Patient(int healthLevel, int bloodLevel) {
        this.HealthLevel = healthLevel;
        this.bloodLevel = bloodLevel;

    }




    public void IncreaseHealthLevel(int healthIncreaseAmount) {
        HealthLevel += healthIncreaseAmount;
    }


    public void decreaseBloodlevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}




