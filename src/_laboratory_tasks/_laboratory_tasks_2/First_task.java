package _laboratory_tasks_2;


import java.util.Scanner;

public class First_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон конца поиска");
        int restrictions = scanner.nextInt();
        scanner.close();
        for (int count=136; count<restrictions; count++){
            if (count%47 == 43){
                System.out.println(count + " Число при делений на 47, равняется 43");
            }else if (count%43 == 47){
                System.out.println(count + " Число при делений на 43, равняется 47");
            }else{
                //нужно было все в массив впихивать, после по каждому элементу пройтись
                //и методом equals удалить все что == 'Неверное число'
//                System.out.println("Неверно число");
            }
        }
    }
}
