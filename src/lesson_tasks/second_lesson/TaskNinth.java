package second_lesson;

import java.util.Scanner;

import static java.lang.String.format;

public class TaskNinth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1188");
        int count = scanner.nextInt();
        if (count > 1188){
            System.out.println("Error, your number more than needed");
        }else if (count < 1){
            System.out.println("Error, your number less than needed");
        }else {
            int year = count/12;
            int month = count%12;
            String ss = "s";
            if (year>= 1 && count/12==0){
                String format = "%s есть %s %s ";
                String msg = format(format, count, year, ss);
                System.out.println(msg);
            }else if  (year> 1 ){
                String format = "%s year%s %s, и %s month%s ";
                String msg = format(format, count, ss, year, month, ss);
                System.out.println(msg);
            }else {
                String format = "%s month %s year, and %s  month%s ";
                String msg = format(format, count, year, month, ss);
                System.out.println(msg);
            }
//            System.out.println(year);
//            System.out.println(month);
        }
    }
}
