package first_lesson;
import java.util.Scanner;
import java.math.*;
public class Task_first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 21;
        System.out.println("Введите предыдущее значение");
        int previousCount = scanner.nextInt();
        System.out.println("Введите текущее значение");
        scanner.close();
        int nowCount = scanner.nextInt();

        int realCount = (nowCount - previousCount);

        if (realCount > 0){
            int forPay = realCount*rate;
            int realAfterTestCount = nowCount - previousCount;

            System.out.println("Вы потребили "+ realAfterTestCount + " кВт");
            System.out.println("Тариф "+ rate + " сом");
            System.out.println("К оплате "+forPay + " сом");
        }
        if (realCount < 0){
            int realAfterTestCount = previousCount-nowCount;
           int forPay = Math.abs(realCount*rate);

            System.out.println("Возможно вы ошиблись при введение, текущие ввели на прошедшие");
            System.out.println("Вы потребили "+ realAfterTestCount + " кВт");
            System.out.println("Тариф "+ rate + " сом");
            System.out.println("К оплате "+forPay + " сом");
        }
        if (realCount == 0){
            System.out.println("Вы не потребили электричества");
        }

    }
}
