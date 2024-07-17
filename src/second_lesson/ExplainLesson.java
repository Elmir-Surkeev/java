package second_lesson;
import java.awt.*;

public class ExplainLesson {
    public static void main(String[] args) {
        //create variable feb with text "February"
        String feb = "February";
        //also variable name undefined text = ""

        //very chasto we need know how much symbol have a text, for this we have .length()
        //when we count length, we also count запятой and пробел
        String bookTitle = "Realease the hounds!";
        System.out.println(bookTitle.length());

        // also really chasto we need know text have a null string
        String name = "";
        //variable.isEmpty() = for know null or have a symbols
        boolean empty = name.isEmpty();
        System.out.println("String null? "+ empty);
        System.out.println("Long string = " + name.length());

        name = "Elmir";
        empty = name.isEmpty();
        System.out.println("String null? "+ empty);
        System.out.println("Long string = " + name.length());


        //Find symbol and understrok in String;
        //also really important task know find position random Symbol, or word in text;
        //for this task, Java have two operation indexOf() and lastIndexOf()
        //Example:
        String catsDogs = "cats and dogs";
        int index = catsDogs.indexOf("and");
        System.out.println(index);
        //the display we see number 5, This is position first symbol sovpadaushego with finded word
        //Mhhmm, okey, what to be, if we finded undefined symbol get (-1)
        //Example:
        String giraffeGippopotame = "hey bro giraffe";
        index = giraffeGippopotame.indexOf("cat");
        System.out.println(index);
        //return -1, if this word, don't be in the text;

        //may start find last symbols in word also last word in text
        //find last symbol or word
        int indexx = catsDogs.lastIndexOf("s");
        System.out.println(indexx);

        //Method indexOf  use for find symbol start last string or text;


        //Deleted probel and another symbol at the start and finished string or text
        //If we need to delete probel at the start and finished text, we have a method strip();
        String text = " Hellow world ";
        String cleanText = text.strip();
        System.out.println("-"+text+"-");
        System.out.println("-"+cleanText+"-");

        //Importand part operation change Register Symbol
        //we use toLowerCase() and toupperCase();
        String email = "Student@Attractor.SCHOOL";
        System.out.println(email);
        System.out.println(email.toLowerCase());
        System.out.println(email.toUpperCase());


        //Replace string in text, another string
        //we use variable.replace(oldString, newString)
        String weather = "Sunny day";
        weather = weather.replace("Sunny", "Rain");
        System.out.println(weather);

        //Equal String and String

        String water = "Water";
        String food = "Food";
        boolean result = water.equals(food);
        System.out.println(result);
        String moreWater = "Water";
        result = water.equals(moreWater);
        System.out.println(result);


        //formation String for print
        //sometimes we need to print text, strange or personal vide
        //For example: We get name and surname and we to do print in type text;
        //we use String format(shablon, arguments)
        String first = "Elmir";
        String last = "Surkeev";

        //% this is variable
        //format = this is Shablon, we can replace Today birthday
        String format = "My name's %s %s";
        String msg = String.format(format, first, last);
        System.out.println(msg);


        //Vyravnivanie print text;
        //With help easy to do pechat table data
        String f = "| %12s | %12s";
        String row1 = String.format(f, "Apple", "30 cent");
        String row2 = String.format(f, "Banana", "53 cent");
        String row3 = String.format(f, "Ice cream", "10 cent");
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);

        //Okey we say, easy, but we see really unBeatiful display, for solve
        //we can use numbers
        //String f = "| %12s | %12s";



        // Formating print numbers
        String formatDouble = "|%f|";
        double e = 5.25254325432;
        String resultt = String.format(formatDouble, e);
        System.out.println(resultt);
        //по умолчанию 6 symbol, after " , "
        formatDouble = "|%.2f|";
        String results = String.format(formatDouble, e);
        System.out.println(results);
        //теперь print 2 symbol after " , "


        //aslo we can add null prostanstvo
        formatDouble = "|%10.2f|";
        //10 this is null prostranstvo
        String resultss = String.format(formatDouble, e);
        System.out.println(resultss);


        //IF || ELSE IF | ELSE
        int numFirst = 5;
        int numLast = 43;
        if (numFirst> numLast){
            String formats = "%s, больше чем %s";
            String all = String.format(formats, numFirst, numLast);
            System.out.println(all);
        }else{
            String formats = "%s, больше чем %s";
            String all = String.format(formats, numLast, numFirst);
            System.out.println(all);
        }



        //Neskolko operation choice
        java.util.Random r = new java.util.Random();
        int dice1 = r.nextInt(6) + 1;
        int dice2 = r.nextInt(6) + 1;
        String formats = "Ordinary roll: [%s, %s]";
        if (dice1 ==6){
            if (dice2 ==6){
                formats = "Double 6 roll [%s, %s]";
            }
        }
        String msgg = String.format(formats, dice1, dice2);
        System.out.println(msgg);

    }
}
