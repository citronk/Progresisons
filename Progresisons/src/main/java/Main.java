public class Main {
    public static void main(String[] args) {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(1, 1);
        System.out.println(arithmeticProgression.sumOfProgression(11));
        GeometricProgression geometricProgression = new GeometricProgression(1, 2);
        System.out.println(geometricProgression.sumOfProgression(5));
    }
}

// 0.5 + 1 + 1.5 + 2 + 2.5 = 7.5
// 1 + 2 + 4 + 8 + 16 = 31
// 1 2