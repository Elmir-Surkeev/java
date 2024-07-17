package third_lesson;

import java.util.Scanner;

public class TaskFouth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 15;

        if (n > 15) {
            System.out.println("Количество дней не должно превышать 15.");
            return;
        }

        // Объявление массива для хранения осадков
        int[] rainfall = new int[n];

        // Ввод данных о количестве осадков
        System.out.println("Введите количество осадков (от 0 до 50) за каждый день:");
        for (int i = 0; i < n; i++) {
            System.out.print("День " + (i + 1) + ": ");
            rainfall[i] = scanner.nextInt();

            // Проверка на корректность введенного значения
            if (rainfall[i] < 0 || rainfall[i] > 50) {
                System.out.println("Количество осадков должно быть от 0 до 50.");
                return;
            }
        }

        // Вычисление среднего количества осадков
        int totalRainfall = 0;
        for (int i = 0; i <n ; i++) {
            totalRainfall += rainfall[i];
        }

        double averageRainfall = (double) totalRainfall / n;

        // Вывод результата
        System.out.println("Среднедневное количество осадков: " + averageRainfall);
    }
}
