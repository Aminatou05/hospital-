package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoctorTest {

    Doctor underTest = new Doctor("I", "name", "specialist");
    Patient sickPatient = new Patient();

@Test
public void ShouldIncreasedHealthLevelOfPatientFrom10To20WhenProvidingCare() {
    underTest.careForPatient(sickPatient);
    int patienthealthLevel = sickPatient.getHealthLevel();
    assertEquals(20,patienthealthLevel);
}
@Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
    underTest.drawBlood(sickPatient);
    int bloodLevel =sickPatient.getBloodLevel();
    assertEquals(15,bloodLevel);

    }
    @Test
    public void shouldexpectASalaryOf90k(){
    int salary = underTest.calculatePay();
    assertEquals(90000,salary);
    }

}

