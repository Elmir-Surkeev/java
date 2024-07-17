package _laboratory_tasks_2;
import java.util.Arrays;
import java.util.Random;

public class Second_task {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random r = new Random();
        int sum = 0;
        int[] arrayRemainder = new int[10];
        for(int i=0; i<array.length; i++){
            array[i] = r.nextInt(99-10+1)+10;
            if (array[i]%2 == 0){
                sum += array[i];
                arrayRemainder[i] += array[i];
            }
        }
        System.out.println("массив случайно сгенерированных чисел " + Arrays.toString(array));
        System.out.println("Все четные числа в массиве "+Arrays.toString(arrayRemainder));
        System.out.println("Сумма всех четных чисел в массиве "+ sum);
    }
}
