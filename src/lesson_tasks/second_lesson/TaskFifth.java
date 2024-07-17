package second_lesson;
import java.util.Scanner;


//Задание пятое.
//Даны радиус круга и сторона квадрата. У какой фигуры площадь меньше? Вывести площади
//круга и квадрата, и строку, что площадь квадрата/круга меньше.

public class TaskFifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        int radius = scanner.nextInt();
        System.out.println("Введите сторону квадрата");
        int boxWall = scanner.nextInt();
        double p = 3.12;
        double SCircle = radius *p;
        int SBox = boxWall*boxWall;
        if (SCircle> SBox){
            String format = "Площадь круга радиусом %s, больше чем площадь квадрата %s ";
            String msg = String.format(format, radius, boxWall);
            System.out.println(msg);
        }else if (SCircle < SBox){
            String format = "Площадь квадрата сторонами %s, больше чем площадь круга с радиусом %s ";
            String msg = String.format(format, boxWall, radius);
            System.out.println(msg);
        }

    }
}
