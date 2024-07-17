package fifth_lesson_part2;

import fifth_lesson.fifth_lesson_part2.Food;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int initialSatiety = random.nextInt(31) + 50;
        int desiredSatiety = 100;

        if (desiredSatiety < initialSatiety) {
            System.out.println("Коту пора сесть на диету. Желаемый уровень сытости ниже начального.");
            return;
        }

        Cat cat = new Cat("Рыжик", initialSatiety, 40);
        Scanner scanner = new Scanner(System.in);

        boolean isThirsty = false;

        while (cat.satietyLevel < desiredSatiety && cat.satietyLevel < 100) {
            System.out.println("Уровень сытности кота: " + cat.satietyLevel);
            System.out.println("Уровень жажды кота: " + cat.thirstLevel);

            if (cat.thirstLevel >= 70) {
                System.out.println("Кот очень жаждет! Коту есть нельзя. Дайте коту воду или молоко.");
                isThirsty = true;
            } else {
                isThirsty = false;
            }

            if (isThirsty) {
                System.out.println("Выберите что дать коту:");
                System.out.println("1. Вода, +0 к сытности, -30 к жажде");
                System.out.println("2. Молоко, +10 к сытости, -30 к жажде");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        cat.feed(new Food("Вода", 0, -30));
                        break;
                    case 2:
                        cat.feed(new Food("Молоко", 10, -30));
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        continue;
                }
            } else {
                System.out.println("Выберите что дать коту:");
                System.out.println("1. Корм вискас +1");
                System.out.println("2. Рыбу +20");
                System.out.println("3. Куринную грудку +40");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        cat.feed(new Food("Вискас", 1, 20));
                        break;
                    case 2:
                        cat.feed(new Food("Рыба", 20, 20));
                        break;
                    case 3:
                        cat.feed(new Food("Куриная грудка", 40, 20));
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        continue;
                }
            }

            System.out.println("Текущее состояние кота: Сытость - " + cat.satietyLevel + ", Жажда - " + cat.thirstLevel);
        }

        if (cat.satietyLevel >= 95) {
            System.out.println("Кот доволен!");
        } else if (cat.satietyLevel > desiredSatiety) {
            System.out.println("У кота живот переполнен!");
        }

        scanner.close();
    }
}