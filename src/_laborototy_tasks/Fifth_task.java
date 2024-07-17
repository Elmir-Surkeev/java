package _laborototy_tasks;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

public class Fifth_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = new int[4];
        for (int i=0; i < coordinates.length ; i++){
            System.out.println("Введите x1, x2, y1, y2)");
            coordinates[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(coordinates));
        if (coordinates[0] == coordinates[1] && coordinates[2] == coordinates[3]){
                System.out.println("Вы находитесь на точке деления");
        }
        if (coordinates[0] == coordinates[1] || coordinates[2] == coordinates[3]){
                System.out.println("Вы находитесь на границе");
        }
        int x1 = coordinates[0];
        int y1 = coordinates[1];
        int x2 = coordinates[2];
        int y2 = coordinates[3];
        String[] gps = new String[4];
        gps[0] = "Северозападной";
        gps[1] = "Северовосточной";
        gps[2] = "Югозападной";
        gps[3] = "Юговосточной";
        String fmt = "Ваш дом находится в %s Флэтлэндии";
        if (x2 < x1 && y2 > y1) {
            String format = format(fmt, gps[0]);
            System.out.println(format);
        } else if (x2 > x1 && y2 > y1) {
            String format = format(fmt, gps[1]);
            System.out.println(format);
        } else if (x2 < x1 && y2 < y1) {
            String format = format(fmt, gps[2]);
            System.out.println(format);
        } else if (x2 > x1 && y2 < y1) {
            String format = format(fmt, gps[3]);
            System.out.println(format);
        }
    }
}
