package second_lesson;

import java.util.Scanner;

//Задание седьмое
//Пользователь вводит предложение и отдельно слово. Ваша программа должна вывести, есть ли
//такое слово в этом предложении и показать с какой позиции оно начинается.
public class TaskSeventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentenes");
        String sentens = scanner.next();
        System.out.println("Enter word");
        String word = scanner.next();
        int index = sentens.indexOf(word);
        if (index >= 1){
            System.out.println(index + " позиций находится это слово");
        }else {
            System.out.println(index + " не находится такое слово");
        }

    }
}
