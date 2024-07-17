package third_lesson;
import java.util.Arrays;
import java.util.Random;
public class Task_Fifth {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            int value = r.nextInt(21) - 10;
            array[i] = value;
        }
        System.out.println("Выводим все числа в промежутке от -10 до 10");
        System.out.println(Arrays.toString(array));
        int[] minusArray = new int[10];
        int[] plusArray = new int[10];
        for (int i=0; i<10; i++){
            if (array[i]<10 && array[i]>0){
                minusArray[i] = array[i];
            }
            else if (array[i]<0 && array[i]>-11){
                plusArray[i] = array[i];
            }
        }
        System.out.println("Выводим все отрицательные числа");
        System.out.println(Arrays.toString(plusArray));
        System.out.println("Выводим все положительные числа");
        System.out.println(Arrays.toString(minusArray));
        int[] nechetArray = new int[10];
        int[] chetArray = new int[10];
        for (int i=0; i<10; i+=2){
            chetArray[i] = array[i];
        }
        for (int i=1; i<10; i+=2){
            nechetArray[i] = array[i];
        }
        System.out.println("Выводим все числа, в четном индексе");
        System.out.println(Arrays.toString(nechetArray));
        System.out.println("Выводим все числа в нечетном индексе");
        System.out.println(Arrays.toString(chetArray));
        int countPlus = 0;
        int countMinus = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > 0){
                countPlus++;
            }
            else if (array[i]<= 0){
                countMinus++;
            }
        }
        System.out.println("Количество отрицательных элементов " + countMinus);
        System.out.println("Количество положительных элементов " + countPlus);
    }
}
