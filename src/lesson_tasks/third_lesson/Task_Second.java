package third_lesson;

import java.util.Scanner;

public class Task_Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для умножения");
        int number = scanner.nextInt();
        String fmt = "за %s, операций умножения ответ будет %s";
        for (int i = 0; i < 10; i++){
            int sum = i*number;
            System.out.printf((fmt) + "%n", i, sum);
        }

    }
}
