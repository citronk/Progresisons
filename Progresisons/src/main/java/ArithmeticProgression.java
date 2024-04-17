public class ArithmeticProgression extends SumOfProgression {
    public ArithmeticProgression(double firstMemberOfProgression, double permanent) {
        super(firstMemberOfProgression, permanent);
    }

    public double sumOfProgression(int countOfElements) { // сумма арифметической прогрессии
        double lastElement = firstMemberOfProgression + permanent * (countOfElements - 1); // считаем последний элемент, чтобы потом подставить в формулу суммы арифметической прогрессии
        return (firstMemberOfProgression + lastElement) * countOfElements / 2;
    }
}

//1 + 2 + 3 + 4 + 5 = 15