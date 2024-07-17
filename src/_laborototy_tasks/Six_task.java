package _laborototy_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Six_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = new String[10];
        String[] secondArray = new String[10];
        String[] thirdArray = new String[10];
        int[] intArray = new int[10];
        int[] intArray2 = new int[10];
        int[] intArray3 = new int[10];
        for (int i=0; i < firstArray.length; i++){
            System.out.println("Введите данные элемента " + i);
            firstArray[i] = scanner.next();
            intArray[i] = Integer.parseInt(firstArray[i]);
        }
        for (int i=0; i < secondArray.length; i++){
            System.out.println("Введите данные элемента " + i);
            secondArray[i] = scanner.next();
            intArray2[i] = Integer.parseInt(secondArray[i]);
        }
        if (intArray.length == intArray2.length){
            for (int i=0; i < thirdArray.length; i++){
                intArray3[i] = intArray[i]+ intArray2[i];
            }
        }
        for (int value : intArray3) {
            int max = intArray3[0];
            if (value > max) {
                max = value;
                System.out.println(max + "Найбольший элемент в последнем массиве");
            }
        }

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(intArray3));

    }
}
