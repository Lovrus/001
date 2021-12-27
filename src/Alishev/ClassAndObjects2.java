package Alishev;

// Урок 18. Инкапсуляция. Сеттеры и геттеры.
class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.setName("");
        person1.setAge(-4);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());

    }
}

class Person2 {
    // У класса могут быть:
    //1. Данные (поля).
    //2. Действия, которые он может совершать (методы)
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

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
