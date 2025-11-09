import org.example.HRCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HRCalculatorTest {

    @Test
    public void testValidMaxHR() {
        assertEquals(195, HRCalculator.calculateMaxHR(25));
    }

    @Test
    public void testInvalidMaxHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(500));
    }

    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(-1));
    }

    @Test
    public void testWorkoutZones() {
        int age = 40;
        int maxHR = HRCalculator.calculateMaxHR(age);

        assertEquals("Warm-up", HRCalculator.getWorkoutZone(age, 80));
        assertEquals("Fat Burn", HRCalculator.getWorkoutZone(age, 100));
        assertEquals("Cardio", HRCalculator.getWorkoutZone(age, 120));
        assertEquals("Endurance", HRCalculator.getWorkoutZone(age, 140));
        assertEquals("Anaerobic", HRCalculator.getWorkoutZone(age, 160));
        assertEquals("Maximum", HRCalculator.getWorkoutZone(age, 170));
    }
}
