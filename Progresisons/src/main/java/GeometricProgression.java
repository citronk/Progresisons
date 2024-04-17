public class GeometricProgression extends SumOfProgression {
    public GeometricProgression(double firstMemberOfProgression, double permanent) {
        super(firstMemberOfProgression, permanent);
    }

    public double sumOfProgression(int countOfElements) { // сумма геометрической прогрессии
        if (permanent != 1) { // если постоянное отношение не равно 1, то считаем по формуле (знаменатель не обнуляется)
            double lastElement = firstMemberOfProgression * Math.pow(permanent, countOfElements - 1); // // считаем последний элемент, чтобы потом подставить в формулу суммы геометрической прогрессии
            return (firstMemberOfProgression - lastElement * permanent) / (1 - permanent);
        }
        else { // если постоянное отношение равно 1, то знаменатель обнуляется. Поэтому рассмотрим, что будет происходить:
                        // Например, пусть первый член прогрессии = 2, постоянное отношение = 1, количество элементов = 5. Тогда получится: 2 + 2 + 2 + 2 + 2 = 10, или 2 * 5, то есть количество элементов * первый элемент (так как элементы меняться не будут из-за постоянного отношения, равного 1)
            return firstMemberOfProgression * countOfElements;
        }
    }
}