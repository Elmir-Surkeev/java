package third_lesson;


public class Task_Third {
    public static void main(String[] args) {
        int[] fibonacci = new int[15];

        fibonacci[0]= 1;
        fibonacci[1]= 1;

        for (int i=2; i < fibonacci.length; i++){
            fibonacci[i]= fibonacci[i-1] + fibonacci[i-2];

        }
        System.out.println("Вывод массива по порядку");
        for (int i=1; i < fibonacci.length; i++){
            System.out.println(fibonacci[i]);
        }
        System.out.println("Вывод массива наоборот");
        for (int i=fibonacci.length-1; i >= 0; i--){
            System.out.println(fibonacci[i]);
        }

    }
}
