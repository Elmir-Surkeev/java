package first_lesson;

import javax.swing.*;
import java.util.Scanner;

public class Task_third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество живущих в доме");
        int peopleCount = scanner.nextInt();
        System.out.println("Введите предыдущее значенее");
        int previosSum = scanner.nextInt();
        System.out.println("Введите текущее значение");
        int nowSum = scanner.nextInt();
        scanner.close();
        int forPay = nowSum - previosSum;

        double rateFirst = 16.24;
        double rateSecond = 21.8;
        double rateThird = 25.6;
        System.out.println("Вы потребили");
        double each = (double) forPay /peopleCount;
        if (each < 115){
            System.out.println(each+ "= первый уровень потребления");
            double firstLevel = Math.round(each * rateFirst);
            System.out.println("По первом уровню потребления " + firstLevel);
        }else if (115 < each && each < 190){
            System.out.println(each +  "= второй уровень потребления");
            double secondLevel = Math.round(each * rateSecond);
            System.out.println("по второму уровню потребления " + secondLevel);
        }else if (each > 190){
            System.out.println(each +  "= третий уровень потребления");
            double thirdLevel = Math.round(each * rateThird);
            System.out.println("По третьему уровню потребления " + thirdLevel);
        }


    }
}
//System.out.println("Тарифы следующие:" +
//                           "  тариф на первый уровень =" + rateFirst +
//                           "  тариф на второй уровень = " + rateSecond+
//                           "  тариф на третий уровень = " + rateThird);