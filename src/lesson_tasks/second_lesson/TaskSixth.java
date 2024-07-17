package second_lesson;

//Задание шестое.
//Дано предложение. Все буквы e в нем заменить буквой i. Затем в получившемся предложении
//заменить все d на t. Вывести исходное и получившееся предложение на экран.

import java.util.Scanner;

public class TaskSixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentens = scanner.next();
        System.out.println("изначальное " + sentens);
        sentens = sentens.replace("e", "i");
        sentens = sentens.replace("d", "t");
        //System.out.println(getSentens);
        System.out.println("после замены " + sentens);
        scanner.close();
    }
}
