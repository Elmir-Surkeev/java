package second_lesson;

import java.util.Scanner;
//Задание четвертое.
//Известны две скорости: одна в километрах в час, другая — в метрах в секунду. Какая из
//скоростей больше? Вывести на экран, что такая-то скорость больше чем другая.

public class TaskFouth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость в час");
        int kmHour = scanner.nextInt();
        System.out.println("Введите скорость в сек");
        double metrSek = scanner.nextDouble();
        int solveKmMetr = kmHour*1000;
        if (solveKmMetr> metrSek){
            System.out.println("Скорость км в час быстрее");
        }else if (solveKmMetr<metrSek){
            System.out.println("Скорость сек в час быстрее");
        }else if (solveKmMetr == metrSek){
            System.out.println("Они равны");
        }

    }
}
