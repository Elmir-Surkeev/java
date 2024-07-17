package _laboratory_tasks_2;
import java.util.Random;
public class Trird_task {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(1, 300)+1;
        System.out.println(random);

        for (int i = 1; i <=random; i++) {
            int divisorCount = count(i);
            System.out.print(i + " ");
            for (int j = 0; j < divisorCount; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    private static int count (int random){
        int count = 0;
        for (int i=0; i<= random; i++){
            if(random%1 == 0){
                count++;
            }
        }
        return count;
    }
}
