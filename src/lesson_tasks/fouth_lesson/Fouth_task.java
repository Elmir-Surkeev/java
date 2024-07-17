package fouth_lesson;

import java.util.Scanner;

public class Fouth_task {
    public static void main(String[] args) {
        System.out.println("Введите день недели 1-7");

        int day = getDay();
//        if (day ==0){getDay();}
    }
    static int getDay(){
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.close();
        String[] raspisanie = new String[7];
        raspisanie[0] = "   :Выгулять собаку 08:00 ";
        raspisanie[1] = "   :Работа 10:00";
        raspisanie[2] = "   :Уроки IT 19:00";
        raspisanie[3] = "   :Отдых 14:00";
        switch (day){
            case 1:
                System.out.println("Hey monday");
                System.out.println(raspisanie[2]);
                System.out.println(raspisanie[3]);
                break;
            case 2:
                System.out.println("Hey tuesday");
                System.out.println(raspisanie[1]);
                break;
            case 3:
                System.out.println("Hey wednesdey");
                System.out.println(raspisanie[0]);
                System.out.println(raspisanie[1]);
                break;
            case 4:
                System.out.println("Hey thurday");
                System.out.println(raspisanie[2]);
                System.out.println(raspisanie[0]);
                break;
            case 5:
                System.out.println("Hey friday");
                System.out.println(raspisanie[1]);
                System.out.println(raspisanie[2]);
                break;
            case 6:
                System.out.println("Hey saturday");
                System.out.println(raspisanie[0]);
                System.out.println(raspisanie[4]);
                break;
            case 7:
                System.out.println("Hey Sunday");
                System.out.println(raspisanie[4]);
                System.out.println(raspisanie[2]);
                break;
            default:
                System.out.println("You enter unreal number");
                getDay();
        }
        return day;
    }
}
