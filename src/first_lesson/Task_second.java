package first_lesson;


import java.util.Scanner;
import java.util.Locale;
public class Task_second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.FRANCE);
        System.out.println("Решаем ax^2+bx+c=0");
        System.out.println("Введите значение a");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c");
        double c = scanner.nextDouble();
        double discriminant = b*b - 4*a*c;

        if (discriminant>0){
            double firstRoot = (-b+ Math.sqrt(discriminant)) / (2*a);
            double secondRoot = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("Первый корень уравнения равен " + firstRoot);
            System.out.println("Второй корень уравнения равен " + secondRoot);
        }
        if (discriminant == 0){
            double firstRoot = -b / (2*a);
            System.out.println("Дискриминант равен 0, имеет один корень" + firstRoot);
        }
        if (discriminant < 0){
            System.out.println("Дискриманант меньше нуля, корня не имеет ");
        }


    }
}
