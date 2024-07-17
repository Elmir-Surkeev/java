package fouth_lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = getArray(scanner);
        System.out.println("Массив: " + Arrays.toString(array));

        int[] reversedArray= getArrayReverse(array);
        System.out.println("Реверсированный массив: " + Arrays.toString(reversedArray));
        scanner.close();
    }
    static int[] getArray(Scanner scanner){
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        System.out.println("Введите массив целых чисел");
        int array[] = new int[length];
        for(int i=0; i<length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    static int[] getArrayReverse(int[] array){
        int length = array.length;
        int[] reversedArray = new int[length];
        for (int i=0; i<length; i++){
            reversedArray[i] = array[i]*-1;
        }
        return reversedArray;
    }
}
