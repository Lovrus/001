package Alishev;

// Урок 16. Тип возвращаемого значения метода.
class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.name = "Роман";
        person1.age = 50;

        Person2 person2 = new Person2();
        person2.name = "Вова";
        person2.age = 20;
        int years1 = person1.calculateYearsToRetirement();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + years1 + " лет.");
        System.out.println("Второму человеу до пенсии: " + years2 + " лет.");
    }
}

class Person2 {
    // У класса могут быть:
    //1. Данные (поля).
    //2. Действия, которые он может совершать (методы)
    String name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65-age;
        return  years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello() {

        System.out.println("Привет!");
    }
}