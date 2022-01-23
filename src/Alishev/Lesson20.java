package Alishev;

// Урок 20. Конструкторы
public class Lesson20 {
    public static void main(String[] args) {
        Human20 human20 = new Human20("Bob", 15);
    }

}

class Human20 {
    private String name20;
    private int age20;

    public Human20() {
        this.name20 = "Имя по умолчанию";
        this.age20 = 0;
    }

    public Human20(String name20) {
        System.out.println("Привет из второго конструктора!");
        this.name20 = name20;
    }

    public Human20(String name20, int age20) {
        System.out.println("Привет из третьего конструктора!");
        this.name20 = name20;
        this.age20 = age20;
    }

    public void setName20(String name20) {
        this.name20 = name20;
    }

    public void setAge20(int age20) {
        this.age20 = age20;
    }
}