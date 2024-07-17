package _laborototy_tasks;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

public class Fouth_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age in days");
        int days = scanner.nextInt();
        scanner.close();
        int[] num = new int[3];
        num[0] = days/365;
        num[1] = days%365/30;
        num[2] = days%365%30;
        String fmt = "Years: %s, month: %s, days: %s";
        String msg = format(fmt, num[0], num[1], num[2]);
        System.out.println(msg);
    }
}
