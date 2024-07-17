package second_lesson;

import java.util.Scanner;

import static java.lang.Math.sin;

public class TaskThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value x");
        int x = scanner.nextInt();
        double y ;
        if (x>0){
            y = sin(x*x);
        }else{
            y = 1-2*sin(x*x);
        }
        System.out.println("The value of y is: " + y);
    }
}
