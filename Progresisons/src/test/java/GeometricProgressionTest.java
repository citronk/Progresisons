import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {

    @Test
    void sumOfProgression() {
        GeometricProgression geometricProgression = new GeometricProgression(1, 2);
        assertEquals(geometricProgression.sumOfProgression(5), 31); // 1 + 2 + 4 + 8 + 16 = 31
        GeometricProgression geometricProgression1 = new GeometricProgression(2, 1);
        assertEquals(geometricProgression1.sumOfProgression(5), 10); // 2 * 5 = 10
    }
}