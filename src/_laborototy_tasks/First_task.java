package _laborototy_tasks;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

public class First_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employees = 3;
        int[] salaryEmployees = new int [employees];
        for (int i = 0; i < salaryEmployees.length; i++){
            System.out.println("Введите зарплату  сотрудникa # " + i);
                salaryEmployees[i] = scanner.nextInt();
        }
        scanner.close();
        int max = Arrays.stream(salaryEmployees).max().getAsInt();
        int min = Arrays.stream(salaryEmployees).min().getAsInt();

        int dif = max-min;
        String maxString = "maximal";
        String minString = "minimal";
        String fmt = "the best: %s %s $ per/hour";
        String msgMax = format(fmt, minString,min);
        String msgMin = format(fmt, maxString, max);
        System.out.println(msgMin);
        System.out.println(msgMax);
        System.out.println("Different between more and cheaper salary was: " + dif+ "$ per/hour");


    }
}
