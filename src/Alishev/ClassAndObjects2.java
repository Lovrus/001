package Alishev;

// Урок 17. Параметры метода.
class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.setNameAndAge("Роман",20);
        String s1 = "Вова";
        Person2 person2 = new Person2();
        person2.setNameAndAge(s1,30);
        person1.speak();
        person2.speak();
    }
}

class Person2 {
    // У класса могут быть:
    //1. Данные (поля).
    //2. Действия, которые он может совершать (методы)
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;

    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
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