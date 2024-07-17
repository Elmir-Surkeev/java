package third_lesson;

import java.util.Arrays;

public class Task_First {
    public static void main(String[] args) {
        String[] words  = {", kid", "That's where", "and corners", "Doors", "you", "they get"};
        System.out.println(Arrays.toString(words));
        java.util.Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        String[] div = new String[]{words[0]};
        words[0] = words[1];
        words[1] = words[3];
        String[] That = new String[]{words[2]};
        words[2] = div[0];
        words[3] = That[0];
        System.out.println(Arrays.toString(words));
        String joined2 = String.join(" ", words);
        System.out.println(joined2);
    }
}
