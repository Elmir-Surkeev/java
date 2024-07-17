package _laborototy_tasks;

import java.util.Scanner;

public class Second_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter guest count");
        int countGuest = scanner.nextInt();
        scanner.close();
        int squareCake = 200;
        double divide = squareCake/countGuest;
        System.out.println(divide);
    }
}
