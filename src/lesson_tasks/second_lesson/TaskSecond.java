package second_lesson;

import java.util.Scanner;
//Задание второе.
//Даны две фамилии. Определить, какая из них длиннее. Вывести на отдельных строках фамилию
//и длину. Вывести, что такая-то фамилия длиннее чем другая.
public class TaskSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое имя");
        String firstName = scanner.next();
        System.out.println("Введите второе имя");
        String secondName = scanner.next();
        int firstCount = firstName.length();
        int secondCount = secondName.length();
        System.out.println(firstName +" " + firstCount);
        System.out.println(secondName + " " + secondCount);
        if (firstCount> secondCount){
            String format = "Фамилие %s длинее чем %s";
            String msg = String.format(format, firstName, secondName);
            System.out.println(msg);
        }else if (secondCount > firstCount){
            String format = "Фамилие %s длинее чем %s";
            String msg = String.format(format, secondName, firstName);
            System.out.println(msg);
        }
    }
}
