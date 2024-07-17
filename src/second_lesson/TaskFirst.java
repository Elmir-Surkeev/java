package second_lesson;

import java.util.Scanner;//Задание первое.
//Дано название футбольного клуба. Определить и вывести на экран количество символов в
//нем. Вывести это же название в полностью заглавных буквах, и полностью строчных.

public class TaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название клуба");
        String nameFootballClub = scanner.next();
        int count = nameFootballClub.length();
        String format = "В футбольном клубе %s есть %s символов";
        String msg = String.format(format, nameFootballClub, count);
        System.out.println(msg);
        System.out.println(nameFootballClub.toUpperCase());
        System.out.println(nameFootballClub.toLowerCase());
        scanner.close();
    }
}
