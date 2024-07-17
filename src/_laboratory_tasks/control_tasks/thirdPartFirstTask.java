package control_tasks;

import java.util.Random;
import java.util.Scanner;

public class thirdPartFirstTask {
    public static void main(String[] args) {
        firstGame();
    }
    public static void firstGame() {
        int countHumanWin = 0;
        int countComputerWin = 0;
        int differenceCount;

        for (int i = 0; i <= 3; i++) {
            int[] results = oneGame();
            int countComputer = results[0];
            int countHuman = results[1];

            if (countComputer > countHuman) {
                differenceCount = countComputer - countHuman;
                countComputerWin++;
                System.out.println("Computer is ahead by " + differenceCount + " points");
            } else if (countComputer < countHuman) {
                differenceCount = countHuman - countComputer;
                countHumanWin++;
                System.out.println("Human is ahead by " + differenceCount + " points");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("------Current score------");
            System.out.println("User: " + countHumanWin);
            System.out.println("Computer: " + countComputerWin);
        }
    }

    public static int[] oneGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int print = 1;

        int sumCoins = throwTheDice(random);
        int enteredNumber = askPrint(scanner, print, 0, sumCoins);
        print = 2;
        System.out.println("Сумма очков " + sumCoins);

        int countHuman = askPrint(scanner, print, enteredNumber, sumCoins);
        printHash(countHuman);

        int countComputer = random.nextInt(11) + 2;
        countComputer = askPrint(scanner, print, countComputer, sumCoins);
        printHash(countComputer);

        countMore(countComputer, countHuman);

        System.out.println("Congratulations!!!");

        return new int[]{countComputer, countHuman};
    }

    private static void countMore(int countComputer, int countHuman) {
        int differenceCount;
        if (countComputer > countHuman) {
            differenceCount = countComputer - countHuman;
            System.out.println("С разницей в " + differenceCount + " побеждает компьютер");
        } else if (countComputer < countHuman) {
            differenceCount = countHuman - countComputer;
            System.out.println("С разницей в " + differenceCount + " побеждает человек");
        } else {
            System.out.println("Undefined please wait");
        }
    }

    private static void printHash(int lastPrint) {
        System.out.println("------------------------------");
        System.out.println("  | Predicted " + lastPrint + " |");
        switch (lastPrint) {
            case 1:
                printDiceFace(new String[]{
                        "     ",
                        "  *  ",
                        "     "
                });
                break;
            case 2:
                printDiceFace(new String[]{
                        "*    ",
                        "     ",
                        "    *"
                });
                break;
            case 3:
                printDiceFace(new String[]{
                        "*    ",
                        "  *  ",
                        "    *"
                });
                break;
            case 4:
                printDiceFace(new String[]{
                        "*   *",
                        "     ",
                        "*   *"
                });
                break;
            case 5:
                printDiceFace(new String[]{
                        "*   *",
                        "  *  ",
                        "*   *"
                });
                break;
            case 6:
                printDiceFace(new String[]{
                        "*   *",
                        "*   *",
                        "*   *"
                });
                break;
            case 7:
                printDiceFace(new String[]{
                        "*   *",
                        "* * *",
                        "*   *"
                });
                break;
            case 8:
                printDiceFace(new String[]{
                        "* * *",
                        "*   *",
                        "* * *"
                });
                break;
            case 9:
                printDiceFace(new String[]{
                        "* * *",
                        "* * *",
                        "* * *"
                });
                break;
            case 10:
                printDiceFace(new String[]{
                        "* * * *",
                        "*     *",
                        "* * * *"
                });
                break;
            case 11:
                printDiceFace(new String[]{
                        "* * * *",
                        "*  *  *",
                        "* * * *"
                });
                break;
            case 12:
                printDiceFace(new String[]{
                        "* * * *",
                        "* * * *",
                        "* * * *"
                });
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }

    private static void printDiceFace(String[] face) {
        for (String line : face) {
            System.out.println(line);
        }
    }

    private static int askPrint(Scanner scanner, int print, int getInt, int sumCoins) {
        switch (print) {
            case 1:
                System.out.println("------------------------------");
                System.out.println("  | Predicted " + getInt + " |");
                getInt = scanner.nextInt();
                System.out.println("User rolls the dices...");
                return getInt;
            case 2:
                int round = 1;
                System.out.println("------------------------------");
                System.out.println("  | Predicted " + getInt + " |");
                System.out.println(round + "  | Dice " + sumCoins + " |");
                System.out.println("  | Result");
                System.out.println("On the dice fell " + getInt + " points.");
                int result = Math.abs(sumCoins - getInt) * 2;
                System.out.println("Result is " + getInt + "-abs(" + getInt + "-" + sumCoins + ")*2: " + result + " points");
                System.out.println("Result= " + result);
                return result;
            default:
                System.out.println("Critical don't valide system");
                return 0;
        }
    }

    private static int throwTheDice(Random random) {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            int oneDice = random.nextInt(6) + 1;
            sum += oneDice;
        }
        return sum;
    }
}
