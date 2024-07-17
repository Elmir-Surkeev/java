package _laboratory_tasks_2;

import java.util.Scanner;

public class Fifth_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива 2-10");
        int N = scanner.nextInt();
        scanner.close();
        if (N<2 || N>10){
            System.out.println("Число не соответствует требованиям");
            return;
        }
        int[][] array = new int[N][N];
        fillArray(array, N);
        printArray(array, N);
    }
    private static void fillArray(int[][]array, int N){
        for(int i=0; i<N;i++){
            array[0][i] = 1;
            array[i][0] = 1;
        }
        for(int i=1; i<N;i++){
            for(int j=1;j<N;j++){
                array[i][j] = array[i-1][j] + array[i][j-1];
            }
        }
    }
    private static void printArray(int[][]array, int N){
        for (int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }
}

