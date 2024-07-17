package second_lesson;

import java.util.Scanner;

public class TaskTwelth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Введите символ + или plus, - или minus, * multi, / div, % mod");
        String operator = scanner.next();
        scanner.close();
        if (operator.equals("+") || operator.equalsIgnoreCase("plus")){
            int sum =num1 + num2;
            System.out.println(sum);
        }
        else if (operator.equals("-") || operator.equalsIgnoreCase("minus")){
            int sum =num1 - num2;
            System.out.println(sum);
        }
        else if (operator.equals("*") || operator.equalsIgnoreCase("multi")){
            int sum =num1 * num2;
            System.out.println(sum);
        }
        else if (operator.equals("/") || operator.equalsIgnoreCase("div")){
            int sum =num1/ num2;
            System.out.println(sum);
        }
        else if (operator.equals("%") || operator.equalsIgnoreCase("mod")){
            int sum =num1 % num2;
            System.out.println(sum);
        }
        else {
            System.out.println("Введены некорекктные данные");
        }

    }
}
