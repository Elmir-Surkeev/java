package first_lesson;

import java.util.Scanner;
//Как получить уровни?
//Первый уровень - 115 * Количество людей
//Второй уровень - 75 * Количество людей
//Киловатты отнимаешь от этих уровней и получаешь третий уровень
public class Task_third_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество живущих в доме");
        int peopleCount = scanner.nextInt();
        System.out.println("Введите предыдущее значенее");
        int previosSum = scanner.nextInt();
        System.out.println("Введите текущее значение");
        int nowSum = scanner.nextInt();
        scanner.close();
        double rateFirst = 16.24;
        double rateSecond = 21.8;
        double rateThird = 25.6;
        double firstLevel = 115*peopleCount;
        double secondLevel =   75*peopleCount;
        double thirdLevel = 191*peopleCount;
        System.out.println("Вы потребили");
        System.out.println("Первый уровень " + firstLevel + " кВт");
        System.out.println("Второй уровень " + secondLevel + " кВт");
        System.out.println("Третий уровень " + thirdLevel + " кВт");
        double first_sum = firstLevel * rateFirst;
        double second_sum = secondLevel * rateSecond;
        double third_sum = thirdLevel * rateThird;
        double all_sum = first_sum + second_sum + third_sum;
        System.out.println("Вы потребили:");
        System.out.println("Первый уровень " + Math.round(first_sum) + " сом");
        System.out.println("Второй уровень " + Math.round(second_sum) + " сом");
        System.out.println("Третий уровень " + Math.round(third_sum) + " сом");
        System.out.println("Общая сумма потребления " + Math.round(all_sum) + " сом");

    }
}
