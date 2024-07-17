package third_lesson;
import java.util.Arrays;
import java.util.Scanner;
public class explain_lesson {
    public static void main(String[] args) {
        //Массив это тип данных, где есть название и значения одного типа
        //как поезд, локомотив это название, и в обязательном порядке похожие вагоны, с одним типом данных.
        //Нумерование массива начинается с нуля

        // объявление массива надо добавить [], либо после int, Char, String либо после название
        //for example
        int[] numbers; //приоритет
        //String hello[];


        //инициализация массива
        //есть два способа,
        //
        //первый когда мы точно знаем какое значение имеются
        String[] header = {"id", "name", "surname"};

        //второй когда мы узнаем массив в процессе работы
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("How many ");
        ///int studentCount = scanner.nextInt();
        //s.next line();
        //String[] studentNames = new String[studentCount];
        //String[] studentSurnames = new String[studentCount];


        //Вывод массива
        //выведет технические данные о массиве: тип данных, адрес и тп
        //System.out.println(header);

        //для содержимого нужно использовать toString();
        String contents = java.util.Arrays.toString(header);
        System.out.println(contents);

        String[] studentNames = new String[1];
        String[] studentSurnames = new String[1];
        contents = java.util.Arrays.toString(studentNames);
        System.out.println(contents);


        //Инициализация массивов
        //когда произведем создание массивов с помощью new, то обычно значение равно 0, null

        //новый массив с именами

        String[] names = new String[3];
        names[0] = "Caesar";
        names[1] = "Elmir";
        names[2] = "Ebo";
        //names[3] = "Daniel";
        //то есть двумя словами для доступа к элементу мы пишем имя массива, фигурные скобки, и номер элемента

        //точно также мы можем вывести, по номера элемента
        System.out.println(names[1]);
        //ошибка из-за того что границы массива мы обозначали как 3 new String[3] (48стока)
        //System.out.println(names[3]);



        //Циклы
        //часто используются для массивов
        //один проход по циклу называется итерация или одно повторения
        //все что внутри цикла, точнее {} называется телом цикла

        //Цикл for
        String fmt = "{%2d}: %s";
        for (int i = 0; i < studentNames.length ; i++){
            System.out.println(String.format(fmt, i +1, "name"));
            studentNames[i] = s.nextLine();

            System.out.println(String.format(fmt, i+1, "surname"));
            studentSurnames[i] = s.nextLine();
        }

        //Цикл for each
        //упрощает чтение кода, минус не можем менять данные
        for (String name: studentNames){
            System.out.println(name);
        }


        //Операций на массивами,
        // что мы можем сделать
        // отсортировать, скопировать, получить индекс элемента, сделать копию части массива
        // сравнить два массива (поэлементно), кроме того используя циклы
        // цикла мы можем провести необходимые любые другие операций над массивами

        //Копирование массива
        //есть метод copyOf() в классе Arrays
        //у метода copyOf() есть два аргумента
                //1 это название массива который нужно скопировать
                //2 это количество элементов в новом массиве
        String[] friendNames = {"Stas", "Sereja", "Katya"};
        System.out.println(Arrays.toString(friendNames));
        String[] copyFriendNames = Arrays.copyOf(friendNames, friendNames.length + 1);
        System.out.println(Arrays.toString(copyFriendNames));


        //Копирование части массива
        //метод copyOfRange() в классе Arrays, поможет нам в частичной копировке
        //у метода copyOfRange() есть три аргумента
                //1 это название массива который нужно скопировать
                //2 это начало старта копирование
                //3 это конец копировки
        String[] divFriendNames = Arrays.copyOfRange(friendNames, 0, 2);
        System.out.println(Arrays.toString(divFriendNames));


        //Сортировка массива
        //есть метод sort(), в объекте Arrays, который находится в пакете java.util
        //по умолчанию сортировка идет по возрастанию, или же в алфавитном порядке
        //для примера выведем неотсортированный массив и также отсортированный массив
        System.out.println(Arrays.toString(friendNames));
        java.util.Arrays.sort(friendNames);
        System.out.println(Arrays.toString(friendNames));
        //После использование метода sort(), произошла сортировка в алфавитном порядке


        //Поиск элемента в массиве
        //Arrays.binarySearch() = метод для поиска элемента в массиве
        //имеет два аргумента
                    //1 это название массива в котором производим поиск
                    //2 это элемент поиска который ищем
        //Если найдем элемент, то получаем индекс элемента
        //!!! важно упомянуть что этот метод требует чтобы до поиска элемента в массиве,
        //!!! все элементы должны быть заранее отсортированы по возрастанию или же в алфавитном порядке
        //Arrays.sort(array);
        //int index = Arrays.binarySearch(array, key);


        //Двумерные массивы

        byte [][] field = new byte[3][3];
        field [0][2] = 4;
        field [2][1] = 1;
        System.out.println(Arrays.deepToString(field));
        double num = 44;
        while (num > 2){
            System.out.println(num + " ");
            num /= 2;

        }
//
//        while (true){
//            System.out.println("yes or no");
//            String answer = s.nextLine().trim();
//            if (answer.equalsIgnoreCase("no")){
//                break;
//            }
//            if(answer.equalsIgnoreCase("yes")){
//                System.out.println("good");
//            }
//        }
//        s.close();
        String[] someData = {"wey", "human", "well", "horse"};
        for (String el : someData){
            if (!el.startsWith("h")){
                continue;
            }
            System.out.println(el);
        }

        //Операция switch, case;
        //Операция switch, case это как аналог if, else только если в if, else проверяется на истинность
        //то при использований switch, case есть несколько верных вариантов
        // дальнейшего выполнения программы
        System.out.println("menu");
        System.out.println("1 meals");
        System.out.println("2 drink");
        System.out.println("3 pasta");
        System.out.println("Enter 1,2,3,");
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine().trim();
        switch (ss){
            case "1":
                System.out.println("Chicken, meat with potato");
                break;
            case "2":
                System.out.println("cola, fanta, sprite");
                break;
            case "3":
                System.out.println("karbonara, spagetti with strachetello, penne arapiata");
                break;
            default:
                System.out.println("Enter only 1,2,3");
        }
        scanner.close();

        //Преобразование текста в число
        String text = "1234";

        //В целочисленный тип данных
        int asInt = Integer.parseInt(text);

        //В double тип, с запятыми
        double asDouble = Double.parseDouble(text);
        System.out.println(asInt + asDouble);
        //Если есть текст, то выведет ошибку


        //Преобразование чисел в текст
        double e = 2.4433534d;
        String.valueOf(84);
        String.valueOf(2.353895);
        String.valueOf(e);

        //int count = 23;
        String n1 = "" + 3 + 3;//выведет 33!важен порядок
        String n2 =  3 + 3 + "";//выведет 6 !важен порядок


    }
}
