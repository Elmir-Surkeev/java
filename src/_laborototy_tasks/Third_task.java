package _laborototy_tasks;

import java.util.Scanner;

public class Third_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter our level <= 12");
        int level = scanner.nextInt();
        System.out.println("Enter human level <=" + level );
        int human = scanner.nextInt();
        String hash = null;
        for (int i=0; i <= level; i++){
            for (int j = 0; j < i; j++) {
                hash = "#".repeat(i);
            }
            if (i == human){
                System.out.println("|@"+  hash);
            }
            System.out.println("|"+  hash);
        }

    }
}
