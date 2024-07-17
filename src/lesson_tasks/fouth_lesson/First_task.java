package fouth_lesson;

import java.util.Scanner;

public class First_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getIntOfSide(scanner, "First parametr");
        int b = getIntOfSide(scanner, "Second parametr");
        int c = getIntOfSide(scanner, "Third parametr");
        scanner.close();
        int more = startComprarisons(a,b,c);
        System.out.println("The more big parametr");
        System.out.println(more);
    }
    static int startComprarisons(int a, int b, int c){
        int[] all = new int[3];
        all[0] = a;
        all[1] = b;
        all[2] = c;
        int max = Integer.MIN_VALUE;
        for (int el:all){
            max = Math.max(max, el);
        }
        return max;
    }
    static int getIntOfSide(Scanner scanner, String comment){
        int count = 0;
        while (count<=0){
            System.out.println(comment);
            String input = scanner.nextLine();
            count = (int) Double.parseDouble(input);
        }
        return count;
    }
}

