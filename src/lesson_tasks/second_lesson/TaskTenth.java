package second_lesson;

import java.util.Scanner;

import static java.lang.String.format;

public class TaskTenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter adress");
        String adress = scanner.next();
        System.out.println("Enter birthYear");
        int birthYear = scanner.nextInt();
        name = name.toUpperCase().strip();
        surname = surname.toUpperCase().strip();
        adress = adress.strip();
        int year = 2019 - birthYear;
        String format = "Your name is %s %s. And you %s years old, and you are from %s";
        String msg = format(format, name, surname, year, adress);
        System.out.println(msg);
    }
}
