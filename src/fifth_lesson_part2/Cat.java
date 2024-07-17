package fifth_lesson_part2;

import fifth_lesson.fifth_lesson_part2.Food;

public class Cat {
    String name;
    int satietyLevel;
    int thirstLevel;

    Cat(String name, int satietyLevel, int thirstLevel) {
        this.name = name;
        this.satietyLevel = satietyLevel;
        this.thirstLevel = thirstLevel;
    }

    void feed(Food food) {
        if (thirstLevel >= 100) {
            System.out.println("Кот слишком жаждет, чтобы есть. Дайте ему сначала воды.");
            return;
        }

        satietyLevel += food.satietyValue;
        thirstLevel += food.thirstEffect;

        if (thirstLevel < 0) thirstLevel = 0;
        if (thirstLevel > 100) thirstLevel = 100;
    }
}
