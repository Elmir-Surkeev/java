package first_lesson;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Cat cat = new Cat("Рыжик", 3, 50);

        Food[] foods = {
                new Food("Дать яблоко", 10),
                new Food("Дать рыбу", 30),
                new Food("Дать куриную грудку", 40)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите еду:");
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + ". " + foods[i].name);
        }

        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= foods.length) {
            cat.feed(foods[choice - 1]);
            System.out.println("Уровень сытности кота равен : " + cat.satietyLevel);
        } else {
            System.out.println("Введите 1.2.3");
        }

        scanner.close();
    }
}

class Cat {
    String name;
    int age;
    int satietyLevel;
    Cat(String name, int age, int satietyLevel) {
        this.name = name;
        this.age = age;
        this.satietyLevel = satietyLevel;
    }

    void feed(Food food) {
        this.satietyLevel += food.satietyValue;
    }
}

class Food {
    String name;
    int satietyValue;

    Food(String name, int satietyValue) {
        this.name = name;
        this.satietyValue = satietyValue;
    }
}
