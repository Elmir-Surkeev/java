package control_tasks;


import java.util.Scanner;
import java.util.Random;
public class First_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int print = 1;
        int sumCoins = throwTheDice(random);
        int enteredNumber = askPrint(scanner, print,0,  sumCoins );
        print = 2;
        System.out.println("Сумма очков "+sumCoins);
        int lastPrint = askPrint(scanner,print,enteredNumber,  sumCoins);
        printHash(lastPrint);

    }
    private static void printHash(int lastPrint){
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
    private static String printDiceFace(String[] face){
        for (String line: face){
            System.out.println(line);
        }
        return null;

    }
    private static int askPrint(Scanner scanner, int print,int getInt, int sumCoins){
        switch (print){
            case 1:
                System.out.println("---  Start Game  ---");
                System.out.println("Predict amount of points (2, 12):9");
                getInt = scanner.nextInt();
                System.out.println("User rolls the dices...");
//                break; я здесь не понял, почему без BREAK работает?
                //менял местами с return, но все равно выходила ошибка
                return getInt;
            case 2:
                System.out.println("On the dice feel "+getInt+" points.");
                int result = Math.abs(sumCoins - getInt) * 2;
                System.out.println("Result is "+getInt+"-abs("+getInt+"-"+sumCoins+")*2:"+ result+" points");
                System.out.println("Result= "+result);
                int count = result;
                //break;
                return result;
            default:
                System.out.println("Critical don't valide system");
                //break;
                return 0;
        }
    }
    private static int throwTheDice(Random random){
        int sum = 0;
        for (int i=0; i<2; i++){
            int oneDices = random.nextInt(6)+1;
            sum += oneDices;
        }
        return sum;
    }
}
