package fifth_lesson;

public class Main {
    public static void main(String[] args) {
        fifth_lesson.Cat cat = new fifth_lesson.Cat();
        cat.name = "Barsik";
        cat.breed = "Siamskaya";
        cat.age = 3;

        fifth_lesson.Food food = new fifth_lesson.Food();
        food.name = "Apple";
        food.type = "Fruit";
        food.calories = 95;

        Paper paper = new Paper();
        paper.size = "A4";
        paper.color = "White";
        paper.weight = 80;

        WaterHeater waterHeater = new WaterHeater();
        waterHeater.brand = "Legenda";
        waterHeater.capacity = 50;
        waterHeater.power = 2000;

        Battery battery = new Battery();
        battery.type = "AA";
        battery.voltage = 1.5;
        battery.capacity = 2000;

        Liquid liquid = new Liquid();
        liquid.name = "Water";
        liquid.color = "Clear";
        liquid.volume = 1.0;

        Mug mug = new Mug();
        mug.material = "Ceramic";
        mug.color = "Blue";
        mug.capacity = 350;

        Box box = new Box();
        box.material = "Cardboard";
        box.size = "5x5x15cm";
        box.color = "White";

        Student student = new Student();
        student.name = "Elmir Surkeev";
        student.age = 19;
        student.major = "Programming teghnologies";

        CompanyEmployee employee = new CompanyEmployee();
        employee.name = "Alfit Bashirov";
        employee.age = 30;
        employee.position = "Middle 3level Software Engineer";
    }
}

class Cat {
    String name;
    String breed;
    int age;
}

class Food {
    String name;
    String type;
    int calories;
}

class Paper {
    String size;
    String color;
    int weight;
}

class WaterHeater {
    String brand;
    int capacity;
    int power;
}

class Battery {
    String type;
    double voltage;
    int capacity;
}

class Liquid {
    String name;
    String color;
    double volume;
}

class Mug {
    String material;
    String color;
    double capacity;
}

class Box {
    String material;
    String size;
    String color;
}

class Student {
    String name;
    int age;
    String major;
}

class CompanyEmployee {
    String name;
    int age;
    String position;
}
