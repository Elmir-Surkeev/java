package third_lesson;
public class Task_Six {
    public static void main(String[] args) {
        double[] masses = {
                82.5, 95, 101.2, 120.3, 85.7,
                60.8, 110.5, 88.4, 92.3, 105,
                99.9, 102.1, 65.5, 98.2, 80,
                115.3, 70.6, 78.4, 108.8, 87.2,
                102.7, 75.3, 90.1, 99, 103.6};
        double fullMassSum = 0;
        int bigCount = 0;
        double otherMassSum = 0;
        int smallCount = 0;

        for (double oneHuman : masses) {
            if (oneHuman > 100) {
                fullMassSum += oneHuman;
                bigCount++;
            } else {
                otherMassSum += oneHuman;
                smallCount++;
            }
        }

        double fullAverage = fullMassSum / bigCount;
        double otherAverage = otherMassSum / smallCount;

        System.out.println("Средняя масса полных людей больше > 100 кг: " + fullAverage);
        System.out.println("Средняя масса остальных людей больше < или = 100 кг): " + otherAverage);
    }
}

