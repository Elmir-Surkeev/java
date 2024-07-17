package _laboratory_tasks_2;

import java.util.Arrays;
import java.util.Scanner;

public class Zero_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cornersLanes = getGPS();
//        int square = getSquare(scanner, cornersLanes);
        //System.out.println(square);
        boolean result = willBrickPass(scanner, cornersLanes);
        System.out.println(result ? "Кирпич пройдет через отверстие." : "Кирпич не пройдет через отверстие.");
    }
//
//    private static int getSquare(Scanner scanner, int[] cornerLanes) {
//        int a = cornerLanes[0];
//        int b = cornerLanes[1];
//        int c = cornerLanes[2];
//        int square = a * b * c;
//        return square;
//    }

    private static int[] getGPS() {
        Scanner scanner = new Scanner(System.in);
        int[] cornersLane = new int[5];
        int count = 0;
        for (int i = 0; i < cornersLane.length; i++) {
            System.out.println("Введите a, b, c, x, y по следующей таблице");
            System.out.println("a=1, b=2, c=3, x=4, y=5");
            count++;
            System.out.println("Введите a, b, c, x, y. Введите число " + count);
            cornersLane[i] = scanner.nextInt();
            System.out.println("a=1, b=2, c=3, x=4, y=5");
            System.out.println(Arrays.toString(cornersLane));
        }
        scanner.close();
        return cornersLane;
    }

    private static boolean willBrickPass(Scanner scanner, int[] cornersLane) {
        int a = cornersLane[0];
        int b = cornersLane[1];
        int c = cornersLane[2];
        int x = cornersLane[3];
        int y = cornersLane[4];

        return (a <= x && b <= y) || (a <= y && b <= x) ||
                (a <= x && c <= y) || (a <= y && c <= x) ||
                (b <= x && c <= y) || (b <= y && c <= x);
    }
}
