package first_lesson;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Task_third_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите предыдущее значение электросчетчика: ");
        int previousReading = scanner.nextInt();

        System.out.print("Введите текущее значение электросчетчика: ");
        int currentReading = scanner.nextInt();

        System.out.print("Введите количество проживающих: ");
        int numPeople = scanner.nextInt();

        // Расчет общего потребления
        int totalConsumption = currentReading - previousReading;

        // Пределы уровней потребления на одного человека
        int level1Limit = 115 * numPeople;
        int level2Limit = 190 * numPeople;

        // Тарифы
        double rate1 = 16.24;
        double rate2 = 21.8;
        double rate3 = 25.6;

        // Расчет потребления по уровням
        int level1Consumption = Math.min(totalConsumption, level1Limit);
        int level2Consumption = Math.min(Math.max(totalConsumption - level1Limit, 0), level2Limit - level1Limit);
        int level3Consumption = Math.max(totalConsumption - level2Limit, 0);

        // Расчет стоимости по уровням
        double costLevel1 = level1Consumption * rate1;
        double costLevel2 = level2Consumption * rate2;
        double costLevel3 = level3Consumption * rate3;

        // Общая сумма
        double totalCost = costLevel1 + costLevel2 + costLevel3;

        // Округление до ближайшего большего числа
        BigDecimal totalCostRounded = new BigDecimal(totalCost).setScale(0, RoundingMode.UP);

        // Вывод результатов
        System.out.println("\nВы потребили:");
        System.out.println("Первый уровень: " + level1Consumption + " кВт");
        System.out.println("Второй уровень: " + level2Consumption + " кВт");
        System.out.println("Третий уровень: " + level3Consumption + " кВт");
        System.out.println("Тариф: 16.24тг, 21.8тг, 25.6тг\n");

        System.out.println("К оплате:");
        System.out.printf("Первый уровень: %.1fтг%n", costLevel1);
        System.out.printf("Второй уровень: %.1fтг%n", costLevel2);
        System.out.printf("Третий уровень: %.1fтг%n", costLevel3);
        System.out.println("Общая сумма: " + totalCostRounded + "тг");
    }
}
