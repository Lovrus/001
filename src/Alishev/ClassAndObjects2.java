package Alishev;

// Урок 15. Методы в java
class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        Person2 person2 = new Person2();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();

    }
}

class Person2 {
    // У класса могут быть:
    //1. Данные (поля).
    //2. Действия, которые он может совершать (методы)
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}