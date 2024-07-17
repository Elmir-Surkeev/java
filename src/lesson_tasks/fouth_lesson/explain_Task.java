package fouth_lesson;

import java.nio.DoubleBuffer;
import java.util.Scanner;

public class explain_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getLengthOfSide(scanner, "Длина строны А");
        double b = getLengthOfSide(scanner,"Длина строны Б");
        double c = getLengthOfSide(scanner,"Длина строны В");
        scanner.close();
        double p = a+b+c;
        System.out.println(p);

    }
    static double getLengthOfSide(Scanner scanner, String prompt){
        double a = 0;
        while (a<=0){
            System.out.println(prompt);
            String input = scanner.nextLine();
            a = Double.parseDouble(input);
            if (a <= 0){
                System.out.println("Длина стороны должна быть больше нуля");
            }
        }
        return a;
    }
}
