package second_lesson;

import java.util.Scanner;

import static java.lang.String.format;

public class TaskEigth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время для определения сигнала светофора");
        int time = scanner.nextInt();
        String times = format("%d", time);
        String sentensGreen = "1, 2, 3, 6, 7, 8, 11, 12,13, 16, 17, 18, 21, 22, 23, 26, 27," +
                " 28, 31,32, 33, 36, 37, 38, 41, 42, 43, 46, 47, 58, 51, 52 ,53, 56, 57, 58";

        int index = sentensGreen.indexOf(times);
        System.out.println(time);
        if (index >= 1){
            System.out.println(index + "green");
        }else {
            System.out.println("red");
        }

    }
}
