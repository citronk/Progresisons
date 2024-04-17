import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {

    @org.junit.jupiter.api.Test
    void sumOfProgression() {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(1, 1);
        assertEquals(arithmeticProgression.sumOfProgression(5), 15); // 1 + 2 + 3 + 4 + 5 = 15
        ArithmeticProgression arithmeticProgression1 = new ArithmeticProgression(1.5, 3);
        assertEquals(arithmeticProgression1.sumOfProgression(7), 73.5); // 1.5 + 4.5 + 7.5 + 10.5 + 13.5 + 16.5 + 19.5 = 73.5
    }
}