package fouth_lesson;

import java.util.Scanner;

public class FouthReal_Task {
    enum Day {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
        private final int value;

        Day(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }

        public static Day fromValue(int value) {
            for (Day day : Day.values()) {
                if (day.getValue() == value) {
                    return day;
                }
            }
            return null;  // Возвращаем null, если значение не соответствует ни одному дню недели
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер дня недели 1=Понедельник, 2=Вторник и тп ");
        int dayNumber = scanner.nextInt();

        Day day = Day.fromValue(dayNumber);
        if (day != null) {
            printDay(day);
        } else {
            System.out.println("Неверный номер дня недели. Пожалуйста, введите число от 1 до 7.");
        }
    }

    private static void printDay(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Понедельник: Прогулка с собакой, работа");
                break;
            case TUESDAY:
                System.out.println("Вторник: Спорт, встретиться с друзьями, учеба бэкенд");
                break;
            case WEDNESDAY:
                System.out.println("Среда: Работа, учеба БЭК.");
                break;
            case THURSDAY:
                System.out.println("Четверг: чтение, очередь уборки по квартире");
                break;
            case FRIDAY:
                System.out.println("Пятница: Работа, Вечеринка с друзьями.");
                break;
            case SATURDAY:
                System.out.println("Суббота: Созвониться с мамой, учеба");
                break;
            case SUNDAY:
                System.out.println("Воскресенье: отдых.");
                break;
            default:
                System.out.println("Неверный день.");
        }
    }
}
