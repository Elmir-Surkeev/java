package fouth_lesson;

import java.sql.ResultSet;
import java.util.Scanner;

public class Third_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result result = getNumbers();
        int count = getcount(result);
        int totalSum = getsumNumbers(result);
        double average = averageNumbers(result);

        System.out.println("Количество введеных чисел " + totalSum);
        System.out.println("сумма введеных чисел " + totalSum);
        System.out.println("среднее ариф чисел " + average);
    }

    static Result getNumbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Введите число (0 для завершения): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            count++;
            sum += number;  // Ошибка была здесь: заменено `sum =+ number` на `sum += number`
        }
        return new Result(count, sum);
    }
    private static int getcount(Result result) {
        return result.count;
    }

    private static int getsumNumbers(Result result) {
        return result.sum;
    }

    static double averageNumbers(Result result){
        int count = getcount(result);
        if (count ==0){
            return 0;
        }
        return (double)  getsumNumbers(result)/count;

    }
    static class Result{
        int count;
        int sum;
        Result(int count, int sum){
            this.count = count;
            this.sum = sum;

        }
    }

}
