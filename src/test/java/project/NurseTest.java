package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse underTest = new Nurse("I", "name",5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10to15WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(15,healthLevel);
    }
    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int bloodLevel =sickPatient.getBloodLevel();
        assertEquals(15,bloodLevel);

    }
    @Test
    public void shouldexpectASalaryOf90k() {
        int salary = underTest.calculatePay();
        assertEquals(80000, salary);


    }}
